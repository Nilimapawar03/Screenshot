package Screenshot.Screen_1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Base {
	public static WebDriver driver;
	public static void Intiliziation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neelima\\workspace\\SeleniumByNaveen\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();


		driver.get("http://www.Google.com");
	}
	//Logic of Screenshot
	@Test
	public void failed(String testMethodName){
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		try {
			//			FileUtils.copyFile(scrFile, new File("C://Users//Admin//eclipse-workspace//ScreenShots//EvidenceShots/testfailure.jpg"));
			//Append the file name
			//		FileUtils.copyFile(scrFile, new File("C://Users//Admin//eclipse-workspace//ScreenShots//EvidenceShots/"+"failshot_"+this.getClass().getName()+"_"+".jpg"));

			//Append the Method name
			FileUtils.copyFile(scrFile, new File("C://Users//Admin//eclipse-workspace//ScreenShots//EvidenceShots//"+testMethodName+"_"+".jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();


		}

	}}
