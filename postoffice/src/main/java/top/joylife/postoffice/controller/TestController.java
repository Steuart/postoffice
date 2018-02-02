package top.joylife.postoffice.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.joylife.postoffice.dao.entity.Test;
import top.joylife.postoffice.dao.mapper.TestMapper;

import java.util.List;

/**
 * created by wuhaiming on 2018/2/2
 */
@RestController
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/")
    String home(){
        List<Test> testList = testMapper.selectAll();
        return JSON.toJSONString(testList);
    }
}
