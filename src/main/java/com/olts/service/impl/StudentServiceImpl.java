package com.olts.service.impl;

import com.olts.dao.StudentDao;
import com.olts.pojo.Student;
import com.olts.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Student studentLogin(Student student){
        return studentDao.studentLogin(student);
    }
}
