package practice;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseClass {
	
	@Test(priority=1)
	public void login() {
		//verifications
		WebElement swagLabTest = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		if(swagLabTest.getText().contains("Swag Labs")) {
			Reporter.log("Login successfull");
		}
		else {
			Reporter.log("Login failed");
		}
	}
	
	
	@Test(priority=2)
	public void addToCart() {
		// add to bag
		driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/../../..//button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
		//verify
		driver.findElement(By.id("shopping_cart_container")).click();
		List<WebElement> productsInCart = driver.findElements(By.className("cart_list"));
		
		String addToCartVerify ="";
		for(WebElement cartProducts : productsInCart) {
			addToCartVerify = cartProducts.getText();
		}
		if(addToCartVerify.contains("Sauce Labs Backpack") && addToCartVerify.contains("Sauce Labs Bike Light")) {
			Reporter.log("The products are added | Status: pass", true);
		}
		else {
			Reporter.log("The products are not added | Status: fail", true);
		}	
	}
	
}
