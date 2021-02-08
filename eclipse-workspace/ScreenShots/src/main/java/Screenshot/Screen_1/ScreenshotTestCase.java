package Screenshot.Screen_1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTestCase extends Base{
@BeforeMethod
	public void Setup() {
	Intiliziation();
	
}

@AfterMethod
public void teardown() {
	driver.quit();
}
@Test
public void LoginTest() {
	Assert.assertEquals(false, true);
}
@Test
public void SearchTest() {
	Assert.assertEquals(false, true);
}
@Test
public void takescreenshot2() {
	Assert.assertEquals(false, true);
}
@Test
public void takescreenshot3() {
	Assert.assertEquals(false, true);
}

}
