package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExampleDemo {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/patharaj/Desktop/DemoTable.html");

		// PRINT ALL HEADERS OF WEB TABLE

		List<WebElement> totalHeader = driver.findElements(By
				.xpath("//table/tbody/tr/th"));

		System.out.println("Total Number Of Header Found::"
				+ totalHeader.size());

		for (WebElement element : totalHeader) {
			System.out.println(element.getText());
		}

		// RETRIEVE AND PRINT NUMBER OF ROWS IN A WEB TABLE
		List<WebElement> totalRow = driver.findElements(By
				.xpath("//table/tbody/tr"));

		System.out.println("Total Number Of Row Found::"
				+ (totalRow.size() - 1));

		for (WebElement element : totalRow) {
			System.out.println(element.getText());
		}

		String part1 = "//table/tbody/tr[";
		String part2 = "]/td";

		// Total Number of Column

		List<WebElement> totalColumn = driver.findElements(By
				.xpath("//table/tbody/tr/td"));
		System.out.println("Total Number of Column::" + totalColumn.size());

		// FIND NUMBER OF COLUMNS FOR EACH ROW
		for (int i = 2; i <= totalRow.size(); i++) {
			List<WebElement> totalColumnInEachRow = driver.findElements(By
					.xpath(part1 + i + part2));
			System.out.println("Total Number of Column in " + (i - 1)
					+ "Row are:" + totalColumnInEachRow.size());
		}
			// RETRIEVE NAME OF BOOK WHOSE AUTHOR IS MUKESH
			
			String first_part="//table/tbody/tr[";
			String second_part="]/td";
			List<WebElement>columnvalue= driver.findElements(By.xpath("//table/tbody/tr/td"));
			System.out.println("Book Written By Mukesh are below");
			for(WebElement element:columnvalue){
				if(element.getText().contains("Mukesh")){
					for(int i=1;i<columnvalue.size();i++){
					driver.findElement(By.xpath(first_part+i+second_part));
					}
				}
			}
			
			
		
	}
}
