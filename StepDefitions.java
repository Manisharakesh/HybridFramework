import AmazonPages.ResultVerificationPage;
import AmazonPages.ShoppingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefitions {
    WebDriver driver;
    ResultVerificationPage resultVerificationPage = new ResultVerificationPage();
    ShoppingPage shoppingPage = new ShoppingPage();

    @Given("^User  Open the Browser and Enter Url$")
    public void user_Open_the_Browser_and_Enter_Url() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


    }

    @Then("^User click on search box$")
    public void user_click_on_search_box() {
        driver.findElement(By.id("twotabsearchtextbox")).click();
    }

    @Then("^User enter \"([^\"]*)\" for product search$")
    public void user_enter_for_product_search(String arg1) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("2020+Newest+Dell+Inspiron+15+3000+PC+Laptop");
    }


    @Then("^User click on search$")
    public void user_click_on_search() {
        driver.findElement(By.id("nav-search-submit-button")).click();

    }

    @Then("^User click on DellInsiron Product$")
    public void user_click_on_DellInsiron_Product() {
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();

    }

    // @Then("^User click on All Buying Option$")
    //  public void user_click_on_All_Buying_Option()  {
    //  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[9]/div[4]/div[1]/div[4]/div/div/div/div/div/form/div/div/" +
    //       "div[1]/div/div[2]/div/span[2]/div/span/span/input")).click();


//}

    @Then("^User click on Add to Cart$")
    public void user_click_on_Add_to_Cart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();

    }

    @Then("^User is on HomePage$")
    public void user_is_on_HomePage()  {
        String title = driver.getTitle();
        System.out.println("Homepage Title:" + title);
       // Assert.assertEquals("Amazon.com. Spend less. Smile more.", title);
        driver.close();


    }

}
