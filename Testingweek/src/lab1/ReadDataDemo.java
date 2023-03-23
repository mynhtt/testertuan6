package lab1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("testertuan6\\Testingweek\\src\\properties\\TestData.properties");
        Properties p = new Properties();
        p.load(fr);
        System.out.println(p.getProperty("website"));
    }
}
