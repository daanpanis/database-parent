package com.daanpanis.database.mysql.query;

public interface SelectFieldsQuery {

    SelectFromQuery from();

    default SelectFromDataQuery from(String table) {
        return from().table(table);
    }

    default SelectFromDataQuery from(String table, String alias) {
        return from().table(table, alias);
    }

}
