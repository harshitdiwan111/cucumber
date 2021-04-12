package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registrationpageobject {
	@FindBy(how=How.ID,using="userName")
    private WebElement uname;

	@FindBy(how=How.ID,using="firstName")
    private WebElement fname;
	
	@FindBy(how=How.ID,using="lastName")
    private WebElement lname;
	
	@FindBy(how=How.ID,using="password")
    private WebElement pwd;
	
	@FindBy(how=How.ID,using="pass_confirmation")
    private WebElement cpwd;
	
	@FindBy(how=How.ID,using="gender")
    private WebElement gender;
	
	@FindBy(how=How.ID,using="emailAddress")
    private WebElement email;
	
	@FindBy(how=How.ID,using="mobileNumber")
    private WebElement mob;
	
	@FindBy(how=How.ID,using="dob")
    private WebElement dob;
	
	@FindBy(how=How.ID,using="address")
    private WebElement address;
	
	//@FindBy(how=How.ID,using="securityQuestion")
    //private WebElement sq;
	
	@FindBy(how=How.ID,using="answer")
    private WebElement ans;
	
	@FindBy(how=How.NAME,using="Submit")
    private WebElement regis_button;
	
    private WebDriver driver;
    
    public Registrationpageobject(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(this.driver, this);
    }
    
    public void Registration(String username, String first, String last , String pass,String Pass1, String gen,String id,String phone,String birth,String add,String ans1) {
    	uname.sendKeys(username);
    	fname.sendKeys(first);
    	lname.sendKeys(last);
    	pwd.sendKeys(pass);
    	cpwd.sendKeys(Pass1);
    	gender.click();;
    	email.sendKeys(id);
    	mob.sendKeys(phone);
    	dob.sendKeys(birth);
    	address.sendKeys(add);
    	ans.sendKeys(ans1);
    	regis_button.click();
    }
	
	
	
	
	
}
