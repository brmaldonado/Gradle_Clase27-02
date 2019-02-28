package com.example.curacao.registro.database.Models;

import com.example.curacao.registro.database.TestDataBase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = TestDataBase.class)
public class TestModel extends BaseModel {

    @Column
    @PrimaryKey(autoincrement = true)
    public long id;

    @Column
    public String name;

    @Column
    public String last_name;




}
