package com.mkraskiewicz.springframework.beans;

/**
 * Created by Maciej on 09/04/2018
 */
public class UserBean {

    private String username;
    private String password;
    private String url;

    public UserBean(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    @Override
    public String toString(){
        return String.format("Username: %s, Password: %s, url: %s", username,password,url);
    }
}
