package parallel;

import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.MyAddressesPage;
import com.qa.factory.DriverFactory;
import com.qa.util.Common;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePageSteps {


	private WebDriver driver;

	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@When("user navigates in Home page")
	public void user_navigates_in_home_page() {
		homePage.homePageUrl();
	}

	@When("user searches product {string}")
	public void user_searches_product(String searchProduct) {
		homePage.searchProduct(searchProduct);
	}

	@When("Add product to cart")
	public void add_product_to_cart() {
		
		homePage.addToCartBtn();
	}

	@Then("Verify added product")
	public void verify_added_product() {

		Common.pause(2);
		Assert.assertTrue(homePage.verifyAddedProduct());
	}

}
