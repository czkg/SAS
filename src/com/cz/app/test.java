package com.cz.app;

/**
 * Created by zhichai on 7/7/17.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/zhichai/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.baidu.com");
    }
}