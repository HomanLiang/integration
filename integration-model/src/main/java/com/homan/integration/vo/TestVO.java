package com.homan.integration.vo;

import java.io.Serializable;

/**
 * @description:
 * @author: Homan Liang
 * @time: 2021/5/6 15:05
 */
public class TestVO implements Serializable {
    /**
     * 测试名字
     */
    private String testName;

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
