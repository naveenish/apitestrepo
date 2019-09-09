package hellocucumber.steps;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hellocucumber.BaseTest;
import hellocucumber.domain.ApiResponse;
import hellocucumber.domain.Category;
import hellocucumber.domain.Promotion;
import hellocucumber.services.ApiService;

@SuppressWarnings("nls")
public class StepDefinitions extends BaseTest {

    private @Autowired ApiService apiService;

    @When("^retrieve category details by id \"([^\"]*)\" and catalogue \"([^\"]*)\"$")
    public void retrieve_category_details_by_id_and_catalogue(String categoryId, String catalogue) throws Throwable {

        if (!StringUtils.hasText(categoryId)) {
            throw new IllegalArgumentException("Category cannot be empty.");
        }
        if (!StringUtils.hasText(catalogue)) {
            throw new IllegalArgumentException("Catalogue cannot be empty.");
        } else if (!"true".equalsIgnoreCase(catalogue) && !"false".equalsIgnoreCase(catalogue)) {
            throw new IllegalArgumentException("Catalogue should be true or false.");
        }

        ApiResponse apiResponse = this.apiService.getCategoryDetails(categoryId,
                Boolean.valueOf(catalogue.toLowerCase()));
        this.propertyHolder.put("categoryAPIResponse", apiResponse.getCategory());
        this.propertyHolder.put("categoryAPIResponseStatus", Integer.valueOf(apiResponse.getHttpStatusCode()));

    }

    @Then("^the response status code is (\\d+)$")
    public void the_response_status_code_is(int statusCode) throws Throwable {
        Integer httpStatus = this.propertyHolder.get("categoryAPIResponseStatus", Integer.class);
        assertNotNull("Http status should not be null:", httpStatus);
        assertThat("Validating http status code:", httpStatus, is(Integer.valueOf(statusCode)));
    }

    @Then("^category name is \"([^\"]*)\"$")
    public void category_name_is(String categoryName) throws Throwable {
        Category category = this.propertyHolder.get("categoryAPIResponse", Category.class);
        assertNotNull("Category should not be null:", category);
        assertThat("Validating Category Name:", category.getName(), is(categoryName));
    }

    @Then("^can relist is \"([^\"]*)\"$")
    public void can_relist_is(String canRelist) throws Throwable {
        if (!"true".equalsIgnoreCase(canRelist) && !"false".equalsIgnoreCase(canRelist)) {
            throw new IllegalArgumentException("canRelist should be true or false.");
        }
        Category category = this.propertyHolder.get("categoryAPIResponse", Category.class);
        assertNotNull("Category should not be null:", category);
        assertThat("Validating Can Relist:", category.getCanRelist(), is(Boolean.valueOf(canRelist.toLowerCase())));
    }

    @Then("^promotion name is \"([^\"]*)\" and descrption should contains \"([^\"]*)\"$")
    public void promotion_name_is_and_descrption_should_contains(String promotionName, String descrption)
            throws Throwable {
        Category category = this.propertyHolder.get("categoryAPIResponse", Category.class);
        assertNotNull("Category should not be null:", category);
        assertNotNull("Promotions should not be null:", category.getPromotions());
        assertTrue("Promotions list should not be empty:", category.getPromotions().size() > 0);
        for (Promotion promotion : category.getPromotions()) {
            if (promotionName.equals(promotion.getName())) {
                assertThat("Validating Promotion Description:", promotion.getDescription(), containsString(descrption));
            }
        }

    }

}
