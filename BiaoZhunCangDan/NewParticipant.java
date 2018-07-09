package com.work.DaZongYeWu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewParticipant {

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
		Thread.sleep(3000);

		driver.findElement(By.linkText("交易商")).click();
		driver.findElement(By.linkText("交易商开户")).click();
		
		Thread.sleep(2000);
		driver.switchTo().frame("serviceiframe").switchTo().frame("viewiframe");
		
	    //*******************************************交易商基本信息**************************************************//
		//与仓单系统对接的数据
		driver.findElement(By.name("PARTICIPANTNAME")).sendKeys("上海大昌铜业有限公司");    //交易商名称
	    String note = "新回执";    //备注
	    driver.findElement(By.id("formEdit_editor_TAXNUMBER")).sendKeys("310114607341645");   //税务登记号
	    driver.findElement(By.id("formEdit_editor_ORGANIZEID")).sendKeys("310000400019989");       //组织机构代码
	    driver.findElement(By.id("formEdit_editor_WARRCLIENTID")).sendKeys("00222673");       //客户号（标准仓单账号）
	    
	    //必填项
	    driver.findElement(By.name("PARTICIPANTABBR")).sendKeys(note+"简");                                    //交易商简称
	    driver.findElement(By.id("formEdit_editor_REGCAPITAL")).sendKeys("234.567");                              //注册资金
	    driver.findElement(By.id("formEdit_editor_BUSILICENSENO")).sendKeys("111000");                        //营业执照号
	    driver.findElement(By.id("formEdit_editor_UNISOCIALCREDITID")).sendKeys("111133111879122222");        //统一社会信用代码
	    driver.findElement(By.id("formEdit_editor_ARTIFICIALPERSON")).sendKeys(note+"法人");                  //法人
	    driver.findElement(By.id("formEdit_editor_ARTIPERIDCARDNO")).sendKeys("63222119900101853x");          //法人身份证号
	    //driver.findElement(By.cssSelector("input[type='checkbox'][value='ZN']")).click();                    //拟交易品种
	    //driver.findElement(By.cssSelector("input[type='checkbox'][value='SN']")).click();
	    //driver.findElement(By.cssSelector("input[type='checkbox'][value='PB']")).click();
	    //driver.findElement(By.cssSelector("input[type='checkbox'][value='NI']")).click();
	    //driver.findElement(By.cssSelector("input[type='checkbox'][value='CU']")).click();
	    driver.findElement(By.cssSelector("input[type='checkbox'][value='AL']")).click();
	    //driver.findElement(By.cssSelector("input[type='checkbox'][value='AG']")).click();
	    driver.findElement(By.id("formEdit_editor_OPENUSERNUM")).sendKeys("5");                              //开通用户数量：这里填的+默认1个管理员=总的操作员数
	    
	    //选填项
	    //driver.findElement(By.cssSelector("button[data-id='formEdit_editor_CMPKIND']")).click();              //单位性质
	    //driver.findElement(By.linkText("国有")).click();
	    //driver.findElement(By.cssSelector("button[data-id='formEdit_editor_RUNFLDFST']")).click();            //经营范围一级
	    //driver.findElement(By.linkText("加工制造(农产品,金属,能源,化工)")).click();
	    driver.findElement(By.cssSelector("button[data-id='formEdit_editor_RUNFLDSND']")).click();            //经营范围二级
	    driver.findElement(By.linkText("农产品")).click();
	    driver.findElement(By.id("formEdit_editor_ZIPCODE")).sendKeys("764770");                              //邮政编码
	    driver.findElement(By.id("formEdit_editor_LINKMAN")).sendKeys(note+"联系人");                          //联系人
	    driver.findElement(By.id("formEdit_editor_LINKMOBILE")).sendKeys("1332");                      //联系人号码
	    driver.findElement(By.id("formEdit_editor_EMAIL")).sendKeys("124,233@gfgfga.com");                           //电子邮箱
	    driver.findElement(By.id("formEdit_editor_OPENMAN")).sendKeys(note+"开户经办");                        //开户经办人
	    driver.findElement(By.id("formEdit_editor_OPENMOBILE")).sendKeys("17622220000");                      //开户经办人号码
	    driver.findElement(By.id("formEdit_editor_OPENMANIDCARDNO")).sendKeys("63222119900101765x");          //开户经办人身份证号
	    
	    //*******************************************增值税发票信息**************************************************//
	    //必填项
	    driver.findElement(By.id("formInvoice_editor_TAXNAME")).sendKeys(note+"纳税人");                      //纳税人名称
	    driver.findElement(By.id("formInvoice_editor_COMPANYNAME")).sendKeys(note+"纳税单位");                //单位名称
	    driver.findElement(By.id("formInvoice_editor_ADDRESS")).sendKeys(note+"单位地址");                    //单位地址
	    driver.findElement(By.id("formInvoice_editor_TAXNUMBER")).sendKeys("146146");                        //税务登记号
	    driver.findElement(By.id("formInvoice_editor_INVOICEBANKNAME")).sendKeys(note+"开户行名");            //开户银行名称
	    driver.findElement(By.id("formInvoice_editor_INVOICEBANKACCOUNT")).sendKeys("948509362");            //开户银行账号
	    driver.findElement(By.id("formInvoice_editor_AGENTMAN")).sendKeys(note+"经办");                       //经办人
	    driver.findElement(By.id("formInvoice_editor_AGENTTEL")).sendKeys("11245690902");                     //经办人联系方式
	    
	    //选填项
	    driver.findElement(By.cssSelector("button[data-id='formInvoice_editor_INVOICEGETTYPE']")).click();    //专票领取方式
	    driver.findElement(By.linkText("邮递")).click();
	    driver.findElement(By.id("formInvoice_editor_INVOICEADDRESS")).sendKeys(note+"专票邮寄地址");           //专票邮寄地址
	    driver.findElement(By.id("formInvoice_editor_ZIPCODE")).sendKeys("562201");                            //邮寄地址邮编
	    driver.findElement(By.id("formInvoice_editor_INVOICEGETMANONE")).sendKeys(note+"领用1");                //专票领用人1
	    driver.findElement(By.id("formInvoice_editor_INVOICEGETTELONE")).sendKeys("10032323232");               //领用人1电话号码
	    driver.findElement(By.id("formInvoice_editor_INVOICEGETNOONE")).sendKeys("320106197001014376");        //领用人1身份证
	    driver.findElement(By.id("formInvoice_editor_INVOICEGETMANTWO")).sendKeys(note+"领用2");                //专票领用人2
	    driver.findElement(By.id("formInvoice_editor_INVOICEGETTELTWO")).sendKeys("3232");               //领用人2电话号码
	    driver.findElement(By.id("formInvoice_editor_INVOICEGETNOTWO")).sendKeys("220601198901012655");        //领用人2身份证
	    driver.findElement(By.id("formInvoice_editor_INVOICEGETMANTHREE")).sendKeys(note+"领用3");                //专票领用人3
	    driver.findElement(By.id("formInvoice_editor_INVOICEGETTELTHREE")).sendKeys("12252443232");               //领用人3电话号码
	    driver.findElement(By.id("formInvoice_editor_INVOICEGETNOTHREE")).sendKeys("44040119970101655x");        //领用人3身份证
	    
	    //提交
	    driver.findElement(By.cssSelector("button[class='btn btn-primary command-pin']")).click();
	    System.out.println("交易商开户结束");
	    
	    Thread.sleep(2000);
	    driver.quit();

	}

}
