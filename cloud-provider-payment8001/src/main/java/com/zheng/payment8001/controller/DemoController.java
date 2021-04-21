package com.zheng.payment8001.controller;

import com.zheng.commons.bean.StudentBean;
import com.zheng.commons.bean.TestBean;
import com.zheng.payment8001.dao.StudentDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@Slf4j
public class DemoController {
    @Autowired
    StudentDao studentDao;
    @Value("${server.port}")
    String port;
    @Autowired
    DiscoveryClient discoveryClient;
    @RequestMapping("/ddds")
    public List<StudentBean> studentBeans(){
        List<com.zheng.commons.bean.StudentBean> getslist = studentDao.getslist();
        System.out.println("");
        System.out.println("");
        System.out.println(port);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
    @RequestMapping("/discoveryClient")
    Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String tmp:services) {
            log.info(tmp);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT");
        for (ServiceInstance serviceInstance:instances){
            log.info(serviceInstance.getInstanceId());
            log.info(serviceInstance.getServiceId());
            log.info(serviceInstance.getHost());
            log.info(serviceInstance.getScheme());
            log.info(serviceInstance.getUri().toString());
            int port = serviceInstance.getPort();
            log.info(Integer.toString(port));
        }
        return this.discoveryClient;
    }
}
