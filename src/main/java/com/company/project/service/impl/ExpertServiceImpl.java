package com.company.project.service.impl;

import com.company.project.dao.ExpertMapper;
import com.company.project.model.Expert;
import com.company.project.service.ExpertService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/08/09.
 */
@Service
@Transactional
public class ExpertServiceImpl extends AbstractService<Expert> implements ExpertService {
    @Resource
    private ExpertMapper expertMapper;


}
