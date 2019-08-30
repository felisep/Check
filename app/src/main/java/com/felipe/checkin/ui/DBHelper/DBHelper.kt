package com.felipe.checkin.ui.DBHelper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelp
    class DBHelper(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VER){

        companion object{
            private val DATABASE_VER = 1
            private val DATABASE_NAME = "EDMTDB.db"

            //TABLE
            private val TABLE_ID = "Id"
            private val TABLE_DATE = "Date"
            private val TABLE_TIME = "Time"
            private val TABLE_HOURS = "Hours"
        }

        override fun onCreate(db: SQLiteDatabase?) {
            val CREATE_TABLE_QUERY: String = ("CREATE TABLE " + TABLE_ID + "(" + "$TABLE_DATE: TEXT"
                    + "$TABLE_DATE: INTEGER PRIMARY KEY" + "$TABLE_TIME: INTEGER" + "$TABLE_HOURS: TEXT")
        }

        override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

        }

    }