package com.example.demo.main.mapper;

import com.example.demo.main.vo.MainVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MainMapper {

    List<MainVO> selectMainList(MainVO mainVO);

}
