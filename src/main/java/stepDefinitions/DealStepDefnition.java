package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class DealStepDefnition {
	
	 WebDriver driver;


 
	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password(DataTable credentials){
		List<List<String>> data = credentials.raw();
	 driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	 driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	 }
	
	 	 
	 @Then("^user moves to new deal page$")
	 public void user_moves_to_new_contact_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		
		}
	 
	 @Then("^user enters deal details$")
	 public void user_enters_contacts_details(DataTable dealData){
		 List<List<String>> dealValues =  dealData.raw();
		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
	 }
	 

	
	
	

}
