package com.cloud.test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ParseXmlByDom4j {
    public static void main(String[] args) {
        // 1、 创建SAXReader对象
        SAXReader reader = new SAXReader();
        try{
            // 2、指定要解析的XML文件
            Document document = reader.read("src/main/resources/myProperties.xml").getDocument();
            // 3、 遍历所有teacer节点下的内容
            Element rootElement = document.getRootElement();
            for (Element element : rootElement.element("teachers").elements()) {
                String qname = element.getQName().getName();
                String teacherName = element.element("name").getText();
                String teacherAge = element.element("age").getText();
                System.out.println(qname + ": name = " + teacherName + " age = " + teacherAge);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
