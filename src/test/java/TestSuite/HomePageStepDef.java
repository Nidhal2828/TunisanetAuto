package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utiles;
import HomePagePage.HomePagePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {


    @Given("the user is on the homepage")
    public void the_user_is_on_the_homepage() throws Exception {
        Config.driver =new ChromeDriver();
        Config.confchrome(); 
        Config.driver.get(Utiles.getproprety("webhomelink")); 
        Config.maximiseWindow(); 

    }

    @When("the user hovers over the {string} menu and clicks on the {string} submenu")
    public void the_user_hovers_over_the_menu_and_clicks_on_the_submenu(String menutitle, String submenutitle) throws InterruptedException {
        HomePagePage page = new HomePagePage();
        page.MouseHoverOnMenu(menutitle, submenutitle);
    }

    @Then("the user is redirected to the {string} page")
    public void the_user_is_redirected_to_the_page(String submenutitle) throws InterruptedException {
        HomePagePage page = new HomePagePage();

        page.verif(submenutitle);
    }
}
