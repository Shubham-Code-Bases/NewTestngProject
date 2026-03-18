package base_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class searchClass {

	
    WebDriver driver;

    // Constructor
    
    public searchClass
    (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
