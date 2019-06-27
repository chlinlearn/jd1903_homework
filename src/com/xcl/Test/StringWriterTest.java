package com.xcl.Test;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/26/18:48
 * @description: TODO
 */

import java.io.*;

public class StringWriterTest {
    public static void main(String[] args) {
        StringWriter out = new StringWriter();
        PrintWriter pw = new PrintWriter(out);
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/com/xcl/Test/User.java"));
            String temp = null;
            while ((temp=br.readLine())!=null){
                pw.print(temp);
                break;
            }
            pw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(out.toString());
    }
}
