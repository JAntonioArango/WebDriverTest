package pageobject_model.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import waits.CustomConditions;
import java.time.Duration;

public class IcesiHomePage extends AbstractPage {

    private static final String HOMEPAGE_URL = "https://www.icesi.edu.co/servicios/convenios-oracle-academy/";

    @FindBy(name = "s")
    private WebElement searchInput;

    @FindBy(css = "button.search-submit")
    private WebElement searchButton;

    public IcesiHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public IcesiHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .until(CustomConditions.jQueryAJAXsCompleted());
        return this;
    }

    public SearchResultsPagePFMixed searchForTerms(String term) {
        searchInput.sendKeys(term);
        searchButton.click();
        return new SearchResultsPagePFMixed(driver, term);
    }

}
