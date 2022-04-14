package andy.whatsapp_training;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class test2 extends base{


		
		@Test
		
		public void chatList() throws IOException {
			driver=initDriver();
			driver.get(url);
			String name = getName();
			actions a = new actions(driver, name);
			a.getQr();
			List<WebElement> chList = driver.findElements(By.xpath("//div[@role='gridcell']/div/span"));
			System.out.println(chList.size());
			for(WebElement chat: chList) {
				System.out.println(chat.getText());
			}
			
		}
		
		
		
	}

