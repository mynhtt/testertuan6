package com.rcv.readdata;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataToTxtAndCSV {
    public static void main(String[] args) throws IOException{
        File f = new File("D:\\HCMUE\\2022-2023\\HK2\\KIEM THU PHAN MEM\\tesst\\src\\com\\rcv\\properties\\TestData.txt"); // đổi đuôi file từ txt thành csv để đổi loại file đọc
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println("Read successfully");
        br.close();
    }
}
