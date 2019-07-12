package com.qf.y1902.Service;


import com.github.pagehelper.PageHelper;
import com.qf.y1902.mapper.InformationMapper;
import com.qf.y1902.vo.IfmAddVo;
import com.qf.y1902.vo.InformationVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Configuration("com.qf.y1902.mapper")
public class ImplTest {
    @Resource
    private InformationMapper informationMapper;

    @Test
    public void Test1(){
        Integer page = 1;
        Integer pageSize = 10;
       /*  String x = "";
        Integer y = null;
        Integer z = null;
        HashMap<String, Object> map = new HashMap<>();
        map.put("title",x);
        map.put("initialTime",y);
        map.put("lastTime",z);*/
        PageHelper.startPage(page,pageSize);
        List<InformationVo> finddraft = informationMapper.selectAll();
        System.out.println(finddraft);
    }


    @Test
    public void test2(){
        String a = "2017-07-01";
        String s = a.replaceAll("-", "");
        System.out.println(s);
    }

    @Test
    public void test3(){
        String x = "";
        System.out.println("x===="+x);
    }

    @Test
    public void test4(){
        int i = informationMapper.maxID()+1;
        System.out.println(i);
        String title = "旧汽车";
        String source = "转载";
        String describe = "这是第二段描述";
        String image = "这是图片的路径";
        String author = "这是作者";
        int createTime = 0;
        String lable = "这是第二个标签";
        int isAllow = 0;
        int isCollect = 0;
        String content = "这是又一段正文内容";
        IfmAddVo ifmAddVo = new IfmAddVo();
        ifmAddVo.setId(i);
        ifmAddVo.setAuthor(author);
        ifmAddVo.setContent(content);
        ifmAddVo.setCreatTime(createTime);
        ifmAddVo.setDescribe(describe);
        ifmAddVo.setImage(image);
        ifmAddVo.setIsAllow(isAllow);
        ifmAddVo.setIsCollect(isCollect);
        ifmAddVo.setLable(lable);
        ifmAddVo.setSource(source);
        ifmAddVo.setTitle(title);
        int i1 = informationMapper.addIfm(ifmAddVo);
        System.out.println(i1);
    }
}
