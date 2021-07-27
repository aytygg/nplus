package com.example.demo.main.service.impl;

import com.example.demo.main.vo.MainVO;
import com.example.demo.main.mapper.MainMapper;
import com.example.demo.main.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MainServiceImpl implements MainService {

    @Autowired
    private MainMapper mainMapper;

    @Override
    public List<MainVO> selectMainList(MainVO mainVO) {
        return mainMapper.selectMainList(mainVO);
    }

}
