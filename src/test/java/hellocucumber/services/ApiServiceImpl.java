package hellocucumber.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import hellocucumber.domain.ApiResponse;
import hellocucumber.domain.Category;

@Service
public class ApiServiceImpl implements ApiService {

    private Logger logger = LoggerFactory.getLogger(ApiServiceImpl.class);

    @Value("${apiUrl}")
    private String apiUrl;

    private @Autowired RestTemplate restTemplate;

    @Override
    public ApiResponse getCategoryDetails(String categoryId, Boolean catalogue) {

        try {
            Category category = this.restTemplate.getForObject(this.apiUrl, Category.class, categoryId, catalogue);
            return new ApiResponse(category, HttpStatus.OK);
        } catch (HttpClientErrorException e) {
            this.logger.error(e.getMessage(), e);
            return new ApiResponse(e.getStatusCode());
        } catch (Exception e) {
            this.logger.error(e.getMessage(), e);
            return new ApiResponse(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
