package org.poj;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoClass extends BaseClass {
	public pojoClass() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='About Us'])[1]")
	public WebElement about;

	@FindBy(xpath = "(//div[@role='button'])[2]")
	public WebElement hotels;

	@FindBy(xpath = "(//div[@role='button'])[3]")
	public WebElement office;

	@FindBy(xpath = "(//div[@role='button'])[4]")
	public WebElement airpoet;

	@FindBy(xpath = "(//div[@role='button'])[5]")
	public WebElement retail;

	@FindBy(xpath = "(//span[@class='elementor-icon-list-text'])[19]")
	public WebElement our;

	@FindBy(xpath =  "(//span[@class='elementor-button-text'])[2]")
	public WebElement cont;

	@FindBy(xpath =  "(//span[@class='elementor-icon-list-text'])[21]")
	public WebElement conts;

	@FindBy(name = "form_fields[name]")
	public WebElement fullName;

	@FindBy(id = "form-field-email")
	public WebElement company;

	@FindBy(name = "form_fields[message]")
	public WebElement phone;


	@FindBy(xpath = "//input[@type='email']")
	public WebElement email;

	@FindBy(xpath = "//select[@name='form_fields[field_a5209a9]']")
	public WebElement select;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	public WebElement location;

	@FindBy(xpath = "//textarea[@placeholder='Message']")
	public WebElement message;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submit;
	
	public WebElement getAbout() {
		return about;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getOffice() {
		return office;
	}

	public WebElement getAirpoet() {
		return airpoet;
	}

	public WebElement getRetail() {
		return retail;
	}

	public WebElement getOur() {
		return our;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getConts() {
		return conts;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getMessage() {
		return message;
	}

	public WebElement getSubmit() {
		return submit;
	}


}
