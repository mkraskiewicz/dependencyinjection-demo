package com.mkraskiewicz.springframework.beans;

/**
 * Created by Maciej on 12/04/2018
 */
public class JmsUserBean {

    private String username;
    private String password;
    private String url;

    public JmsUserBean(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    @Override
    public String toString(){
        return String.format("JMS Username: %s, Password: %s, url: %s", username,password,url);
    }
}
