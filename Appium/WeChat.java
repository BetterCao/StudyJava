package cao.study.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class WeChat {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//手机设置
        capabilities.setCapability("deviceName", "GSL0217905002317");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        //app设置
        capabilities.setCapability("appPackage", "com.tencent.mm");
        capabilities.setCapability("appActivity", ".ui.LauncherUI");
        //appium设置
        capabilities.setCapability("unicodeKeyboard", "True");
        capabilities.setCapability("resetKeyboard", "True");
        capabilities.setCapability("noReset", "True");
        capabilities.setCapability("automationName", "Appium");
        
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        //开始执行操作
        driver.findElement(By.linkText("刘伯彦")).click();
        Thread.sleep(2000);
        System.out.println("结束！");

	}

}
