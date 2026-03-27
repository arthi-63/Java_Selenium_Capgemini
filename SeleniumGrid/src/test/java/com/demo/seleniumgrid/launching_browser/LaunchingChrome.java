package com.demo.seleniumgrid.launching_browser;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class LaunchingChrome {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver = new RemoteWebDriver(new URL(" http://localhost:4444"),opt);
		driver.get("https://www.selenium.dev/documentation/grid/");
		Thread.sleep(4000);
		driver.quit();
	}

}
