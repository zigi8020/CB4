package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(className = "elementor-element elementor-element-dd1dc06 elementor-align-right demo1 elementor-widget__width-auto elementor-widget elementor-widget-button")
    WebElement watchADemoBtn;

    public void clickOnWatchADemoBtn() {
        click(watchADemoBtn);
    }

}
