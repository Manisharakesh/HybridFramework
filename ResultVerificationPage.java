package AmazonPages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static AmazonPages.BasePage.driver;

public class ResultVerificationPage extends Utils{
    public void verificationOfApplicationURL(){

        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.amazon.co.uk/","Current Url not matching");
    }


    public void verificationOfHomePageTitle(){
        String HomePageActTitle = driver.getTitle();
        Assert.assertEquals(HomePageActTitle,"Amazon.com. Spend less. Smile more.","Title not matching");

    }
}

