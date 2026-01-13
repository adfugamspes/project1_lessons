import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorsCss {
    WebDriver driver = new ChromeDriver();

//    @Test
//    public void phoneBookTest() {
//        driver.manage().window().maximize();
////        driver.manage().window().fullscreen();
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
////        driver.get("https://telranedu.web.app/home");
//        driver.navigate().to("https://telranedu.web.app/home");
//        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
//        btnAbout.click();
////        WebElement divRoot = driver.findElement(By.cssSelector("div[id='root']"));
////        WebElement divRoot = driver.findElement(By.id("root"));
////        WebElement divRoot = driver.findElement(By.cssSelector("#root"));
//        WebElement divRoot = driver.findElement(By.cssSelector("*[id='root']"));
//        System.out.println(divRoot.getAttribute("class"));
//
////        WebElement divRootClass = driver.findElement(By.cssSelector("div[class='container']"));
////        WebElement divRootClass = driver.findElement(By.cssSelector("*[class='container']"));
////        WebElement divRootClass = driver.findElement(By.cssSelector(".container"));
//        WebElement divRootClass = driver.findElement(By.className("container"));
//        System.out.println(divRootClass.getAttribute("id"));
//
//        pause(3);
//        driver.navigate().refresh();
//        driver.navigate().to("https://telranedu.web.app/login");
//        pause(3);
//        driver.navigate().back();
////        driver.close();
//        driver.quit();
//
//       }

    static void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void ilCarroTest1() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");
        pause(3);
        WebElement logoHeader = driver.findElement(By.cssSelector("img[alt='logo']"));
        logoHeader.click();
        pause(3);
//        a.navigation-link
//        a[class='navigation-link']
//        *[class='navigation-link']
//        [class='navigation-link']
        WebElement btnSearch = driver.findElement(By.className("navigation-link"));
        btnSearch.click();
        pause(3);
//        a[id='1']
//        a#1.navigation-link
//        #1
//        [id='1']
//        WebElement btnLet = driver.findElement(By.cssSelector("a[id='1']"));
//        WebElement btnLet = driver.findElement(By.id("1");
//        WebElement btnLet = driver.findElement(By.linkText("Let the car work"));
        WebElement btnLet = driver.findElement(By.partialLinkText("work"));
        btnLet.click();
        pause(3);

        // a[href='/terms-of-use']
        // a[href*='/terms'] - содержит
        // a[href^='/terms'] - начинается
        // a[href$='-use'] - заканчивается
        //a.navigation-link[href='/terms-of-use']
//        WebElement btnTerms = driver.findElement(By.cssSelector("a[href='/terms-of-use']"));
        WebElement btnTerms = driver.findElement(By.cssSelector("a[href*='/terms']"));
        btnTerms.click();
        pause(3);

        WebElement btnSignUp = driver.findElement(By.cssSelector("div.header a.navigation-link:nth-child(5)"));
        btnSignUp.click();
        pause(3);

//        WebElement btnLogIn = driver.findElement(By.cssSelector("div.header a.navigation-link:nth-child(6)"));
        WebElement btnLogIn = driver.findElement(By.cssSelector("div.header a.navigation-link:last-child"));
        btnLogIn.click();
        pause(3);

        driver.navigate().to("https://ilcarro.web.app/search");
        pause(3);
        driver.quit();
    }

//    @Test
//    public void ilCarroTest () {
//        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.navigate().to("https://ilcarro.web.app/search");
//        pause(3);
//        WebElement btnSearch = driver.findElement(By.cssSelector("a[href='/search']"));
//        btnSearch.click();
//        pause(3);
//        WebElement btnLet = driver.findElement(By.cssSelector("a[href='/let-car-work']"));
//        btnLet.click();
//        pause(3);
//        WebElement btnTerms = driver.findElement(By.cssSelector("a[href='/terms-of-use']"));
//        btnTerms.click();
//        pause(3);
//        WebElement btnSignUp = driver.findElement(By.xpath("/html/body/app-root/app-navigator/div[1]/a[5]"));
//        btnSignUp.click();
//        pause(3);
//        WebElement btnLogIn = driver.findElement(By.xpath("/html/body/app-root/app-navigator/div[1]/a[6]"));
//        btnLogIn.click();
//        pause(3);
//        WebElement btnLogo = driver.findElement(By.cssSelector("a[class='logo']"));
//        btnLogo.click();
//        pause(3);
//        driver.navigate().refresh();
//        pause(3);
//        driver.quit();
//    }
}
