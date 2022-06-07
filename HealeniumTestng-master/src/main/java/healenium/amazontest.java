package healenium;

import org.testng.annotations.Test;
import pagefactory.allFunctions;

public class amazontest extends  BaseTest{

    @Test
    public void amazonSignin() throws InterruptedException
    {
    	allFunctions af = new allFunctions(driver);
        af.open("https://gettr.com/");
//        ap.signinbtn();
        af.login("getterswe33", "Indium@123");
        
    }
    
}
