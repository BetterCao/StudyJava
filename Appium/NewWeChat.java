package cao.study.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class NewWeChat {
	public static void main(String args[]) throws MalformedURLException, InterruptedException{
	//实际业务之前的配置
	Settings set = new Settings();
	set.app("com.tencent.mm", ".ui.LauncherUI");
	set.phone("GSL0217905002317", "Android", "7.0");
	
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), set.getCapabilities());

    //开始执行操作
    Thread.sleep(3000);
    driver.findElement(By.xpath("//android.view.View[@text='刘伯彦']")).click();
    Thread.sleep(2000);
    System.out.println("结束！");
    driver.quit();
	}
	
}
