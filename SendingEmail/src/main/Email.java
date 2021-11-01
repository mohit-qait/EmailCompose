package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Email extends Base {

	static WebDriver driver = launchBrowser();
	
	// this method use to launch URL
	public static void launchUrl(String url) {
		System.out.println("Trying to launching URL.....");
		driver.get(url);
		System.out.println("Launched the " + url);
	}

	// this method provide the credentials
	public static void provideCredentials(String userName, String password) {
		impliciteWait();
		driver.findElement(By.id("identifierId")).sendKeys(userName);
		System.out.println("User Enters the " + userName);
		driver.findElement(By.id("identifierNext")).click();
		System.out.println("User Clicks on the next button");
		driver.findElement(By.id("password")).sendKeys(password);
		System.out.println("User enters the " + password);
		driver.findElement(By.id("passwordNext")).click();
		System.out.println("User Clicks on the next button");
	}

	// this method Clicks on the compose button
	public static void clickOncomposeButton() {
		impliciteWait();
		driver.findElement(By.className("aic")).click();
		System.out.println("User clicks on Compose button");
	}
	
	// this method verify Recipent Text 
	public static String verifyRecipentText() {
		String windoText = driver.findElement(By.id(":oc")).getText();
		return windoText;
	}
	
	// this method add Recipent 
	public static void addRecipients(String recipients) {
		impliciteWait();
		driver.findElement(By.id(":oc")).sendKeys(recipients);
		System.out.println("User enters the Recipients" + recipients);
	}

	// this method enter subject 
	public static void enterSubject(String subject) {
		driver.findElement(By.id(":pd")).sendKeys(subject);
		System.out.println("User Enters the Subject " + subject);

	}

	// this method enter Body Text 
	public static void enterBodyContent(String bodyText) {

		driver.findElement(By.id(":qj")).sendKeys(bodyText);
		System.out.println("User enters the Body" + bodyText);
	}

	// this verify Subject Text 
	public static String verifySubjectText() {
		String windoText = driver.findElement(By.className("aYF")).getText();
		return windoText;
	}
	// this verify Body Text
	public static String verifyBodyText() {
		String windoText = driver.findElement(By.id(":qj")).getText();
		return windoText;
	}
	// this verify Logo Text
	public static String verifyLogotext() {
		String actualLogoText = driver.findElement(By.id("logo")).getAttribute("title");
		return actualLogoText;
	}

	// this verify New Window Text
	public static String verifyNewWindowText() {
		String windoText = driver.findElement(By.className("aYF")).getText();
		return windoText;
	}
	
	// this mathod is clicks on the Send Button
	public static void clickOnSendButton() {
		
		driver.findElement(By.className("dC")).click();
		System.out.println("User clicks on the Send button");
	}

}
