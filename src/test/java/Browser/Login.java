package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Login {

        public static void main(String[] args) throws InterruptedException {
            System.out.println("Hello world!");

            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.get("https://console.dev.initializ.ai/login/");

            WebElement userName = driver.findElement(By.id("user-email-input"));
            userName.sendKeys("adiwalkar@initializ.io");

            WebElement password = driver.findElement(By.id("auth-login-v2-password"));
            password.sendKeys("Swami@2498");

            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit' and text()='Login']"));
            loginButton.click();
            System.out.println(" ==== Before ====");


            // Wait for the new page to load
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60)); // Set a timeout of 60 seconds

            By createButtonLocator = By.xpath("//button[@type='button' and text()='Create']");

            // Wait for the button to be present on the new page
            WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(createButtonLocator));

            // Perform actions on the button
            button.click();

            System.out.println(" ==== After click ====");

            //WebElement ApplicationName = driver.findElement(By.xpath("//input[@placeholder='Name your app']"));

            /*By xpathLocator = By.xpath("//*[@id=':r4:']");
            WebElement ApplicationName = driver.findElement(xpathLocator);

            // Perform actions with the located element
            ApplicationName.sendKeys("AnjaliD"); */

            By  ApplicationNameText = By.xpath("//*[@id=':r4:']");
            WebElement ApplicationName = wait.until(ExpectedConditions.presenceOfElementLocated(ApplicationNameText));

            // Perform actions on the button
            ApplicationName.sendKeys("DemoApp4");

            /*By Repository = By.xpath("/html/body/div/div[1]/div[2]/main/div/div[2]/div/div/form/div/div[3]/div/div/svg");
            WebElement RepositoryText = wait.until(ExpectedConditions.presenceOfElementLocated(Repository));
            RepositoryText.click();*/
            Thread.sleep(2000);


            By repositoryLocator = By.xpath("/html/body/div/div[1]/div[2]/main/div/div[2]/div/div/form/div/div[3]/div/div/div");
             // Find the dropdown element
            WebElement dropdownElement = driver.findElement((repositoryLocator));

            // Click on the dropdown to open it
            dropdownElement.click();

            By optionLocator = By.xpath("/html/body/div[2]/div[3]/ul/li[2]");

            // Find and click the desired option
            WebElement optionElement = driver.findElement(optionLocator);
            optionElement.click();


            By branchLocator = By.xpath("/html/body/div/div[1]/div[2]/main/div/div[2]/div/div/form/div/div[5]/div/div/div");
            // Find the dropdown element
            WebElement branchElement = wait.until(ExpectedConditions.presenceOfElementLocated(branchLocator));

            // Click on the dropdown to open it
            branchElement.click();

            By optionsLocator = By.xpath("/html/body/div[2]/div[3]/ul/li");

            JavascriptExecutor scroll = (JavascriptExecutor) driver;
            scroll.executeScript("window.scrollBy(50,40000)");

            // Find and click the desired option
            WebElement optionsElement = wait.until(ExpectedConditions.presenceOfElementLocated(optionsLocator));
            optionsElement.click();

            WebElement NextButton = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/main/div/div[2]/div/div/form/div/div[7]/button[2]"));
            NextButton.click();

            //Second page

            WebElement NextPageButton = driver.findElement(By.cssSelector("button.MuiButton-sizeLarge:nth-child(2)"));
            NextPageButton.click();

            // third page

            WebElement SubmitButton = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/main/div/div[2]/div/div/div/div[3]/button[2]"));
            SubmitButton.click();

            // to select country from edit profile
            /*By CountryLocator = By.xpath(" //*[@id="country"]");
            WebElement countryElement = driver.findElement(CountryLocator);
            Select countryDropdown = new Select(countryElement);
            String countryToSelect = "India";
            countryDropdown.selectByVisibleText(countryToSelect);*/













            //driver.quit();




        }

}
