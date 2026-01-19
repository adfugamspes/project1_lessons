import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class SelectorsXpath {
    WebDriver driver = new ChromeDriver();

    @Test
    public void iLCarroXpathTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");
        WebElement btnLogin = driver.findElement(By.xpath("//a[@ng-reflect-router-link='login']"));
        btnLogin.click();
        // ByClassName "ng-dirty"
        // Xpath "a//[@ng-reflect-router-link='login']"
        WebElement fieldEmail = driver.findElement(By.xpath("//input[@id='email']"));
        fieldEmail.sendKeys("sima_simonova123@gmail.com");
        pause(3);
        WebElement fieldPassword = driver.findElement(By.xpath("//*[@formcontrolname='password']"));
        fieldPassword.sendKeys("Password!123");
        // "//form/div[last()]/input"
        pause(3);
        WebElement btnYalla = driver.findElement(By.xpath("//button[text()='Y’alla!']"));
        //button[start-with(text(), 'Y’a!')]
        btnYalla.click();
        WebElement btnOk = driver.findElement(By.xpath("//button[@class='positive-button ng-star-inserted']"));
        pause(3);
        btnOk.click();
        WebElement btnLogout = driver.findElement(By.xpath("//a[contains(text(), 'Logout')]"));
        pause(3);
        btnLogout.click();
        pause(3);
        driver.quit();
        // //input[@id='password']/../.. - вверх по дереву
    }


    @Test
    public void phoneBookTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");
//      WebElement btnAbout = driver.findElement(By.cssSelector("a[href='//about']"));
        WebElement btnAbout = driver.findElement(By.xpath("//a[@href='/about']"));
//        *a[@href='about']
//        *[text()='ABOUT']
        btnAbout.click();
        pause(3);

        WebElement btnLogin = driver.findElement(By.xpath("//*[text()='LOGIN']"));
        btnLogin.click();
        pause(3);

        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        int i = new Random().nextInt(1000);
        inputEmail.sendKeys("test23" + i + "@gmail.com");
        pause(3);

        WebElement inputName = driver.findElement(By.xpath("//*[@name='password']"));
        inputName.sendKeys("Password!123");
        pause(3);

        WebElement btnRegistration = driver.findElement(By.xpath("//*[@name='registration']"));
        btnRegistration.click();
        pause(3);

        WebElement btnSignOut = driver.findElement(By.xpath("//button[text()='Sign Out']"));
        btnSignOut.click();
        pause(3);

        List<WebElement> buttons = driver.findElements(By.xpath("//button"));
        System.out.println(buttons);
        System.out.println(buttons.get(0).getText());
        System.out.println(buttons.get(1).getText());
    }

        static void pause (int time){
            try {
                Thread.sleep(time * 1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
