package stepsDefination;

import org.junit.Assert;

import AmazoneImplementation.Product;
import AmazoneImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	Product product;
	
	Search search;
	
	@Given("I have Search field on Amazon Page")
	public void i_have_search_field_on_amazon_page() {
	    System.out.println("step 1: I am on Serach Page");
	    
	    
	}

	@When("I searched for a product with name {string} and Price {int}")
	public void i_searched_for_a_product_with_name_and_price(String productName, Integer price) {
	   System.out.println("Step 2 : Search product Name : " +productName +" and its price : " +price);
	   
	   product = new Product(productName,price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3 :  product Name : " +productName +" is displayed");
		
		search = new Search();
		String name=search.displayProduct(product);
		
		System.out.println("Searched product is :" +name);
		
	//	Assert.assertEquals(product.getProductName(), name);
	
	}

}
