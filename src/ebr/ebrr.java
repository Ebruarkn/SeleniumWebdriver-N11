package ebr;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ebrr {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/Users/ebru/Downloads/geckodriver");
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.n11.com");
		
		driver.get("https://www.n11.com/giris-yap");
		
		driver.findElement(By.name("email")).sendKeys("ebru.991@hotmail.com");
		driver.findElement(By.name("password")).sendKeys("123456a");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.id("searchData")).sendKeys("samsung");
		driver.findElement(By.className("searchBtn")).click();
		Thread.sleep(2000);
		
		
		
		WebElement element=driver.findElement(By.className("listView"));
		List<WebElement> list1=element.findElements(By.tagName("h3"));
		for(WebElement b:list1) {
		String icerik=b.getText().toLowerCase();
		//System.out.println(icerik);
		
		
		if(icerik.contains("samsung")) {
			System.out.println("Samsung ürünü");
			
		}else { 
			System.out.println("SAMSUNG OLMAYAN ÜRÜN MEVCUT");
		}
		}
		
		
		
		Thread.sleep(2000);
		try {
			driver.findElement(By.linkText("2")).click();
			System.out.println("2. Sayfa başarıyla açıldı");
		
		
		}catch(Exception e) {
			System.out.println("Sayfa açılırken hata oluştu");
			
		}
		
		Thread.sleep(2000);
		
		try {
		driver.findElement(By.xpath("//*[@id=\'p-172445146\']/div[2]/span[2]")).click();
		System.out.println("Ürün favorilere eklendi");
		
		
		}catch(Exception e) {
			System.out.println("Ürün favorilere eklenirken hata oluştu");
			 

		}
		
		driver.navigate().to("https://www.n11.com/hesabim/favorilerim");	
		
		try {
		driver.findElement(By.className("itemSelected")).click();
		driver.findElement(By.className("removeSelectedProduct")).click();
		System.out.println("Ürün favorilerden kaldırıldı");

		
		}
		catch(Exception e){
		System.out.println("Favorilerden kaldırılırken hata oluştu");
		}
		    
		}
}
