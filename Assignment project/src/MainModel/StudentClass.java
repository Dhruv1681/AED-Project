/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainModel;

/**
 *
 * @author dipenpatel
 */
public class StudentClass {
    private String FirstName;
    private String LastName;
    private String ContactDetails;
    private String UserID;
    private String Password;
    private String NEUID;
    private String EmailId;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getContactDetails() {
        return ContactDetails;
    }

    public void setContactDetails(String ContactDetails) {
        this.ContactDetails = ContactDetails;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNEUID() {
        return NEUID;
    }

    public void setNEUID(String NEUID) {
        this.NEUID = NEUID;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }
    @Override
    public String toString(){
       return FirstName; 
    }
}
