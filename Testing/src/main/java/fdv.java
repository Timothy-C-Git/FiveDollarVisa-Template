import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class fdv {
	public static void main(String[] args) throws TelegramApiException {
		TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
		botsApi.registerBot(new Bot());}}

//public class fdv {
//
//	public static void main(String args[])
//	{
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("user-data-dir=C:\\users\\19728\\AppData\\Local\\Google\\Chrome\\User Data");
//
//		// Instantiate a ChromeDriver class.
//		WebDriver driver = new ChromeDriver(options);
//		
//		// Maximize the browser
//		driver.manage().window().maximize();
//
//		// Launch Website
//		driver.get("https://e-visa.gov.uz/main");
//		
//		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-animating')]")));
//		WebElement uz_vis_app = driver.findElement(By.xpath("/html/body/app-root/app-main/section/div[2]/div/div/div[1]/a/div/div/h5"));
//		wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-animating')]")));
//		uz_vis_app.click();
//		wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-animating')]")));
//		WebElement cit_sel = driver.findElement(By.xpath("/html/body/app-root/app-application/section/div[2]/div[2]/div/div/div/div[2]/div[1]/select"));
//		cit_sel.click();
//		wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-animating')]")));
//		WebElement cit_sel_us = driver.findElement(By.xpath("/html/body/app-root/app-application/section/div[2]/div[2]/div/div/div/div[2]/div[1]/select/option[135]"));
//		cit_sel_us.click();
//		wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-animating')]")));
//		WebElement cit_sel_us_pass = driver.findElement(By.xpath("/html/body/app-root/app-application/section/div[2]/div[2]/div/div/div/div[2]/div[2]/select"));
//		cit_sel_us_pass.click();
//		wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-animating')]")));
//		WebElement cit_sel_us_pass_conf = driver.findElement(By.xpath("/html/body/app-root/app-application/section/div[2]/div[2]/div/div/div/div[2]/div[2]/select/option[2]"));
//		cit_sel_us_pass_conf.click();
//		wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-animating')]")));
//		
//		
//		//wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-animating')]")));
//		//WebElement expand_account_balance_options = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div[2]/main/div/div[2]/div/div/div"));
//		//expand_account_balance_options.click();
//		
//		//wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-animating')]")));
//		//WebElement expand_account_balance = driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div[2]/main/div/div[2]/div/div/div[2]/div/div[4]"));
//		//expand_account_balance.click();
//		
//		
//		
//		//wait.until(org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'ng-animating')]")));
//		//driver.findElement(By.xpath("/html/body")).sendKeys(Keys.CONTROL, Keys.END);
//		
//		//WebElement cookies = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div[1]"));
//		//cookies.click();
//        
//		//WebElement redirect = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button"));
//		//redirect.click();
//		
//		//WebElement username = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div/form/div/div[2]/div[2]/div/div/span/input"));
//		//username.sendKeys("ecotaxieco");
//		
//		//WebElement username_login = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div/form/div/div[3]/div[2]/button"));
//		//username_login.click();
//		
//		//WebElement password = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/form/div/div[2]/div[2]/div[1]/span/input"));
//		//password.sendKeys("tR9eP4EsP9kYcbB77");
//		
//		//WebElement password_login = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/form/div/div[3]/div[1]/button"));
//		//password_login.click();
//		
//	}
//}
