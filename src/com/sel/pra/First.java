package com.sel.pra;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;



public class First {

	
	@Test
	@Parameters({"browser"})
	
	void q(String browser) {
		
		System.out.println(browser);

		
	}
		
		@Test
		void te() {
			System.out.println("hello");

	}
		

		

@Test(dataProvider="mydp")




void w(String aa, String bb) {
	
	System.out.println(aa);
	System.out.println(bb);
}

@DataProvider(name="mydp")

public Object[][] v(){
	
	Object[][] data=new Object[3][2];
	
	{
		data[0][0]="hi";
		data[0][1]="hello";
		data[1][0]="hi";
		data[1][1]="hello";
		data[2][0]="hi";
		data[2][1]="hello";
	}
	return data;
}

}
