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
    }
}
