package com.example.formAutomation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FormAutomationApplication {


    public static void main(String[] args) {
        SpringApplication.run(FormAutomationApplication.class, args);
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        //opt.addArguments("headless");
        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://www.browlab.fr/");

        driver.manage().window().maximize();
        WebElement input = driver.findElement(By.className("Form__Input"));
        System.out.println(input.toString());
        input.sendKeys("khaled.bougrine.eniso@gmail.com");


        // Enter your login password
        WebElement button = driver.findElement(By.xpath("//*[@id=\"footer-1613785179ea8f9018\"]/div[1]/button"));
//				.sendKeys("Khaled@1998.");
        button.click();
//		driver.findElement(By.className("signin-button"))
//				.click();


    }

}
