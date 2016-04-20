package Automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Testcase_2_ProductLevelNewProduct {
	
	// Create webdriver interface reference as fields of test class
	
	public WebDriver driver;
	
	@BeforeClass
	public void testSetup() {
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		
		
		driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
	
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	@Test
  public void Testcase() throws Exception {
		
		    		  driver.get("http://scnj400b:70/EPIC/presentation/KeyInfoBookView.jsp#"); // Open the url
		    		  Thread.sleep(3000);
		    		  
		    		  driver.findElement(By.name("userName")).sendKeys("Pardinay"); // Enter username
		    		 Thread.sleep(1000);
		    		  
		    		  driver.findElement(By.name("password")).sendKeys("welcome"); // Enter password
		    		  Thread.sleep(1000);
		    		  
		    		  driver.findElement(By.xpath("//html/body/form/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[3]/a/img")).click(); // Click on Go button
		    		  Thread.sleep(1000);
		    		  
		    		  
		    		  
		    		    driver.findElement(By.name("ownerType")).click();
						Select s = new Select(driver.findElement(By.name("ownerType")));
						Thread.sleep(3000);
						
						s.selectByVisibleText("BOOK FAIRS");
						Robot r = new Robot();
						r.keyPress(KeyEvent.VK_ENTER);
						r.keyRelease(KeyEvent.VK_ENTER);
						Thread.sleep(1000);
		    		  
		    		  
						driver.findElement(By.xpath("//html/body/form/table[1]/tbody/tr/td[1]/a[1]/img")).click();
						
						driver.findElement(By.xpath("//html/body/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("The Adventures of Benny Agbayani");
						
						
						driver.findElement(By.name("majorClassCode")).click();
						Select s1 = new Select(driver.findElement(By.name("majorClassCode")));
						Thread.sleep(1000);
						
						s1.selectByVisibleText("HBK - HARDBACK");
						Robot r1 = new Robot();
						r1.keyPress(KeyEvent.VK_ENTER);
						r1.keyRelease(KeyEvent.VK_ENTER);
						Thread.sleep(1000);
						
						
						driver.findElement(By.name("minorClassCode")).click();
						Select s2 = new Select(driver.findElement(By.name("minorClassCode")));
						
						
						Thread.sleep(3000);
						s2.selectByVisibleText("HJK - JACKETED (HC)");
						Robot r2 = new Robot();
						r2.keyPress(KeyEvent.VK_ENTER);
						r2.keyRelease(KeyEvent.VK_ENTER);
						Thread.sleep(1000);
						
						
						driver.findElement(By.xpath("//html/body/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[5]/td[2]/a[1]/img")).click();
						
						driver.findElement(By.xpath("//html/body/form/table[1]/tbody/tr/td/input[1]")).click();
						
						driver.findElement(By.xpath("//html/body/form[1]/table[3]/tbody/tr/td[1]/table[1]/tbody/tr[2]/td/table/tbody/tr[1]/td[4]/img")).click();
						
						
						Set <String> set1=driver.getWindowHandles();
						 Iterator <String> win1=set1.iterator();
						 String parent=win1.next();
						 String child=win1.next();
						 driver.switchTo().window(child);
						 
						 driver.findElement(By.xpath("//html/body/form/table/tbody/tr[2]/td/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a")).click();
						
						 driver.switchTo().window(parent);
						 
					 
						 driver.findElement(By.xpath("//html/body/form[1]/table[3]/tbody/tr/td[1]/table[2]/tbody/tr[3]/td[2]/table/tbody/tr/td[1]/select/option[4]")).click();
						 driver.findElement(By.xpath("//html/body/form[1]/table[3]/tbody/tr/td[1]/table[2]/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/input[1]")).click();
				
						 driver.findElement(By.xpath("//html/body/form[1]/table[3]/tbody/tr/td[1]/table[2]/tbody/tr[3]/td[2]/table/tbody/tr/td[1]/select/option[5]")).click();
						 driver.findElement(By.xpath("//html/body/form[1]/table[3]/tbody/tr/td[1]/table[2]/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/input[1]")).click();

						 driver.findElement(By.xpath("//html/body/form[1]/table[3]/tbody/tr/td[1]/table[2]/tbody/tr[3]/td[2]/table/tbody/tr/td[1]/select/option[6]")).click();
						 driver.findElement(By.xpath("//html/body/form[1]/table[3]/tbody/tr/td[1]/table[2]/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/input[1]")).click();

						 
							driver.findElement(By.name("ageRangeMin")).click();
							Select s4 = new Select(driver.findElement(By.name("ageRangeMin")));
							Thread.sleep(3000);
							
							s4.selectByVisibleText("1 Year");
							Robot r4 = new Robot();
							r4.keyPress(KeyEvent.VK_ENTER);
							r4.keyRelease(KeyEvent.VK_ENTER);
							
							
							driver.findElement(By.name("ageRangeMax")).click();
							Select s5 = new Select(driver.findElement(By.name("ageRangeMax")));
							Thread.sleep(1000);
							
							s5.selectByVisibleText("4 Years");
							Robot r5 = new Robot();
							r5.keyPress(KeyEvent.VK_ENTER);
							r5.keyRelease(KeyEvent.VK_ENTER);
							
							
							
							driver.findElement(By.name("gradeRangeMin")).click();
							Select s6 = new Select(driver.findElement(By.name("gradeRangeMin")));
							//Thread.sleep(3000);
							s6.selectByVisibleText("Grade 5");
							Robot r6 = new Robot();
							r6.keyPress(KeyEvent.VK_ENTER);
							r6.keyRelease(KeyEvent.VK_ENTER);
							
							
							driver.findElement(By.name("gradeRangeMax")).click();
							Select s7 = new Select(driver.findElement(By.name("gradeRangeMax")));
							//Thread.sleep(3000);
							s7.selectByVisibleText("Grade 10");
							Robot r7 = new Robot();
							r7.keyPress(KeyEvent.VK_ENTER);
							r7.keyRelease(KeyEvent.VK_ENTER);
							
							
							driver.findElement(By.name("readingLevelMin")).click();
							Select s8 = new Select(driver.findElement(By.name("readingLevelMin")));
							//Thread.sleep(3000);
							s8.selectByVisibleText("3 YEARS");
							Robot r8 = new Robot();
							r8.keyPress(KeyEvent.VK_ENTER);
							r8.keyRelease(KeyEvent.VK_ENTER);
							
							
							driver.findElement(By.name("readingLevelMax")).click();
							Select s9 = new Select(driver.findElement(By.name("readingLevelMax")));
							//Thread.sleep(3000);
							s9.selectByVisibleText("14 YEARS");
							Robot r9 = new Robot();
							r9.keyPress(KeyEvent.VK_ENTER);
							r9.keyRelease(KeyEvent.VK_ENTER);
							
							
							driver.findElement(By.name("interestLevelMin")).click();
							Select s10 = new Select(driver.findElement(By.name("interestLevelMin")));
							//Thread.sleep(3000);
							s10.selectByVisibleText("GRADE 4");
							Robot r10 = new Robot();
							r10.keyPress(KeyEvent.VK_ENTER);
							r10.keyRelease(KeyEvent.VK_ENTER);
							
							
							driver.findElement(By.name("interestLevelMax")).click();
							Select s11 = new Select(driver.findElement(By.name("interestLevelMax")));
							//Thread.sleep(3000);
							s11.selectByVisibleText("GRADE 10");
							Robot r11 = new Robot();
							r11.keyPress(KeyEvent.VK_ENTER);
							r11.keyRelease(KeyEvent.VK_ENTER);
							
							
							driver.findElement(By.xpath("//html/body/form[1]/table[3]/tbody/tr/td[1]/table[7]/tbody/tr[2]/td/table/tbody/tr/td[2]/input[1]")).click();
							
							driver.findElement(By.xpath("//html/body/form[1]/table[3]/tbody/tr/td[1]/table[7]/tbody/tr[4]/td/table/tbody/tr/td[2]/input")).click();
							
							
							Set <String> set2=driver.getWindowHandles();
							 Iterator <String> win2=set2.iterator();
							 String parent1=win2.next();
							 String child1=win2.next();
							 driver.switchTo().window(child1);
							 
							 driver.findElement(By.xpath("//html/body/form/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[10]/td[1]/input")).click();
							
							 driver.findElement(By.xpath("//html/body/form/table/tbody/tr[2]/td/table/tbody/tr[1]/td/input[1]")).click();
							
							 
							 driver.switchTo().window(parent1);
							
							    driver.findElement(By.name("licensedIndicator")).click();
								Select s12 = new Select(driver.findElement(By.name("licensedIndicator")));
								Thread.sleep(1000);
								
								s12.selectByVisibleText("No");
								Robot r12 = new Robot();
								r12.keyPress(KeyEvent.VK_ENTER);
								r12.keyRelease(KeyEvent.VK_ENTER);
							    
								 driver.findElement(By.xpath("//html/body/form[1]/table[3]/tbody/tr/td[2]/table[2]/tbody/tr[2]/td/table/tbody/tr[1]/td[2]/input")).click();
								Thread.sleep(1000);	
								
								driver.findElement(By.name("managingEditorID")).click();
								Select s13 = new Select(driver.findElement(By.name("managingEditorID")));
								Thread.sleep(3000);
								
								s13.selectByVisibleText("HARD COVER,");
								Robot r13 = new Robot();
								r13.keyPress(KeyEvent.VK_ENTER);
								r13.keyRelease(KeyEvent.VK_ENTER);
							    
								
								driver.findElement(By.name("internalEditorID")).click();
								Select s14 = new Select(driver.findElement(By.name("internalEditorID")));
								Thread.sleep(1000);
								
								s14.selectByVisibleText("Anderson, AnnMarie");
								Robot r14 = new Robot();
								r14.keyPress(KeyEvent.VK_ENTER);
								r14.keyRelease(KeyEvent.VK_ENTER);
								
								
								driver.findElement(By.name("productionScheduleType")).click();
								Select s15 = new Select(driver.findElement(By.name("productionScheduleType")));
								Thread.sleep(1000);
								
								s15.selectByVisibleText("7-HC YA PICKUPS DOMESTIC");
								Robot r15 = new Robot();
								r15.keyPress(KeyEvent.VK_ENTER);
								r15.keyRelease(KeyEvent.VK_ENTER);
								
								driver.findElement(By.name("packScheduleType")).click();
								Select s16 = new Select(driver.findElement(By.name("packScheduleType")));
								Thread.sleep(1000);
								
								s16.selectByVisibleText("NONE");
								Robot r16 = new Robot();
								r16.keyPress(KeyEvent.VK_ENTER);
								r16.keyRelease(KeyEvent.VK_ENTER);
								
								driver.findElement(By.xpath("//html/body/form[1]/table[3]/tbody/tr/td[2]/table[2]/tbody/tr[2]/td/table/tbody/tr[2]/td[2]/input")).click();
								
								driver.findElement(By.name("sourceType")).click();
								Select s17 = new Select(driver.findElement(By.name("sourceType")));
								Thread.sleep(1000);
								
								s17.selectByVisibleText("PACKAGER");
								Robot r17 = new Robot();
								r17.keyPress(KeyEvent.VK_ENTER);
								r17.keyRelease(KeyEvent.VK_ENTER);
								
								driver.findElement(By.name("audienceType")).click();
								Select s52 = new Select(driver.findElement(By.name("audienceType")));
								Thread.sleep(1000);
								
								s52.selectByVisibleText("CHILDREN/JUVENILE");
								Robot r52 = new Robot();
								r52.keyPress(KeyEvent.VK_ENTER);
								r52.keyRelease(KeyEvent.VK_ENTER);
								
								
								
								driver.findElement(By.xpath("//html/body/form[1]/table[4]/tbody/tr/td/img")).click();
								
								//Thread.sleep(5000);
								
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
						    		  System.out.println("Expected string - 0PreK2016-04-152016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-15Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7Kindergarten-6HJK");
						    	
						    		  FileOutputStream fileOut = new FileOutputStream("E://Testcase_2_ProductLevelNewProduct.xls");
						  			HSSFWorkbook workbook = new HSSFWorkbook();
						  			HSSFSheet worksheet = workbook.createSheet("Test_Scenario_1");
						    		  
						  			int flag = 0;
						  			 String strng1 = "0PreK2016-04-152016-04-15PETE THE CAT AND HIS MAGICAL SUNGLASSES2016-04-15Z+HBK2016-04-15BOOK CLUBS97800622755612013-12-012016-04-150062275569770LIT17.7Kindergarten-6HJK";
						  			if(strng1.equals(strng)){flag=1;}
						  			  
						  			   if(flag==1)
						  			  {
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

						    		  }
						    		  if(flag==0)
						    		  {
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
						    		  }
										 Thread.sleep(10000);
								
								
	}
}
