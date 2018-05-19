package HomePage;

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


public class CommonApi
{
   public AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Nexus");
        capabilities.setCapability("platformName","Android");
        //capabilities.setCapability("app","/Users/shafiqul/Testing Training/PeopleNTECHT/Selenium_NOV/Mobile Automation/MobileShafiqulProject/komootAPK/Komoot — Cycling Hiking Maps_v9.4.9_apkpure.com.apk");
        capabilities.setCapability("app","/Users/shafiqul/Testing Training/PeopleNTECHT/Selenium_NOV2017/MobileProject/Team5/komoot/src/app/Komoot — Cycling Hiking Maps_v9.4.9_apkpure.com.apk");

        capabilities.setCapability("appWaitActivity","de.komoot.android.app.JoinKomootActivity");

       // /Users/shafiqul/Testing Training/PeopleNTECHT/Selenium_NOV2017/MobileProject/Team5/komoot/src/app/Komoot — Cycling Hiking Maps_v9.4.9_apkpure.com.apk

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

    }

    @After
    public void teardown()
    {
        driver.quit();
    }

}

