package com.SSMdemo.controller;

import com.SSMdemo.bean.UserBean;
import com.SSMdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 表示层，和前端进行数据交互
 */
@Controller
public class UserController {
    @Autowired
    private IUserService service;

    /**
     *t通过id查询user所用信息
     * @param id
     * @return mav
     */
    @RequestMapping("test.do")
    //直接返回一个ModelAndView
    public ModelAndView findMessage(Integer id){
        ModelAndView mav = new ModelAndView();
       UserBean bean = service.findById(id);
       if (bean!=null){
           mav.addObject("bean",bean);
       }else {
           System.out.println("bean为null");
       }

        mav.setViewName("jsp/testresult.jsp");
        return mav;
    }

    @RequestMapping("test1.do")
    //通过内置对象和model向前台传递参数
    public String findMessage2(Model model, HttpServletRequest request, HttpSession session){

        UserBean bean = service.findById(1);
        model.addAttribute("bean",bean);
        return "jsp/testresult.jsp";
    }



}
