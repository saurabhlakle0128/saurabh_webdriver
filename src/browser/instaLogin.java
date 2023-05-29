package browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

;

public class instaLogin {
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver s=new	ChromeDriver();
	s.get("https://www.instagram.com/accounts/login/");
	
Thread.sleep(3000); //for late login
	
	s.findElement(By.xpath("//input[name='username']")).sendKeys("ajhudijeihbc");
	Thread.sleep(3000);
	
	s.findElement(By.xpath("//input[@type='password']")).sendKeys("6787429827");


	
	}


}