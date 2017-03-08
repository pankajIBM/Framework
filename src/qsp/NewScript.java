package qsp;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
	public class NewScript {

		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("file:///E:/htmlCode/ListBox.html");
			
			WebElement listBox=driver.findElement(By.id("month"));
			
			Select select=new Select(listBox);
			
			select.selectByIndex(1);
			Thread.sleep(1000);
			select.selectByValue("m");
			Thread.sleep(1000);
			select.selectByVisibleText("MAY");	
			
			if(select.isMultiple())
			{
				//select.deselectByIndex(1);
				//Thread.sleep(1000);			
				//select.deselectByValue("f");
				//Thread.sleep(1000);
				//select.deselectByVisibleText("MAY");
				
				select.deselectAll();
				
			}
			
			else
			{
				System.out.print("Sorry not Possible");
			}
			
			
		}	

		}



