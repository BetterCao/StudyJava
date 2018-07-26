package cao.study.Appium;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Settings {
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	public Settings(){
		//appium设置
		capabilities.setCapability("unicodeKeyboard", "True");
        capabilities.setCapability("resetKeyboard", "True");
        capabilities.setCapability("noReset", "True");
        capabilities.setCapability("automationName", "Appium");
	}
	
	public void app(String appPackage,String appActivity){
		capabilities.setCapability("appPackage", appPackage);
        capabilities.setCapability("appActivity", appActivity);
	}
	
	public void phone(String deviceName,String platformName,String platformVersion){
		capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("platformVersion", platformVersion);
	}
	
	public DesiredCapabilities getCapabilities(){
		return capabilities;
	}

}
