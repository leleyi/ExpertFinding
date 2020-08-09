package com.company.project.service.impl;

import com.company.project.dao.PaperMapper;
import com.company.project.model.Paper;
import com.company.project.service.PaperService;
import com.company.project.core.AbstractService;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2020/08/09.
 */
@Service
@Transactional
public class PaperServiceImpl extends AbstractService<Paper> implements PaperService {
    @Resource
    private PaperMapper paperMapper;


//    T findById(Integer id);//通过ID查找
//
//    /**
//     * @param fieldName
//     * @param value
//     * @return
//     * @throws TooManyResultsException
//     */
//    T findBy(String fieldName, Object value) throws TooManyResultsException; //通过Model中某个成员变量名称（非数据表中column的名称）查找,value需符合unique约束
//
//    /**
//     * @param ids
//     * @return
//     */
//    List<T> findByIds(String ids);//通过多个ID查找//eg：ids -> “1,2,3,4”
//
//    /**
//     * @param condition
//     * @return
//     */
//    List<T> findByCondition(Condition condition);//根据条件查找
//
//    /**
//     * @return
//     */
//    List<T> findAll();//获取所有

}
