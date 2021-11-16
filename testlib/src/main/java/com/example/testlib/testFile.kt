package com.example.testlib

import android.content.Context
import android.widget.Toast

public  class testFile {
    object ConnectivityUtils {
        fun testMeth(context: Context, msg: String) {
            Toast.makeText(context,msg, Toast.LENGTH_SHORT).show()
        }
    }
}