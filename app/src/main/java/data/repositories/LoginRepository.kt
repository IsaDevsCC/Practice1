package data.repositories

import android.content.Context
import android.content.SharedPreferences
import data.repositories.model.LoginModel

class LoginRepository {

    private val userTag = "USER"
    private val passwordTag = "PASSWORD"
    private val preferencesTag = "PASSWORD"

    fun getLogin(user : LoginModel, context : Context){
        context.getSharedPreferences(preferencesTag, Context.MODE_PRIVATE).edit()
            .putString(userTag, user.user)
            .putString(passwordTag, user.password)
            .apply()
    }

    fun loadLogin(context : Context) {
        context.getSharedPreferences(preferencesTag, Context.MODE_PRIVATE)
            .apply {

            }
    }
}