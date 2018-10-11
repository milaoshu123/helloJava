package com.lll.service.impl;

import com.lll.dao.StudentDao;
import com.lll.model.Student;
import com.lll.service.StudentService;

public class StudentServiceImpl implements StudentService {

    StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void addStudent(Student student) {
        studentDao.insertStudent(student);
    }
}
