package core;

import org.openqa.selenium.*;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;

public class Safari {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		Logger.getLogger("").setLevel(Level.OFF);

		if (!System.getProperty("os.name").contains("Mac")) {
			throw new IllegalArgumentException("Safari is available only on Mac");
		}
		System.out.println("Browser: Safari");
		driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.sleep(1000); // Pause in milliseconds (1000 – 1 sec)
		System.out.println("Title: " + driver.getTitle());
		driver.quit();
	}
}
