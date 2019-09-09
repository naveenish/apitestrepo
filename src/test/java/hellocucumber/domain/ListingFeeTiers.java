package hellocucumber.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListingFeeTiers {

    @JsonProperty("MinimumTierPrice")
    private double minimumTierPrice;

    @JsonProperty("FixedFee")
    private double fixedFee;

    public double getMinimumTierPrice() {
        return this.minimumTierPrice;
    }

    public double getFixedFee() {
        return this.fixedFee;
    }

    public void setFixedFee(double fixedFee) {
        this.fixedFee = fixedFee;
    }

    public void setMinimumTierPrice(double minimumTierPrice) {
        this.minimumTierPrice = minimumTierPrice;
    }

    @SuppressWarnings("nls")
    @Override
    public String toString() {
        return "ListingFeeTiers [minimumTierPrice=" + this.minimumTierPrice + ", FixedFee=" + this.fixedFee + "]";
    }

}
