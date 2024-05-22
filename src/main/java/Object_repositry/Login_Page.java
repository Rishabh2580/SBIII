package Object_repositry;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
	
    private String claimNumber;
	
	
	  WebDriver  driver;
public Login_Page(WebDriver d) {

	driver = d;
	PageFactory.initElements(driver, this);
}

	@FindBy(xpath = "//p[contains(text(),'Validation Dashboard')]")
	WebElement Boardname;
	@FindBy(id = "email")
	WebElement username;
	@FindBy(xpath = "//body/app-root[1]/app-auth[1]/app-sign-in[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")
	WebElement pass;
	@FindBy(xpath = "//button[contains(text(),'LOGIN')]")
	WebElement Signin;
	//-----------------------------------------------------
	
	@FindBy(xpath = "//*[@id=\"main\"]/app-application-list/div/div[3]/div/div[1]/div/input")
	
	WebElement Search;
	
	
	@FindBy(xpath = "//small[contains(text(),'view')]")
			
	WebElement View;
	
	@FindBy(xpath = "//thead/tr[1]/th[4]")
	
	WebElement Name ;
	
	
	//------------------------------------------------------------------------------------------------------
	
	
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/div[1]/main[1]/app-application-list[1]/div[1]/div[1]/p[1]")
	
	WebElement Validation;
	
	
	
	//----------------------------------------------------------------------------------------------------------
	 @FindBy(xpath = "//tbody/tr[1]/td[2]/a[1]")
	 WebElement frontdashboard;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/div[1]/main[1]/app-details[1]/div[1]/div[1]/div[1]")
	
	WebElement Backarrow;
 
	//------------------------------------------------------------------------------------------------------------------------
	
	@FindBy(xpath = " //span[contains(text(),'Validation')]")
	
	WebElement validate;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	WebElement Text;
	
	
	
	//----------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	public String BoardName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(Boardname));
	    return Boardname.getText();
	}


	public void emailuser(String cauliflower)
	{
		
		
		
		username.sendKeys("sbilife@artivatic.ai");
		
	}


	public void Passuser(String cauliflower)
	{
		
		
		
		pass.sendKeys("sbilife@123");
		
	}


	public void saveinhit()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(Signin));
	    Signin.click();
		
	}

	
	//------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	public void ssearchshit(String cauliflower) throws InterruptedException
	{
		
		 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
	    wait.until(ExpectedConditions.elementToBeClickable(Search));
	   // Search.sendKeys(Keys.RETURN);
        //driver.navigate().refresh();
       // Thread.sleep(5000);
        //driver.navigate().refresh();
	    Search.sendKeys("3DYH150171");
		
		
	}
	
	
	
	
	
	public void viewhit()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(View));
	    View.click();
		
	}

	
	public void  Name () throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(Name));

        Thread.sleep(5000); // Note: Consider using explicit waits instead of Thread.sleep()

        // Get the text from the element
        String actualText = Name.getText();
        
        System.out.println(actualText);

        // Expected text
        String expectedText = "Remarks";

        // Assert that the actual text matches the expected text
       // Assert.assertEquals(expectedText, actualText);
    }
	
	
	
	
	public void  Validationn () throws InterruptedException
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.elementToBeClickable(Validation));
	    String Extact_text = Validation.getText();
	    System.out.println(Extact_text);
	    
	    String Actual_text = "Validation Dashboard";
	    
	    //Assert.assertEquals(Extact_text, Actual_text);
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
    }
	
	
	
	
	public void Backarro() throws InterruptedException
	{
		
		 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
	    wait.until(ExpectedConditions.elementToBeClickable(frontdashboard));
	    //wait.until(ExpectedConditions.elementToBeClickable(Backarrow));
	   // Search.sendKeys(Keys.RETURN);
        //driver.navigate().refresh();
       // Thread.sleep(5000);
        //driver.navigate().refresh();
	    
        frontdashboard.click();	  
        
        Thread.sleep(4000);
	    
	    Backarrow.click();
		
		
	}
	

	//-----------------------------------------------------------------------------------------------
	
	
	public void Validatonbtn() throws InterruptedException
	{
		
		 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
	    wait.until(ExpectedConditions.elementToBeClickable(frontdashboard));
        frontdashboard.click();	
	    wait.until(ExpectedConditions.elementToBeClickable(Validation));

        
        Thread.sleep(4000);
        
        validate.click();
        Thread.sleep(4000);

        String Raw_Text = Text.getText();
        
        System.out.println(Raw_Text);
        
        Thread.sleep(4000);


        
        System.out.println(Raw_Text);
        
        String Actual_Text  = "No records found";
        
       // Assert.assertEquals(Raw_Text, Actual_Text);
 
		
	}
	
}


	



