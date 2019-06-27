package com.briup.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/26/19:15
 * @description: 下载网络上的一张图或文件
 */
class Download extends Thread{
    private final static String strUrl = "https://dzs.qisuu.la/15/15862/%E6%96%97%E7%BD%97%E5%A4%A7%E9%99%86.txt";

    @Override
    public void run() {
        try {
            URL url = new URL(strUrl);
            URLConnection conn = url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
            InputStream fis = conn.getInputStream();
            PrintWriter pw = new PrintWriter("src/com/briup/io/images/" + "dldl" + ".txt");
            BufferedReader bis = new BufferedReader(new InputStreamReader(fis));
            //OutputStream os = new FileOutputStream("src/com/briup/io/images/"+filename+".js");
            char[] buff = new char[1024];
            int len = -1;
            int count = 0;
            while ((len = bis.read(buff)) != -1) {
                pw.write(buff);
                count += 2;
                System.out.println("已下载" + count + "k");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }
}

public class ReadImageTest2 {
   /* public static void download(String urlStr, String filename) throws Exception {
        URL url = new URL(urlStr);
        URLConnection conn = url.openConnection();
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
        InputStream fis = conn.getInputStream();
        PrintWriter pw = new PrintWriter("src/com/briup/io/images/"+filename+".txt");
        BufferedReader bis = new BufferedReader(new InputStreamReader(fis));
        //OutputStream os = new FileOutputStream("src/com/briup/io/images/"+filename+".js");
        char[] buff = new char[1024];
        int len = -1;
        int count = 0;
        while ((len=bis.read(buff))!=-1){
            pw.write(buff);
            count += 2;
            System.out.println("已下载"+count+"k");
        }
        pw.flush();
        pw.close();
        bis.close();
    }*/

    public static void main(String[] args) {

    }
}