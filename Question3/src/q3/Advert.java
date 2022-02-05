package q3;

import java.math.BigDecimal;
import java.util.Date;

public class Advert {

    private RealEstate realEstate;
    private String title;
    private User user;        // individual - corporate
    private String[] imageList = new String[5];
    private BigDecimal price;
    private int time;
    private boolean isFeature = false;
    private boolean isReviewed = false;
    private Date postingDate;
    private boolean isActive;


    public Advert(){

    }

    public Advert(RealEstate realEstate, User user, String[] imageList){
        this.realEstate = realEstate;
        this.user = user;
        this.imageList = imageList;
    }

    public Advert(RealEstate realEstate, String title, User user, String[] imageList, BigDecimal price, int time, boolean isFeature, boolean isReviewed, Date postingDate, boolean isActive) {
        this.realEstate = realEstate;
        this.title = title;
        this.user = user;
        this.imageList = imageList;
        this.price = price;
        this.time = time;
        this.isFeature = isFeature;
        this.isReviewed = isReviewed;
        this.postingDate = postingDate;
        this.isActive = isActive;
    }

    public RealEstate getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(RealEstate realEstate) {
        this.realEstate = realEstate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String[] getImageList() {
        return imageList;
    }

    public void setImageList(String[] imageList) {
        this.imageList = imageList;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public boolean isFeature() {
        return isFeature;
    }

    public void setFeature(boolean feature) {
        isFeature = feature;
    }

    public boolean isReviewed() {
        return isReviewed;
    }

    public void setReviewed(boolean reviewed) {
        isReviewed = reviewed;
    }

    public Date getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(Date postingDate) {
        this.postingDate = postingDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
