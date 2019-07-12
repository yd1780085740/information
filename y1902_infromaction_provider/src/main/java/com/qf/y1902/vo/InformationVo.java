package com.qf.y1902.vo;

import lombok.Data;

@Data
public class InformationVo {
    private int id;  //资讯id
    private String title;  //资讯标题
    private String source;  //资讯来源
    private String author;  //作者
    private int lastUpdateTime;  //时间
    private int state;  //状态
}
