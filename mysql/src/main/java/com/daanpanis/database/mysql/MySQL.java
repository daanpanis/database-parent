package com.daanpanis.database.mysql;

import com.daanpanis.database.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL implements Database<Connection> {

    private final MySQLConfiguration configuration;
    private Connection connection;

    public MySQL(MySQLConfiguration configuration) {
        this.configuration = configuration;
    }

    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    public void connect() {
        if (this.configuration != null && this.connection == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(
                        "jdbc:mysql://" + configuration.host() + ":" + configuration.port() + "/" + configuration.database()
                                + "?useSSL=true&allowMultiQueries=true&autoReconnect=true", configuration.username(), configuration.password());
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                // TODO Log
            } finally {
                connection = null;
            }
        }
    }

    @Override
    public boolean isConnected() {
        try {
            return connection != null && !connection.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }
}
