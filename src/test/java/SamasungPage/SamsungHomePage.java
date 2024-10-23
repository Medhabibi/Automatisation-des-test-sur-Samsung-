package SamasungPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class SamsungHomePage {
	
	@FindBy(xpath="/html/body/main/header/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/ul/li/a/span")
	List<WebElement> menus ;
	
	@FindBy(xpath="/html/body/main/header/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/ul/li[4]/ul/li[1]/ul/li/div[1]/div/ul/li/a")
	List<WebElement>submenus;
	
	@FindBy(xpath="/html/body/main/section/div[1]/div[2]/div/h1")
	WebElement verifname ;
	
	public SamsungHomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	
    public void MouseHoverOnMenu(String categoryName)throws Exception {
    	Actions action = new Actions(Config.driver);
    	try {
    		
    		for(WebElement menu : menus) {
    			Config.attente(10);
    			System.out.println(menu.getText());
    			
    			if(menu.getText().contains(categoryName)) {
    				Config.attente(10);
    			
    			action.moveToElement(menu).perform();
    			Config.attente(10);
    			}	
    			}
    			}catch (Exception e) {
			// TODO: handle exception
		}
    	}
    	
    	public void selectProduct(String productName) throws Exception {
    		
    		try {
    		for (WebElement product : submenus) {
    			Config.attente(10);
    			System.out.println(product.getText());
    			if (product.getText().contains(productName)) {
    				Config.attente(10);
    				Config.attente(10);
    				product.click();
    			}
    		}
    		}catch (Exception e) {
    			// TODO: handle exception
    		}
    }
   public String verifnameproduit() {
	   String actueltext = verifname.getText();
	   System.out.println("Nom du produit capturé : " + actueltext);
	   return actueltext;
	  
    	
    }
}
