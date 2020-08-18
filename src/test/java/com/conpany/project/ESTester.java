package com.conpany.project;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.common.xcontent.json.JsonXContent;
import org.elasticsearch.index.mapper.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

public class ESTester {

    RestHighLevelClient client = ESClient.getClient();
    String index = "person";
//    String type = "man";

//    @Test
//    public void testClient() {
//        this.client = ();
//        System.out.println(client);
//    }


    @Test
    public void createIndex() throws Exception {
        // 1.准备关于索引的setting
        Settings.Builder settings = Settings.builder()
                .put("number_of_shards", 3)
                .put("number_of_replicas", 1);

        // 2.准备关于索引的mapping
        XContentBuilder mappings = JsonXContent.contentBuilder()
                .startObject()
                .startObject("properties")
                .startObject("name")
                .field("type", "text")
                .endObject()
                .startObject("age")
                .field("type", "integer")
                .endObject()
                .endObject()
                .endObject();
        // 3.将settings和mappings 封装到到一个Request对象中
        CreateIndexRequest request = new CreateIndexRequest(index)
                .settings(settings)
                .mapping("man", mappings);
        // 4.使用client 去连接ES
        CreateIndexResponse response = client.indices().create(request, RequestOptions.DEFAULT);
        System.out.println("response:" + response.toString());
    }


    String type="man";
    public void createDocTest() throws IOException {
        //  1.准备一个json数据
//        Person person  = new Person(1,"张三",33,new Date());

        //  2.创建一个request对象(手动指定的方式创建)
        IndexRequest request = new IndexRequest("posts"); //索引
        request.source("", XContentType.JSON);
        // 3.使用client 操作request对象生成doc
        IndexResponse response = client.index(request, RequestOptions.DEFAULT);
        // 4.输出返回结果
        System.out.println(response.getResult().toString());

    }

}
