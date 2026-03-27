package com.demo.seleniumgrid.launching_browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingFirefox {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		FirefoxOptions opt = new FirefoxOptions();
		WebDriver driver = new RemoteWebDriver(new URL(" http://localhost:4444"),opt);
		driver.get("https://www.selenium.dev/documentation/grid/");
		Thread.sleep(4000);
		driver.quit();
	}
}
