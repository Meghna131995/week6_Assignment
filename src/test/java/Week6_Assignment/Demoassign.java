package Week6_Assignment;

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demoassign {
	AndroidDriver<AndroidElement> driver;
	  @BeforeTest
	  public void beforeTest() throws MalformedURLException, InterruptedException {
	      DesiredCapabilities dc = new DesiredCapabilities();
	      dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	      dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	      dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
	      dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
	      dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"org.khanacademy.android.ui.library.MainActivity");
	      driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	      Thread.sleep(3000);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	  }
	  @Test
	  public void Login_logout() throws InterruptedException {
	      Thread.sleep(2000);
	      driver.findElements(MobileBy.className("android.widget.Button")).get(1).click();
	      Thread.sleep(1000);
	      driver.findElement(MobileBy.AccessibilityId("Continue with Google")).click();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.findElement(MobileBy.id("com.google.android.gms:id/account_display_name")).click();
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.findElement(MobileBy.AccessibilityId("Settings")).click();
	      //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text("Sign out"))")).click();
	      driver.findElement(MobileBy.id("android:id/button1")).click();
	      //driver.pressKey(new KeyEvent(AndroidKey.HOME));

}
}
	  
