package org.airline;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VoloTea extends Base {
	public static void main(String[] args) throws Throwable {
		launch();
		ttt("https://www.volotea.com/");
		WebElement rad = driver.findElement(By.xpath("//input[@value='OneWay']"));
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].click()", rad);
		WebElement sor = driver.findElement(By.xpath("//input[@name='origin']"));
		search(sor,"madrid");
		robo(1);
		WebElement des = driver.findElement(By.xpath("//input[@name='destination']"));
		search(des,"nantes");
		robo(1);
		Thread.sleep(3000);
		webtable("29");
		WebElement chil = driver.findElement(By.xpath("//select[@name='children']"));
		dropdown(chil,"0");
		WebElement curr = driver.findElement(By.xpath("//select[@name='currencySelect']"));
		dropdown(curr,"USD $");
		screenShot("F:\\selenium screenshot\\out.png");
		WebElement findfl = driver.findElement(By.xpath("//a[@role='button']"));
		click(findfl);
		WebElement con = driver.findElement(By.xpath("(//a[@data-type='submit'])[4]"));
		click(con);
		WebElement tit = driver.findElement(By.xpath("(//div[@class='radio-wrapper'])[1]"));
		click(tit);
		WebElement fname = driver.findElement(By.xpath("(//input[@id='name_0'])"));
		search(fname,"venkatesh");
		WebElement sname = driver.findElement(By.xpath("(//input[@id='surname1_0'])"));
		search(sname,"SM");
		WebElement co = driver.findElement(By.xpath("(//select[@class='country'])"));
		dropdown(co,"India");
		WebElement ph = driver.findElement( By.xpath("(//input[@id='phone'])"));
		search(ph,"8526929857");
		WebElement email = driver.findElement(By.xpath("(//input[@id='email'])"));
		search(email,"venkateshv6868@gmail.com");
		WebElement ch = driver.findElement(By.xpath("(//div[@class='icheckbox_square-mustard'])[5]"));
		click(ch);
		screenShot("F:\\selenium screenshot\\out1.png");
		WebElement ne = driver.findElement(By.xpath("//a[@class='button arrow xl']"));
		click(ne);
		WebElement n = driver.findElement(By.xpath("//a[@id='continueAndCustomizeButton']"));
		click(n);
		WebElement seat = driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[10]"));
		click(seat);
		WebElement board = driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[12]"));
		click(board);
		WebElement baggage = driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[15]"));
		click(baggage);
		WebElement menu = driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[23]"));
		click(menu);
		WebElement flex = driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[31]"));
		click(flex);
		WebElement ent = driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[33]"));
		click(ent);
		WebElement insure = driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[36]"));
		click(insure);
		WebElement checkin = driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[38]"));
		click(checkin);
		WebElement step = driver.findElement(By.xpath("(//a[@class='button arrow xl mainSubmit block-xs'])[2]"));
		click(step);
		screenShot("F:\\selenium screenshot\\out2.png");
		WebElement page = driver.findElement(By.xpath("(//a[@class='button arrow xl mainSubmit block-xs'])[1]"));
		click(page);
		escape();
		WebElement card = driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[3]"));
		click(card);
	}

	
	

}
