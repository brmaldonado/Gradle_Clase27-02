package com.example.curacao.registro.database;

import com.raizlabs.android.dbflow.annotation.Database;

@Database(name = TestDataBase.dbname, version = TestDataBase.dbversion)

public class TestDataBase {
    public static final String dbname = "TestDataBase";
    public static final int dbversion = 1;
}
