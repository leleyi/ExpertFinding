package com.company.project.es;


import com.company.project.Application;
import com.company.project.model.Paper;
import com.company.project.service.PaperService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

/**
 * @author leleyi
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
@Rollback
public class ElasticSearchOperator {

    @Autowired
    PaperService paperService;

    public boolean createIndex() {

        return true;
    }

    public boolean insertDoc(int id) {
        System.out.println(id);
        return true;
    }

    public boolean insertDocs(int[] ids) {
        System.out.println(Arrays.toString(ids));
        return true;
    }

}
