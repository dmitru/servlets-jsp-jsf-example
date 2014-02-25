/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.dmitryborody.webexampleapp.model;

import ru.dmitryborody.webexampleapp.model.Message;
import java.util.List;

/**
 *
 * @author Dmitry
 */
public interface User {
    String getEmail();
    String getName();
    String getPassword();
    String getAvatar();
    
    void setEmail(String email);
    void setName(String name);
    void setPassword(String password);
    void setAvatar(String avatar);
    
    List<User> getFriends();
    List<Message> getMessages();
    void sendMessage(String msg, User to);
    void becomeFriends(User user);
}
