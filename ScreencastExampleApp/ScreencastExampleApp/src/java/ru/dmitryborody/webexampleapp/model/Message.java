/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.dmitryborody.webexampleapp.model;

import ru.dmitryborody.webexampleapp.model.User;

/**
 *
 * @author Dmitry
 */
public interface Message {
    User getFrom();
    User getTo();
    String getMessage();
    
    void setMessage(String message);
    void setTo(User to);
    void setFrom(User from);
}
