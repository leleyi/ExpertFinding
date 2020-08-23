package com.conpany.project;


import com.company.project.model.Paper;
import com.company.project.model.Paper2Search;
import com.company.project.service.PaperService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

public class ESTester extends Tester {
    @Autowired
    PaperService paperService;

    RestHighLevelClient client = ESClient.getClient();


    @Test
    public void createIndex() throws Exception {
        // 1.准备关于索引的setting
        CreateIndexRequest request = new CreateIndexRequest("paper");
        request.settings(Settings.builder()
                .put("index.number_of_shards", 3)
                .put("index.number_of_replicas", 2)
        );

        XContentBuilder builder = XContentFactory.jsonBuilder();
        builder.startObject();
        {
            builder.startObject("properties");
            {
                builder.startObject("name");
                {
                    builder.field("type", "text");
                    builder.field("index", "true");
                    builder.field("analyzer", "ik_max_word");
                }
                builder.endObject();
                builder.startObject("authors");
                {
                    builder.field("type", "text");
                }
                builder.endObject();
                builder.startObject("abstract");
                {
                    builder.field("type", "text");
                    builder.field("index", "true");
                    builder.field("analyzer", "ik_max_word");
                }
                builder.endObject();

            }
            builder.endObject();
        }
        builder.endObject();
        request.mapping(builder);
        CreateIndexResponse createIndexResponse = client.indices().create(request, RequestOptions.DEFAULT);
        System.out.println(createIndexResponse);
    }

    @Test
    public void createDocTest() throws IOException {
        Paper byId = paperService.findById(2);
        System.out.println(byId.getAbstract());
    }

    @Test
    public void insertToES() throws IOException {
        StringBuilder ids = new StringBuilder();
        for (int i = 1507403; i < 1507403 + 100; i++) {
            ids.append(i + ",");
        }
        List<Paper> byIds = paperService.findByIds(ids.substring(0, ids.length() - 1));

        BulkRequest bulkRequest = new BulkRequest();
        ObjectMapper mapper = new ObjectMapper();
        for (Paper write :
                byIds) {
            Paper2Search paper2Search = new Paper2Search(write.getName(), write.getAuthors(), write.getAbstract());
            String jsonString = mapper.writeValueAsString(paper2Search);
            bulkRequest.add(new IndexRequest("paper").id(String.valueOf(write.getId()))
                    .source(jsonString, XContentType.JSON));
        }

        BulkResponse bulkResponse = client.bulk(bulkRequest, RequestOptions.DEFAULT);
        System.out.println(bulkResponse.status());
    }

    @Test
    public void searchTest() throws IOException {
        SearchRequest searchRequest = new SearchRequest()
                .indices("paper")
                .source(new SearchSourceBuilder()
                        .query(QueryBuilders.matchQuery("paparAbstract", "治疗")));
        SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
        System.out.println(searchResponse.getHits().getTotalHits());
    }

    /**
     * add the dense vector
      */
    @Test
    public void addMapping(){

    }
}
