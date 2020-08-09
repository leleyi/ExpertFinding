package com.company.project.service.impl;

import com.company.project.dao.ExpertPaperJoinMapper;
import com.company.project.model.ExpertPaperJoin;
import com.company.project.service.ExpertPaperJoinService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/08/09.
 */
@Service
@Transactional
public class ExpertPaperJoinServiceImpl extends AbstractService<ExpertPaperJoin> implements ExpertPaperJoinService {
    @Resource
    private ExpertPaperJoinMapper expertPaperJoinMapper;

}
