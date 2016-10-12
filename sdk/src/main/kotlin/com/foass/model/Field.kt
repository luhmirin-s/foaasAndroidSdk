package com.foass.model

data class Field(val name: String, val field: String, var value: String?) {

    val fieldToken = ':' + field
    val encodedValue = value?.replace(" ", "%20") ?: ""

}