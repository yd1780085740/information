package com.qf.y1902.controller;

import com.qf.y1902.service.InformctionService;
import com.qf.y1902.vo.InformctionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InformationController {

    @Autowired
    private InformctionService InformctionService;

    @RequestMapping(value = "ifm_list")
    @ResponseBody
    public InformctionResult list(@RequestParam(value = "page",defaultValue = "1")Integer page,
                                  @RequestParam(value = "pageSize",defaultValue = "12") Integer pageSize){
        InformctionResult all = InformctionService.findAll(page, pageSize);
        System.out.println(all);
        return all;
    }
}
