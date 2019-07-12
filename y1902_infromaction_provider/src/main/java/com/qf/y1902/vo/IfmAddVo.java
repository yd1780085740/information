package com.qf.y1902.vo;

import lombok.Data;

/*
* 对新增资讯对象的封装
*  title 标题
 * source 来源
 * describe 描述
 * img 图片
 * author 作者
 * time 时间
 * lable 标签
 * operation 操作
 * content 内容
* */
@Data
public class IfmAddVo {
    private int id;  //资讯标签ID
    private String title;  //标题
    private String source;  //来源
    private String describe;  //描述
    private String image;  //图片地址
    private String author;  //作者
    private int creatTime;  //创建时间
    private String lable;  //标签
    private int isAllow; // 是否点赞
    private int isCollect; //是否收藏
    private String content;  //内容
}
