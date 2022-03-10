package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import com.qa.util.Common;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By search  = By.id("search_query_top");
	private By searchBtn  = By.xpath("//button[@name='submit_search']");
	private By addToCartBtn  = By.xpath("//span[normalize-space()='Add to cart']");
	private By addedToCartIcon  = By.xpath("//i[@class='icon-ok']");
	


	public void homePageUrl() {
		driver.get("http://automationpractice.com/index.php");
	}

	public void searchProduct(String value) {
		Common.type(driver.findElement(search), value);
		Common.pause(2);
		Common.clickOn(driver, driver.findElement(searchBtn));
		Common.pause(2);
	}
	
	public void addToCartBtn() {
		Common.scrollUpToElement(driver, driver.findElement(addToCartBtn));
		Common.jsClick(driver, driver.findElement(addToCartBtn));
	}
	
	public boolean  verifyAddedProduct() {
		
		Common.scrollUpToElement(driver, driver.findElement(addedToCartIcon));
		Common.pause(2);
		if(driver.findElements(addedToCartIcon).size()==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
