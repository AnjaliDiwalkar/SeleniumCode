package Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatePage extends Login{
public static void main (String[] args)
{
    WebDriverManager.firefoxdriver().setup();
    WebDriver driver = new FirefoxDriver();
    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

    WebElement StaticDropdown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
    Select dropDown = new Select(StaticDropdown);
    dropDown.selectByValue("USD");
    System.out.println(dropDown.getFirstSelectedOption().getText());
    dropDown.selectByIndex(01);
    System.out.println(dropDown.getFirstSelectedOption().getText());
    dropDown.selectByVisibleText("AED");
    System.out.println(dropDown.getFirstSelectedOption().getText());
}
}
