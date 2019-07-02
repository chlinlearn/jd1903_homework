package com.briup.io;

/* *
 * @author: xuchunlin
 * @createTime: 2019/7/1/14:17
 * @description: 下载网络资源
 */

import com.briup.tools.Stack;

import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;

public class HttpDown {
    public static void main(String[] args) {
        String strURL = "https://dzs.qisuu.la/15/15862/%E6%96%97%E7%BD%97%E5%A4%A7%E9%99%86.txt";
        final int DOWN_THREAD_NUM = 4;
        final String PATH = "src/com/briup/io/files/"; //文件存放路径
        final String OUT_FILE_NAME = "basketball.txt";//文件名
        InputStream[] isArr = new InputStream[DOWN_THREAD_NUM];
        RandomAccessFile[] rafArr = new RandomAccessFile[DOWN_THREAD_NUM];
        try {
            System.out.println("下载开始.....");
            long startTime = System.currentTimeMillis();
            URL url = new URL(strURL);
            URLConnection conn = url.openConnection();

            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64)");
            //InputStream is = conn.getInputStream();
            long fileLength = conn.getContentLength();//获取文件长度
            System.out.println("文件长度="+fileLength);
            isArr[0] = url.openStream();
            rafArr[0] = new RandomAccessFile(PATH+OUT_FILE_NAME,"rw");
            for (int i=0;i<fileLength;i++){
                rafArr[0].write(0);
            }
            long numPerThread = fileLength/DOWN_THREAD_NUM;
            long left = fileLength%DOWN_THREAD_NUM;
            for (int i=0;i<DOWN_THREAD_NUM;i++){
                if (i!=0){
                    isArr[i] = conn.getInputStream();
                    rafArr[i] = new RandomAccessFile(PATH+OUT_FILE_NAME,"rw");
                }
                if (i==DOWN_THREAD_NUM-1){
                    new DownThread(i*numPerThread,(i+1)*numPerThread+left ,isArr[i],rafArr[i]).start();
                }else {
                    new DownThread(i*numPerThread,(i+1)*numPerThread ,isArr[i],rafArr[i]).start();
                }
            }

            /*for (int i=0;i<DOWN_THREAD_NUM;i++){
                isArr[i] = conn.getInputStream();
                long start = (i*fileLength)/DOWN_THREAD_NUM;
                long end = ((i+1)*fileLength)/DOWN_THREAD_NUM;
                System.out.println(start+"-->"+end);
                rafArr[i] = new RandomAccessFile(PATH+OUT_FILE_NAME,"rw");
                new DownThread(start, end,isArr[i],rafArr[i]).start();
            }
            long endTime = System.currentTimeMillis();
            System.out.println("下载结束.....");
            System.out.println("花费时间："+(endTime-startTime));*/
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class DownThread extends Thread{
    private final int BUFF_LEN = 1024;
    private long start;//下载起始位置
    private long end;//下载结束位置
    private InputStream is;//输入流
    private RandomAccessFile raf;//输出

    public DownThread(long start,long end,InputStream is,RandomAccessFile raf){
        System.out.println("该线程下载的起始和结束位置："+start+"---->"+end);
        this.start = start;
        this.end = end;
        this.is = is;
        this.raf = raf;
    }

    @Override
    public void run() {
        byte[] buff = new byte[BUFF_LEN];
        try {
            is.skip(start);//跳过并丢弃来自此输入流的 n字节数据。
            raf.seek(start);//设置文件指针偏移
            long contentLen = end-start;//该线程需要读取的字节长度
            long times = contentLen/BUFF_LEN+4;
            int hasRead = 0;
            for (int i=0;i<times;i++){
                hasRead = is.read(buff);
                if (hasRead<0){
                    break;
                }
                raf.write(buff,0,hasRead);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (raf!=null)raf.close();
                if (is!=null)is.close();
            }catch (Exception e){
                e.printStackTrace();
            }
    }
    }

}