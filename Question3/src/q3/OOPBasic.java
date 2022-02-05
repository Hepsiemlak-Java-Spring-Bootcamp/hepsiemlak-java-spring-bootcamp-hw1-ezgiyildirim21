package q3;

import java.util.ArrayList;
import java.util.List;

public class OOPBasic {

    public static void main(String[] args) {
        User user1 = new User("Individual", "Admin", "admin06@gmail.com");
        user1.messageBox = prepareMessageBox();
        User user2 = new User("Individual", "Ali", "ali06@gmail.com");
        user2.messageBox = prepareMessageBox();
        User user3 = new User("Individual", "Ayşe", "ayse.sari@gmail.com");
        user3.messageBox = prepareMessageBox();
        User user4 = new User("Individual", "Ahmet", "ahmet06@gmail.com");
        user4.messageBox = prepareMessageBox();

        List<Advert> advertList = new ArrayList<>();
        advertList.add(prepareAdvert("Urgent sale by owner", user1));
        advertList.add(prepareAdvert("Urgent! Sale!", user2));
        advertList.add(prepareAdvert("Last house available", user3));
        advertList.add(prepareAdvert("Litter free grapes", user4));

    }

    private static List<Message> prepareMessageBox() {
        List<Message> messageBox = new ArrayList<>();
        messageBox.add(new Message("title1"));
        messageBox.add(new Message("attempt"));
        messageBox.add(new Message("hello"));
        return messageBox;
    }

    private static Advert prepareAdvert(String title, User user) {
        Advert advert = new Advert();
        advert.setTitle(title);
        advert.setRealEstate(makeRealEstate());

        advert.setUser(user);
        advert.setActive(true);
        advert.setImageList(makeImageList());
        for (Message message: user.getMessageBox())
        {
            System.out.println(message.title);

        }
        return advert;
    }

    private static String[] makeImageList() {
        String[] imageList = new String[5];
        imageList[0] = "https://hecdnw01.hemlak.com/ds01/7/8/5/2/2/9/7/3/00543bfe-ce9b-4e67-b9e2-c001c506fbd9.jpg";
        imageList[1] = "https://hecdnw01.hemlak.com/ds01/7/8/5/2/2/9/7/3/12355f18-b7d9-4028-9c2d-f30e33535574.jpg";
        return imageList;
    }

    private static RealEstate makeRealEstate() {
        return new RealEstate();
    }
}
