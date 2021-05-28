package com.zheng.springboot.bootredisdemo.service;

import com.zheng.springboot.bootredisdemo.javabean.StudentBean;

import java.util.List;

public interface StudentService {
    List<StudentBean> select();
    Integer delete();
    List<StudentBean> selects();
    String test(int id);
}
