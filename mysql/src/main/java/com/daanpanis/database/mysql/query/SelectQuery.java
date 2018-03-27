package com.daanpanis.database.mysql.query;

public interface SelectQuery {

    SelectFieldsQuery fields(String... fields);

    default SelectFieldsQuery all() {
        return fields("*");
    }
}
