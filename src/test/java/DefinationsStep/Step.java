package DefinationsStep;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.PageObjects.Bounce;
import com.PageObjects.Clothes;
import com.PageObjects.Commit;
import com.PageObjects.Contact;
import com.PageObjects.Tidesimply;
import com.PageObjects.New;
import com.PageObjects.PG;
import com.PageObjects.Products;
import com.PageObjects.Search;
import com.PageObjects.Search2;
import Utilities.ExcelData;

//import Utility.ReadConfiguration;
import Utilities.*;
import Utilities.getscreenshots;
import io.cucumber.java.en.And;
//import Utility.snaps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {

	WebDriver driver;
	Tidesimply c;
	Clothes c1;
	Commit co;
	Contact con;
	New ne;
	Products pro;
	PG pg;
	Bounce bo;
	Search sc;
	Search2 sct;
	
	public static ExcelData excel;
	
	
	ReadConfiguration rc=new ReadConfiguration();
	Logger log=Logger.getLogger("Cucumber Framework");
	

	
	
	@Given("user launch Browser")
	public void user_launch_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathyusha Janagama\\Downloads\\TideBDD\\TideBDD\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		log.info("Chrome started succesfully");
		}
	@When("user open url")
	public void user_open_url() throws IOException {
		c=new Tidesimply(driver);
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		log.info("Opens url");
		System.out.println(driver.getTitle());
		getscreenshots.getScreenshot(driver, "Website");
			}
	
	//TIDESIMPLY
	
	@And("click on Tidesimply")
	public void click_on_Coupons() throws IOException {
	Tidesimply c= new Tidesimply(driver);
	c.Tidesimply();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	getscreenshots.getScreenshot(driver, "Tidesimply");
	log.info("clicked on Tidesimply");
		}
	@Then("close Browser")
	public void close_Browser() {
	driver.quit();
	log.info("Browser is closed");
	}
	
	
	//WASH CLOTHES
	@When("click on Wash Clothes")
	public void click_on_Wash_Clothes() throws IOException {
	 c1=new Clothes(driver);
	 c1.Wash();
	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
	getscreenshots.getScreenshot(driver, "Wash Clothes");
	log.info("clicked on How to wash my clothes");
	System.out.println(driver.getTitle());
		}
	@And("click on Remove stains")
	public void click_on_Remove_stains() throws IOException {
	c1.Stain();
	getscreenshots.getScreenshot(driver, "Remove Stains");
	System.out.println(driver.getTitle());
	}
	
	//OUR COMMITMENT
	@When("click on commitment")
	public void click_on_commitment() throws IOException {
	co=new Commit(driver);
	co.Comm();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	getscreenshots.getScreenshot(driver, "Commitment");
	log.info("clicked on commitment");
	}
		
	//CONTACT US
	@When("click on Contact")
	public void click_on_Contact() throws IOException {
	con=new Contact(driver);
	con.con();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
	getscreenshots.getScreenshot(driver, "contact us");
	System.out.println(driver.getTitle());	
	}
	
	//FABRIC CARE
	@When("click on Fabriccare")
	public void click_on_Fabriccare() throws IOException {
	New n= new New(driver);
	n.Fabriccare();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	getscreenshots.getScreenshot(driver, "Fabriccare");
	log.info("clicked on Fabricacre");
	}
	

	//SHOP BY PRODUCT
	@When("click on product")
	public void click_on_product() throws IOException {
	pro= new Products(driver);
	pro.Shop();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	getscreenshots.getScreenshot(driver, "Product");
		}
	@And("click on cleaner")
	public void click_on_cleaner() throws IOException {
		pro.Cleaner();
		getscreenshots.getScreenshot(driver, "product of Tide");
		System.out.println(driver.getTitle());
	
		}
	
	//P&G ICON
	@When("click on PG")
	public void click_on_PG() throws IOException {
		pg=new PG(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		pg.icon();
		getscreenshots.getScreenshot(driver, "PG");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		}
	
	//BOUNCE
	@When("click on Bounce")
	public void click_on_Bounce() throws IOException {
		bo=new Bounce(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
		bo.Bicon();
		getscreenshots.getScreenshot(driver, "Bounce");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		}
	
	//SEARCH POWDER
	@When("click on Search")
	public void click_on_Search() throws IOException
	{
	 sc=new Search(driver);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
	 sc.scrh();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	getscreenshots.getScreenshot(driver, "Powder");
	System.out.println(driver.getTitle());
	}
	@And("click on item 1")
	public void click_on_item_1() throws IOException {
	sc.item();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	getscreenshots.getScreenshot(driver, "product item");
	System.out.println(driver.getTitle());
	}
	
	// SEARCH TIDESIMPLY
	@When("click on Search Two")
	public void click_on_Search_Two() throws IOException {
	sct=new Search2(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"lilo3746-wrapper\"]/div/a")).click();
	sct.scrhing();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	getscreenshots.getScreenshot(driver, "Tidesimply");
	System.out.println(driver.getTitle());
	}
	@And("click on item Two")
	public void click_on_item_Two() throws IOException {
		sct.items();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		getscreenshots.getScreenshot(driver, "product item");
		System.out.println(driver.getTitle());
		}
	
}
	

