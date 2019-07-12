package com.qf.y1902.service;

import com.qf.y1902.service.Impl.InformctionServiceImpl;
import com.qf.y1902.vo.InformctionResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "information-client",fallback = InformctionServiceImpl.class)
public interface InformctionService {

    @RequestMapping(value = "information/list")
    public InformctionResult findAll(@RequestParam("page") Integer page,@RequestParam("pageSize") Integer pageSize);
}
