package Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bsh.ParseException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.format.CellFormat;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;


public class Testcase_1_ProductLevelChanges {
	
	// Create webdriver interface reference as fields of test class
	
	public WebDriver driver;
	
	@BeforeClass
	public void testSetup()  {
		//System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		driver = new FirefoxDriver(); 
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	    //driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	@Test
  public void Testcase() throws Exception
	{
		
		login();
		Test_Scenario_1();
		logout();
		Thread.sleep(1000);
		
		login();
		Test_Scenario_2();
		logout();
		Thread.sleep(1000);
		
		login();
		Test_Scenario_3();
		logout();
		Thread.sleep(1000);
		
		login();
		Test_Scenario_4();
		logout();
		Thread.sleep(1000);
				
		login();
		Test_Scenario_5();
		logout();
		Thread.sleep(1000);
	}
	
	public void Test_Scenario_1() throws Exception
	{    
		  System.out.println("Test_Scenario_1 Running.......");
		
		  
		  driver.findElement(By.name("searchProperty")).click();
			Select s = new Select(driver.findElement(By.name("searchProperty")));
			Thread.sleep(3000);
			s.selectByVisibleText("Pete the Cat");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
		    // Click on Search
			driver.findElement(By.xpath("//*[@id='criteriaForm']/table[2]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[23]/td[2]/img[1]")).click();
			Thread.sleep(1000);
			
			// Click on 2nd page pagination
			//driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[3]/tbody/tr/td[2]/a[1]")).click();
			//Thread.sleep(1000);
			
			// Click on the , "PETE THE CAT AND HIS MAGICAL SUNGLASSES, type HJK " title link
			driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[2]/tbody/tr[20]/td[3]/a")).click();		
			Thread.sleep(1000);
	
			 driver.get("http://scnj400b:70/EPIC/level.do?parameter=editLevel");
			
	
		    
			driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[5]/td[2]/input")).clear();							
			driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[5]/td[2]/input")).sendKeys("770L");		
			Thread.sleep(2000);   
			
			
			
  		    driver.findElement(By.name("levelSRLG_SRG")).click();
				Select s1 = new Select(driver.findElement(By.name("levelSRLG_SRG")));
				s1.selectByVisibleText("PreK");
				Robot r1 = new Robot();
				r1.keyPress(KeyEvent.VK_ENTER);
				r1.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);

				 
				driver.findElement(By.name("levelSRLGAppealsToMin_SRA")).click();
				Select s2 = new Select(driver.findElement(By.name("levelSRLGAppealsToMin_SRA")));
				s2.selectByVisibleText("Kindergarten");
				Robot r2 = new Robot();
				r2.keyPress(KeyEvent.VK_ENTER);
				r2.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.name("levelSRLGAppealsToMax_SRA")).click();
				Select s3 = new Select(driver.findElement(By.name("levelSRLGAppealsToMax_SRA")));
				s3.selectByVisibleText("Grade 6");
				Robot r3 = new Robot();
				r3.keyPress(KeyEvent.VK_ENTER);
				r3.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				
				
				driver.findElement(By.name("guidedReadingLevel")).click();
				Select s4 = new Select(driver.findElement(By.name("guidedReadingLevel")));
				s4.selectByVisibleText("P");
				Robot r4 = new Robot();
				r4.keyPress(KeyEvent.VK_ENTER);
				r4.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.name("guidedReadingSpanishLevel")).click();
				Select s5 = new Select(driver.findElement(By.name("guidedReadingSpanishLevel")));
				s5.selectByVisibleText("Z+");
				Robot r5 = new Robot();
				r5.keyPress(KeyEvent.VK_ENTER);
				r5.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[12]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[12]/td[2]/input")).sendKeys("17.7");		
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[14]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[14]/td[2]/input")).sendKeys(".5");		
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[16]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[16]/td[2]/input")).sendKeys("123");		
				Thread.sleep(1000); 
				
				driver.findElement(By.xpath("//html/body/form/table[5]/tbody/tr/td[1]/img[1]")).click();		
			
				driver.get("scnj400b:70/EPIC/bookProduct.do");
				driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[2]/tbody/tr[20]/td[3]/a")).click();		
				Thread.sleep(1000);
				
				 WebElement element2 = driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr/td[3]/table[8]/tbody/tr[2]/td/table/tbody/tr[4]/td[2]"));
				 String elementval = element2.getText();
				 
				    
					
					driver.get("http://pardinay:pardip@sch031.coresys.com/restapi/products/EPIC_STG_"+elementval);
				    Thread.sleep(5000);
					//driver.get("http://sch031.coresys.com/restapi/products/EPIC_CONTRIB_7771732");
					//Thread.sleep(10000);
				 
                    String page = driver.getTitle();
					
					if(page.equals("Error 404 Not Found"))
					{
						System.out.println("Error 404 Not Found");
						//driver.quit();
					}
						
					else 
						{System.out.println(page + "Page Found");}
					
					
		    		  
		    		  WebElement element = driver.findElement(By.xpath("//Product"));
		    		  String strng = element.getText();
		
		    		  System.out.println("Actual string - " + strng);
		    		  System.out.println("");
		    		  System.out.println("Expected string - 02016-04-15PreK2016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-18Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7HJKKindergarten-6");
		    	
		    		  //FileOutputStream fileOut = new FileOutputStream("E://Testcase_1_ProductLevelChanges_TestScenario1.xls");
		  			//HSSFWorkbook workbook = new HSSFWorkbook();
		  			//HSSFSheet worksheet = workbook.createSheet("Test_Scenario_1");
		    		  
		  			int flag = 0;
		  			 String strng1 = "02016-04-15PreK2016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-18Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7HJKKindergarten-6";
		  			if(strng1.equals(strng)){flag=1;}
		  			  
		  			   if(flag==1)
		  			  {
		  				 writeexcel("Passed",Colour.GREEN);
		  				   /*
		  				   HSSFRow row1 = worksheet.createRow((short) 0); 
		    			  
		    			  
		    			  HSSFCell cellA1 = row1.createCell((short) 0);
		    				cellA1.setCellValue("Passed");
		    				HSSFCellStyle cellStyle = workbook.createCellStyle();
		    				cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		    				cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		    				cellA1.setCellStyle(cellStyle);
		    				
		    		
		    				workbook.write(fileOut);
		    				fileOut.flush();
		    				fileOut.close();
		    				*/

		    		  }
		    		  if(flag==0)
		    		  {    
		    			  
		    			  writeexcel("Failed",Colour.RED);
		    			  
		    			  /*
		    			  HSSFRow row1 = worksheet.createRow((short) 0); 
		    			  
		    			  
		    			  HSSFCell cellA1 = row1.createCell((short) 0);
		    				cellA1.setCellValue("Failed");
		    				HSSFCellStyle cellStyle = workbook.createCellStyle();
		    				cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		    				cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		    				cellA1.setCellStyle(cellStyle);
		    				
		    				
		    				workbook.write(fileOut);
		    				fileOut.flush();
		    				fileOut.close();
		    				
		    				*/
		    		  }
		    		 
		    			  
						 //Thread.sleep(5000);
		    		  
	}
	
	
	public void Test_Scenario_2()throws Exception
	{
          System.out.println("Test_Scenario_2 Running.......");
		
		  
		  driver.findElement(By.name("searchProperty")).click();
			Select s = new Select(driver.findElement(By.name("searchProperty")));
			Thread.sleep(3000);
			s.selectByVisibleText("Pete the Cat");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
		    // Click on Search
			driver.findElement(By.xpath("//*[@id='criteriaForm']/table[2]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[23]/td[2]/img[1]")).click();
			Thread.sleep(1000);
			
			// Click on 2nd page pagination
			//driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[3]/tbody/tr/td[2]/a[1]")).click();
			//Thread.sleep(1000);
			
			// Click on the , "PETE THE CAT AND HIS MAGICAL SUNGLASSES, type HJK " title link
			driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[2]/tbody/tr[20]/td[3]/a")).click();		
			Thread.sleep(1000);
	
			 driver.get("http://scnj400b:70/EPIC/level.do?parameter=editLevel");
			
	
		    
			driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[5]/td[2]/input")).clear();							
			driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[5]/td[2]/input")).sendKeys("10L");		
			Thread.sleep(2000);   
			
			
			
  		    driver.findElement(By.name("levelSRLG_SRG")).click();
				Select s1 = new Select(driver.findElement(By.name("levelSRLG_SRG")));
				s1.selectByVisibleText("PreK");
				Robot r1 = new Robot();
				r1.keyPress(KeyEvent.VK_ENTER);
				r1.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);

				 
				driver.findElement(By.name("levelSRLGAppealsToMin_SRA")).click();
				Select s2 = new Select(driver.findElement(By.name("levelSRLGAppealsToMin_SRA")));
				s2.selectByVisibleText("Kindergarten");
				Robot r2 = new Robot();
				r2.keyPress(KeyEvent.VK_ENTER);
				r2.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.name("levelSRLGAppealsToMax_SRA")).click();
				Select s3 = new Select(driver.findElement(By.name("levelSRLGAppealsToMax_SRA")));
				s3.selectByVisibleText("Grade 6");
				Robot r3 = new Robot();
				r3.keyPress(KeyEvent.VK_ENTER);
				r3.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				
				
				driver.findElement(By.name("guidedReadingLevel")).click();
				Select s4 = new Select(driver.findElement(By.name("guidedReadingLevel")));
				s4.selectByVisibleText("P");
				Robot r4 = new Robot();
				r4.keyPress(KeyEvent.VK_ENTER);
				r4.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.name("guidedReadingSpanishLevel")).click();
				Select s5 = new Select(driver.findElement(By.name("guidedReadingSpanishLevel")));
				s5.selectByVisibleText("Z+");
				Robot r5 = new Robot();
				r5.keyPress(KeyEvent.VK_ENTER);
				r5.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[12]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[12]/td[2]/input")).sendKeys("17.7");		
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[14]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[14]/td[2]/input")).sendKeys(".5");		
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[16]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[16]/td[2]/input")).sendKeys("123");		
				Thread.sleep(1000); 
				
				driver.findElement(By.xpath("//html/body/form/table[5]/tbody/tr/td[1]/img[1]")).click();		
				 
				/*driver.navigate().back();
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(5000);
				
				driver.navigate().refresh();
				
				Robot r40 = new Robot();
				//r40.keyPress(KeyEvent.VK_ENTER); 
				
				
				Thread.sleep(10000);
				*/
				
				driver.get("scnj400b:70/EPIC/bookProduct.do");
				driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[2]/tbody/tr[20]/td[3]/a")).click();		
				Thread.sleep(1000);
				
				 WebElement element2 = driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr/td[3]/table[8]/tbody/tr[2]/td/table/tbody/tr[4]/td[2]"));
				 String elementval = element2.getText();
				 
				    
					
				 driver.get("http://pardinay:pardip@sch031.coresys.com/restapi/products/EPIC_STG_"+elementval);
				    Thread.sleep(5000);
					//driver.get("http://sch031.coresys.com/restapi/products/EPIC_CONTRIB_7771732");
					//Thread.sleep(10000);
				 
                 String page = driver.getTitle();
					
					if(page.equals("Error 404 Not Found"))
					{
						System.out.println("Error 404 Not Found");
						//driver.quit();
					}
						
					else 
						{System.out.println(page + "Page Found");}
					
					
		    		  
		    		  WebElement element = driver.findElement(By.xpath("//Product"));
		    		  String strng = element.getText();
		
		    		  System.out.println("Actual string - " + strng);
		    		  System.out.println("");
		    		  System.out.println("Expected string - 02016-04-15PreK2016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-18Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7HJKKindergarten-6");
		    	
		    		  //FileOutputStream fileOut = new FileOutputStream("E://Testcase_1_ProductLevelChangesTest_Scenario2.xls");
		  			//HSSFWorkbook workbook = new HSSFWorkbook();
		  			//HSSFSheet worksheet = workbook.createSheet("Test_Scenario_2");
		    		  
		  			int flag = 0;
		  			 String strng1 = "02016-04-15PreK2016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-18Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7HJKKindergarten-6";
		  			if(strng1.equals(strng)){flag=1;}
		  			  
		  			   if(flag==1)
		  			  {    
		  				 writeexcel("Passed",Colour.GREEN);
		  				   /*
		    			  HSSFRow row1 = worksheet.createRow((short) 0); 
		    			  
		    			  
		    			  HSSFCell cellA1 = row1.createCell((short) 0);
		    				cellA1.setCellValue("Passed");
		    				HSSFCellStyle cellStyle = workbook.createCellStyle();
		    				cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		    				cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		    				cellA1.setCellStyle(cellStyle);
		    				
		    		
		    				workbook.write(fileOut);
		    				fileOut.flush();
		    				fileOut.close();
		    				*/

		    		  }
		    		  if(flag==0)
		    		  {   
		    			  writeexcel("Failed",Colour.RED);
		    			  /*
		    			  HSSFRow row1 = worksheet.createRow((short) 0); 
		    			  
		    			  
		    			  HSSFCell cellA1 = row1.createCell((short) 0);
		    				cellA1.setCellValue("Failed");
		    				HSSFCellStyle cellStyle = workbook.createCellStyle();
		    				cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		    				cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		    				cellA1.setCellStyle(cellStyle);
		    				
		    				
		    				workbook.write(fileOut);
		    				fileOut.flush();
		    				fileOut.close();
		    				*/
		    		  }
		    		 
		    			  
						 //Thread.sleep(5000);
		    		  
	}
	
	
	
	public void Test_Scenario_3()throws Exception
	{
		
			System.out.println("Test_Scenario_3 Running.......");
		
		  driver.findElement(By.name("searchProperty")).click();
			Select s = new Select(driver.findElement(By.name("searchProperty")));
			Thread.sleep(3000);
			s.selectByVisibleText("Pete the Cat");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
		    // Click on Search
			driver.findElement(By.xpath("//*[@id='criteriaForm']/table[2]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[23]/td[2]/img[1]")).click();
			Thread.sleep(1000);
			
			// Click on 2nd page pagination
			//driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[3]/tbody/tr/td[2]/a[1]")).click();
			//Thread.sleep(1000);
			
			// Click on the , "PETE THE CAT AND HIS MAGICAL SUNGLASSES, type HJK " title link
			driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[2]/tbody/tr[20]/td[3]/a")).click();		
			Thread.sleep(1000);
	
			 driver.get("http://scnj400b:70/EPIC/level.do?parameter=editLevel");
			
	
		    
			driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[5]/td[2]/input")).clear();							
			driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[5]/td[2]/input")).sendKeys("770L");		
			//Thread.sleep(2000);   
			
			
			
  		    driver.findElement(By.name("levelSRLG_SRG")).click();
				Select s1 = new Select(driver.findElement(By.name("levelSRLG_SRG")));
				s1.selectByVisibleText("PreK");
				Robot r1 = new Robot();
				r1.keyPress(KeyEvent.VK_ENTER);
				r1.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);

				 
				driver.findElement(By.name("levelSRLGAppealsToMin_SRA")).click();
				Select s2 = new Select(driver.findElement(By.name("levelSRLGAppealsToMin_SRA")));
				s2.selectByVisibleText("Kindergarten");
				Robot r2 = new Robot();
				r2.keyPress(KeyEvent.VK_ENTER);
				r2.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.name("levelSRLGAppealsToMax_SRA")).click();
				Select s3 = new Select(driver.findElement(By.name("levelSRLGAppealsToMax_SRA")));
				s3.selectByVisibleText("Grade 6");
				Robot r3 = new Robot();
				r3.keyPress(KeyEvent.VK_ENTER);
				r3.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				
				
				driver.findElement(By.name("guidedReadingLevel")).click();
				Select s4 = new Select(driver.findElement(By.name("guidedReadingLevel")));
				s4.selectByVisibleText("WORD BOOK");
				Robot r4 = new Robot();
				r4.keyPress(KeyEvent.VK_ENTER);
				r4.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.name("guidedReadingSpanishLevel")).click();
				Select s5 = new Select(driver.findElement(By.name("guidedReadingSpanishLevel")));
				s5.selectByVisibleText("Z+");
				Robot r5 = new Robot();
				r5.keyPress(KeyEvent.VK_ENTER);
				r5.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[12]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[12]/td[2]/input")).sendKeys("17.7");		
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[14]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[14]/td[2]/input")).sendKeys(".5");		
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[16]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[16]/td[2]/input")).sendKeys("123");		
				Thread.sleep(1000); 
				
				driver.findElement(By.xpath("//html/body/form/table[5]/tbody/tr/td[1]/img[1]")).click();		
				 
				/*driver.navigate().back();
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(5000);
				
				driver.navigate().refresh();
				
				Robot r40 = new Robot();
				//r40.keyPress(KeyEvent.VK_ENTER); 
				
				
				Thread.sleep(10000);
				*/
				
				driver.get("scnj400b:70/EPIC/bookProduct.do");
				driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[2]/tbody/tr[20]/td[3]/a")).click();		
				Thread.sleep(1000);
				
				 WebElement element2 = driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr/td[3]/table[8]/tbody/tr[2]/td/table/tbody/tr[4]/td[2]"));
				 String elementval = element2.getText();
				 
				    
					
				 driver.get("http://pardinay:pardip@sch031.coresys.com/restapi/products/EPIC_STG_"+elementval);
				    Thread.sleep(5000);
					//driver.get("http://sch031.coresys.com/restapi/products/EPIC_CONTRIB_7771732");
					//Thread.sleep(10000);
				 
                 String page = driver.getTitle();
					
					if(page.equals("Error 404 Not Found"))
					{
						System.out.println("Error 404 Not Found");
						//driver.quit();
					}
						
					else 
						{System.out.println(page + "Page Found");}
					
					
		    		  
		    		  WebElement element = driver.findElement(By.xpath("//Product"));
		    		  String strng = element.getText();
		
		    		  System.out.println("Actual string - " + strng);
		    		  System.out.println("");
		    		  System.out.println("Expected string - 0PreK2016-04-152016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-18Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7HJKKindergarten-6");
		    	
		    		 // FileOutputStream fileOut = new FileOutputStream("E://Testcase_1_ProductLevelChanges_TestScenario3.xls");
		  			//HSSFWorkbook workbook = new HSSFWorkbook();
		  			//HSSFSheet worksheet = workbook.createSheet("Test_Scenario_3");
		    		  
		  			int flag = 0;
		  			 String strng1 = "02016-04-15PreK2016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-18Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7HJKKindergarten-6";
		  			if(strng1.equals(strng)){flag=1;}
		  			  
		  			   if(flag==1)
		  			  {   
		  				 writeexcel("Passed",Colour.GREEN);
		  				   /*
		    			  HSSFRow row1 = worksheet.createRow((short) 0); 
		    			  
		    			  
		    			  HSSFCell cellA1 = row1.createCell((short) 0);
		    				cellA1.setCellValue("Passed");
		    				HSSFCellStyle cellStyle = workbook.createCellStyle();
		    				cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		    				cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		    				cellA1.setCellStyle(cellStyle);
		    				
		    		
		    				workbook.write(fileOut);
		    				fileOut.flush();
		    				fileOut.close();
		    				*/

		    		  }
		    		  if(flag==0)
		    		  {   
		    			  writeexcel("Failed",Colour.RED);
		    			  /*
		    			  HSSFRow row1 = worksheet.createRow((short) 0); 
		    			  
		    			  
		    			  HSSFCell cellA1 = row1.createCell((short) 0);
		    				cellA1.setCellValue("Failed");
		    				HSSFCellStyle cellStyle = workbook.createCellStyle();
		    				cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		    				cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		    				cellA1.setCellStyle(cellStyle);
		    				
		    				
		    				workbook.write(fileOut);
		    				fileOut.flush();
		    				fileOut.close();
		    				*/
		    		  }
		    		 
		
		
	}
	
	
	
	
	public void Test_Scenario_4()throws Exception
	{
		
			System.out.println("Test_Scenario_4 Running.......");
		
		  driver.findElement(By.name("searchProperty")).click();
			Select s = new Select(driver.findElement(By.name("searchProperty")));
			Thread.sleep(3000);
			
			s.selectByVisibleText("Pete the Cat");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
		    // Click on Search
			driver.findElement(By.xpath("//*[@id='criteriaForm']/table[2]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[23]/td[2]/img[1]")).click();
			Thread.sleep(1000);
			
			// Click on 2nd page pagination
			//driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[3]/tbody/tr/td[2]/a[1]")).click();
			//Thread.sleep(1000);
			
			// Click on the , "PETE THE CAT AND HIS MAGICAL SUNGLASSES, type HJK " title link
			driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[2]/tbody/tr[20]/td[3]/a")).click();		
			Thread.sleep(1000);
	
			 driver.get("http://scnj400b:70/EPIC/level.do?parameter=editLevel");
			
	
		    
			driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[5]/td[2]/input")).clear();							
			driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[5]/td[2]/input")).sendKeys("770L");		
			Thread.sleep(2000);   
			
			
			
  		    driver.findElement(By.name("levelSRLG_SRG")).click();
				Select s1 = new Select(driver.findElement(By.name("levelSRLG_SRG")));
				s1.selectByVisibleText("Grade 7");
				Robot r1 = new Robot();
				r1.keyPress(KeyEvent.VK_ENTER);
				r1.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);

				 
				driver.findElement(By.name("levelSRLGAppealsToMin_SRA")).click();
				Select s2 = new Select(driver.findElement(By.name("levelSRLGAppealsToMin_SRA")));
				s2.selectByVisibleText("Kindergarten");
				Robot r2 = new Robot();
				r2.keyPress(KeyEvent.VK_ENTER);
				r2.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.name("levelSRLGAppealsToMax_SRA")).click();
				Select s3 = new Select(driver.findElement(By.name("levelSRLGAppealsToMax_SRA")));
				s3.selectByVisibleText("Grade 6");
				Robot r3 = new Robot();
				r3.keyPress(KeyEvent.VK_ENTER);
				r3.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				
				
				driver.findElement(By.name("guidedReadingLevel")).click();
				Select s4 = new Select(driver.findElement(By.name("guidedReadingLevel")));
				s4.selectByVisibleText("P");
				Robot r4 = new Robot();
				r4.keyPress(KeyEvent.VK_ENTER);
				r4.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.name("guidedReadingSpanishLevel")).click();
				Select s5 = new Select(driver.findElement(By.name("guidedReadingSpanishLevel")));
				s5.selectByVisibleText("Z+");
				Robot r5 = new Robot();
				r5.keyPress(KeyEvent.VK_ENTER);
				r5.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[12]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[12]/td[2]/input")).sendKeys("17.7");		
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[14]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[14]/td[2]/input")).sendKeys(".5");		
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[16]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[16]/td[2]/input")).sendKeys("123");		
				Thread.sleep(1000); 
				
				driver.findElement(By.xpath("//html/body/form/table[5]/tbody/tr/td[1]/img[1]")).click();		
				 
				/*driver.navigate().back();
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(5000);
				
				driver.navigate().refresh();
				
				Robot r40 = new Robot();
				//r40.keyPress(KeyEvent.VK_ENTER); 
				
				
				Thread.sleep(10000);
				*/
				
				driver.get("scnj400b:70/EPIC/bookProduct.do");
				driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[2]/tbody/tr[20]/td[3]/a")).click();		
				Thread.sleep(1000);
				
				 WebElement element2 = driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr/td[3]/table[8]/tbody/tr[2]/td/table/tbody/tr[4]/td[2]"));
				 String elementval = element2.getText();
				 
				    
					
				 driver.get("http://pardinay:pardip@sch031.coresys.com/restapi/products/EPIC_STG_"+elementval);
				    Thread.sleep(5000);
					//driver.get("http://sch031.coresys.com/restapi/products/EPIC_CONTRIB_7771732");
					//Thread.sleep(10000);
				 
                 String page = driver.getTitle();
					
					if(page.equals("Error 404 Not Found"))
					{
						System.out.println("Error 404 Not Found");
						//driver.quit();
					}
						
					else 
						{System.out.println(page + "Page Found");}
					
					
		    		  
		    		  WebElement element = driver.findElement(By.xpath("//Product"));
		    		  String strng = element.getText();
		
		    		  System.out.println("Actual string - " + strng);
		    		  System.out.println("");
		    		  System.out.println("Expected string - 0PreK2016-04-152016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-18Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7HJKKindergarten-6");
		    	
		    		  //FileOutputStream fileOut = new FileOutputStream("E://Testcase_1_ProductLevelChanges_TestScenario4.xls");
		  			//HSSFWorkbook workbook = new HSSFWorkbook();
		  			//HSSFSheet worksheet = workbook.createSheet("Test_Scenario_4");
		    		  
		  			int flag = 0;
		  			 String strng1 = "0PreK2016-04-152016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-18Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7HJKKindergarten-6";
		  			if(strng1.equals(strng)){flag=1;}
		  			  
		  			   if(flag==1)
		  			  {   
		  				 writeexcel("Passed",Colour.GREEN);
		  				   /*
		    			  HSSFRow row1 = worksheet.createRow((short) 0); 
		    			  
		    			  
		    			  HSSFCell cellA1 = row1.createCell((short) 0);
		    				cellA1.setCellValue("Passed");
		    				HSSFCellStyle cellStyle = workbook.createCellStyle();
		    				cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		    				cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		    				cellA1.setCellStyle(cellStyle);
		    				
		    		
		    				workbook.write(fileOut);
		    				fileOut.flush();
		    				fileOut.close();
		    				*/

		    		  }
		    		  if(flag==0)
		    		  {   
		    			  writeexcel("Failed",Colour.RED);
		    			  /*
		    			  HSSFRow row1 = worksheet.createRow((short) 0); 
		    			  
		    			  
		    			  HSSFCell cellA1 = row1.createCell((short) 0);
		    				cellA1.setCellValue("Failed");
		    				HSSFCellStyle cellStyle = workbook.createCellStyle();
		    				cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		    				cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		    				cellA1.setCellStyle(cellStyle);
		    				
		    				
		    				workbook.write(fileOut);
		    				fileOut.flush();
		    				fileOut.close();
		    				*/
		    		  }
		    		 
		
	}
	
	
	
	
	public void Test_Scenario_5()throws Exception
	{
		System.out.println("Test_Scenario_5 Running.......");
		
		
		  driver.findElement(By.name("searchProperty")).click();
			Select s = new Select(driver.findElement(By.name("searchProperty")));
			Thread.sleep(3000);
			
			s.selectByVisibleText("Pete the Cat");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			
		    // Click on Search
			driver.findElement(By.xpath("//*[@id='criteriaForm']/table[2]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[23]/td[2]/img[1]")).click();
			Thread.sleep(1000);
			
			// Click on 2nd page pagination
			//driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[3]/tbody/tr/td[2]/a[1]")).click();
			//Thread.sleep(1000);
			
			// Click on the , "PETE THE CAT AND HIS MAGICAL SUNGLASSES, type HJK " title link
			driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[2]/tbody/tr[20]/td[3]/a")).click();		
			Thread.sleep(1000);
	
			 driver.get("http://scnj400b:70/EPIC/level.do?parameter=editLevel");
			
	
		    
			driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[5]/td[2]/input")).clear();							
			driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[5]/td[2]/input")).sendKeys("770L");		
			Thread.sleep(2000);   
			
			
			
  		    driver.findElement(By.name("levelSRLG_SRG")).click();
				Select s1 = new Select(driver.findElement(By.name("levelSRLG_SRG")));
				s1.selectByVisibleText("PreK");
				Robot r1 = new Robot();
				r1.keyPress(KeyEvent.VK_ENTER);
				r1.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);

				 
				driver.findElement(By.name("levelSRLGAppealsToMin_SRA")).click();
				Select s2 = new Select(driver.findElement(By.name("levelSRLGAppealsToMin_SRA")));
				s2.selectByVisibleText("Kindergarten");
				Robot r2 = new Robot();
				r2.keyPress(KeyEvent.VK_ENTER);
				r2.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.name("levelSRLGAppealsToMax_SRA")).click();
				Select s3 = new Select(driver.findElement(By.name("levelSRLGAppealsToMax_SRA")));
				s3.selectByVisibleText("Grade 6");
				Robot r3 = new Robot();
				r3.keyPress(KeyEvent.VK_ENTER);
				r3.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				
				
				driver.findElement(By.name("guidedReadingLevel")).click();
				Select s4 = new Select(driver.findElement(By.name("guidedReadingLevel")));
				s4.selectByVisibleText("P");
				Robot r4 = new Robot();
				r4.keyPress(KeyEvent.VK_ENTER);
				r4.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.name("guidedReadingSpanishLevel")).click();
				Select s5 = new Select(driver.findElement(By.name("guidedReadingSpanishLevel")));
				s5.selectByVisibleText("");
				Robot r5 = new Robot();
				r5.keyPress(KeyEvent.VK_ENTER);
				r5.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[12]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[12]/td[2]/input")).sendKeys("17.7");		
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[14]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[14]/td[2]/input")).sendKeys(".5");		
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[16]/td[2]/input")).clear();
				driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr[16]/td[2]/input")).sendKeys("123");		
				Thread.sleep(1000); 
				
				driver.findElement(By.xpath("//html/body/form/table[5]/tbody/tr/td[1]/img[1]")).click();		
				 
				/*driver.navigate().back();
				Thread.sleep(1000);
				driver.navigate().back();
				Thread.sleep(5000);
				
				driver.navigate().refresh();
				
				Robot r40 = new Robot();
				//r40.keyPress(KeyEvent.VK_ENTER); 
				
				
				Thread.sleep(10000);
				*/
				
				driver.get("scnj400b:70/EPIC/bookProduct.do");
				driver.findElement(By.xpath("//html/body/form/table[2]/tbody/tr/td/table[2]/tbody/tr[20]/td[3]/a")).click();		
				Thread.sleep(1000);
				
				 WebElement element2 = driver.findElement(By.xpath("//html/body/form/table[3]/tbody/tr/td[3]/table[8]/tbody/tr[2]/td/table/tbody/tr[4]/td[2]"));
				 String elementval = element2.getText();
				 
				    
					
				 driver.get("http://pardinay:pardip@sch031.coresys.com/restapi/products/EPIC_STG_"+elementval);
				    Thread.sleep(5000);
					//driver.get("http://sch031.coresys.com/restapi/products/EPIC_CONTRIB_7771732");
					//Thread.sleep(10000);
				 
                 String page = driver.getTitle();
					
					if(page.equals("Error 404 Not Found"))
					{
						System.out.println("Error 404 Not Found");
						//driver.quit();
					}
						
					else 
						{System.out.println(page + "Page Found");}
					
					
		    		  
		    		  WebElement element = driver.findElement(By.xpath("//Product"));
		    		  String strng = element.getText();
		
		    		  System.out.println("Actual string - " + strng);
		    		  System.out.println("");
		    		  System.out.println("Expected string - 02016-04-15PreK2016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-18Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7HJKKindergarten-6");
		    	
		    		  //FileOutputStream fileOut = new FileOutputStream("E://Testcase_1_ProductLevelChanges_TestScenario5.xls");
		  			//HSSFWorkbook workbook = new HSSFWorkbook();
		  			//HSSFSheet worksheet = workbook.createSheet("Test_Scenario_5");
		    		  
		  			int flag = 0;
		  			 String strng1 = "02016-04-15PreK2016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-18Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7HJKKindergarten-6";
		  			if(strng1.equals(strng)){flag=1;}
		  			  
		  			   if(flag==1)
		  			  {    
		  				 writeexcel("Passed",Colour.GREEN);
		  				   /*
		    			  HSSFRow row1 = worksheet.createRow((short) 0); 
		    			  
		    			  
		    			  HSSFCell cellA1 = row1.createCell((short) 0);
		    				cellA1.setCellValue("Passed");
		    				HSSFCellStyle cellStyle = workbook.createCellStyle();
		    				cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		    				cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		    				cellA1.setCellStyle(cellStyle);
		    				
		    		
		    				workbook.write(fileOut);
		    				fileOut.flush();
		    				fileOut.close();
		    				*/

		    		  }
		    		  if(flag==0)
		    		  {   
		    			  writeexcel("Failed",Colour.RED);
		    			  /*
		    			  HSSFRow row1 = worksheet.createRow((short) 0); 
		    			  
		    			  
		    			  HSSFCell cellA1 = row1.createCell((short) 0);
		    				cellA1.setCellValue("Failed");
		    				HSSFCellStyle cellStyle = workbook.createCellStyle();
		    				cellStyle.setFillForegroundColor(HSSFColor.GOLD.index);
		    				cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		    				cellA1.setCellStyle(cellStyle);
		    				
		    				
		    				workbook.write(fileOut);
		    				fileOut.flush();
		    				fileOut.close();
		    				*/
		    		  }
		    		 
		    		  
		
		
	}
	
	public void login()throws ParseException, InterruptedException, AWTException
	{
		driver.get("http://scnj400b:70/EPIC/validateKeyInfoBook.do"); // Open the url
		  Thread.sleep(1000);
		  
		  driver.findElement(By.name("userName")).sendKeys("Pardinay"); // Enter username
		  Thread.sleep(1000);
		  
		  driver.findElement(By.name("password")).sendKeys("welcome"); // Enter password
		  Thread.sleep(1000);
		  
		  driver.findElement(By.xpath("//html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[3]/a/img")).click(); // Click on Go button
		  Thread.sleep(1000);
	}
	
	
	
	
	public void logout()throws ParseException, InterruptedException, AWTException
	{   
		driver.get("http://scnj400b:70/EPIC/validateKeyInfoBook.do"); // Open the url
		driver.findElement(By.xpath("//html/body/table[2]/tbody/tr/td[2]/a/img")).click();
	}
	
	
	
	public void writeexcel(String s, Colour colour) throws Exception
	{   
		Date date1 = new Date();
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss"); // Output excel sheet named with Date format 	
	    String Fname = dateFormat1.format(date1);	
		
		FileInputStream fs = new FileInputStream("C:\\scholastic\\Input\\testdata.xls");
		Workbook  wb = Workbook.getWorkbook(fs);
		Fname= "C:\\scholastic\\Output\\" + Fname+ ".xls"; // Creating Output excel sheet
	    WritableWorkbook wkr = Workbook.createWorkbook(new File(Fname), wb);
	  Sheet sh = wb.getSheet(0);
		 WritableSheet getsht = wkr.getSheet(0);
		
	int totalNoOfCols = sh.getRow(0).length;
	
	int totalNoOfRows = sh.getRows();
	for (int i= 1 ; i < totalNoOfRows; i++) {
		
	    Label label = new Label(2, i,s, getCellFormat (colour));
			 getsht.addCell(label);
			}
	
	wkr.write();
	wkr.close();
	}
	
	private static CellFormat getCellFormat(Colour colour) throws Exception {
		WritableFont cellFont = new WritableFont(WritableFont.TIMES, 16);
	    WritableCellFormat cellFormat = new WritableCellFormat(cellFont);
	    cellFormat.setBackground(colour);
	    return cellFormat;
	
	}
	
}
