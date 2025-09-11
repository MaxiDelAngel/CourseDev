package com.mdao.cursedev.cursedev.domain

import com.google.gson.annotations.SerializedName
import com.mdao.cursedev.cursedev.ui.models.DataAllCourses

data class GetAllCourses(
    @SerializedName("code") var code: String = "",
    @SerializedName("mensaje") var mensaje: String = "",
    @SerializedName("data") var data: DataAllCourses? = null
)
