import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleNavigateExample {
    public static void main(String[] args) {
        // WebDriver'ı kullanacağımız tarayıcıyı ayarlayalım
        System.setProperty("webdriver.chrome.driver", "path/to/your/chromedriver");

        // Tarayıcı seçeneklerini ayarlayalım (isteğe bağlı)
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless"); // Başsız (headless) mod için

        // WebDriver nesnesini oluşturalım
        WebDriver driver = new ChromeDriver(options);

        // Google ana sayfasına git
        driver.navigate().to("https://www.google.com");

        // Google'da "Selenium" araması yap
        driver.findElement(By.name("q")).sendKeys("Selenium");
        driver.findElement(By.name("q")).submit();

        // Sonuçlardan birine tıkla
        driver.findElement(By.cssSelector("#search .g:nth-child(1) a")).click();

        // Tarayıcıyı kapat
        driver.quit();
    }
}
