package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base{
	
	// in this class we will store UI elements of Login page
	//we will implement Pagefactory.initElement method to initialize the page elements
	//we will use @findBy annotations to store UI WebElements
	//we will store UI elments as Private Webelements and access them 
	//through the public methods and we will write the function inside the public methods. 
	//**
	//this consturctor will use to initiaize the Webelements inside this POM class
	// we will create PageFactor.initElments method inside the constructor 
	
	public LoginPageObject() {
		PageFactory.initElements(driver,this);
		
	}
//Pagefactory class provides an annotation @FindBy to find UI elements
// @Findby == driver.findElement()
	
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login;
	
	@FindBy (id="input-email")
	private WebElement email;
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement myAccountText;
	
	
	
	public void clickOnMyAccount() {
		myAccount.click();
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public void enterEmailAndPassword(String emailValue, String passwordValue) {
		
		email.sendKeys(emailValue);
		password.sendKeys(passwordValue);
	}
	
			
		
		public void clickOnloginButton() {
			
		  loginButton.click();
		
	
		
		}

            public boolean myAccountTextisPresent() {
            	
            	if(myAccountText.isDisplayed())
            		return true;
            	else 
            		return false;
            }    	
	


}






