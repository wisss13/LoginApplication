package tn.com.wihraiech.loginapplication.server;

import tn.com.wihraiech.loginapplication.model.User;

/**
 * Created by lenovo on 16/08/2016.
 */
public class ServerResponse {

    private String result;
    private String message;
    private User user;

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
