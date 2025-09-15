package com.mdao.cursedev.cursedev.domain

import com.google.gson.annotations.SerializedName
import com.mdao.cursedev.cursedev.ui.models.DataAllCourses
import com.mdao.cursedev.cursedev.ui.models.DataContentCourse

data class GetContentCourse(
    @SerializedName("code") var code: String = "",
    @SerializedName("mensaje") var mensaje: String = "",
    @SerializedName("data") var data: List<DataContentCourse>? = null
)
