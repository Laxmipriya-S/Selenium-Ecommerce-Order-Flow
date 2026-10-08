package ecommerce_order_flow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ecommerce {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.className("product_sort_container"));
		Thread.sleep(2000);
		
		Select sort=new Select(dropdown);
		System.out.println("Options is dropdown:");
		List<WebElement> options=sort.getOptions();
		for( WebElement e : options) {
			System.out.println(e.getText());
		}
		Thread.sleep(2000);
		
		System.out.println("-----------------");
		sort.selectByVisibleText("Price (low to high)");
		Thread.sleep(2000);
		
		dropdown=driver.findElement(By.className("product_sort_container"));
		Select check=new Select(dropdown);
		WebElement selected=check.getFirstSelectedOption();
		
		if(selected.getText().equals("Price (low to high)")) {
			System.out.println("selected successfully");
		}
		else {
			System.out.println("Not Selected");
		}
		Thread.sleep(2000);
		
		List<WebElement> products=driver.findElements(By.xpath("//div[@class='inventory_item_description']"));
		String name=" ";
		double price=Double.MAX_VALUE;
		WebElement element=null;
		
		for(WebElement e: products) {
			String productName=e.findElement(By.className("inventory_item_name")).getText();
			String productPrice=e.findElement(By.className("inventory_item_price")).getText();
			
			productPrice=productPrice.replace("$", "");
			double p=Double.parseDouble(productPrice);
			if(p<price) {
				price=p;
				name=productName;
				element=e;
			}
		}
		
		Thread.sleep(2000);
		 element.findElement(By.className("btn_inventory")).click();
		 Thread.sleep(2000);
		 
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstName")).sendKeys("Laxmipriya");
		Thread.sleep(2000);
		
		driver.findElement(By.id("last-name")).sendKeys("S");
		Thread.sleep(2000);
		
		driver.findElement(By.name("postalCode")).sendKeys("609609");
		Thread.sleep(2000);
		
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		String checkoutProductName=driver.findElement(By.className("inventory_item_name")).getText();
		if(checkoutProductName.equals(name)) {
			System.out.println("Test passed: "+name);
		}else {
			System.out.println("test failed");
		}
		Thread.sleep(2000);
		
		String total=driver.findElement(By.className("summary_total_label")).getText();
		Thread.sleep(2000);
		
		String tax=driver.findElement(By.className("summary_tax_label")).getText();
		Thread.sleep(2000);
		
		System.out.println("order placed");
		System.out.println("Product Description:");
		System.out.println("Product Name:"+ name);
		System.out.println("Product Price:"+ price);
		System.out.println(tax);
		System.out.println(total);
		
		driver.findElement(By.id("finish")).click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}

