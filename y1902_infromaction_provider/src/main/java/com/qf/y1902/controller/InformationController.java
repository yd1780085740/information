package com.qf.y1902.controller;


import com.qf.y1902.service.InformationService;
import com.qf.y1902.vo.DraftResult;
import com.qf.y1902.vo.IfmAddVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;


@Controller
public class InformationController {
    @Autowired
    private InformationService informationService;
    //草稿箱首页
    @RequestMapping(value = "information/list",method = RequestMethod.POST)
    @ResponseBody
    public DraftResult findAll(@RequestParam(value = "page",defaultValue = "1") Integer page,
                               @RequestParam(value = "rows",defaultValue = "2") Integer pageSize,
                               @RequestParam(value = "title",required = false,defaultValue = "") String title,
                               @RequestParam(value = "initialTime",required = false, defaultValue = "") String initialTime,
                               @RequestParam(value = "lastTime", required = false, defaultValue = "") String lastTime) {

        HashMap<String, Object> stringObjectHashMap = new HashMap<>();
        String trim = initialTime.replaceAll("-", "").trim();
        System.out.println("initialTime=" + trim);
        String trim1 = lastTime.replaceAll("-", "").trim();
        System.out.println("lastTime=" + trim1);
        Integer firstTime;
        try {
            firstTime = Integer.parseInt(trim);
        } catch (NumberFormatException e) {
            firstTime = null;
        }
        Integer lasttime;
        try {
            lasttime = Integer.parseInt(trim1);
        } catch (NumberFormatException e) {
            lasttime = null;
        }
        stringObjectHashMap.put("title", title);
        stringObjectHashMap.put("initialTime", firstTime);
        stringObjectHashMap.put("lastTime", lasttime);
        System.out.println(stringObjectHashMap);
        DraftResult result = informationService.selectAll(page, pageSize, stringObjectHashMap);
        System.out.println(result);
        return result;
    }

    //保存编辑草稿
    @RequestMapping(value = "ifm/add",method = RequestMethod.GET)
    public Object addOne(IfmAddVo ifmAddVo){
        int jg = informationService.addOne(ifmAddVo);
        return jg;
    }
}
