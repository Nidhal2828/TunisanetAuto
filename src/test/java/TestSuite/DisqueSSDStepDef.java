package TestSuite;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utiles;
import HomePagePage.DisqueSSD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisqueSSDStepDef {
	
	@Given("user is on the page Disque SSD")
	public void user_is_on_the_page_disque_ssd() throws Exception {
		Config.driver =new ChromeDriver();
        Config.confchrome(); 
        Config.maximiseWindow(); 
        Config.driver.get(Utiles.getproprety("disquessdlink")); 

	    
	}

	@When("user click on product {string}")
	public void user_click_on_product(String productname) {
		DisqueSSD page = new DisqueSSD();
		page.clickonproductbyname(productname);
		
	    
	}

	@Then("user is directed to product page and verif the name off product is {string}")
	public void user_is_directed_to_product_page_and_verif_the_name_off_product_is(String nameproduct) throws InterruptedException {
		DisqueSSD page = new DisqueSSD();
		page.verifProduitPanier(nameproduct);
		Config.driver.quit();

	}


}
