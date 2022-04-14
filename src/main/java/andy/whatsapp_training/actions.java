package andy.whatsapp_training;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class actions {
	
	
	public WebDriver driver;
	By search = By.xpath("//div[@title='Search input textbox']");
	By messageBox = By.xpath("//div[@title='Type a message']");
	By sendButton = By.xpath("//button[@class='_4sWnG']");
	By messages = By.xpath("//div[contains(@aria-label,'Message list')]");
	//By chat = By.xpath("//span[@title='Angelina']/span")
			String name;
	
			public actions(WebDriver driver2, String name2) {
		this.driver = driver2;
		this.name = name2;
	}


	//			driver.findElement(By.xpath("//div[@title='Search input textbox']")).sendKeys(name);
	public WebElement getSearch () {
		return driver.findElement(search);
		
	}
	
	
	public void getQr () {
		Scanner kb = new Scanner(System.in);
		 System.out.println("Please scan QR and press Enter");
		 kb.nextLine();
		
	}
	

	
	public WebElement getChat (String name) {
		return driver.findElement(By.xpath("//span[@title='"+name+"']/span"));
		
		
	}
	
	public WebElement getMessageBox() {
		return driver.findElement(messageBox);
	}
	
	public WebElement getSendButton() {
		return driver.findElement(sendButton);
	}
	
	public WebElement getmessagesArea() {
		return driver.findElement(messages);
	}
	

}
