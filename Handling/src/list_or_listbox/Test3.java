package list_or_listbox;

	import java.util.ArrayList;
	import java.util.Collection;
	import java.util.Collections;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Test3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/admin/Desktop/Link16.html");
		WebElement listBox = driver.findElement(By.name("country"));
		Select s = new Select(listBox);
		List<WebElement> allOptions = s.getOptions();
		ArrayList<String> allText = new ArrayList<String>();

		int count = allOptions.size();
		for(int i=0;i<count;i++) {
			String text = allOptions.get(i).getText();
			System.out.println(text);
			allText.add(text);
		}
		Collections.sort(allText);
		for(String s1: allText) {
			System.out.println(s1);
		}
		
	}
	
}
