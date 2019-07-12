package com.qf.y1902.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.y1902.mapper.InformationMapper;
import com.qf.y1902.service.InformationService;
import com.qf.y1902.vo.DraftResult;
import com.qf.y1902.vo.IfmAddVo;
import com.qf.y1902.vo.InformationVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class InformationServiceImpl implements InformationService {

    @Resource
    private InformationMapper informationMapper;


    @Override
    public DraftResult selectAll(Integer page, Integer pageSize, Map<String, Object> map) {
        DraftResult draftResult = new DraftResult();
        PageHelper.startPage(page,pageSize);
        List<InformationVo> finddraft = informationMapper.finddraft(map);
        System.out.println("finddraft==="+finddraft);
        PageInfo<InformationVo> informationVoPageInfo = new PageInfo<>(finddraft);
        System.out.println(informationVoPageInfo.getTotal());
        draftResult.setTotal(informationVoPageInfo.getTotal());
        draftResult.setRows(finddraft);
        return draftResult;
    }

    @Override
    @Transactional
    public int addOne(IfmAddVo ifmAddVo) {
        int id = informationMapper.maxID()+1;
        ifmAddVo.setId(id);
        int i = informationMapper.addIfm(ifmAddVo);

        return i;
    }
}
