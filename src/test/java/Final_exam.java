import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Final_exam {
    public static WebDriver driver;

    @BeforeMethod
    public void launchbrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mr.khark\\Downloads\\chromedriver.exe");
         driver= new ChromeDriver(); // creating object of chrome driver
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
}

@AfterMethod
public void quit(){
        driver.quit(); // to close windows
}

    @Test
    public void verifyPageTitle() throws InterruptedException //for login details
    {
        String getPageTitle = driver.getTitle();
        String _pageTitle = "Swag Labs";
        Assert.assertEquals(getPageTitle, _pageTitle);
        Thread.sleep(1000);
    }

    @Test()
    public void loginDetails() {
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
           username.sendKeys("standard_user");  // adding username;


        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");  // adding password;

        WebElement btnlogin = driver.findElement(By.xpath("//input[@class='submit-button btn_action']"));
        btnlogin.click(); // clicking on button;
    }
    @Test()
    public void burger_menu() throws InterruptedException {
        loginDetails();
        WebElement burger= driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
        burger.click();  // clicking on burger menu;
        Thread.sleep(1000);

       WebElement about= driver.findElement(By.xpath("//a[@id='about_sidebar_link']"));
       about.click(); // clicking on about
       driver.navigate().back();
       Thread.sleep(1000);

        WebElement burger1= driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
        burger1.click();  // clicking on burger menu;
        Thread.sleep(1000);

        WebElement logout= driver.findElement(By.xpath("//nav[@class='bm-item-list']//a[@id='logout_sidebar_link']"));
        logout .click(); // clicking on logout button from burger menu

        Thread.sleep(1000);


    }

    @Test
    public void home() throws InterruptedException {
        loginDetails();
        WebElement dropdown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        dropdown.sendKeys("Price (low to high)"); //changing the values in dropdown menu
        Thread.sleep(1000);

        WebElement product = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
        product.click();// clicking on product
        Thread.sleep(1000);

        WebElement addtocart = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        addtocart.click();  // adding product to cart
        Thread.sleep(1000);

        WebElement remove = driver.findElement(By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory']"));
        remove.click();   // item removed
        Thread.sleep(1000);

        WebElement backtoproduct = driver.findElement(By.xpath("//button[@class='btn btn_secondary back btn_large inventory_details_back_button']"));
        backtoproduct.click(); // going back to home page
        Thread.sleep(1000);


        WebElement twitter = driver.findElement(By.xpath("//a[@href='https://twitter.com/saucelabs']"));
        twitter.click();  //testing twitter link
        Thread.sleep(1000);

        WebElement fb = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/saucelabs']"));
        fb.click();  // testing facebook link
        Thread.sleep(1000);

        WebElement linkdin = driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/sauce-labs/']"));
        linkdin.click();  // testing linkdin link
        Thread.sleep(1000);



    }




}
