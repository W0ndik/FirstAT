package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class BellPageFactory {

    private WebDriver chromeDriver;

    @FindBy(how = How.XPATH, using = "//input[@id='edit-keys' and @type='search']")
    WebElement searchField;

    @FindBy(how= How.XPATH, using="//input[@id='edit-submit' and @value='Поиск']")
    WebElement searchButton;

    @FindBy(how= How.XPATH, using = "//ol[contains(@class,'search-results')]//p[@class='search-result__snippet']")
    List<WebElement> results;

    public BellPageFactory(WebDriver chromeDriver) {
        this.chromeDriver = chromeDriver;
    }

    public void find(String word){
        searchField.click();
        searchField.sendKeys(word);
        searchButton.click();
    }

    public List<WebElement> getResults() {
        return results;
    }
}
