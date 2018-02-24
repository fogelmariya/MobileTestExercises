package scenarios;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ContactManagerTest extends DriverSetup{

	@BeforeClass
	/**
	 * Prepare driver to run test(s)
	 */
	public void setUp() throws Exception {
		prepareNative();
		//prepareAndroidWeb();
	}


	@Test(description = "This simple test just click on button 'Add contact'")
	public void addContactButtonTest(){
		String app_package_name = "com.example.android.contactmanager:id/";
		By add_btn = By.id(app_package_name + "addContactButton");
		By addBtnId = MobileBy.AccessibilityId("Add Contact");
		By addBtnXPath = By.xpath("//android.widget.Button[@content-desc=\"Add Contact\"]");
		driver.findElement(addBtnXPath).click();
		//driver.findElement(addBtnId).click();
		//driver.findElement(add_btn).click();
		System.out.println("Simplest Appium test done");
	}

	@Test(description = "Open website")
	public void webTest() throws InterruptedException {
		driver.get("http://iana.org");
		Thread.sleep(5000);
		System.out.println("Site opening done");
	}

	@AfterClass(description = "Close driver on all tests completion")
	public void tearDown() throws Exception {
		driver.quit();
	}
}
