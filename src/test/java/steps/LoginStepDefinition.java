package steps;

import junit.framework.Assert;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;
import page.TestBase;

public class LoginStepDefinition extends TestBase{
	LoginPage loginPage;
	
	@Before
	public void beforeRun() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
			driver.get("http://techfios.com/test/105/");
		}
			
		@Given("{string} button exists")
		public void button_exists(String button) {
			if(button.equalsIgnoreCase("SetSkyBlueBackground")) {
				loginPage.clickontheskywhiteButton();
			}else if (button.equalsIgnoreCase("SetSkyWhiteBackground")) {
				loginPage.clickontheskywhiteButton();
			}else {
				System.out.println("background color change");
			}
		}
	  @When("I click on the button")
	  public void I_click_on_the_button() {
		 loginPage.clickontheskyblueButton();
		  loginPage.clickontheskywhiteButton();
	  }
	  @Then("the background color will change to Sky blue")
	  public void the_background_color_will_change_to_Sky_blue() {
		  String expectedColor = "sky blue";
		  String actualColor = loginPage.getPageColor();
		  Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).isDisplayed());
		  System.out.println(driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]")).isDisplayed());
	}
	   @Then("the background color will change to white")
	   public void the_background_color_will_change_to_white() {
		   String expectedColor = "white";
			  String actualColor = loginPage.getPageColor();
			  Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).isDisplayed());
			  System.out.println(driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]")).isDisplayed());
	   }
	   
	   @After void tearDown() {
		   driver.close();
		   driver.quit();
	   }
			  
	}		  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		   
		   
		   
		   
		   
		   


