package com.briup.io;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* *
 * @author: xuchunlin
 * @createTime: 2019/6/26/19:15
 * @description: 下载网络上的一张图或文件,无法利用RandomAccessFile做到多点分块下载，因为资源不在自己手上
 */
class Download{
    private static String strUrl;
    private long fileLength;
    private String fileType;
    private InputStream fis;
    //"https://dzs.qisuu.la/15/15862/%E6%96%97%E7%BD%97%E5%A4%A7%E9%99%86.txt";

    public Download(String name){
        strUrl = name;
    }

    /**
     *  加载网络资源
     *  获取文件大小，文件类型，文件输入流
     * @throws Exception
     */
    public void load() throws Exception{
        URL url = new URL(strUrl);
        URLConnection conn = url.openConnection();
        conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
        fis = conn.getInputStream();
        //获取网络文件大小
        fileLength = conn.getContentLength();
        fileType = conn.getContentType();
    }

    public long getFileLength() {
        return fileLength;
    }

    public String getFileType() {
        return fileType;
    }

    public InputStream getFis() {
        return fis;
    }
}

class ReadFrom{
    private RandomAccessFile raf;

    public ReadFrom(String srcPath)throws Exception{
        raf = new RandomAccessFile(srcPath,"r");
    }

    public int read(long pos,byte[] buff)throws Exception{
        raf.seek(pos);
        return raf.read(buff);
    }
}

class WriteTo{
    private RandomAccessFile raf;

    public WriteTo(String destPath)throws Exception{
        raf = new RandomAccessFile(destPath,"rw");
    }

    public void write(long pos,byte[] buff,int len)throws Exception{
        raf.seek(pos);
        raf.write(buff,0,len);
    }

}

public class DownloadTest extends Thread{
    private long begin;
    private long end;
    private ReadFrom from;
    private WriteTo to;

    public DownloadTest(long begin,long end,ReadFrom from,WriteTo to){
        this.begin = begin;
        this.end = end;
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        try {
            byte[] buff = new byte[1024];
            //读数据并写数据
            while (begin < end) {
                int len = from.read(begin, buff);
                //判断是否超出了结束的位置
                if (begin+len>end){
                    len = (int)(end-begin);
                }
                to.write(begin,buff,len);
                begin += len;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        String url = "https://dzs.qisuu.la/15/15862/%E6%9" +
                "6%97%E7%BD%97%E5%A4%A7%E9%99%86.txt";
        Download d = new Download(url);
        d.load();
        long length = d.getFileLength();
        String type=  d.getFileType();
        InputStream in = d.getFis();
        ReadFrom from = new ReadFrom(url);
        WriteTo to = new WriteTo("src/com/briup/io/a.txt");
        Thread[] threads = new Thread[3];
        for (int i=0;i<3;i++){
            threads[i] = new DownloadTest(i/length,(i+1)/length,from,to);
            threads[i].start();
            threads[i].join();
        }
    }
}