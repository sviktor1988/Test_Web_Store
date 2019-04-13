package kinder_moda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FirstStage {

    private static ChromeDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }
    //Начало выполнения первого пункта задания
    @Test
    public void firstStage() {
        driver.get("https://kinder-moda.com.ua/sale/");

        List<WebElement> allProducts = driver.findElements(By.className("over_wraper"));

        WebDriverWait wait = new WebDriverWait(driver, 1000);

        Random random = new Random();
        int randomProduct = random.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();

        if (driver.findElement(By.className("current_price")) != null) {
            System.out.println("В карточке товара есть цена");
        } else {
            System.out.println("В карточке товара цены нету");
        }
        driver.findElement(By.cssSelector("ul.main_menu:nth-child(1) > li:nth-child(4) > a:nth-child(1)")).click();


        List<WebElement> allProducts2 = driver.findElements(By.className("over_wraper"));

        WebDriverWait wait2 = new WebDriverWait(driver, 1000);

        Random random2 = new Random();
        int randomProduct2 = random.nextInt(allProducts2.size());
        allProducts2.get(randomProduct2).click();

        if (driver.findElement(By.className("current_price")) != null) {
            System.out.println("В карточке товара есть цена");
        } else {
            System.out.println("В карточке товара цены нету");
        }
        driver.findElement(By.cssSelector("ul.main_menu:nth-child(1) > li:nth-child(4) > a:nth-child(1)")).click();


        List<WebElement> allProducts3 = driver.findElements(By.className("over_wraper"));

        WebDriverWait wait3 = new WebDriverWait(driver, 1000);

        Random random3 = new Random();
        int randomProduct3 = random.nextInt(allProducts3.size());
        allProducts3.get(randomProduct3).click();

        if (driver.findElement(By.className("current_price")) != null) {
            System.out.println("В карточке товара есть цена");
        } else {
            System.out.println("В карточке товара цены нету");
        }
        //Конец выполнения первого пункта задания


        //Начало выполнения второго пункта задания
        driver.findElement(By.className("logo_top")).click();

        driver.findElement(By.cssSelector("ul.main_menu:nth-child(1) > li:nth-child(2) > a:nth-child(1)")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[5]/div/div[2]/div[4]/div/form/div/div[3]/button")).click();

        driver.findElement(By.id("v-c700")).click();

        if (driver.findElements(By.className("cost")).size() != 0) {
            System.out.println("У всех товаров в разделе Девочка - туфли есть цена");
        } else {
            System.out.println("У всех товаров в разделе Девочка - туфли нету цены");
        }
        //Конец выполнения второго пункта задания


        //Начало выполнения третьего пункта задания
        driver.findElement(By.cssSelector("ul.main_menu:nth-child(1) > li:nth-child(3) > a:nth-child(1)")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[5]/div/div[2]/div[4]/div/form/div/div[3]/button")).click();

        driver.findElement(By.id("v-c830")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[5]/div/div[2]/div[3]/div/div/button")).click();

        driver.findElement(By.cssSelector("#dropdown-ul > li:nth-child(3) > a:nth-child(1)")).click();

        ArrayList<WebElement> list = new ArrayList<WebElement>(driver.findElements(By.xpath("//*[contains(text(), 'Артикул')]")));
            List<String> all_elements_text = new ArrayList<String>();
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getText());
        }
    }

        //Конец выполнения третьего пункта задания

    @After
        public void closeDriver() {
            driver.quit();
        }
        public static WebDriver getDriver() {
            return driver;
        }
}
