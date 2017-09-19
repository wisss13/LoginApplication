package tn.com.wihraiech.loginapplication.server;

import tn.com.wihraiech.loginapplication.model.User;

/**
 * Created by lenovo on 16/08/2016.
 */
public class ServerRequest {

    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
