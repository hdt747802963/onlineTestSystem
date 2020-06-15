package com.olts.controller;

import com.olts.pojo.Student;
import com.olts.pojo.User;
import com.olts.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/tologin")
    public String tologin(){
        return "login";
    }

    @RequestMapping("/studentLogin")
    public String studentLogin(User user, HttpSession session, Model model) {
        Student stu = new Student(user.getUid(), user.getUpwd());
        Student student = studentService.studentLogin(stu);
        session.setAttribute("userInfo", user);
        System.out.println("student:"+ student);
        if(student != null){
            session.setAttribute("studentInfo", student);
            model.addAttribute("student", student);
            return "success";
        }
        model.addAttribute("msg", "账号或密码错误！请重新输入");
        return "login";
    }

    @RequestMapping("/outLogin")
    public String outLogin(HttpSession session){
        session.invalidate();
        return "login";
    }
}
