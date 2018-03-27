package com.daanpanis.database;

public interface Database<T> {

    T getConnection();

    void connect();

    void disconnect();

    boolean isConnected();

}
