package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WatchADemoPage extends BasePage {

    @FindBy (name = "form_fields[firstname]")
    WebElement firstNameField;

    public void insertName(String name) {
        type(firstNameField, name);
    }
    
}
