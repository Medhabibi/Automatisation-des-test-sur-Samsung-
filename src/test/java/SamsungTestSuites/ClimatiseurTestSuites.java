package SamsungTestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import SamasungPage.SamsungClimatiseurPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClimatiseurTestSuites {
	@Given("Utilisateur dans la page Climatiseur")
	public void utilisateur_dans_la_page_climatiseur() throws Exception {
		Config.driver =new ChromeDriver();
		Config.confchrome();
		Config.maxmizewindow();
		Config.driver.get(Utils.getproprety("webClimatiseurlink"));
	}

	@When("Utilisateur clique sur le produit {string}")
	public void utilisateur_clique_sur_le_produit(String productname) {
		SamsungClimatiseurPage page = new SamsungClimatiseurPage();
		page.ClickproductbyName(productname);
	  
	}

	@Then("Utilisateur est dans la page produit {string}")
	public void utilisateur_est_dans_la_page_produit(String nomproduit) {
		SamsungClimatiseurPage text = new SamsungClimatiseurPage();
		Assert.assertEquals(nomproduit, text.verifbyname());
		Config.closewindow();
	    
	}

}
