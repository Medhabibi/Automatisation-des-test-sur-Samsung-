package SamsungTestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import SamasungPage.AjoutPanierSamsungPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PanierSamsungTestSuites {
	@Given("Utilisateur est sur la page du produit {string}")
	public void utilisateur_est_sur_la_page_du_produit(String string) throws Exception {
		Config.driver =new ChromeDriver();
		Config.confchrome();
		Config.maxmizewindow();
		Config.driver.get(Utils.getproprety("panierlink"));
	}

	@When("Utilisateur ajoute le produit au panier")
	public void utilisateur_ajoute_le_produit_au_panier() throws Exception {
		AjoutPanierSamsungPage panier = new AjoutPanierSamsungPage();
		panier.ajoutpanier();
	    
	}

	@When("Utilisateur accede au panier")
	public void utilisateur_accede_au_panier() {
		AjoutPanierSamsungPage panier = new AjoutPanierSamsungPage();
		panier.panier();
	}

	@Then("Utilisateur verifie que le produit est bien ajouté au panier")
	public void utilisateur_verifie_que_le_produit_est_bien_ajouté_au_panier() {
		AjoutPanierSamsungPage panier = new AjoutPanierSamsungPage();
		String produitajoute = panier.verification();
		Assert.assertEquals("Climatiseur Samsung 12000 BTU Digital Inverter", produitajoute);
		Config.closewindow();
	  
	}

}
