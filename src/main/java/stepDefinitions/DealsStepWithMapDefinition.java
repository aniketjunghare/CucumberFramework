package stepDefinitions;


import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;



//data table with maps : for parameterization of test cases

public class DealsStepWithMapDefinition {

	WebDriver driver;



	@Then("^user enters username1 and password1$")
	public void user_enters_username_and_password(DataTable credentials) {
		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {

			driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));

		}

	}


	@Then("^user moves to deal page$")
	public void user_moves_to_new_deals_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

	}

	@Then("^user enters deal1 details$")
	public void user_enters_contacts_details(DataTable dealData) {

		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {

			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
			
			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
			
			//move to new deal page:
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

		}

		
	}

		

}
