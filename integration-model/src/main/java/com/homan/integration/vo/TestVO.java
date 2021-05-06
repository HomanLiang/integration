package com.homan.integration.vo;

import java.io.Serializable;

/**
 * @description:
 * @author: Homan Liang
 * @time: 2021/5/6 15:05
 */
public class TestVO implements Serializable {
    /**
     * 时间戳
     */
    private Long timestamp;

    private String sign;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
