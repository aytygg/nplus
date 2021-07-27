package com.example.demo.main.controller;

import com.example.demo.main.service.MainService;
import com.example.demo.main.vo.MainVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    MainService mainService;

    @RequestMapping(value="/main")
    public String main(Model model , HttpServletRequest request , HttpServletResponse response){

        List<MainVO> mainList =  mainService.selectMainList(new MainVO());
        System.out.println("mainListSize = "+ mainList.size());
        model.addAttribute("mainList", mainList);

        for (MainVO vo : mainList) {
            System.out.println(vo.getSubject());
            System.out.println(vo.getContents());
            System.out.println(vo.getCamelTest());
        }

        return "view/main/main";
    }

}
