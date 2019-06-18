package com.briup.reflect;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/18/15:17
 * @description: TODO
 */

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        String path = "src/com/briup/reflect/info.properties";
        p.load(new FileInputStream(path));
        String name = p.getProperty("name");
        System.out.println(name);
    }
}
