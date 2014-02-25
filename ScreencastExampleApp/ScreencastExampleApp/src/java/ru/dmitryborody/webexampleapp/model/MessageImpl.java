/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ru.dmitryborody.webexampleapp.model;

/**
 *
 * @author Dmitry
 */
public class MessageImpl implements Message {
    private String message;
    private User to;
    private User from;

    public MessageImpl(String message, User to, User from) {
        this.message = message;
        this.to = to;
        this.from = from;
    }
    
    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public User getTo() {
        return to;
    }

    @Override
    public void setTo(User to) {
        this.to = to;
    }

    @Override
    public User getFrom() {
        return from;
    }

    @Override
    public void setFrom(User from) {
        this.from = from;
    }
}
