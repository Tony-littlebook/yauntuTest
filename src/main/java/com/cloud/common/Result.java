package com.cloud.common;
import com.alibaba.fastjson.JSON;
import lombok.Data;


import java.io.Serializable;

/**
 * @Author sandy
 * @create 2021/8/9 9:43 上午
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 5616070434977448606L;
    private boolean success;
    private String resultCode;
    private String msg;
    private T data;
    public long startTime;
    public long timeConsum;
    private String traceId;
    private String spanId;
    private static final String HOSTNAME = (String)System.getenv().get("COMPUTERNAME");

    public String toJson() {
        return JSON.toJSONString(this);
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getSpanId() {
        return this.spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }
}

