package com.daanpanis.database.mysql.query;

public interface SelectFromQuery {

    SelectFromDataQuery table(String table, String alias);

    default SelectFromDataQuery table(String table) {
        return table(table, null);
    }

}
