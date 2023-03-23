package com.rcv.readdata;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class ReadDataDemo{
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\HCMUE\\2022-2023\\HK2\\KIEM THU PHAN MEM\\testertuan6\\Testingweek\\src\\com\\rcv\\properties\\TestData.properties");
        Properties p = new Properties();
        p.load(fr);
        System.out.println(p.getProperty("website"));
    }
}
