package com.ossic.fileTest;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * created by songyuefeng on 18/1/17
 */
public class FileSoloSendTest {
    public static void main(String[] args) {

        FileSoloSendTest fileTest = new FileSoloSendTest();
        File file = fileTest.getFile("fileTest.txt");
        BufferedReader br;
        int numAll = 0;
        int numSucc = 0;
        int numIllegal = 0;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            boolean odd = true;
            // 防止文件空行过多,阻塞线程
            int blankLines = 0;
            String line;
            String toSid = null;
            String content;
            while ((line = br.readLine()) != null && blankLines < 10) {
                if (StringUtils.isBlank(line)) {
                    blankLines++;
                    continue;
                }
                blankLines = 0;
                line = line.trim();
                if (odd) {
                    if (!sidCheck(line)) {
                        numAll++;
                        numIllegal++;
                        continue;
                    }
                    toSid = line;
                    odd = !odd;
                } else {
                    if (sidCheck(line)) {
                        toSid = line;
                        numAll++;
                        numIllegal++;
                        continue;
                    }
                    content = line;
                    odd = !odd;
                    numAll++;
                    numSucc++;
                }
            }
            if(!odd){
                numAll++;
                numIllegal++;
            }
            System.out.println("all:"+numAll);
            System.out.println("success:"+numSucc);
            System.out.println("illegal:"+numIllegal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean sidCheck(String sid) {
        if (StringUtils.isBlank(sid)) {
            return false;
        }
        String regEx = "^w?\\d+$";
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(sid);
        return matcher.matches();
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
