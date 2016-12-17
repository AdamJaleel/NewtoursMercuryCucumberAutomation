package com.newtours.utilities;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;

public class Browser extends Base {

	public static void verifyText(String text) {
		
		if (text.isEmpty()) {
			fail("text cannot be empty");
		}
		try {
			assertTrue("cannot locate the element", driver.findElement(By.xpath(text)).isDisplayed());
		} catch (Exception e) {
			fail("element does not exist");
		}

	}

}
