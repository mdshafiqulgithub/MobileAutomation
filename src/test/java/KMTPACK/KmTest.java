package KMTPACK;

import HomePage.CommonApi;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import javafx.scene.layout.Priority;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import java.lang.String.*;
import java.util.concurrent.TimeUnit;
import javafx.scene.layout.Priority;


public class KmTest extends CommonApi

{
    //AndroidDriver driver;

    //TC001: Facebook Button enable verfication
    @Test
    public void FaceBookLink()throws NullPointerException,InterruptedException
    {
        driver.findElement((By.id("de.komoot.android:id/button_facebook"))).click();
        Thread.sleep(2);
    }

    //TC002: SIGNING New Account
    @Test
    public void SignUp()throws NullPointerException,InterruptedException
    {
        driver.findElement(By.id("de.komoot.android:id/imageview_btn_signup")).click();
        driver.findElement(By.id("de.komoot.android:id/edittext_display_name")).sendKeys("T00YEC");
        driver.findElement(By.id("de.komoot.android:id/edittext_email")).sendKeys("ki90te@gmail.com");
        driver.findElement(By.id("de.komoot.android:id/edittext_password")).sendKeys("popium");
        driver.findElement(By.id("de.komoot.android:id/button_register")).click();
        Thread.sleep(2);
    }

    //TC003: Invalid SignUp
    @Test
    public void SignUpInvalid()throws NullPointerException,InterruptedException
    {
        driver.findElement(By.id("de.komoot.android:id/imageview_btn_signup")).click();
        Thread.sleep(2);
        driver.findElement((By.id("de.komoot.android:id/button_register"))).click();
        MobileElement message = (MobileElement) driver.findElement((By.id("android:id/message")));
        Assert.assertEquals("Please enter your name and try again.",message.getText());

        Thread.sleep(2);
    }
    //TC004: Terms and Conditions Link Verifications
    @Test
    public void TermsConditionsLink()throws NullPointerException,InterruptedException
    {
        driver.findElement((By.id("de.komoot.android:id/textview_tos"))).click();
        Thread.sleep(5);

    }

    //TC005: Facebook link Verification
    @Test
    public void FacebookLogin()throws NullPointerException,InterruptedException
    {
        driver.findElement((By.id("de.komoot.android:id/button_facebook"))).click();
        Thread.sleep(2);
    }

    //TC006: Facebook Account login Verfication
    @Test
    public void FacebookAccountLogin()throws NullPointerException,InterruptedException
    {
        driver.findElement((By.id("de.komoot.android:id/textview_login"))).click();
        Thread.sleep(3);
        driver.findElement(By.id("de.komoot.android:id/edittext_email")).sendKeys("md.shafiqu09l@gmail.com");
        driver.findElement((By.id("de.komoot.android:id/edittext_password"))).sendKeys("dfjdkfjkdfj");
        driver.findElement((By.id("de.komoot.android:id/button_login"))).click();
        Thread.sleep(3);
    }

    @After
    public void teardown()
    {
        driver.quit();
    }

}

