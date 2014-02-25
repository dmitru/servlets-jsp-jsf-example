/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.dmitryborody.webexampleapp.model;

import ru.dmitryborody.webexampleapp.model.Registry;
import ru.dmitryborody.webexampleapp.model.User;

/**
 *
 * @author Dmitry
 */
public class LoginBean {
    String name;
    String password;
    User me;
    
    public LoginBean() {
    }
    
    public boolean login() {
        for (User u : Registry.getInstance().getUsers()) {
            if (u.getName().equals(name)) {
                if (u.getPassword().equals(password)) {
                    me = u;
                    return true;
                }
            } 
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getMe() {
        return me;
    }

    public void setMe(User me) {
        this.me = me;
    }
}
