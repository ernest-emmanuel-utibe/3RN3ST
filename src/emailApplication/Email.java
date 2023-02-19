package emailApplication;
import java.time.LocalDateTime;

public class Email {

    private LocalDateTime date;
    private String body;
    private Sender sender;
    private Receiver receiver;

    public Email(String body, Sender sender, Receiver receiver) {
        this.date = LocalDateTime.now();
        this.body = body;
        this.sender = sender;
        this.receiver = receiver;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = LocalDateTime.now();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    //    private User currentUser;
//
//    public boolean login(String username, String password) {
//        for (User user : users) {
//            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
//                currentUser = user;
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public void createUser(String username, String password) {
//        User user = new User(username, password);
//        users.add(user);
//    }
//
//    public void sendEmail(Email email) {
//
//    }
}

