package com.cloud.test;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLtest {
    public static void main(String[] args) throws Exception{
        String url = "xxxxx?param=" + URLEncoder.encode("za4T8MHB/6mhmYgXB7IntyyOUL7Cl++0jv5rFxAIFVji8GDrcf+k8g==", "utf-8");
        System.out.println(url);
        url = URLDecoder.decode(url, "utf-8");
        String myUrl = URLDecoder.decode("https%3A%2F%2Fuat.yuantutech.com%2Fyuantu%2Fh5-cli%2F1.21." +
                "7%2Fpay-status.html%3FcorpId%3D929%26unionId%3D3601%26feeChannel%3D6%26optType%3D1&tr" +
                "adeType=APP&feeChannel=6&optType=1&corpId=929&unionId=3601&t=85068&invokerChannel=H5&i" +
                "nvokerDeviceType=others&invokerAppVersion=2.22.4&callback=jsonp1630466687515", "utf-8");
        System.out.println(myUrl);
        System.out.println(url);
    }
}
