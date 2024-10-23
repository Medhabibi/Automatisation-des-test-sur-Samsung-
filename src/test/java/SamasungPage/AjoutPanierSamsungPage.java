package SamasungPage;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class AjoutPanierSamsungPage {
	
	@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[2]/div[3]/form/div[3]/div[1]/div[2]/button")
	WebElement btsajouter ;
	
	@FindBy(xpath="/html/body/div[9]/div/div/div[2]/div/div[2]/div/div/button")
	WebElement Suivant ;
	
	@FindBy(xpath="/html/body/main/header/div/div[2]/div/div[1]/div/div/div[3]/div[3]")
	WebElement panier ;
	
	@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[1]/div/div[2]/ul/li/div/div[2]/div[1]/a")
	WebElement verifname;

	public AjoutPanierSamsungPage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void ajoutpanier() {
		Config.attente(10);
		btsajouter.click();
		WebDriverWait wait = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Suivant));
		Config.attente(10);
		Suivant.click();
		Config.attente(10);
		
	}
	public void panier () {
		Config.attente(10);
		Config.driver.get("https://www.samsungtunisie.tn/fr/");
		WebDriverWait wait = new WebDriverWait(Config.driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(panier));
		panier.click();
		}
	public String verification(){
		String texteActuel = verifname.getText();
		System.out.println("Nom du produit actuellement affiché : " + texteActuel);
		return texteActuel;
		}
	
}
