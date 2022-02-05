package q3;

import java.util.Date;

public class Message {
    String title;
    String content;
    Date sendDate;
    Date readDate;
    boolean isSeen;
    User sender;
    User recipient;

    public Message(String title) {
        this.title = title;
    }
}
