package com.kailixueyuan.MyApp;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class copyFromLocalFile {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
//        获取配置信息
        Configuration conf = new Configuration();

//        获取IP地址
        URI uri = new URI("hdfs://192.168.27.129:8020");

//        获取链接
        FileSystem fs = FileSystem.get(uri,conf,"h");
//      上传文件
//        Locale file
        Path src = new Path("d:\\zxq.txt");

//        HDFS file
        Path dst = new Path("/mydir/zxq.txt");

//        进行上传
        fs.copyFromLocalFile(src,dst);
//        下载文件



//        关闭资源
        fs.close();

    }
}
