package ebr;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.ArrayList;

public class ebrrTest {


	WebDriver driver;
	
	@Before
	public void testSetup() {
		
	System.setProperty("webdriver.gecko.driver", "/Users/ebru/Downloads/geckodriver");


	driver=new FirefoxDriver();
	
	driver.get("http://www.n11.com");
	
	driver.get("https://www.n11.com/giris-yap");
	
	driver.findElement(By.name("email")).sendKeys("ebru.991@hotmail.com");
	driver.findElement(By.name("password")).sendKeys("123456a");
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.id("searchData")).sendKeys("samsung");
	driver.findElement(By.className("searchBtn")).click();
	
	}
	
	@After
	public void Shutdown() {
	driver.close();
	}
	
	
	@Test
	public void SamsungUrunuIcermeTesti(){

		
		
		WebElement element=driver.findElement(By.className("listView"));
		List<WebElement> list1=element.findElements(By.tagName("h3"));
		
		System.out.println(list1);
		for(WebElement b:list1) {
		
		
		Assert.assertTrue("samsung", b.getText().toLowerCase().startsWith("samsung"));
		
		
		
		}
		
		}


		
	@Test
		public void IkınciSayfayıAcmaTesti() {
		try {
			driver.findElement(By.linkText("2")).click();
			System.out.println("2. Sayfa başarıyla açıldı");
		
		
		}catch(Exception e) {
			System.out.println("Sayfa açılırken hata oluştu");
			
		}
		}
	
		@Test
		public void FavorilereEklemeTesti() {
	
		
		

		driver.findElement(By.linkText("2")).click();
		driver.findElement(By.xpath("//*[@id=\'p-172445146\']/div[2]/span[2]")).click();
		System.out.println("Ürün favorilere eklendi");
		
		
	

		}
		@Test
		public void FavorilerdenKaldırmaTesit() {
		driver.navigate().to("https://www.n11.com/hesabim/favorilerim");	
		
		try {
		driver.findElement(By.className("itemSelected")).click();
		driver.findElement(By.className("removeSelectedProduct")).click();
		System.out.println("Ürün favorilerden kaldırıldı");

		
		}
		catch(Exception e){
		System.out.println("Favorilerden kaldırılırken hata oluştu");
		}
	}}
	


