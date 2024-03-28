package com.gini;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.URL;

public class WebDriverGenerator {
    public static AndroidDriver driver;

    public WebDriverGenerator() {
    }

    @BeforeClass
    public static void startDriver() throws IOException {;
        MutableCapabilities capabilities = new MutableCapabilities();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }

    @AfterClass
    public static void quitDriver() {
      driver.quit();
    }
}
