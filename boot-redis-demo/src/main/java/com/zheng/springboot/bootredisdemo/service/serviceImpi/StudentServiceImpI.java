package com.zheng.springboot.bootredisdemo.service.serviceImpi;

import com.zheng.springboot.bootredisdemo.dao.StudentDao;
import com.zheng.springboot.bootredisdemo.javabean.StudentBean;
import com.zheng.springboot.bootredisdemo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@CacheConfig(cacheNames = "student")
@Slf4j
public class StudentServiceImpI implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Transactional
    @Cacheable(key = "'one'")
    public List<StudentBean> select() {
        List<StudentBean> list = studentDao.getList();
        log.info("测试select");
        System.out.println(2);
        return list;
    }

    @Transactional
    @CacheEvict(key = "'one'",allEntries = false)
    public Integer delete() {
        Integer integer = studentDao.deleteStudent(84582723695415291l);
         log.info("测试delete");
        System.out.println(1);
        return integer;
    }
    @Transactional
    @CachePut(key = "'updata'")
    public  List<StudentBean> selects() {

        List<StudentBean> list = studentDao.getList();
        log.info("测试updata");
        System.out.println(3);
        return list;
    }
    @Cacheable(key = "'test'",condition = "#id>10")
    public String test(int id) {
        System.out.println(12131);
        return "方法缓存测试"+id;
    }
}
