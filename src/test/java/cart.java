import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class cart extends Final_exam{
    @Test
    public void cart() throws InterruptedException {
        loginDetails();
        WebElement cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click(); // clicking on cart icon

        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click(); // clicking on checkout
        Thread.sleep(2000);

        WebElement F_name= driver.findElement(By.xpath("//input[@id='first-name']"));
        F_name.sendKeys("B"); // entering first name

        WebElement L_name= driver.findElement(By.xpath("//input[@id='last-name']"));
        L_name.sendKeys("boy");  // entering last name

        WebElement zip_code= driver.findElement(By.xpath("//input[@id='postal-code']"));
        zip_code.sendKeys("H3H2J1");  // entering last name

        WebElement continue_btn= driver.findElement(By.xpath("//input[@id='continue']"));
        continue_btn.click(); // clicking on continue button
        Thread.sleep(1000);

        WebElement finish_btn= driver.findElement(By.xpath("//button[@id='finish']"));
        finish_btn.click(); // clicking on finish button
        Thread.sleep(1000);

        WebElement back_home_btn= driver.findElement(By.xpath("//button[@id='back-to-products']"));
        back_home_btn.click(); // clicking on back to home button
        Thread.sleep(1000);



    }
}
