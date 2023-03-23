package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTXTandCSV {
    public static void main(String[] args) throws IOException {
        File f = new File("testertuan6\\Testingweek\\src\\properties\\TestData.txt"); // đổi đuôi file từ txt thành csv để đổi loại file đọc
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
