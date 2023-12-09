package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C://tools//Chromedriver//chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        // Launch the application
        driver.get("https://market.yandex.ru/catalog--mobilnye-telefony/34512430/filters?hid=91491&rs=eJwzamIOYDzKyLAgzRZINtRYA8kHz22A5IH3u0EiHCCRAx0gkQdsIDKhBSzeBVa5BSTi0A8mJfeAyEaw7COwCTtAbIZtIDaD4R6wepDIgUtglQ5gMghk7wFNsPookOyD02C7ILoKzEDs_2DZdWDx-2B7q_cDSYUbFiD3mIPEFcLA5FqQmQfcQWY-YAKTnGB_NYBIBW-wjWDTEtTB7mwBmaZQCbbrF1j8PIhs2AaSXTATLPLJCkSuBKu5DZb9BNLl8BTM1gKLS-wF2WsKDgcGsI3gsHJYASIXSILZj8AhUA9mO4HdeQMcPs7WANBBing%2C&local-offers-first=0");

        //Resize current window to the set dimension
        driver.manage().window().maximize();
        WebElement priceTo = driver.findElement(new By.ByXPath(Constants.PriceFullToXPath));
        String priceToValue = "20000";
        priceTo.sendKeys(priceToValue);


        for (int i = 2; i < 6 ; i++) {
            String checkBoxAddress = "/html/body/div[3]/section/div[2]/div/div/div[2]/div[1]/div[9]/div/div/div/div[" + i + "]/label/input";

            WebElement secondTry = driver.findElement(new By.ByXPath(checkBoxAddress));
            secondTry.click();
        }
    }

}

class Constants{
    public static final String PriceFullToXPath = "/html/body/div[3]/section/div[2]/div/div/div[2]/div[1]/div[1]/div/div/div/div[2]/input";
}