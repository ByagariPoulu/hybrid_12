package practice_MJ;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		LinkedList al = new LinkedList();

		al.add('A');
		al.add('D');
		al.add('S');
		al.add('Z');
		al.add('T');
		for(int i=0; i<al.size();i++)
		{
			System.out.println( al.get(i));
		}
		System.out.println(al.size());

		System.out.println(al);
		Collections.sort(al);
		
		System.out.println(al);
		
		
		System.out.println(al.get(2));
	
		
	}
}
