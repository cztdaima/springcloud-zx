package com.jk.service;

import com.jk.model.ProfeBean;
import com.jk.model.RelevantBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(value = "glhtprovider")
public interface glService {


    @GetMapping("/hello")
    String hello();

    @RequestMapping("/findRelevantCount")
    @ResponseBody
    String findRelevantCount();



    @RequestMapping("/findRelevant")
    @ResponseBody
    List<RelevantBean> findRelevant();


    @RequestMapping("/findProfession")
    @ResponseBody
    List<ProfeBean> findProfession();
}
