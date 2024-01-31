package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class userProfile {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://console.dev.initializ.ai/login/");

        WebElement userName = driver.findElement(By.id("user-email-input"));
        userName.sendKeys("anjali.1diwalkar@gmail.com");

        WebElement password = driver.findElement(By.id("auth-login-v2-password"));
        password.sendKeys("Swami@2498");

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit' and text()='Login']"));
        loginButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        By userButtonLocator = By.xpath("//img[@alt=\" \" and @src=\"/images/avatars/user-default-avatar.png\"]");

        WebElement userButton = wait.until(ExpectedConditions.presenceOfElementLocated(userButtonLocator));
        userButton.click();

        By myProfileButtonLocator = By.xpath("//div[contains(text(),'My Profile')]");
        WebElement myProfileButton = wait.until(ExpectedConditions.presenceOfElementLocated(myProfileButtonLocator));
        myProfileButton.click();

        By editProfileLocator = By.xpath("//button[contains(text(), 'Edit Profile')]");
        WebElement editProfile = wait.until(ExpectedConditions.presenceOfElementLocated(editProfileLocator));
        editProfile.click();

        WebElement country = driver.findElement(By.id("country"));
        country.click();





    }
}
