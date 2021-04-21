package com.zheng.springcloud.api;

import com.zheng.commons.bean.StudentBean;
import com.zheng.commons.bean.TestBean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
public interface RestApi {
    @GetMapping("/ddds")
    List<StudentBean> studentBeans();
    @PostMapping("post")
    TestBean testBean();
}
