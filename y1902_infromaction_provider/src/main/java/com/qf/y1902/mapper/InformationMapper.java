package com.qf.y1902.mapper;

import com.qf.y1902.vo.IfmAddVo;
import com.qf.y1902.vo.InformationVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface InformationMapper {

    public List<InformationVo> finddraft(Map<String,Object> map);

    public List<InformationVo> selectAll();

    public int addIfm(IfmAddVo ifmAddVo);

    public int maxID();

}
