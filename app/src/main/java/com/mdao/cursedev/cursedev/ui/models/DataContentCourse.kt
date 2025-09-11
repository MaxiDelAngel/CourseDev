package com.mdao.cursedev.cursedev.ui.models

import com.google.gson.annotations.SerializedName

data class DataContentCourse(
    @SerializedName("id") val content_id: Int,
    @SerializedName("title") val content_title: String,
    @SerializedName("code") val content_code: String,
    @SerializedName("content") val content_content: String,
    @SerializedName("course_id") val content_course_id: Int,
)
