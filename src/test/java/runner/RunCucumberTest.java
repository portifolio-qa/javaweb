package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


@CucumberOptions(

		features = "src/test/resources/features/contas.feature",
		tags = {"not @ignore"},
		glue = {"steps"},
		plugin = {"pretty", "html:target/report-html", "io.qameta.allure.cucumber7jvm.AllureCucumber2Jvm"},
		dryRun = false,
		strict = true,
		monochrome = true
		
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

		  
	
	



