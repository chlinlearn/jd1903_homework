package com.briup.io;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/27/9:36
 * @description: TODO
 */

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesFile {
    public static void main(String[] args) {
        Properties p = new Properties();
        try {
            //加载文件
            p.load(new FileReader("src/com/briup/io/files/message.properties"));
            //String name = p.getProperty("prop_name");
            //System.out.println(name);
            //命令行输入
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入：");
            while (scanner.hasNext()){
                String key = scanner.next();
                if (key.equals("exit")){
                    System.exit(0);
                }
                String value = p.getProperty(key);
                System.out.println(key+":"+value);
                System.out.println("请输入：");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
