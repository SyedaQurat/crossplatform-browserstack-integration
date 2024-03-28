package com.gini;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import static com.gini.WebDriverGenerator.driver;

public class UserJourney {
    MainScreen mainScreen = new MainScreen();

    @Test
    public void androidAutomation() throws IOException {
        WebDriverGenerator.startDriver();
        mainScreen.getPhotoPaymentButtonForAndroid();
        mainScreen.getPermissionPopUp();
        mainScreen.skipOnboardingScreen();
        mainScreen.clickHelpIcon();
        mainScreen.clickBackButton();
        mainScreen.clickFileOption();
        WebDriverGenerator.quitDriver();
    }
}
