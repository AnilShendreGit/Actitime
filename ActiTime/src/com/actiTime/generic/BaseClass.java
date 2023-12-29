package com.actiTime.generic;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actiTime.pom.HomePage;
import com.actiTime.pom.LoginPage;

public class BaseClass {

	public static WebDriver dr ;
	@BeforeClass
	public void toOpenBrowser() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i >= 0; i++) {
			System.out.println("enter your number to open the browser : \nChrome : 1 \nFireFox : 2 \nEdge : 3 ");
			int num = sc.nextInt();
			if(num==1) {
				dr = new ChromeDriver();
				break ;
			}
			else if(num==2) {
				dr = new FirefoxDriver();
				break ;
			}
			else if(num==3) {
				dr = new EdgeDriver();
				break ; 
			}
			else {
				System.out.println("please enter the correct number as per mention beloew ");
			}
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void toLogin() throws Exception {
		File f = new File();
		dr.get(f.getPropertyDate("url"));
		LoginPage lp = new LoginPage(dr);
		lp.toLogin(f.getPropertyDate("un"), f.getPropertyDate("pw"));

	}
	@AfterMethod
	public void toLogout() {
		HomePage hp = new HomePage(dr);
		hp.toLogout();
	}
	@AfterClass
	public void toCloseBrowser() {
		dr.close();
	}
}
