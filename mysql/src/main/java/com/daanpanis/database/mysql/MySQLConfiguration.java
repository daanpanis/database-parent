package com.daanpanis.database.mysql;

public class MySQLConfiguration {

    private final String host;
    private final int port;
    private final String username;
    private final String password;
    private final String database;

    public MySQLConfiguration(String host, int port, String username, String password, String database) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.database = database;
    }

    public String host() {
        return host;
    }

    public int port() {
        return this.port;
    }

    public String username() {
        return this.username;
    }

    public String password() {
        return password;
    }

    public String database() {
        return database;
    }


}
