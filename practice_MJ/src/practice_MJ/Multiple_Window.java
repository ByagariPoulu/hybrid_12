package practice_MJ;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Window{


	public static void main(String[] args) throws InterruptedException {
		
		
		List al = new ArrayList();
		
		al.add("String");
		al.add("Java");
		al.add("Python");
		al.add('A');
		al.add(678);
		for(int i=0; i<=al.size();i++)
		{
			System.out.println( al.get(i));
		}

	}


}


