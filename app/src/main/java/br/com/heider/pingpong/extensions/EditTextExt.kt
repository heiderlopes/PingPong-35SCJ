package br.com.heider.pingpong.extensions

import android.widget.EditText

fun EditText.value() = this.text.toString()