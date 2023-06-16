package BanjaraRide;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class BanjaraRide {
	AndroidDriver<AndroidElement> driver;
	ExtentReports extent;
	ExtentTest logger;

@BeforeTest
public void bt() throws MalformedURLException, InterruptedException {
	extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/extentreports.html",true);
	extent.loadConfig(new File(System.getProperty("user.dir")+"src/test/java/extent-config.xml"));
	
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.forbinary.banjararide");
	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.forbinary.banjararide.activity.SplashActivity");
	driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	Thread.sleep(3000);
 
}
  @Test(enabled = false)
  public void BookNow() throws InterruptedException {
	  logger=extent.startTest("Testing BookNow");
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/home_language_button")).click();  
	  logger.log(LogStatus.PASS, "App is launched on phone");
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/rlClickConsumer")).click(); 
	  Thread.sleep(3000);
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Search...\")")).sendKeys("India");
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"India (IN)\")")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/edtMobileNumber")).sendKeys("9845505377"); 
	  logger.log(LogStatus.PASS, "Country code and Phone number entry successful ");
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
	  logger.log(LogStatus.PASS, "OTP Sent");
	  Thread.sleep(2000);
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

  //driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();  
// driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Resend OTP\")")).click();
 
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/link_2")).click();
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Hire Bike\")")).click();
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"CB Hornet 160R\"))")).click();
	  logger.log(LogStatus.PASS, "Booking CB Hornet 160R Bike");
	  Thread.sleep(2000);

 //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"7 days\"))").click();
// driver.findElement(By.xpath("//*[@text='7 days']")).click();

	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/btnBookNow")).click();  
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/llDateContainer")).click(); 
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.AccessibilityId("31 January 2023")).click(); 
	  driver.findElement(MobileBy.id("android:id/button1")).click();  
	  logger.log(LogStatus.PASS, "Booking CB Hornet 160R Bike for 31st January 2023");
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.navigate().back();
 
  }
  
  @Test(enabled = true)
  public void Bookings_CallUs() throws InterruptedException {
	  logger=extent.startTest("Testing Bookings");
	  
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/home_language_button")).click();  
	  logger.log(LogStatus.PASS, "App is launched on phone");
	  Thread.sleep(3000);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/rlClickConsumer")).click();  
	  Thread.sleep(3000);
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Search...\")")).sendKeys("India");
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"India (IN)\")")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/edtMobileNumber")).sendKeys("9845505377"); 
	  logger.log(LogStatus.PASS, "Country code and Phone number entry successful ");
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
	  Thread.sleep(2000);
	  logger.log(LogStatus.PASS, "OTP Sent");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  logger.log(LogStatus.PASS, "Logged in successfully");
	  Thread.sleep(1000);
	  driver.findElement(MobileBy.AccessibilityId("Open")).click();
	  
	  Thread.sleep(1000);
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bookings\")")).click();
	  driver.findElement(MobileBy.className("android.widget.ImageView")).click();
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_src_text")).sendKeys("Activa");
	  logger.log(LogStatus.PASS, "Checked for Activa Bookings");
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_close_btn")).click();
	  Thread.sleep(1000);
	  //driver.findElement(MobileBy.className("android.widget.ImageButton‎")).click();
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  
	  logger.log(LogStatus.PASS, "HomePage of the App");
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Call Us\"))")).click();
	  logger.log(LogStatus.PASS, "Call Us button clicked");
	  Thread.sleep(2000);
	  driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	  Thread.sleep(2000);
	  driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	  logger.log(LogStatus.PASS, "App switched back");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  logger.log(LogStatus.PASS, "App closed");
  }
  @AfterTest
  public void afterTest() {
		extent.endTest(logger);//this will end the logger function
		extent.flush();//this will flush all the logged data into the html report
		extent.close();//this will give an end report
	  
  }
  
  
}