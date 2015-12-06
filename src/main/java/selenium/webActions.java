package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;


/**
 * Created by Mihai on 12/5/2015.
 */
public class WebActions {
    private By locators=null;
    private WebElement webElement=null;
    public WebActions (By locators){
        this.locators=locators;
        //
    }

    public void findElement (){
        //WebDriver webDriver = WebDriver.getInstance();
        webElement=WebDriver.getInstance().browser.findElement(locators);

    }
    public void setText(String text){
        findElement();
        webElement.sendKeys(text);

    }
    public void click(){
        findElement();
        webElement.click();

    }

}
