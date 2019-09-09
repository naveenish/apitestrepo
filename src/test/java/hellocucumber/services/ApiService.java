package hellocucumber.services;

import hellocucumber.domain.ApiResponse;

public interface ApiService {

	/**
	 * Gets the category details.
	 *
	 * @param categoryId the category id
	 * @param catalogue the catalogue
	 * @return the category details
	 */
    ApiResponse getCategoryDetails(String categoryId, Boolean catalogue);
}
