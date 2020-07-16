package headlessbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser {				
	public static void main(String[] args) {
                 // Creating a new instance of the HTML unit driver
                  
		System.setProperty("webdriver.htmlunit.driver", "H:\\HtmlUnitDriver.jar");
                 WebDriver driver = new HtmlUnitDriver();
                  
       		     // Navigate to Google		
                 driver.get("http://www.google.com");					
      
				 // Locate the searchbox using its name		
                 WebElement element = driver.findElement(By.name("q"));	
                 
                // Enter a search query		
                element.sendKeys("Cricket");	
               
	            // Submit the query. Webdriver searches for the form using the text input element automatically		
                // No need to locate/find the submit button		
                element.submit();			
                
        		// This code will print the page title		
                System.out.println("Page title is: " + driver.getTitle());		
                
                driver.quit();		
		//making some changes here to reflect them in eclipse project through pull
     }		
}
