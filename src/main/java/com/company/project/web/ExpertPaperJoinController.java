package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ExpertPaperJoin;
import com.company.project.service.ExpertPaperJoinService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/08/09.
*/
@RestController
@RequestMapping("/expert/paper/join")
public class ExpertPaperJoinController {
    @Resource
    private ExpertPaperJoinService expertPaperJoinService;

    @PostMapping("/add")
    public Result add(ExpertPaperJoin expertPaperJoin) {
        expertPaperJoinService.save(expertPaperJoin);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        expertPaperJoinService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ExpertPaperJoin expertPaperJoin) {
        expertPaperJoinService.update(expertPaperJoin);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ExpertPaperJoin expertPaperJoin = expertPaperJoinService.findById(id);
        return ResultGenerator.genSuccessResult(expertPaperJoin);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ExpertPaperJoin> list = expertPaperJoinService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
