package HomePagePage;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePagePage {
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li/div[1]/span")
	List<WebElement>menus ;
	
	@FindBy(xpath="/html/body/main/header/div[3]/div/div/div/div/div/div/ul/li[3]/div[2]/div/div[1]/ul/li/a")
	List<WebElement>submenus ;
	
	@FindBy(xpath="/html/body/main/section/div/div/nav/ol/li[4]/a/span")
	
	WebElement verifname ;

public HomePagePage() {
	PageFactory.initElements(Config.driver, this);
}

public void MouseHoverOnMenu (String menutitle,String submenutitle) throws InterruptedException {
	try {
		Thread.sleep(3000);

		for ( WebElement menu : menus) {
			Config.attente(10);
			System.out.println(menu.getText());
			if(menu.getText().contains(menutitle)) {
				Config.action =new Actions(Config.driver);
				Config.action.moveToElement(menu).perform();

				Thread.sleep(3000);
				for(WebElement submenu :submenus) {
					if(submenu.getText().contains(submenutitle)) {
						System.out.println(submenu.getText());

						submenu.click();
		            
					}
	
				}
				
			}
			
		}
		
	}catch (Exception e) {
		// TODO: handle exception
	}
}
public void verif(String submenutitle) throws InterruptedException {
	Thread.sleep(3000);
	Assert.assertEquals(submenutitle, verifname.getText());
}
}