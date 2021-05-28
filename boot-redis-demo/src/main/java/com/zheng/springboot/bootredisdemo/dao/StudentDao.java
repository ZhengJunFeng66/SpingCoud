package com.zheng.springboot.bootredisdemo.dao;


import com.zheng.springboot.bootredisdemo.javabean.StudentBean;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentDao {
    List<StudentBean> getslist();
    //多条
    List<StudentBean> getList();
    //单条
    List<StudentBean> getStudentLists(StudentBean studentBean);
    //删除
    Integer deleteStudent(Long id);
    //修改
    Integer updateStudent(StudentBean studentBean);
    //录入
    Integer InsertStudent(StudentBean studentBean);
    //总行数
    Integer Count();
    //分页
    List<StudentBean> limitList(@Param("page") int page, @Param("rows") int rows);

}
