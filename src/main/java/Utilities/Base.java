package Utilities;

import Pages.HomePage;
import Pages.WatchADemoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class Base {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Action actions;

    //Pages
    public static HomePage homePage;
    public static WatchADemoPage watchADemoPage;
}
