package com.rahul.ghanghave.chaton.Models;

public class User {

    String profilepic,userName,mail,passward,userID,lastMessage,status;

    public User(String profilepic, String userName, String mail, String passward, String userID, String lastMessage,String status) {
        this.profilepic = profilepic;
        this.userName = userName;
        this.mail = mail;
        this.passward = passward;
        this.userID = userID;
        this.lastMessage = lastMessage;
        this.status = status;
    }



    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public User(){}

    //SignUp Constructor


    public User(String userName, String mail, String passward) {
        this.userName = userName;
        this.mail = mail;
        this.passward = passward;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

}
