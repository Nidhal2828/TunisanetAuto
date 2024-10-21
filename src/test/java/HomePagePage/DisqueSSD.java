package HomePagePage;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class DisqueSSD {
	
	@FindBy(xpath="/html/body/main/section/div/div/div[2]/section/section/div[3]/div/div/div/div/article/div/div[2]/h2/a")
	List<WebElement> productlist;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/h1")
	WebElement veriftitle;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[3]/span")
	WebElement disponibilite;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div[1]/div[3]/div[4]/form/div[2]/div/div[2]/button")
	WebElement btnajout;
	@FindBy(xpath="/html/body/div[8]/div/div/div/div[2]/div/div/a")
	WebElement btncommander;
	@FindBy(xpath="/html/body/main/section/div/div/div/section/div/div/div[1]/div[2]/ul/li[2]/div/div[2]/div[1]/a")
	WebElement veriftext;
	
	public DisqueSSD () {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickonproductbyname(String productname) {
		try {
		for (WebElement product:productlist) {
			if(product.getText().contains(productname)) {
				product.click();
				Config.attente(10);
				Assert.assertEquals(disponibilite.getText(), "En stock");
				btnajout.click();
				btncommander.click();
				
			}
		}
	}catch (Exception e) {
		// TODO: handle exception
	}

}
	public void verifProduitPanier(String expectedProduct) throws InterruptedException {
		Thread.sleep(3000);
		String actualProductname=veriftext.getText();
		Assert.assertEquals(expectedProduct, actualProductname);
	}
}
