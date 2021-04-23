package com.zheng.configclient3355.controller;

import com.zheng.commons.bean.StudentBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
@ResponseBody
@RefreshScope
public class ControllerTest {
    @Value("${zheng.jun}")
    String str;
    @Autowired
    JdbcTemplate jdbcTemplate;
    @RequestMapping("/ddd")
    public List<StudentBean> string(){
        RowMapper<StudentBean> studentBeanRowMapper=new BeanPropertyRowMapper<StudentBean>(StudentBean.class);
        List<StudentBean> query = jdbcTemplate.query("select * from student", studentBeanRowMapper);
        System.out.println(str);
        return query;

    }
}
