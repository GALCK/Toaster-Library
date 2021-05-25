package com.exampl.toasterlibrary

import android.content.Context
import android.widget.Toast


/**
 * Created by Gal Kohen on 25/05/2021.
 */
class ToasterMessage {
    companion object {
        @JvmStatic
        fun s(c: Context?, message: String?) {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
        }
    }
}