package page;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class LoginPage {
	WebDriver driver;
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
		}
		
//		Elements
		@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")WebElement SKY_BLUE_COLOR_ELEMENT;
		
		@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")WebElement SKY_WHITE_COLOR_ELEMENT;
		
		public void clickontheskyblueButton() {
			SKY_BLUE_COLOR_ELEMENT.click();
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		public void clickontheskywhiteButton() {
			SKY_WHITE_COLOR_ELEMENT.click();
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
	}

}
        public String getPageColor() {
        	return driver.getTitle();
        	
        }
        @After void tearDown() {
 		   driver.close();
 		   driver.quit();
	}
}		

		