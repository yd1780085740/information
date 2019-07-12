package com.qf.y1902.vo;

import lombok.Data;

import java.util.List;

@Data
public class DraftResult {

    private long total;
    private List<InformationVo> rows;
}
