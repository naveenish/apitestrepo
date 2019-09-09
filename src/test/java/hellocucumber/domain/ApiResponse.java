package hellocucumber.domain;

import org.springframework.http.HttpStatus;

public class ApiResponse {

    private Category category;

    private int httpStatusCode;

    public ApiResponse(HttpStatus httpStatus) {
        super();
        this.httpStatusCode = httpStatus.value();
    }

    public ApiResponse(Category category, HttpStatus httpStatus) {
        super();
        this.category = category;
        this.httpStatusCode = httpStatus.value();
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    @SuppressWarnings("nls")
    @Override
    public String toString() {
        return "ApiResponse [category=" + this.category + ", httpStatusCode=" + this.httpStatusCode + "]";
    }

}
