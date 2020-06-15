package com.olts.dao;

import com.olts.pojo.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    //学生登陆
    public Student studentLogin(Student student);
}
