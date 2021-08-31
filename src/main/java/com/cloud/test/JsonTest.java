package com.cloud.test;

import com.alibaba.fastjson.JSONObject;
import com.cloud.common.Result;



public class JsonTest {
    public static void main(String[] args) {
        String JsonString = " {\"success\":true,\"resultCode\":\"100\",\"msg\":\"成功\",\"data\":[{\"gmtModify\":1622098512000,\"gmtCreate\":1622098512000,\"id\":30400,\"corpId\":20201,\"corpName\":\"阜阳人民医院(南区)\",\"userId\":996771,\"patientId\":1000026071,\"patientName\":\"吴文辉\",\"idType\":1,\"idNo\":\"330***********4312\",\"guarderIdNo\":\"\",\"status\":100,\"billNo\":\"12868242\",\"billType\":\"已结算\",\"billFee\":100,\"deptName\":\"方便门诊\",\"selfFee\":0,\"insurFee\":0,\"oppatNo\":\"0001785671\",\"cardNo\":\"000000010410\",\"transNo\":\"12868242\",\"payDate\":\"2021-05-27\",\"unionId\":3401,\"billName\":\"已结算\"}],\"startTime\":1629108816777,\"timeConsum\":3723,\"traceId\":\"0a1000061629108813027289913244\"}";
        Result result = JSONObject.parseObject(JsonString, Result.class);
    }

}
