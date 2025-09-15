package com.mdao.cursedev.cursedev.ui.models

import com.google.gson.annotations.SerializedName

data class DataAllCourses(
    @SerializedName("id") val course_id: Int,
    @SerializedName("name") val course_name: String,
    @SerializedName("imagen") var imagen: String,
    @SerializedName("bandera") val course_bandera: Int,
    @SerializedName("status") val course_status: String,
    @SerializedName("conceptos") val course_conceptos: Int,
    @SerializedName("progress") val course_progreso: Float
)
