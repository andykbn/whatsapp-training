package andy.whatsapp_training;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class whatsapp1 extends base{
	
public static Logger log = LogManager.getLogger(base.class.getName());  
	
	
	@Test
	
	public void sendSingleMessage() throws IOException {
		driver=initDriver();
		log.info("Driver is initialized");
		driver.get(url);
		String name = getName();
		actions a = new actions(driver, name);
		a.getQr();
		log.info("Page loaded");
		a.getSearch().clear();
		a.getSearch().sendKeys(name);
		log.debug("search chat");
		a.getChat(name).click();
		a.getMessageBox().sendKeys("Hello, "+name);
		a.getSendButton().click();
	}
	
	@Test
	
	public void sendToMultipple() throws IOException {
		driver=initDriver();
		driver.get(url);
		String name = getName();
		actions a = new actions(driver, name);
		a.getQr();
		File txt = new File(contactFile);
		Scanner scan = new Scanner(txt);
		ArrayList<String> contList = new ArrayList<String>();
		while(scan.hasNextLine()) {
			contList.add(scan.nextLine());
		}
		for(String contact: contList) {
			System.out.println(contact);
		
		a.getSearch().clear();
		a.getSearch().sendKeys(contact);
		a.getChat(contact).click();
		a.getMessageBox().sendKeys("Hello, "+contact);
		a.getSendButton().click();
		}
	}
	
	@Test
	public void getIncomingMessages() throws IOException {
	driver=initDriver();
	driver.get(url);
	String name = getName();
	actions a = new actions(driver, name);
	a.getQr();
	a.getSearch().clear();
	a.getSearch().sendKeys(name);
	a.getChat(name).click();
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("document.querySelector('div[aria-label*='Message list']').scrollTop=-50000");
//	

	List<WebElement> inMessages =	 driver.findElements(By.xpath("//div[contains (@class, 'message-in')]"));
	System.out.println(inMessages.size());
	 
		 for(WebElement inc : inMessages) {

//			 System.out.println(inc.findElement(By.xpath("//div[@class='copyable-text']")).getAttribute("data-pre-plain-text"));
//			 System.out.println(inc.findElement(By.xpath("//div[@class='copyable-text']/div/span")).getText());

		 System.out.println(inc.getText());
//			 ;
		 }
	}
	
	@Test
	public void getOutboundMessages() throws IOException {
	driver=initDriver();
	driver.get(url);
	String name = getName();
	actions a = new actions(driver, name);
	a.getQr();
	a.getSearch().clear();
	a.getSearch().sendKeys(name);
	a.getChat(name).click();
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("document.querySelector('div[aria-label*='Message list']').scrollTop=-50000");
//	
	
	 List<WebElement> outMessages =	 driver.findElements(By.xpath("//div[contains (@class, 'message-out')]"));
	 
	 for(WebElement out : outMessages) {

//		 System.out.println(out.findElement(By.xpath("//div[@class='copyable-text']")).getAttribute("data-pre-plain-text"));
//		 System.out.println(out.findElement(By.xpath("//div[@class='copyable-text']/div/span")).getText());

		 System.out.println(out.getText());
	 }

//	
	}
	
	@Test
	
	public void chatList() throws IOException {
		driver=initDriver();
		
		driver.get(url);
		log.info("Driver is initialized");
		String name = getName();
		actions a = new actions(driver, name);
		a.getQr();
		List<WebElement> chList = driver.findElements(By.xpath("//div[@role='gridcell']/div/span"));
		for(WebElement chat: chList) {
			System.out.println(chat.getText());
		}
		
	}
	@AfterTest
	public void closeMessanger() {
		driver.close();
	}

}
