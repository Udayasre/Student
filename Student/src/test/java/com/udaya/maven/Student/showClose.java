package com.udaya.maven.Student;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class showClose {

static WebDriver driver;

public showClose(WebDriver driver){
    this.driver=driver;
}

public static void main(String[] args) {

    showClose sc = new showClose(driver);
    sc.IE("http://www.msn.com");
    driver.quit();

}

//Internet Explorer driver
public void IE(String URL){
    //Set the driver property for IE
	System.setProperty("webdriver.ie.driver","D:/IEDriverServer.exe");

    DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();  
    ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

    //Create object of Internet explorer driver
    driver = new InternetExplorerDriver(ieCapabilities);
    driver.get(URL);
}
}
