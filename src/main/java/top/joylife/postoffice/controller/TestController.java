package top.joylife.postoffice.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.joylife.postoffice.common.dto.Result;
import top.joylife.postoffice.common.exception.Warning;
import top.joylife.postoffice.dao.entity.Courier;
import top.joylife.postoffice.dao.mapper.CourierMapper;

import java.util.Date;
import java.util.List;

/**
 * created by wuhaiming on 2018/2/2
 */
@RestController
public class TestController {

    @Autowired
    private CourierMapper courierMapper;

    private Logger logger = LoggerFactory.getLogger(TestController.class);


    @RequestMapping("/courier")
    String courier(){
        List<Courier> couriers = courierMapper.selectAll();
        Date zero = new Date(0);
        logger.info("时间戳：{}",String.valueOf(zero.getTime()));
        logger.info(String.valueOf(couriers.get(0).getDateDelete()));
        return JSON.toJSONString(couriers);
    }

    @RequestMapping("/insert")
    String insert(){
        Courier courier = new Courier();
        courier.setEmail("xxx@xx.com");
        courier.setPassword("xxxx");
        courier.setNickname("xxx");
        courier.setDateDelete(new Date(0));
        courierMapper.insertSelective(courier);
        return JSON.toJSONString(courier);
    }

    @RequestMapping("/select")
    String select(){
        Courier para = new Courier();
        para.setDateDelete(new Date(0));
        List<Courier> couriers = courierMapper.select(para);
        return JSON.toJSONString(couriers);
    }

    @RequestMapping("/warning")
    Result warning(){
        throw new Warning("xxx",111);
    }
}
