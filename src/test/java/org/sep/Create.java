package org.sep;

import org.base.BaseClass;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.poj.pojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Create extends BaseClass {
	pojoClass p;
	JavascriptException js;
	
	FirefoxOptions firefox = new FirefoxOptions();
	EdgeOptions edge = new EdgeOptions();

	@Given("To launch the browser")
	public void to_launch_the_browser() {
	  launchBrowser();
		WindowMaximize();
	}

	@When("To launch the url of SCENT application")
	public void to_launch_the_url_of_scent_application() {
		launchUrl("https://scentarts.ae/");
	}

	@When("Clickthe AboutUs button")
	public void clickthe_about_us_button() {
		p = new pojoClass();
		clickBtn(p.about);

	}

	@When("Verify Descriptions To click hotel button")
	public void verify_descriptions_to_click_hotel_button() {
		p = new pojoClass();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", p.hotels);
		clickBtn(p.hotels);
	}

	@When("To click offices button")
	public void to_click_offices_button() {
		p = new pojoClass();
		clickBtn(p.office);
	}

	@When("To click Ariports")
	public void to_click_ariports() {
		p = new pojoClass();
		clickBtn(p.airpoet);
	}

	@When("To click Retail")
	public void to_click_retail() {
		p = new pojoClass();
		clickBtn(p.retail);
	}

	@Then("close the browser1")
	public void close_the_browser1() {
		closeEntireBrowser();
	}

	@Given("To launch the browser2")
	public void to_launch_the_browser2() {

		launchBrowser();

		WindowMaximize();
	}

	@When("To launch the URL of SCENT application")
	public void to_launch_the_url_of_scent_application1() {
		launchUrl("https://scentarts.ae/");
	}

	@When("To click the our services button")
	public void to_click_the_our_services_button() {
		p = new pojoClass();
		clickBtn(p.getOur());
	}

	@When("To Click the Contact button")
	public void to_click_the_contact_button() {
		p = new pojoClass();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", p.cont);
		clickBtn(p.getCont());
	}

	@Then("Close the Browser2")
	public void close_the_browser2() {
		closeEntireBrowser();
	}

	@Given("To launch the browser3")
	public void to_launch_the_browser3() {
		launchBrowser();
		WindowMaximize();
	}

	@When("To launch the url of SCENT dApplication")
	public void to_launch_the_url_of_scent_d_application() {
		launchUrl("https://scentarts.ae/");
	}

	@When("To Click the Contact us button")
	public void to_click_the_contact_us_button() {
		p = new pojoClass();
		clickBtn(p.conts);
	}

	@When("send text to Full name box")
	public void send_text_to_full_name_box() {
		p = new pojoClass();
		passText("raj", p.getFullName());
	}

	@When("send text to  company name box")
	public void send_text_to_company_name_box() {
		p = new pojoClass();
		passText("inmakes", p.getCompany());
	}

	@When("send text to phone number box")
	public void send_text_to_phone_number_box() {
		p = new pojoClass();
		passText("124344", p.getPhone());
	}

	@When("Send text to Email address box")
	public void send_text_to_email_address_box() {
		p = new pojoClass();
		passText("rai7897@gmail.com", p.getEmail());
	}

	@When("To click the what type of services")
	public void to_click_the_what_type_of_services() {
		p = new pojoClass();
		clickBtn(p.getSelect());
	}

	@When("To select want to buy products")
	public void to_select_want_to_buy_products() {
		p = new pojoClass();
		clickBtn(p.getSelect());
	}

	@When("Send text to where are you located box")
	public void send_text_to_where_are_you_located_box() {
		p = new pojoClass();
		passText("india", p.getLocation());
	}

	@When("Send text to message box")
	public void send_text_to_message_box() {
		p = new pojoClass();
		passText("hello", p.getMessage());
	}

	@When("To click the send button")
	public void to_click_the_send_button() {
		p = new pojoClass();
		clickBtn(p.getSubmit());
	}

	@Then("close the browsers3")
	public void close_the_browsers3() {
		p = new pojoClass();
		closeEntireBrowser();
	}

}
