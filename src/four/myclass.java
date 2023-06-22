package four;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclass {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com");

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("problem_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.manage().window().maximize();
		
	    List<WebElement> the_add_buttons = driver.findElements(By.className("btn"));
	    System.out.println(the_add_buttons.size());
		
	    
	    
	    Random rand = new Random();
	    int index = rand.nextInt(0, the_add_buttons.size());
		for (int i = 0; i < index; i++) {
			the_add_buttons.get(i).click();
			
	    
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,10)");


        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("./screenshot/1.jpg");
        FileUtils.copyFile(SrcFile, DestFile);
        
		}}}



    


    	


