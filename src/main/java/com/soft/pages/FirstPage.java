package com.soft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.soft.base.Base;

public class FirstPage extends Base{
	
	public FirstPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//input[@title='Search']")
	WebElement SearchBox;
	
	@FindBy(xpath="//input[@value=\"I'm Feeling Lucky\"]")
	WebElement ImFeelingLucky;
	
	public void searchGoolge() {		
		driver.get("https://www.google.com");
		SearchBox.sendKeys("hi", Keys.ENTER);
		//SearchBox.sendKeys(Keys.ENTER);

		for(int i = 3; i <= 11; i++) {
			driver.findElement(By.xpath("//*[@id=\"xjs\"]/div/table/tbody/tr/td[" + i +"]/a")).click();
			System.out.println(driver.findElement
							  (By.xpath("//*[@id='result-stats']")).getAttribute("innerHTML"));
		}
	}
}
