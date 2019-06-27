package com.briup.io;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/27/9:10
 * @description: 将一个文件拷贝到多个文件中
 */

import java.io.*;

public class CopyTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            for (int i=0;i<5;i++) {
                br = new BufferedReader(new FileReader("src/com/briup/io/files/dldl.txt"));
                pw = new PrintWriter(new FileWriter("src/com/briup/io/files/copy_"+i+".txt"));
                char[] buff = new char[1024];
                int len = -1;
                while ((len=br.read(buff))!=-1){
                    pw.println(buff);
                }
                pw.flush();
                br.close();
                pw.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (br!=null) br.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            if (pw!=null) pw.close();
        }
    }
}
