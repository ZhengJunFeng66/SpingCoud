package com.zheng.payment8012;

import com.zheng.commons.bean.StudentBean;
import com.zheng.payment8012.dao.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CloudConsulPayment8012ApplicationTests {
    @Autowired
    StudentDao studentDao;
    @Test
    void contextLoads() {
        List<StudentBean> getslist = studentDao.getList();
        System.out.println(getslist);

    }

}
