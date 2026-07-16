package testes;

import java.time.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	private static final Logger logger = LoggerFactory.getLogger(LoginTest.class);
	WebDriver driver;

	@BeforeClass
	void setup()

	{
		logger.info("Iniciando setup do WebDriver");

		ChromeOptions options = new ChromeOptions();
		if (System.getenv("CI") != null) {
			options.addArguments("--headless=new", "--disable-gpu", "--window-size=1920,1080");
		}

		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		logger.info("Navegador aberto: {}", driver.getCurrentUrl());
	}

	@Test
	void testLogin() {
		logger.info("Iniciando teste de login");

		LoginPageFactory lp = new LoginPageFactory(driver);
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		logger.info("Login executado, validando título da página");
		AssertJUnit.assertEquals("OrangeHRM", driver.getTitle());
		;
		logger.info("Teste de login concluído com sucesso");

	}

	@AfterClass
	void tearDOwn() {

		driver.quit();
	}
}
