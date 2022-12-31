package com.facebook.Facebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	static WebDriver driver;
	static int min;
	public static void setproperty() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Facebook\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();

	}
	
	public static void dresscounts() {
		
		List<WebElement> allproducts = driver.findElements(By.xpath("//li[@class='product-base']"));
		System.out.println("Total T-Shirts Available in Page 1 :" + allproducts.size());
	}
	
    public static void MinPrice() {
		
			List<WebElement> discprices = driver.findElements(By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));
			List<Integer> ref = new ArrayList<Integer>();              
			for (int i = 0; i<discprices.size(); i++) {
				String replaceAll = discprices.get(i).getText().replaceAll("Rs. ", "");
				int parseInt = Integer.parseInt(replaceAll);
				ref.add(parseInt);					
			}
			min = Collections.min(ref);
			System.out.println("Minimum Price of WebPage 1 :"+min);
		
	}
    
    public static void MinPriceBrandName(int min) {
    	
    	WebElement brand1 = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()="+ min +"]//ancestor::div[@class='product-productMetaInfo']//h3"));
    	System.out.println("The Minimum Priced Product Brand1 Name is :"+ brand1.getText());
    }
    
 public static void MinPriceBrandName1(int min) {
    	
    	WebElement brand2 = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()=" + min + "]//ancestor::div[@class='product-productMetaInfo']//h4"));
    	System.out.println("The Minimum Priced Product SubBrand Name is :"+ brand2.getText());
    }
	
	public static void main(String[] args) {
		setproperty();
		dresscounts();
		MinPrice();
		MinPriceBrandName(min);
		MinPriceBrandName1(min);
	}
}
