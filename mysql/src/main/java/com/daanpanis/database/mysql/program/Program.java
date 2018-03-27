package com.daanpanis.database.mysql.program;

import com.daanpanis.database.mysql.query.QueryBuilder;

public class Program {

    static QueryBuilder builder = () -> null;

    public static void main(String[] args) {
        builder.select().all().from("users");
    }

}
