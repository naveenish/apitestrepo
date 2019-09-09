package hellocucumber.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fees {

    @JsonProperty("Bundle")
    private double bundle;

    @JsonProperty("EndDate")
    private double endDate;

    @JsonProperty("Feature")
    private double feature;

    @JsonProperty("Gallery")
    private double gallery;

    @JsonProperty("Listing")
    private double listing;

    @JsonProperty("Reserve")
    private double reserve;

    @JsonProperty("Subtitle")
    private double subtitle;

    @JsonProperty("TenDays")
    private double tenDays;

    @JsonProperty("SecondCategory")
    private double secondCategory;

    @JsonProperty("ListingFeeTiers")
    private List<ListingFeeTiers> listingFeeTiers = new ArrayList<>();

    public double getBundle() {
        return this.bundle;
    }

    public void setBundle(double bundle) {
        this.bundle = bundle;
    }

    public double getEndDate() {
        return this.endDate;
    }

    public void setEndDate(double endDate) {
        this.endDate = endDate;
    }

    public double getFeature() {
        return this.feature;
    }

    public void setFeature(double feature) {
        this.feature = feature;
    }

    public double getGallery() {
        return this.gallery;
    }

    public void setGallery(double gallery) {
        this.gallery = gallery;
    }

    public double getListing() {
        return this.listing;
    }

    public void setListing(double listing) {
        this.listing = listing;
    }

    public double getReserve() {
        return this.reserve;
    }

    public void setReserve(double reserve) {
        this.reserve = reserve;
    }

    public double getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(double subtitle) {
        this.subtitle = subtitle;
    }

    public double getTenDays() {
        return this.tenDays;
    }

    public void setTenDays(double tendays) {
        this.tenDays = tendays;
    }

    public double getSecondCategory() {
        return this.secondCategory;
    }

    public void setSecondCategory(double secondCategory) {
        this.secondCategory = secondCategory;
    }

    public List<ListingFeeTiers> getListingFeeTiers() {
        return this.listingFeeTiers;
    }

    public void setListingFeeTiers(List<ListingFeeTiers> listingFeeTiers) {
        this.listingFeeTiers = listingFeeTiers;
    }

    @SuppressWarnings("nls")
    @Override
    public String toString() {
        return "Fees [bundle=" + this.bundle + ", endDate=" + this.endDate + ", feature=" + this.feature + ", gallery="
                + this.gallery + ", listing=" + this.listing + ", reserve=" + this.reserve + ", subtitle="
                + this.subtitle + ", tendays=" + this.tenDays + ", secondCategory=" + this.secondCategory
                + ", listingFeeTiers=" + this.listingFeeTiers + "]";
    }

}
