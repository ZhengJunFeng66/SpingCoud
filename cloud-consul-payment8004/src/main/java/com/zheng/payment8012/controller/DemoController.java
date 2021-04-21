package com.zheng.payment8012.controller;

import com.zheng.commons.bean.StudentBean;
import com.zheng.commons.bean.TestBean;

import com.zheng.payment8012.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class DemoController {
    @Autowired
    StudentDao studentDao;
    @Value("${server.port}")
    String port;
    @RequestMapping("/ddds")
    public List<StudentBean> studentBeans(){
        List<StudentBean> getslist = studentDao.getslist();
        System.out.println("");
        System.out.println("");
        System.out.println(port);
        return getslist;
    }
    @RequestMapping("/ppps")
    public TestBean anInt(@RequestBody StudentBean studentBeans){
        System.out.println(studentBeans);
        StudentBean studentBean=new StudentBean();
        studentBean.setAddress("sdfdsfds");
        studentBean.setId(1634454565445645l);
        studentBean.seteName("DSfsdfsdfds");
        Integer integer = studentDao.InsertStudent(studentBeans);
        TestBean testBean = new TestBean();
        if(integer>0){
            testBean.setText(integer.toString());
            testBean.setMage("成功");
        }else {
            testBean.setText("0");
            testBean.setMage("失败");
        }

        return testBean;
    }
}
