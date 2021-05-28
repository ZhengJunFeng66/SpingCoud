package com.zheng.springboot.bootredisdemo;

import com.zheng.springboot.bootredisdemo.dao.StudentDao;
import com.zheng.springboot.bootredisdemo.javabean.Ceshi;
import com.zheng.springboot.bootredisdemo.javabean.StudentBean;
import com.zheng.springboot.bootredisdemo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BootRedisDemoApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StudentDao studentDao;
    @Autowired
    StudentService studentService;
    @Test
    void contextLoads() {
//        Ceshi ceshi=new Ceshi("小明", "4");
//        Ceshi ceshi1=new Ceshi("小明1", "41");
//        List<Ceshi> ceshis=new ArrayList<>();
//        ceshis.add(ceshi);
//        ceshis.add(ceshi1);
//        redisTemplate.opsForValue().set("xioaming",ceshi );
//        redisTemplate.opsForList().leftPushAll("list", ceshis);
//        Ceshi xioaming = (Ceshi) redisTemplate.opsForValue().get("xioaming");
//        //List<Ceshi> xioamingss = (List<Ceshi>) redisTemplate.opsForValue().get("list");
//        //System.out.println(xioamingss);
//        Long size = redisTemplate.boundListOps("list").size();
//        List<Ceshi> list = redisTemplate.boundListOps("list").range(0,size-1 );
//        System.out.println(size);
//        System.out.println(xioaming);
//        System.out.println(list);
//        List<StudentBean> getslist = studentDao.getslist();
//        System.out.println(getslist);
//        List<StudentBean> select = studentService.select();
//        System.out.println(select);
//        List<StudentBean> select = studentService.select();
//        System.out.println(select);
//        Integer delete = studentService.delete();
//        System.out.println(delete);
        List<StudentBean> selects = studentService.selects();
        System.out.println(selects);
        String test = studentService.test(12);
        System.out.println(test);

    }

}
