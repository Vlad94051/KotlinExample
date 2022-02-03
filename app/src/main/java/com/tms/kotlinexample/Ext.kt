package com.tms.kotlinexample

import android.app.Activity
import android.widget.Toast

fun Activity.showToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun String.removeLast(): String {
    return substring(0, length - 2)
}

fun <T> List<T>.deleteOdd(): List<T> {
    val newList = mutableListOf<T>()

    forEachIndexed { index, item ->
        if(index % 2 != 0) newList.add(item)
    }

    return newList
}

