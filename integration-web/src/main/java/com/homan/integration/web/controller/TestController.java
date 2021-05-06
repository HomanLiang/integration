package com.homan.integration.web.controller;

import com.homan.integration.vo.TestVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 测试控制器
 * @author: Homan Liang
 * @time: 2021/5/6 14:34
 */
@RestController
@RequestMapping(value="/test")
public class TestController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public TestVO test() throws Exception {
        TestVO testVO = new TestVO();
        testVO.setTestName("aaaa");

        return testVO;
    }
}
