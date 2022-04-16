package com.renchao.test;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GBK 转 UTF-8
 */
public class Transcode {
    public static void main(String[] args) throws IOException {
        //文档所在文件夹
        String p = "E:\\BaiduNetdiskDownload\\尚硅谷图解Java设计模式\\代码";
        //新文件夹
        String np = "E:\\DesignPattern";

        File dir = new File(p);
        List<String> list = new ArrayList<>();

        findFileList(dir, list);

        list.forEach(s -> {
            File file = new File(s);

            String path = file.getPath();
            String newParentPath = file.getParentFile().getPath().replace(p, np);
            String newPath = path.replace(p, np);

            File newFile = new File(newParentPath);
            if (!newFile.exists()) {
                System.out.println(newFile.mkdirs() ? "目录创建成功" : "目录创建失败");
            }

            try {
                change(path,newPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    /**
     * 转换
     */
    public static void change(String path, String newPath) throws IOException {

        FileInputStream fis = new FileInputStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, "GBK"));

        BufferedWriter bw = new BufferedWriter(new FileWriter(newPath));
        br.lines().forEach(s -> {
            try {
                bw.write(s + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        bw.close();
        br.close();
        System.out.println("转换成功：" + newPath);
    }


    /**
     * 读取目录下的所有文件
     *
     * @param dir       目录
     * @param fileNames 保存文件名的集合
     */
    public static void findFileList(File dir, List<String> fileNames) {
        if (!dir.exists() || !dir.isDirectory()) {// 判断是否存在目录
            return;
        }
        String[] files = dir.list();// 读取目录下的所有目录文件信息
        for (int i = 0; i < Objects.requireNonNull(files).length; i++) {// 循环，添加文件名或回调自身
            File file = new File(dir, files[i]);
            if (file.isFile()) {// 如果文件
                fileNames.add(dir + "\\" + file.getName());// 添加文件全路径名
            } else {// 如果是目录
                findFileList(file, fileNames);// 回调自身继续查询
            }
        }
    }

}
