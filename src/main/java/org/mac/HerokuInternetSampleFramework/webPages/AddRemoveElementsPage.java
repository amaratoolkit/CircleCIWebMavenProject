package org.mac.HerokuInternetSampleFramework.webPages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRemoveElementsPage {

	public AddRemoveElementsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@onclick='addElement()']")
	private WebElement addElementButton;

	@FindBy(xpath = "//*[@onclick='deleteElement()']")
	private List<WebElement> deleteButton;

	public void addMultipleDeleteButtons(int n) {
		for (int i = 0; i < n; i++) {
			addElementButton.click();
		}
	}

	public int getNumnberOfButtons() {
		return deleteButton.size();
	}

	public void removeDeleteButtons(int n) {
		for(int i=0; i<n; i++) {
			deleteButton.get(0).click();
		}

	}

}
