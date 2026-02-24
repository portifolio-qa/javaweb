package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


@CucumberOptions(

		features = "src/test/resources/features",
		glue = "steps",
		plugin = {
				"pretty",
				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		}
		
		)

@RunWith(Cucumber.class)
public class RunCucumberTest {
	
		    public static WebDriver driver;
		    
		    @BeforeAll
		    public static void start() {
		    	
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");	
				 driver = new ChromeDriver(co);	   	
				 driver.get("https://bugbank.netlify.app/");
		    	
		    }
		    
		    @AfterAll
		    public static void stop() {
		    	driver.quit();	
		    }
		    
	}

		  
	
	



