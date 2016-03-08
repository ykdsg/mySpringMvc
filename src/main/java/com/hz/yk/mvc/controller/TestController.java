package com.hz.yk.mvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hz.yk.mvc.domain.Employee;
import java.util.Date;

/**
 * Created by wuzheng.yk on 16/3/8.
 */
@Controller
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    /**
     * 跳转首页
     * 
     * @return
     */
    @RequestMapping(value = "/index")
    public String index() {
        log.info("---->进入index页");
        log.error("------>输出错误日志");
        return "index";
    }

    @RequestMapping("/testRb")
    @ResponseBody
    public Employee testRb(@RequestBody Employee e) {
        return e;
    }

    @RequestMapping("/testCustomObj")
    @ResponseBody
    public Employee testCustomObj(Employee e) {
        return e;
    }

    @RequestMapping("/testCustomObjWithRp")
    @ResponseBody
    public Employee testCustomObjWithRp(@RequestParam Employee e) {
        return e;
    }

    @RequestMapping("/testDate")
    @ResponseBody
    public Date testDate(Date date) {
        return date;
    }
}
