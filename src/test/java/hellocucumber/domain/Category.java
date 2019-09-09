package hellocucumber.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {

    @JsonProperty("CategoryId")
    private String categoryId;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Path")
    private String path;

    @JsonProperty("CanListAuctions")
    private Boolean canListAuctions;

    @JsonProperty("CanListClassifieds")
    private Boolean canListClassifieds;

    @JsonProperty("CanRelist")
    private Boolean canRelist;

    @JsonProperty("LegalNotice")
    private String legalNotice;

    @JsonProperty("DefaultDuration")
    private int defaultDuration;

    @JsonProperty("AllowedDurations")
    private List<Integer> allowedDurations = new ArrayList<>();

    @JsonProperty("Fees")
    private Fees fees;

    @JsonProperty("FreePhotoCount")
    private int freePhotoCount;

    @JsonProperty("MaximumPhotoCount")
    private int maximumPhotoCount;

    @JsonProperty("IsFreeToRelist")
    private Boolean isFreeToRelist;

    @JsonProperty("Promotions")
    private List<Promotion> promotions = new ArrayList<>();

    @JsonProperty("EmbeddedContentOptions")
    private List<Object> embeddedContentOptions = new ArrayList<>();

    @JsonProperty("MaximumTitleLength")
    private int maximumTitleLength;

    @JsonProperty("AreaOfBusiness")
    private int areaOfBusiness;

    @JsonProperty("DefaultRelistDuration")
    private int defaultRelistDuration;

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getCanListAuctions() {
        return this.canListAuctions;
    }

    public void setCanListAuctions(Boolean canListAuctions) {
        this.canListAuctions = canListAuctions;
    }

    public Boolean getCanListClassifieds() {
        return this.canListClassifieds;
    }

    public void setCanListClassifieds(Boolean canListClassifieds) {
        this.canListClassifieds = canListClassifieds;
    }

    public Boolean getCanRelist() {
        return this.canRelist;
    }

    public void setCanRelist(Boolean canRelist) {
        this.canRelist = canRelist;
    }

    public String getLegalNotice() {
        return this.legalNotice;
    }

    public void setLegalNotice(String legalNotice) {
        this.legalNotice = legalNotice;
    }

    public int getDefaultDuration() {
        return this.defaultDuration;
    }

    public void setDefaultDuration(int defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    public List<Integer> getAllowedDurations() {
        return this.allowedDurations;
    }

    public void setAllowedDurations(List<Integer> allowedDurations) {
        this.allowedDurations = allowedDurations;
    }

    public Fees getFees() {
        return this.fees;
    }

    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public int getFreePhotoCount() {
        return this.freePhotoCount;
    }

    public void setFreePhotoCount(int freePhotoCount) {
        this.freePhotoCount = freePhotoCount;
    }

    public int getMaximumPhotoCount() {
        return this.maximumPhotoCount;
    }

    public void setMaximumPhotoCount(int maximumPhotoCount) {
        this.maximumPhotoCount = maximumPhotoCount;
    }

    public Boolean getIsFreeToRelist() {
        return this.isFreeToRelist;
    }

    public void setIsFreeToRelist(Boolean isFreeToRelist) {
        this.isFreeToRelist = isFreeToRelist;
    }

    public List<Promotion> getPromotions() {
        return this.promotions;
    }

    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    public List<Object> getEmbeddedContentOptions() {
        return this.embeddedContentOptions;
    }

    public void setEmbeddedContentOptions(List<Object> embeddedContentOptions) {
        this.embeddedContentOptions = embeddedContentOptions;
    }

    public int getMaximumTitleLength() {
        return this.maximumTitleLength;
    }

    public void setMaximumTitleLength(int maximumTitleLength) {
        this.maximumTitleLength = maximumTitleLength;
    }

    public int getAreaOfBusiness() {
        return this.areaOfBusiness;
    }

    public void setAreaOfBusiness(int areaOfBusiness) {
        this.areaOfBusiness = areaOfBusiness;
    }

    public int getDefaultRelistDuration() {
        return this.defaultRelistDuration;
    }

    public void setDefaultRelistDuration(int defaultRelistDuration) {
        this.defaultRelistDuration = defaultRelistDuration;
    }

    @SuppressWarnings("nls")
    @Override
    public String toString() {
        return "Category [categoryId=" + this.categoryId + ", name=" + this.name + ", path=" + this.path
                + ", canListAuctions=" + this.canListAuctions + ", canListClassifieds=" + this.canListClassifieds
                + ", canRelist=" + this.canRelist + ", legalNotice=" + this.legalNotice + ", defaultDuration="
                + this.defaultDuration + ", allowedDurations=" + this.allowedDurations + ", fees=" + this.fees
                + ", freePhotoCount=" + this.freePhotoCount + ", maximumPhotoCount=" + this.maximumPhotoCount
                + ", isFreeToRelist=" + this.isFreeToRelist + ", promotions=" + this.promotions
                + ", embeddedContentOptions=" + this.embeddedContentOptions + ", maximumTitleLength="
                + this.maximumTitleLength + ", areaOfBusiness=" + this.areaOfBusiness + ", defaultRelistDuration="
                + this.defaultRelistDuration + "]";
    }

}
