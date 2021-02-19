package com.example.appgestionstock;

public class Constants {
    // db name
    public static final String DB_Name = "myDB";
    // db version
    public static final int DB_VERSION = 1;
    // create Article table
    //db table
    public static final String TABLE1 = "ARTICLE";
    //table columns
    public static final String A_ID = "ID";
    public static final String A_LABEL = "LABEL";
    public static  final String A_QTE = "QUANTITY";
    // create query for table
    public static final String CREATE_TABLE1 = "CREATE TABLE " + TABLE1 + " ("
            + A_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + A_LABEL + " TEXT,"
            + A_QTE + " TEXT,"
            + ");";

    //////////////////////////////////////////////////////////////////////


    // create operation table
    // db table
    public static final String TABLE2 = "OPERATION";
    //table columns
    public static final String O_ID = "ID";
    public static final String O_A_ID = "A_ID";
    public static final String O_QTE = "QUANTITY";
    public static final String O_ADD_TIMESTAMP = "ADD_TIMESTAMP";

    public static final String CREATE_TABLE2 = "CREATE TABLE " + TABLE2 + " ("
            + O_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + O_QTE + " TEXT,"
            + O_ADD_TIMESTAMP + " TEXT,"
            + O_A_ID + " INTEGER,"
            + " FOREIGN KEY ("+ O_A_ID +") REFERENCES "+ TABLE1 +"("+ A_ID +")"
            + ");";

}
