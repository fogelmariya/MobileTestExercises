package scenarios;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverSetup {

	protected AndroidDriver driver;

	protected void prepareNative() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//mandatory capabilities
		//capabilities.setCapability("deviceName","Test device");
		capabilities.setCapability("deviceName","Samsung GT-I9192");
		capabilities.setCapability("platformName","Android");

		// path to app
		File appDir = new File("G:\\Java_Level2\\MobileTestExercises\\src\\main\\resources");
		File app = new File(appDir, "ContactManager.apk");

		//other caps
		capabilities.setCapability("app", app.getAbsolutePath());

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}

	protected void prepareAndroidWeb() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//mandatory Android capabilities
		capabilities.setCapability("deviceName","Test device");
		capabilities.setCapability("platformName","Android");

		// specific web capabilities
	//	capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("browserName", "Browser");

		// Init driver for local Appium server with capabilities have been set
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}


}
