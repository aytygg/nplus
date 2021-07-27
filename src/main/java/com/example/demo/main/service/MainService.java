package com.example.demo.main.service;

import com.example.demo.main.vo.MainVO;

import java.util.List;


public interface MainService {

    List<MainVO> selectMainList(MainVO mainVO);

}
