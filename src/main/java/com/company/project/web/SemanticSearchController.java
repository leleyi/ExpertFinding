package com.company.project.web;

import org.elasticsearch.client.ml.inference.preprocessing.CustomWordEmbedding;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expert")
public class SemanticSearchController {

    public void  semanticSearch(@RequestParam String query){

        return;
    }
    public int[] getTopK(@RequestParam String query,int  k){

        return null;
    }
    public int[] getSimilarityGT(@RequestParam Double similarity, @RequestParam String query){

        return null;
    }
    public int[] getFarestTopk(@RequestParam String query, int k){
        return null;
    }
    public int[] getAuthors(@RequestParam String query, @RequestParam int k){
       return  null;
    }

}
