/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.dmitryborody.webexampleapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dmitry
 */
public class Registry {
    private List<User> users;
    
    private static volatile Registry instance;
    
    private Registry() {
        users = new ArrayList<>();
        User u1 = new UserImpl("Alex", "a@b.com", "abc", "alex.jpg");
        User u2 = new UserImpl("Chuck", "c@b.com", "abc", "chuck.jpg", u1);
        u1.becomeFriends(u2);
        users.add(u1);
        users.add(u2);
        u2.sendMessage("Alex! Hi from Chuck!", u1);
    }

    public List<User> getUsers() {
        return users;
    }
    
    public static Registry getInstance() {
        if (instance == null) {
            synchronized (Registry.class) {
                if (instance == null) 
                    instance = new Registry();
            }
        }
        return instance;
    }
}
