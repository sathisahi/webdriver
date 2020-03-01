package selenium.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fblogin {
	WebDriver  driver;/*WebDriver is an interface,driver is default object variable,it is global variable declaration,so it can be acceble any where*/
	public void browser() {
		System.setProperty("webdriver.gecko.driver","E:\\selenium soft - Copy\\geckodriver.exe" );
	  driver=new FirefoxDriver();
	 driver.get("https://www.fb.com");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	}
	public void login() {
		driver.findElement(By.name("email")).sendKeys("sahithisudha.basavapathri@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("9949450920");
		driver.findElement(By.id("u_0_b")).click();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fblogin obj=new fblogin();
obj.browser();
obj.login();

	}

}




