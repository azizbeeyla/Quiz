package com.example.application

import android.content.Context
import android.content.SharedPreferences

class datastorage {


    val name="REGISTAR"
    val FULL_NAME_KEY="FULL_NAME"
    val USERNAME_KEY="USER_NAME"
    val PASSWORD_KEY="PASSWORD"
    val LOGIN_KEY="LOGIn"

    fun saveToSharedPreferences(context: Context,key:String,value: String){

        val sharedPreferences=context.getSharedPreferences(name,Context.MODE_PRIVATE)
        val edit=sharedPreferences.edit()
        edit.putString(key,value)
        edit.apply()
    }


    fun readToSharedPreferences(context: Context,key: String):String{


        val sharedPreferences=context.getSharedPreferences(name,Context.MODE_PRIVATE)
        return sharedPreferences.getString(key,"")?:""
    }
}