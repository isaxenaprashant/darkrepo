package demo.prog;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJava {
	

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.co.in/");
		List<String> li=new ArrayList<String>();
		File file = new File("F://documnets//cc_bills");
        File[] files = file.listFiles();
        for(File f: files){
//            System.out.println("get f name :"+f.getName());
            li.add(f.getName());
        }
		for (String str : li) {
			System.out.println(str);
		}

	}

}
