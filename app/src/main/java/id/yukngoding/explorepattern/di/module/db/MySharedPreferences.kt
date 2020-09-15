package id.yukngoding.explorepattern.di.module.db

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

class MySharedPreferences(context: Context) {

    private var mSharedPreferences: SharedPreferences =
        PreferenceManager.getDefaultSharedPreferences(context)

    fun putData(key: String, data: String) {
        mSharedPreferences.edit().putString(key, data).apply()
    }

    fun getData(key: String): String? {
        return mSharedPreferences.getString(key, "Data kosong")
    }

}