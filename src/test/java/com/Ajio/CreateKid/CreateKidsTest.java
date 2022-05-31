
package com.Ajio.CreateKid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.Ajio.GenericScript.JavaMethods;
import com.Ajio.GenericScript.WebDriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateKidsTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions otp=new ChromeOptions();
		otp.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(otp);
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[.='KIDS']")).click();
		//Actions act=new Actions(driver);
		//act.moveToElement(null);
		Thread.sleep(4000);
		 driver.findElement(By.xpath("//a[@target='_self' and @href='/s/40-to-70-percent-off-4663-75761']")).click();
		Thread.sleep(2000);
		//WebDriverMethods.initializeJs(driver);
		//WebDriverMethods.scrollTillElement(element);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='rilrtl-lazy-img  rilrtl-lazy-img-loaded' and @src='https://assets.ajio.com/medias/sys_master/root/20211203/sOPE/61aa4be5aeb2690110f1c10c/high_fame_green_polka-dot_print_a-line_dress.jpg']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='oval size-variant-item size-instock ']/span[.='3-4Y']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='edd-pincode-msg-details']")).click();
		WebDriverMethods.switchToFrame(driver, 0);
		driver.findElement(By.xpath("//inpu[@name='pincode' and @type='number']")).sendKeys("562111");
		driver.findElement(By.xpath("//button[.='CONFIRM PINCODE']")).click();
		driver.findElement(By.xpath("//span[.='ADD TO BAG']")).click();
		String actualText = driver.findElement(By.xpath("//a[@href='/high-fame-polka-dot-print-a-line-dress/p/462504838005']")).getText();
		JavaMethods jm=new JavaMethods();
		jm.assertThroughIfcondition(actualText, "HIGH FAME - Polka-Dot Print A-line Dress", "TC pass");
		driver.findElement(By.xpath("//div[.='Delete' and @class='delete-btn']")).click();


	}
	}


