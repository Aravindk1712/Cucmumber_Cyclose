package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cyclos {
WebDriver driver;

	
	@Given("User should open the url")
	public void user_should_lanch_the_url() {
	    WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("headless");
	    driver=new ChromeDriver(options);
	    driver.get("https://demo.cyclos.org/ui/home");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[text()=' Login ']")).click();
	}

	@When("User should enter the {string} and {string}")
	public void user_should_enter_the_and(String User, String pass) {
		driver.findElement(By.xpath("//input[@placeholder='User']")).sendKeys(User);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
	}
	@When("User should click the edit profile   button")
	public void User_should_click_the_edit_profile_button() throws AWTException, InterruptedException {
	    
		driver.findElement(By.xpath("//a[@href='/users/self/profile/edit']//div[@class='quick-access-icon']//icon//*[name()='svg']")).click();
	   
	    driver.findElement(By.xpath("//input[@id='landLinePhoneNumber']")).sendKeys("044-22771317");
	    driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")).click();
	    Thread.sleep(5000);
	}

	@When("User should change the name and add mobile number and click save button")
	public void User_should_change_the_name_and_add_mobile_number_and_click_save_button() {
	    
		//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("User should click the add new  button")
	public void user_should_click_the_add_new_button() throws AWTException, InterruptedException {
	    
	    driver.findElement(By.xpath("//a[@href='/users/contacts']")).click();
	    driver.findElement(By.xpath("//div[contains(text(),'Add new')]")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys("ar");
	    driver.findElement(By.xpath("//a[normalize-space()='Ariadne']")).click();
	    driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")).click();
	    
	    
	    
	}

	@When("User should enter the value and click the submit button")
	public void user_should_enter_the_value_and_click_the_submit_button() {
	    
		//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		driver.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("User should click the submit button")
	public void user_should_click_the_submit_button() throws AWTException, InterruptedException {
	    
	    driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
	     driver.findElement(By.xpath("//input[@placeholder='Type to search']")).sendKeys(" Car");
	     driver.findElement(By.xpath("//a[text()=' Car repair ']")).click();
	     driver.findElement(By.xpath(" //input[@id='id_4']")).sendKeys("100");
	    
	     driver.findElement(By.xpath("//div[@class='w-100 mw-100 text-truncate pr-3']"));
	     driver.findElement(By.xpath("//span[text()='Next']")).click();
	     
	     driver.findElement(By.xpath("//span[text()='Confirm']")).click();
	     
	    /*WebElement drop = driver.findElement(By.xpath("//button[@class='btn btn-icon ml-2']"));
	    drop.click();
	    driver.findElement(By.xpath("//a[text()=' Car repair ']")).click();
	    driver.findElement(By.xpath("//input[contains(@id,'id')]")).sendKeys("200");
	    driver.findElement(By.xpath("//html/body")).sendKeys(Keys.PAGE_DOWN);
	    driver.findElement(By.xpath("//textarea[contains(@id,'id')]")).sendKeys("Payment done");
	    driver.findElement(By.xpath("//span[text()='Next']")).click();*/
	    
	}

	@When("User should enter the value and click confirm button")
	public void user_should_enter_the_value_and_click_confirm_button() {
	    
		//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		//driver.close();
	}
	
	
	
	@When("User should click the switch theme button new  button")
	public void user_should_click_the_switch_theme_button_new_button() throws InterruptedException {
	    
		driver.findElement(By.xpath("//a[@href='/personal/settings']//div[@class='quick-access-icon']//icon//*[name()='svg']")).click();
		Thread.sleep(5000);
		driver.close();
	}
	
	
	
	@When("User should click the directory button")
	public void User_should_click_the_directory_button() throws AWTException, InterruptedException {
	    
	
		driver.findElement(By.xpath("//a[@href='/users/search']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='My vouchers']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Buy vouchers')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Cinema voucher']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'form-control text-right ng-untouched ng-pristine ng-valid')]")).sendKeys("100");
		driver.findElement(By.xpath("//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")).click();
		
		
		////span[text()='Amount']//following::div//input[@class='form-control text-right ng-valid ng-dirty ng-touched']
		//driver.findElement(By.xpath("//a[@href='/users/messages/search']//div[@class='quick-access-icon']")).click();
	   
	   // driver.findElement(By.xpath("//div[contains(text(),'New message')]")).click();
	    //driver.findElement(By.xpath("//button[@id='id_11']")).click();
	   //Select select = new Select( driver.findElement(By.xpath("//button[@id='id_2']")));
	   //select.selectByVisibleText("User");
	   
	    
	    //driver.findElement(By.xpath("//button[@class='btn btn-icon ml-2']//icon//*[name()='svg']")).click();
	    //driver.findElement(By.xpath("//a[normalize-space()='Alfred Akuffo Addo']")).click();
	    //driver.findElement(By.xpath("//div[@id='id_212_editor']")).sendKeys("Hi, This is test 1 2 3 4");
	    //driver.findElement(By.xpath("//span[normalize-space()='Send']")).click();
	    
	    
	    
	    Thread.sleep(5000);
	}

	@When("User should click My vouchers and click Buy vouchers and send button")
	public void User_should_click_My_vouchers_and_click_Buy_vouchers_and_send_button() {
	    
		//driver.findElement(By.xpath("//span[text()='Confirm']")).click();
		driver.close();
	}


	@When("User should click scheduled payment")
	public void user_should_click_scheduled_payment() {
		driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
		driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")).click();
		driver.findElement(By.xpath("//th[text()='Due date']//parent::thead//following::td//a[text()=' 08/05/2023 ']")).click();
		driver.findElement(By.xpath("//div[text()='Cancel this scheduled payment']")).click();
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		driver.close();
		
	}

	@When("User should click scheduled payments")
	public void user_should_click_scheduled_payments() {
		driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
		driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")).click();
		WebElement txt = driver.findElement(By.xpath("//th[text()='Amount']//parent::thead//preceding-sibling::th"));
		String text = txt.getText();
		System.out.println(text);
		driver.close();
	}

	@When("User should click scheduled payment mode")
	public void user_should_click_scheduled_payment_mode() {
		driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
		driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")).click();
		driver.findElement(By.xpath("//th[text()='Due date']//parent::thead//following::div//a[text()='Cyclos software']")).click();
		driver.quit();
	}

	@When("User should click scheduled payment modes")
	public void user_should_click_scheduled_payment_modes() {
		driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
		driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Scheduled payments']")).click();
		driver.findElement(By.xpath("//th[text()='Due date']//parent::thead//following::div//a[text()='Forum']")).click();
		driver.quit();
	}
	
	@When("User should click Member account")
	public void user_should_click_member_account() {
		driver.findElement(By.xpath("//a[@href='/banking/self/payment']//div[@class='quick-access-icon']")).click();
	   driver.findElement(By.xpath("//div[normalize-space()='Member account']")).click();
	   WebElement findElement = driver.findElement(By.xpath("//th[text()=' Description']"));
	   String text = findElement.getText();
	   System.out.println(text);
	   driver.quit();
	   
	}

	@When("User should click voucher")
	public void user_should_click_voucher() {

		driver.findElement(By.xpath("//div[contains(text(),'My vouchers')]")).click();
		driver.findElement(By.xpath("//div[@class='nav-item-text'][normalize-space()='Business directory']")).click();
		driver.findElement(By.xpath("//format-field-value[normalize-space()='Natural garden pools']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='Make payment']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'id')]")).sendKeys("200");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Confirm']")).click();
		driver.quit();
		
	}
}

	

