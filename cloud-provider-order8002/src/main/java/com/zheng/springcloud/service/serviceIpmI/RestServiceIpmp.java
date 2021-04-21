package com.zheng.springcloud.service.serviceIpmI;

import com.zheng.commons.bean.StudentBean;
import com.zheng.commons.bean.TestBean;
import com.zheng.springcloud.service.RestService;

import java.util.ArrayList;
import java.util.List;

public class RestServiceIpmp implements RestService {
    @Override
    public List<StudentBean> studentBeans() {
        List<StudentBean> studentBeans=new ArrayList<>();
        StudentBean studentBean = new StudentBean();
        studentBean.setId(4546456456l);
        studentBeans.set(0, studentBean);
        return studentBeans;
    }

    @Override
    public TestBean testBean() {
        System.out.println("cuowu");
        return null;
    }
}
