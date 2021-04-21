package com.zheng.springcloud.controller;

import com.zheng.commons.bean.StudentBean;
import com.zheng.commons.bean.TestBean;
import com.zheng.springcloud.api.RestApi;
import com.zheng.springcloud.service.RestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class RestConsulController implements RestApi {
    @Autowired
    RestService restService;
    public List<StudentBean> studentBeans() {
        log.info("***************************");
        List<StudentBean> studentBeans = restService.studentBeans();
        return studentBeans;
    }

    @Override
    public TestBean testBean() {
        return null;
    }
}
