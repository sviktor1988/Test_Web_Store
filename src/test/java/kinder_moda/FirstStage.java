package kinder_moda;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Assert;





@FixMethodOrder(MethodSorters.NAME_ASCENDING)  //Тестовые методы запускаються по порядку
public class FirstStage {

    private static ChromeDriver driver;

    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://kinder-moda.com.ua/sale/");
    }
    //Начало выполнения первого пункта задания
    @Test
    public void firstStage() {
        List<WebElement> allProducts = driver.findElements(By.className("over_wraper"));

        WebDriverWait wait = new WebDriverWait(driver, 1000);

        Random random = new Random();
        int randomProduct = random.nextInt(allProducts.size());
        allProducts.get(randomProduct).click();

        Assert.assertTrue(driver.findElement(By.className("current_price")).isDisplayed()); //проверка наличия цены в карточке товара

   /*     if (driver.findElement(By.className("current_price")) != null) {
            System.out.println("В карточке товара есть цена");
        } else {
            System.out.println("В карточке товара цены нету");
        }*/
        driver.findElement(By.cssSelector("ul.main_menu:nth-child(1) > li:nth-child(4) > a:nth-child(1)")).click();


        List<WebElement> allProducts2 = driver.findElements(By.className("over_wraper"));

        WebDriverWait wait2 = new WebDriverWait(driver, 1000);

        Random random2 = new Random();
        int randomProduct2 = random2.nextInt(allProducts2.size());
        allProducts2.get(randomProduct2).click();

        Assert.assertTrue(driver.findElement(By.className("current_price")).isDisplayed()); //проверка наличия цены в карточке товара

/*        if (driver.findElement(By.className("current_price")) != null) {
            System.out.println("В карточке товара есть цена");
        } else {
            System.out.println("В карточке товара цены нету");
        }*/
        driver.findElement(By.cssSelector("ul.main_menu:nth-child(1) > li:nth-child(4) > a:nth-child(1)")).click();


        List<WebElement> allProducts3 = driver.findElements(By.className("over_wraper"));

        WebDriverWait wait3 = new WebDriverWait(driver, 1000);

        Random random3 = new Random();
        int randomProduct3 = random3.nextInt(allProducts3.size());
        allProducts3.get(randomProduct3).click();

        Assert.assertTrue(driver.findElement(By.className("current_price")).isDisplayed()); //проверка наличия цены в карточке товара

    /*    if (driver.findElement(By.className("current_price")) != null) {
            System.out.println("В карточке товара есть цена");
        } else {
            System.out.println("В карточке товара цены нету");
        }*/
    }
        //Конец выполнения первого пункта задания


        //Начало выполнения второго пункта задания
    @Test
    public void firstStage2() {
        driver.findElement(By.className("logo_top")).click();

        driver.findElement(By.cssSelector("ul.main_menu:nth-child(1) > li:nth-child(2) > a:nth-child(1)")).click();

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[5]/div/div[2]/div[4]/div/form/div/div[3]/button")).click();

        driver.findElement(By.id("v-c700")).click();

        Assert.assertTrue(driver.findElement(By.className("cost")).isDisplayed()); //проверка наличия цены в у всех товаров в разделе Девочка - туфли

      /*  if (driver.findElements(By.className("cost")).size() !=0) {
            System.out.println("У всех товаров в разделе Девочка - туфли есть цена");
        }
        else {
            System.out.println("У всех товаров в разделе Девочка - туфли нету цены");
        }*/
    }
        //Конец выполнения второго пункта задания


        //Начало выполнения третьего пункта задания
    @Test
    public void firstStage3(){
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
    /*    public static WebDriver getDriver() {
        return driver;
        }*/
}
