package q3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class User {
    private String userType;
    private String username;
    private String email;
     String image;
     String about;
     String vkn;

     Set<Advert> favouriteAdverts = new HashSet<>();

     List<Advert> postingAdverts = new ArrayList<>();

     List<Message> messageBox = new ArrayList<>();

    public User(String userType, String username, String email) {
        this.userType = userType;
        this.username = username;
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getVkn() {
        return vkn;
    }

    public void setVkn(String vkn) {
        this.vkn = vkn;
    }

    public Set<Advert> getFavouriteAdverts() {
        return favouriteAdverts;
    }

    public void setFavouriteAdverts(Set<Advert> favouriteAdverts) {
        this.favouriteAdverts = favouriteAdverts;
    }

    public List<Advert> getPostingAdverts() {
        return postingAdverts;
    }

    public void setPostingAdverts(List<Advert> postingAdverts) {
        this.postingAdverts = postingAdverts;
    }

    public List<Message> getMessageBox() {
        return messageBox;
    }

    public void setMessageBox(List<Message> messageBox) {
        this.messageBox = messageBox;
    }
}
