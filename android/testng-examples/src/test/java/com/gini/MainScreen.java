package com.gini;
import org.openqa.selenium.By;

import static com.gini.WebDriverGenerator.driver;

public class MainScreen {
    public void getPhotoPaymentButtonForAndroid() {
        driver.findElement(By.id("net.gini.android.bank.sdk.exampleapp:id/button_startScanner")).click(); }
    public void getPermissionPopUp() {
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")).click(); }
    public void skipOnboardingScreen() {
        driver.findElement(By.id("net.gini.android.bank.sdk.exampleapp:id/gc_skip")).click(); }
    public void clickHelpIcon() {
        driver.findElement(By.id("net.gini.android.bank.sdk.exampleapp:id/gc_action_show_onboarding")).click(); }
    public void clickBackButton() {
        driver.findElement(By.className("android.widget.ImageButton")).click();}
    public void clickFileOption() {
        driver.findElement(By.id("net.gini.android.bank.sdk.exampleapp:id/gc_button_import_document")).click();
        driver.findElement(By.xpath("//android.widget.GridView[@resource-id=\"net.gini.android.bank.sdk.exampleapp:id/gc_file_providers\"]/android.widget.LinearLayout[5]"));
        driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"net.gini.android.bank.sdk.exampleapp:id/gc_app_label\"])[3]")).click();
    }
}



