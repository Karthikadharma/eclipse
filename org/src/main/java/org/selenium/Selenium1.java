package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium1 {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver  driver = new EdgeDriver();
		
	}

}
