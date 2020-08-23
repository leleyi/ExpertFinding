package com.conpany.project;

import com.company.project.model.Paper;
import com.company.project.service.PaperService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class PaperTester extends Tester {
    @Autowired
    PaperService paperService;

    @Test
    public void getPaper() {
        Paper paper = paperService.findById(1507428);
        System.out.println(paper.getAbstract());
    }


}

