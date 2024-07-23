package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BellBeforeSearch {
    protected WebDriver chromeDriver;
    protected WebElement searchField;
    protected WebElement searchButton;

    public BellBeforeSearch(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
        this.searchField = chromeDriver.findElement(By.xpath("//input[@id='edit-keys' and @type='search']"));
        this.searchButton = chromeDriver.findElement(By.xpath("//input[@id='edit-submit' and @value='Поиск']"));
    }

    public void find(String word){
        searchField.click();
        searchField.sendKeys(word);
        searchButton.click();
    }
}
