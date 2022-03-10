package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.util.Common;

public class MyAddressesPage {
	
	private WebDriver driver;

	public MyAddressesPage(WebDriver driver) {
		this.driver = driver;
	}


	private By MyAddressesLink = By.xpath("//span[normalize-space()='My addresses']");
	private By addAddressesBtnLink = By.xpath("//span[text()='Add a new address']");
	private By enterAddresses = By.xpath("//input[@id='address1']");
	private By enterCity = By.xpath("//input[@id='city']");
	private By enterState = By.xpath("//select[@id='id_state']");
	private By enterPostalCode = By.xpath("//input[@id='postcode']");
	private By enterCountry = By.xpath("//select[@id='id_country']");
	private By enterphone  = By.xpath("//input[@id='phone_mobile']");
	private By enteraddresstitle  = By.xpath("//input[@id='alias']");
	private By clickOnSaveAddNewAddress  = By.xpath("//span[normalize-space()='Save']");

	
	public void MyAddressesLink() {
		driver.findElement(MyAddressesLink).click();
	}
	
	public String getMyAddressTitle() {
		return driver.getTitle();
	}
	
	public void addAddressesBtnLink() {
		Common.pause(1);
		Common.scrollUpToElement(driver, driver.findElement(addAddressesBtnLink));
		driver.findElement(addAddressesBtnLink).click();
	}
	
	public void enterAddresses(String value) {
		Common.type(driver.findElement(enterAddresses), value);
	}

	public void enterCity(String value) {
		Common.type(driver.findElement(enterCity), value);
	}

	public void enterState(String value) {
		Common.selectFromComboByVisibleElement(driver.findElement(enterState), value);
	}
	
	public void enterPostalCode(String value) {
		Common.type(driver.findElement(enterPostalCode), value);
	}
	
	public void enterCountry(String value) {
		Common.selectFromComboByVisibleElement(driver.findElement(enterCountry), value);
	}
	
	public void enterphone(String value) {
		Common.type(driver.findElement(enterphone), value);
	}
	
	public void enteraddresstitle(String value) {
		Common.type(driver.findElement(enteraddresstitle), value);
	}
	
	public void clickOnSaveAddNewAddress() {
		Common.clickOn(driver, driver.findElement(clickOnSaveAddNewAddress));
	}
	
	public boolean verifyAddressTitilePresent	(String value) {
		String xpath = "//h3[normalize-space()='"+value+"']";
		Common.scrollUpToElement(driver, driver.findElement(By.xpath(xpath)));
		Common.pause(2);
		if(driver.findElements(By.xpath(xpath)).size()==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
}
