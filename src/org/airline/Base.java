package org.airline;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	public static WebDriver launch(){
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sridhar\\Ecli\\Selenium\\driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		    
			return driver;
	}
	public static void ttt(String url) {
		driver.get(url);
		
	}
	public static void search(WebElement w,String s){
		w.sendKeys(s);
		
	}
	public static void click(WebElement w) {
		w.click();
	}
	static Robot r;
	  public static void robo(int v) throws Throwable {
		   Robot r=new Robot();
		    for(int i=0;i<=v;i++) {
		    	r.keyPress(KeyEvent.VK_ENTER);
			    r.keyRelease(KeyEvent.VK_ENTER);
			    
		    
	    }
		    
}
	  public static void escape() {
		  r.keyPress(KeyEvent.VK_ESCAPE);
		  r.keyRelease(KeyEvent.VK_ESCAPE);
	
		  
	  }
	  public static void webtable(String s) {
		  List<WebElement> allrows = driver.findElements(By.tagName("tr"));
			for(int i=0;i<allrows.size();i++) {
				WebElement eachr = allrows.get(i);
				List<WebElement> alldatas = eachr.findElements(By.tagName("td"));
				for(int j=0;j<alldatas.size();j++) {
					WebElement eachd = alldatas.get(j);
					String text = eachd.getText();
					if(text.equals(s)) {
						eachd.click();
					}
				}
			}
		    	
		    }
	  public static void dropdown(WebElement dd,String s ) {
		  Select sr=new Select(dd);
		  sr.selectByVisibleText(s);
	  }
	  public static void screenShot(String sc) throws IOException {
		  TakesScreenshot tk=(TakesScreenshot)driver;
		  File f = tk.getScreenshotAs(OutputType.FILE);
		  File dest=new File("sc");
		  FileUtils.copyFile(f, dest);
	  }
	    	
	    }


