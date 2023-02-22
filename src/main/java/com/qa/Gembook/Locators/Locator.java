package com.qa.Gembook.Locators;

import org.openqa.selenium.By;

public class Locator {
    public static By signin= By.xpath("//div/button[text()='Sign in']");
    public static By userNameField= By.xpath("//div[@class='placeholderContainer']/input[1]");
    public static By nextButton = By.xpath("//input[@type='submit']");
}
