package com.cloud.test;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLtest {
    public static void main(String[] args) throws Exception{
        String url = "xxxxx?param=" + URLEncoder.encode("za4T8MHB/6mhmYgXB7IntyyOUL7Cl++0jv5rFxAIFVji8GDrcf+k8g==", "utf-8");
        System.out.println(url);
        url = URLDecoder.decode(url, "utf-8");
        System.out.println(url);
    }
}
