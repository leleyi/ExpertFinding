package com.conpany.project;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;

public class ESClient {

      public static RestHighLevelClient getClient(){
        //  创建 HttpHost
        HttpHost httpHost = new HttpHost("10.1.13.143",9200);

        // 创建 RestClientBuilder
        RestClientBuilder builder = RestClient.builder(httpHost);

        // 创建 RestHighLevelClient
        RestHighLevelClient client = new RestHighLevelClient(builder);

        return client;
    }

}
