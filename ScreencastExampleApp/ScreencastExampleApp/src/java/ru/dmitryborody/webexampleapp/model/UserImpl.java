/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.dmitryborody.webexampleapp.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Dmitry
 */
public class UserImpl implements User {

   private String name;
   private String email;
   private String password;
   private String avatar;
   
   private List<User> friends;
   private List<Message> messages;

    public UserImpl(String name, String email, String password, String avatar, User ... friends) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.messages = new ArrayList<Message>();
        this.friends = new ArrayList<User>(Arrays.asList(friends));
        this.messages.add(new MessageImpl("Welcome aboard!", this, this));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String getAvatar() {
        return this.avatar;
    }

    @Override
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public void sendMessage(String msg, User to) {
        to.getMessages().add(new MessageImpl(msg, to, this));
    }

    @Override
    public void becomeFriends(User user) {
        this.friends.add(user);
    }
    
}
