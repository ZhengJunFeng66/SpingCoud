//package com.zheng.order8012.controller;
//
//import com.zheng.commons.bean.StudentBean;
//import com.zheng.commons.bean.TestBean;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//@RestController
//public class DemoController {
//    @Autowired
//    RestTemplate restTemplate;
//    String url="http://"+"cloud-consul-payment/";
//    @RequestMapping("/get")
//    public List<StudentBean> studentBeans(){
//        return restTemplate.getForObject(url+"ddds",List.class);
//    }
//    @RequestMapping("/post")
//    public TestBean testBean(){
//        int i=10;
//        System.out.println("********************************************");
//        StudentBean studentBean=new StudentBean();
//        studentBean.setAddress("sdfdsfds");
//        studentBean.setId(1497978979798798l+i++);
//        studentBean.seteName("DSfsdfsdfds");
//        System.out.println(studentBean);
//        return restTemplate.postForObject(url+"ppps",studentBean,TestBean.class);
//    }
//}
