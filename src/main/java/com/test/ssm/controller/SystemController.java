package com.test.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.test.ssm.pojo.Department;
import com.test.ssm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SystemController {
    @Autowired
    private DepartmentService departmentService;
    @RequestMapping("index.html")
    public String indext(){
        return "index";
    }
    @RequestMapping("left.html")
    public String left(){
        return "left";
    }
    @RequestMapping("left1.html")
    public String left1(){
        return "left1";
    }
    @RequestMapping("left2.html")
    public String left2(){
        return "left2";
    }
    @RequestMapping("top.html")
    public String top(){
        return "top";
    }
    @RequestMapping("right.html")
    public String right(){
        return "right";
    }
    @RequestMapping("control.html")
    public String control(){
        return "control";
    }
    @RequestMapping("listDepartment.html")
    @ResponseBody
    public ModelAndView listDepartment(Integer pageNum){
        if (pageNum==null||pageNum<1){
            pageNum=1;
        }
        PageInfo<Department> pageInfo = departmentService.getAllDeparment(pageNum,2);
        return new ModelAndView("listDepartment","pageInfo",pageInfo);
        //return "listDepartment";
    }

    @RequestMapping("addOrEditDepartment.html")
    public String addOrEditDepartment(){
//
        return "addOrEditDepartment";
    }
    @RequestMapping("addDepartment.html")
    public String addDepartment(String dname){
        departmentService.addDeparment(dname);
        return "redirect:listDepartment.html";
    }

}
