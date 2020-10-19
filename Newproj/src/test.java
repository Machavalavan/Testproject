import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "M:\\selenium\\driver\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://139.59.43.169/europetWeb/#/");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/div/div/div/div[3]/div/input")).sendKeys("6566656665");
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/div/div/div/div[4]/div/input")).sendKeys("123456");
    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/div/div/div/div[5]/button")).click();
}
}
