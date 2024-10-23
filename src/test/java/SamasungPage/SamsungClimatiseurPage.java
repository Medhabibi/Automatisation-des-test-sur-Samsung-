package SamasungPage;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class SamsungClimatiseurPage {
	
	@FindBy(xpath="/html/body/main/section/div[4]/div/div/div[2]/section/section/div[2]/div/div/div[1]/div/div/div/article/div/div[2]/div[1]/h3/a")
	List<WebElement> produits ;
	
	@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[2]/h1")
	WebElement nomproduit ;
	
	public SamsungClimatiseurPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void ClickproductbyName(String Nproduit) {
		
		try {
			for(WebElement produit : produits) {
				Config.attente(10);
				System.out.println("Nom du produit trouvé : " + produit.getText());
				if ( produit.getText().contains(Nproduit)) {
					Config.attente(10);
					
					produit.click();
				}
				
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public String verifbyname() {
		Config.attente(10);
		String texteActuel =nomproduit.getText();
		System.out.println("Nom du produit actuellement affiché : " + texteActuel);
		return texteActuel;
		
	}

}
