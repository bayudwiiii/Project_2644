package com.example.project_2644

class LoginModel {
    //variabel
    var username = ""
    var password = ""

    //method/fc
    fun loginCheck():Boolean {
        if (username.equals("bayu") && password.equals("1")){
            return true
        }else{
            return false
        }
    }
}