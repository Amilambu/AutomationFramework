package ANB;

import org.openqa.selenium.chrome.ChromeDriver;
public class OpenBrowser {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\amilambu\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        chrome.get("https://dev.citrii-software.co.za");
       /** chrome.findElement(By.id(“username”));
        WebElement username;**/

    }

}
