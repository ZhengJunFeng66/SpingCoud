package com.zheng.payment8012.dao;

import com.zheng.commons.bean.StudentBean;
import com.zheng.commons.bean.StudentEid;
import com.zheng.commons.bean.StudentGid;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Mapper
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
    //eid
    List<StudentEid> eid();
    //gid
    List<StudentGid> gid();
}
