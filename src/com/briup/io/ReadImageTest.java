package com.briup.io;

import java.io.*;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/26/19:05
 * @description: 读取一张图片
 */
//字节流
public class ReadImageTest {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        PrintStream ps = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("src/com/briup/io/images/cloud.png"));
            ps = new PrintStream("src/com/briup/io/say.jpg");
            byte[] buff = new byte[1024];
            int len = -1;
            while ((len=bis.read(buff))!=-1){
                ps.write(buff,0,len);
            }
            ps.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (ps!=null)ps.close();
            if (bis!=null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
