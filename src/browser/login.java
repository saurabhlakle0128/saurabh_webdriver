package browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login
{
	public static void main(String[] args) throws InterruptedException
	{
	WebDriver s=new	ChromeDriver();
	s.get("https://www.facebook.com/login/");
	Thread.sleep(3000); //for late login
	
	
	//Xpath by Attribute
	
	//s.findElement(By.xpath("//input[@type='text']")).sendKeys("9404030293");
	//Thread.sleep(3000);
	
	
	//Xpath by Attribute
	
	//s.findElement(By.xpath("//input[@type='password']")).sendKeys("saurabh");
	//Thread.sleep(3000);
	
	//Xpath by Attribute
	//s.findElement(By.xpath("//button[@name='login']")).click();
	//Thread.sleep(3000);
	
	//xpath by TEXT
	//s.findElement(By.xpath("//button[text()='Log in']")).click();
	
	
	//xpath by TEXT
	//s.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	
	
	s.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	
	//s.findElement(By.xpath("//input[@name='firstname']")).sendKeys("saurabh");
	
	s.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]")).sendKeys("jbhddyuv");
	
	//Thread.sleep(3000);
	
//	s.findElement( By.xpath("(//input[@type='text'])[2]")).sendKeys("hdsgu6f");
	
	
	//s.findElement( By.xpath("(//input[@type='text'])[3]")).sendKeys("byudsf");
	
	//s.findElement(By.xpath("(//input[@type='password'])")).sendKeys("saurabh");
	

	
	
	}
}


////a[text()='Forgotten password?']