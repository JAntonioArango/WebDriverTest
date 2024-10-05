package pageobject_model.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import static java.lang.System.out;

public class SearchResultsPagePFMixed extends AbstractPage{

    private final String splitRegex = "\\s";
    private String searchTerm;

    private String defaultLocator = "//*[%s]";
    private String containsPart = "contains(.,'%s')";

    protected SearchResultsPagePFMixed(WebDriver driver, String searchTerm) {
        super(driver);
        this.searchTerm = searchTerm;
    }

    public int countResultsNumberWithSearchTerm() {
        List<WebElement> resultNumberWithSearchTerm = driver.findElements((By.xpath(buildLocationForSearch())));
        out.println("Search results number for requested term: " + resultNumberWithSearchTerm.size());
        return resultNumberWithSearchTerm.size();
    }

    private String buildLocationForSearch() {
        StringBuilder partWithSearchTerm = new StringBuilder();
        String[] terms = searchTerm.split(splitRegex);
        for (String term : terms) {
            if (partWithSearchTerm.length() > 0) {
                partWithSearchTerm.append(" and ");
            }
            partWithSearchTerm.append(String.format(containsPart, term));
        }
        String locatorForSearch = String.format(defaultLocator, partWithSearchTerm);
        out.println("DEBUG: Final locator with search terms: " + locatorForSearch);
        return locatorForSearch;
    }

    @Override
    protected AbstractPage openPage() {
        throw new RuntimeException("Please think twice...");
    }
}
