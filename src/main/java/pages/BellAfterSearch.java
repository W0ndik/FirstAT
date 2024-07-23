package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BellAfterSearch extends BellBeforeSearch{

    private List<WebElement> results;

    private WebDriverWait wait;

    public BellAfterSearch(WebDriver chromeDriver) {
        super(chromeDriver);
        wait = new WebDriverWait(chromeDriver, 120);
    }

    public List<WebElement> getResults() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ol[contains(@class,'search-results')]//p[@class='search-result__snippet']")));
        results = chromeDriver.findElements(By.xpath("//ol[contains(@class,'search-results')]//p[@class='search-result__snippet']"));
        return results;
    }
}
