package studentManagementSystem;

public class Record {
    private String name;
    private int idNumber;
    private int contactNumber;
    private String emailAddress;
    private String homeAddress;

    public Record() {}

    public Record(String name, int idNumber, int contactNumber, String emailAddress, String homeAddress) {
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.homeAddress = homeAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String toString() {
        return
                "RECORDS:/n" +
                "##################################/n" +
                "Name: " + name +
                "/n" +
                "--------------------------------------/n" +
                "id-number: " + idNumber +
                "/n" +
                "--------------------------------------/n" +
                "contact-number: " + contactNumber +
                "/n" +
                "--------------------------------------/n" +
                "email-address: " + emailAddress +
                "/n" +
                "--------------------------------------/n" +
                "home-address: " + homeAddress +
                "/n" +
                "#######################################/n";
    }
}
