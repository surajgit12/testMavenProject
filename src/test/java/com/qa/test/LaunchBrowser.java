package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaunchBrowser {
	  WebDriver driver;
//test this browser specific changes doneee
	    @BeforeClass(alwaysRun = true)
	    public void setup() {
	        // Selenium 4.6+ automatically manages drivers
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();

	    }

	    @Test(groups ="smoke")
	    public void launchBrowser() {
	    	
	        driver.get("https://www.google.com");
	        System.out.println("Title: " + driver.getTitle());
	    }

	    @Test
	    public void testPage() {
	    	
	        System.out.println("Able tpo launch test page");
	        System.out.println("Able tpo launch test page");
	        System.out.println("Able to test testNg Annotation");
			   System.out.println("Able to test testNg Para,t");
	        
	        System.out.println("Param1");
	        System.out.println("Param2");
	        System.out.println("Param3");
	        System.out.println("Param4");
	        System.out.println("Param5");

			System.out.println("Param6");
	        System.out.println("Param7");
	        
	         //driver.quit();
	         //driver.quit();
	         //driver.quit();
	        
	    }

	    @AfterClass
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


