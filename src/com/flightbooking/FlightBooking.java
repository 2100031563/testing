package com.flightbooking;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class FlightBooking {
public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        
	        // Verify current URL and title
	        System.out.println("Current URL: " + driver.getCurrentUrl());
	        System.out.println("Page Title: " + driver.getTitle());

	        // Create an instance of WebDriverWait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Wait for the user name field to be present
	        WebElement usernameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
	        usernameInput.sendKeys("Admin");

	        // Wait for the password field to be present
	        WebElement passwordInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
	        passwordInput.sendKeys("admin123");

	        // Wait for the login button to be click able
	        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
	        loginButton.click();
	    }
	}