package AmazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage{
    //method for clickOnElement
    public static void clickOnElement (By by)
    {
        driver.findElement(by).click();

    }
    //method for enterText
    public static void enterText (By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    //method for timeStamp
    public static String dateStamp()
    {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss");
        return format.format(new Date());
    }
    //method for driver to wait
    public static void waitForClickable(By by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    // wait for element
    public static void waitforElementBy(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }
    //method for selectFromDropdownByVisibleText
    public static void selectFromDropdownByVisibleText(By by,String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    //method for selectFromDropdownByValue
    public static void selectFromDropdownByValue(By by,String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    //method for getTextElement
    public static String getTextFromElement(By by)
    {

        return driver.findElement(by).getText();
    }
    //method for getSelectedTextFromDropdown
    public static String getSelectedTextFromDropdown(By by)
    {
        Select select = new Select(driver.findElement(by));
        return select.getFirstSelectedOption().getText();
    }
    //verification method
    public static void assertCurrentURL(String url)
    {
        Assert.assertTrue(driver.getCurrentUrl().equals(url));

    }
    //method for Thread.sleep
    public static void sleep(int time)
    {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}




