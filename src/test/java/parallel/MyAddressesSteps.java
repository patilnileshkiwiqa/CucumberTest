package parallel;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.pages.MyAddressesPage;
import com.qa.factory.DriverFactory;
import com.qa.util.Common;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class MyAddressesSteps {

	private MyAddressesPage myAddressesPage = new MyAddressesPage(DriverFactory.getDriver());
	
	
	@Given("user is on My addresses page")
	public void user_is_on_my_addresses_page() {
		
		System.out.println("My addresses Page title is: "+myAddressesPage.getMyAddressTitle() );
		
	}

	@When("user clicks on My addresses link")
	public void user_clicks_on_my_addresses_link() {
		myAddressesPage.MyAddressesLink();
	}
	
	@When("user clicks on Add new address button")
	public void user_clicks_on_add_new_address_button() {
		
		myAddressesPage.addAddressesBtnLink();
		Common.pause(3);
	}
	
	
	@When("user enteres Address {string}")
	public void user_enteres_address(String enterAddresses) {
	   
		myAddressesPage.enterAddresses(enterAddresses);;
	}

	@When("user enteres City {string}")
	public void user_enteres_city(String city) {
	   
		myAddressesPage.enterCity(city);
	}

	@When("user enteres State {string}")
	public void user_enteres_state(String state) {
	   
		myAddressesPage.enterState(state);
	}

	@When("user enteres Zip\\/Postal Code {string}")
	public void user_enteres_zip_postal_code(String zip) {
	   
		myAddressesPage.enterPostalCode(zip);
	}

	@When("user enteres Country {string}")
	public void user_enteres_country(String Country) {
	   
		myAddressesPage.enterCountry(Country);
	}

	@When("user enteres Mobile phone Code {string}")
	public void user_enteres_mobile_phone_code(String phone) {
	   
		myAddressesPage.enterphone(phone);
	}

	@When("user enteres Please assign an address title for future reference {string}")
	public void user_enteres_please_assign_an_address_title_for_future_reference(String addresstitle) {
	   
		myAddressesPage.enteraddresstitle(addresstitle);
	}

	@When("user clicks on save new address button")
	public void user_clicks_on_save_new_address_button() {
	   
		myAddressesPage.clickOnSaveAddNewAddress();
	}

	@Then("Verify new address is available or not with a given reference name {string}")
	public void verify_new_address_is_available_or_not_with_a_given_reference_name(String verifytitle) {
		Common.pause(3);
		System.out.println(">>>>>verify"+myAddressesPage.verifyAddressTitilePresent(verifytitle));
	   Assert.assertTrue(myAddressesPage.verifyAddressTitilePresent(verifytitle));
		
	}

	
}
