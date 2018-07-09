package com.work.DaZongYeWu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWarehouse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://172.24.115.120:8001/#");
		
		driver.findElement(By.xpath("//*[@id='userId']")).sendKeys("caojuepeng");
		driver.findElement(By.xpath("//*[@id='passwd']")).clear();
		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("111111");
		driver.findElement(By.cssSelector("input#verificationCode")).click();
		Thread.sleep(3000);   //等手工输入验证码
		driver.findElement(By.cssSelector("button#btnSubmit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("仓库")).click();
		driver.findElement(By.linkText("仓库开户")).click();
		
		Thread.sleep(2000);
		driver.switchTo().frame("serviceiframe").switchTo().frame("viewiframe");
		
		//需要从数据库里查到再填的内容
		driver.findElement(By.id("formEdit_editor_WARRCLIENTID")).sendKeys("104");    //仓库id
		
		String note = "看绑定";       //备注
		driver.findElement(By.id("formEdit_editor_WAREHOUSENAME")).sendKeys(note+"名称");               //单位名称
		driver.findElement(By.id("formEdit_editor_WAREHOUSEABBR")).sendKeys(note+"简称");               //单位简称
		driver.findElement(By.id("formEdit_editor_ORGANIZEID")).sendKeys("25622225-7");                 //社会信用代码
		driver.findElement(By.id("formEdit_editor_WAREADDRESS")).sendKeys(note+"存放地址");
		driver.findElement(By.id("formEdit_editor_ARTIFICIALPERSON")).sendKeys(note+"可交易品种");
		driver.findElement(By.id("formEdit_editor_OPENUSERNUM")).sendKeys("3");
		driver.findElement(By.id("formEdit_editor_CONTACT")).sendKeys(note+"联系人");
		driver.findElement(By.id("formEdit_editor_WORKTEL")).sendKeys("19836273737");
		driver.findElement(By.id("formEdit_editor_TEL")).sendKeys("17676762622");
		driver.findElement(By.id("formEdit_editor_FAX")).sendKeys("4465");
		driver.findElement(By.id("formEdit_editor_ZIPCODE")).sendKeys("124465");
		driver.findElement(By.id("formEdit_editor_ZIPADDRESS")).sendKeys(note+"邮寄地址");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn btn-primary command-pin']")).click();
		
		System.out.println("仓库开户结束");
		driver.quit();

	}

}
