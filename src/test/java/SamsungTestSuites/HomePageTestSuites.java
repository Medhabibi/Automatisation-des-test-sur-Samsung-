package SamsungTestSuites;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import SamasungPage.SamsungHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTestSuites {

	@Given("Utilisateur est sur la page dacceuil")
	public void utilisateur_est_sur_la_page_dacceuil() throws Exception {
		Config.driver =new ChromeDriver();
		Config.confchrome();
		Config.maxmizewindow();
		Config.driver.get(Utils.getproprety("webhomelink"));
	}

	@When("Utilisateur survole la souris sur le {string}")
	public void utilisateur_survole_la_souris_sur_le(String menu) throws Exception {
		SamsungHomePage page = new SamsungHomePage();
		page.MouseHoverOnMenu(menu);;
	   
	}

	@When("clique sur le {string}")
	public void clique_sur_le(String sousmenu) throws Exception {
		SamsungHomePage page = new SamsungHomePage();
		page.selectProduct(sousmenu);
		
	    
	}

	@Then("utilisateur est dirige vers la page {string}")
	public void utilisateur_est_dirige_vers_la_page(String article) {
		SamsungHomePage articlee = new SamsungHomePage();
		Assert.assertEquals(article, articlee.verifnameproduit());
		
		Config.closewindow();
	    
	}
}