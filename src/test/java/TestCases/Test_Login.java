package TestCases;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Object_repositry.Login_Page;
import Pages.BasePage;

public class Test_Login extends BasePage{
	
	
	// @Test
	    public void Test1() throws InterruptedException {
	
        Login_Page S = new Login_Page(driver);
    
        S.emailuser("sbilife@artivatic.ai"); 
    
        test.log(LogStatus.INFO,"username entered successfully");

        S.Passuser("sbilife@123");
    
        test.log(LogStatus.INFO,"Password entered successfully");
           
        for(int i = 0; i<=5;i++)
        {
        	
        	
        	S.saveinhit();
            test.log(LogStatus.INFO,"Login Succeessfully");

        	
        }
        
            String boardNameText = S.BoardName();
            
            System.out.println("Board Name: " + boardNameText);
            
            test.log(LogStatus.INFO,"Fetched Board Name Successfully");
	 }


	 
	 
        
        
	// @Test
	    public void Test2() throws InterruptedException {
	
     Login_Page S = new Login_Page(driver);
 
     S.emailuser("sbilife@artivatic.ai"); 
 
     test.log(LogStatus.INFO,"username entered successfully");

     S.Passuser("sbilife@123");
 
     test.log(LogStatus.INFO,"Password entered successfully");
        
     for(int i = 0; i<=2;i++)
     {
     	
     	
     	S.saveinhit();
        test.log(LogStatus.INFO,"Login Succeessfully");

     	
     }
     
    
     Thread.sleep(9000);
    
     S.ssearchshit("3DYH150171");
     
     Thread.sleep(12000);

     S.viewhit();
     
     S.Name();   //Validating Remark because it is present there 
     
    }	







//@Test
public void Test3() throws InterruptedException {
	
    Login_Page S = new Login_Page(driver);

    S.emailuser("sbilife@artivatic.ai"); 

    test.log(LogStatus.INFO,"username entered successfully");

    S.Passuser("sbilife@123");

    test.log(LogStatus.INFO,"Password entered successfully");
       
    for(int i = 0; i<=5;i++)
    {
    	
    	
    	S.saveinhit();
       test.log(LogStatus.INFO,"Login Succeessfully");

    	
    }
    
    Thread.sleep(300);
    
    S.Validationn();
    
    
    test.log(LogStatus.INFO, "Validation dashboard successfully validated");
    
    test.log(LogStatus.INFO, "Scrolling functionlaity is working (as per  expectation");
    

    
    
    
   }	


@Test


public void Test4() throws InterruptedException {
	
    Login_Page S = new Login_Page(driver);

    S.emailuser("sbilife@artivatic.ai"); 

    test.log(LogStatus.INFO,"username entered successfully");

    S.Passuser("sbilife@123");

    test.log(LogStatus.INFO,"Password entered successfully");
       
    for(int i = 0; i<=5;i++)
    {
    	
    	
    	S.saveinhit();
       test.log(LogStatus.INFO,"Login Succeessfully");

    	
    }
    
   
    S.Backarro();
    
    test.log(LogStatus.INFO,"Back arrow functionlaity working as per our expectation");

    
   }




@Test


public void Test5() throws InterruptedException {
	
    Login_Page S = new Login_Page(driver);

    S.emailuser("sbilife@artivatic.ai"); 

    test.log(LogStatus.INFO,"username entered successfully");

    S.Passuser("sbilife@123");

    test.log(LogStatus.INFO,"Password entered successfully");
       
    for(int i = 0; i<=5;i++)
    	
    {
    	
    	
    	S.saveinhit();
       test.log(LogStatus.INFO,"Login Succeessfully");

    	
    }
    
    
    S.Validatonbtn();
    
    test.log(LogStatus.INFO,"Validation tab is successfully opening");
  
    
}



//@Test


public void Test6() throws InterruptedException {
	
    Login_Page S = new Login_Page(driver);

    S.emailuser("sbilife@artivatic.ai"); 

    test.log(LogStatus.INFO,"username entered successfully");

    S.Passuser("sbilife@123");

    test.log(LogStatus.INFO,"Password entered successfully");
       
    for(int i = 0; i<=5;i++)
    {
    	
    	
    	S.saveinhit();
       test.log(LogStatus.INFO,"Login Succeessfully");

    	
    }
    
    
    
    
  
}
}


    
    
    



    






