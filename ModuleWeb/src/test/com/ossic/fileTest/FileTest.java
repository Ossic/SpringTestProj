package com.ossic.fileTest;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.URL;

/**
 * created by songyuefeng on 18/1/17
 */
public class FileTest {
    public static void main(String[] args) {

        FileTest fileTest = new FileTest();
        File file = fileTest.getFile("fileTest.txt");
        BufferedReader br;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                if (StringUtils.isBlank(line)) {
                    count++;
                }
                System.out.print("<" + line + ">");
            }
            System.out.println("count:" + count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private File getFile(String fileName) {
        ClassLoader classLoader = getClass().getClassLoader();
        /**
         getResource()方法会去classpath下找这个文件，获取到url resource, 得到这个资源后，调用url.getFile获取到 文件 的绝对路径
         */
        URL url = classLoader.getResource(fileName);
        /**
         * url.getFile() 得到这个文件的绝对路径
         */
        System.out.println(url.getFile());
        File file = new File(url.getFile());
        System.out.println(file.exists());
        return file;
    }
}
