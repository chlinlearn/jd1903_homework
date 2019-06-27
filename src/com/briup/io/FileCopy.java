package com.briup.io;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/27/9:50
 * @description: TODO
 */

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        File srcFile = new File("src/com/briup/io/files/hello.txt");
        if (!srcFile.exists()){
            System.out.println("源文件不存在！");
            System.exit(0);
        }
        File destFile = new File("src/com/briup/io/files/hi.txt");
        //destFile.setWritable(false);
        if (!destFile.canWrite()){
            System.out.println("目标文件没有写的权限！");
            System.exit(0);
        }
        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);
            br = new BufferedReader(fr);
            pw = new PrintWriter(fw);
            String temp = null;
            while ((temp=br.readLine())!=null){
                System.out.println(temp);
                pw.println(temp);
            }
            pw.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (pw!=null)pw.close();
            try {
                if (br != null) br.close();
                if (fw != null) fw.close();
                if (fr != null) fr.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
