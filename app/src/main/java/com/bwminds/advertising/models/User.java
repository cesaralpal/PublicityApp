package com.bwminds.advertising.models;


import com.google.firebase.database.IgnoreExtraProperties;

// [START blog_user_class]
@IgnoreExtraProperties
public class User {

    public String username;
    public String email;
    public String hora;
    public String clientName;
    public String clientMail;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email, String hora, String clientName, String clientMail) {
        this.username = username;
        this.email = email;
        this.hora=hora;
        this.clientName=clientName;
        this.clientMail=clientMail;
    }

}
// [END blog_user_class]