package com.test.ssm.controller;

import com.github.pagehelper.PageInfo;
import com.test.ssm.pojo.Department;
import com.test.ssm.pojo.Duties;
import com.test.ssm.service.DutiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DutiesController {
    @Autowired
    private DutiesService dutiesService;
  @RequestMapping("listPost.html")
    public ModelAndView listPost(Integer pageNum){
      if (pageNum==null||pageNum<1){
          pageNum=1;
      }
      PageInfo<Duties> pageInfo = dutiesService.getAllDuties(pageNum,2);
      return new ModelAndView("listPost","pageInfo",pageInfo);
//      return "listPost";
  }
  @RequestMapping("addOrEditPost.html")
  @ResponseBody
    public ModelAndView addOrEditPost(){
        List<Department> departmentList = dutiesService.getAllDeparment();
        return new ModelAndView("addOrEditPost","departmentList",departmentList);
      //  return "addOrEditPost";
  }
  @RequestMapping("addPost.html")
    public String addPost( Duties duties){
        dutiesService.addDuties(duties);
        return "redirect:listPost.html";

  }

}
