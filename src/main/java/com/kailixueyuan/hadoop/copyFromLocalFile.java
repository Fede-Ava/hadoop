package com.kailixueyuan.hadoop;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class copyFromLocalFile {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
//        获取配置文件链接
        Configuration conf = new Configuration();
//        获取服务器域名
        URI uri = new URI("hdfs://192.168.23.128:8020");
//        链接服务器
        FileSystem fs = FileSystem.get(uri,conf,"h");

//        上传本地文件到服务器
//        Local Path
        Path src = new Path("d:\\wlc.txt");

//        HDFS Path
        Path dst = new Path("/mydir/wlc.txt");

//        复制本地文件到分布式
        fs.copyFromLocalFile(src,dst);

//        关闭资源
        fs.close();
    }
}
