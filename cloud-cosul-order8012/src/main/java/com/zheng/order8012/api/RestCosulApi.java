package com.zheng.order8012.api;

import com.zheng.commons.bean.StudentBean;
import com.zheng.commons.bean.TestBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Component
public interface RestCosulApi {
    @GetMapping("/ddds")
    List<StudentBean> studentBeans();
    @PostMapping("post")
    TestBean testBean();
}
