/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.dmitryborody.webexampleapp.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import ru.dmitryborody.webexampleapp.model.Registry;
import ru.dmitryborody.webexampleapp.model.User;

/**
 *
 * @author Dmitry
 */
@ManagedBean
@SessionScoped
public class LoginBean {
    String name;
    String password;
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
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
    
    public String loginJsf() {
        for (User u : Registry.getInstance().getUsers()) {
            if (u.getName().equals(name)) {
                if (u.getPassword().equals(password)) {
                    me = u;
                    return "profile.xhtml";
                }
            } 
        }
        return "login.xhtml";
    }
    
    public void sendMessage(User to) {
        me.sendMessage(message, to);
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
