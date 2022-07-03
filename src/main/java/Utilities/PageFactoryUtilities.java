package Utilities;

import Pages.*;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryUtilities extends Base{

    public static void buildPageFactory() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
}