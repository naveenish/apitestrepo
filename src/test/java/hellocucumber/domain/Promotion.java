package hellocucumber.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Promotion {

    @JsonProperty("Id")
    private int id;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Price")
    private double price;

    @JsonProperty("MinimumPhotoCount")
    private int minimumPhotoCount;

    @JsonProperty("OriginalPrice")
    private double originalPrice;

    @JsonProperty("Recommended")
    private boolean recommended;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMinimumPhotoCount() {
        return this.minimumPhotoCount;
    }

    public void setMinimumPhotoCount(int minimumPhotoCount) {
        this.minimumPhotoCount = minimumPhotoCount;
    }

    public double getOriginalPrice() {
        return this.originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public boolean isRecommended() {
        return this.recommended;
    }

    public void setRecommended(boolean recommended) {
        this.recommended = recommended;
    }

    @SuppressWarnings("nls")
    @Override
    public String toString() {
        return "Promotion [id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", price="
                + this.price + ", minimumPhotoCount=" + this.minimumPhotoCount + "]";
    }

}
