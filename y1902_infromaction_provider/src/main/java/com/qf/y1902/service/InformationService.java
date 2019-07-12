package com.qf.y1902.service;


import com.qf.y1902.vo.DraftResult;
import com.qf.y1902.vo.IfmAddVo;

import java.util.Map;

public interface InformationService {
    public DraftResult selectAll(Integer page, Integer pageSize, Map<String,Object> map);

    public int addOne(IfmAddVo ifmAddVo);
}
