package com.lll.controller;


import com.lll.model.Student;
import com.lll.service.StudentService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController implements Controller {


    StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = request.getParameter("name");
        String ageStr = request.getParameter("age");
        Integer age = Integer.valueOf(ageStr);
        Student student = new Student(name,age);
        studentService.addStudent(student);
        ModelAndView mv = new ModelAndView();
        mv.addObject(student);
        mv.setViewName("/welcome.jsp");
        return mv;
    }
}
