package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WatchADemoPage extends BasePage {

    @FindBy (id = "form-field-firstname")
    WebElement firstNameField;
    
}
