package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.Email;

public class EmailTest extends Email {
	
	@Test
	public void composeEmail() {
		
		launchUrl("https://gmail.com");
		Assert.assertEquals("Google", verifyLogotext());
		provideCredentials("UserName", "Password");
		//Click on the Compose button
		clickOncomposeButton();
		Assert.assertEquals("New Message", verifyNewWindowText());
		//add recipients and verify
		addRecipients("any recipaint mail id");
		Assert.assertEquals("any recipaint mail id", verifyRecipentText());
		//Enter the Subject Content and verify
		enterSubject("Incubyte");
		Assert.assertEquals("Incubyte", verifySubjectText());
		//Enter the Body content and verify
		enterBodyContent("Automation QA test for Incubyte");
		Assert.assertEquals("Automation QA test for Incubyte", verifyBodyText());
		
		clickOnSendButton();
		// to close the browser
		tearDown();
	}

}
