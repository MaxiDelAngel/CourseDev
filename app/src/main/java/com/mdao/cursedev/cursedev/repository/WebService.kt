package com.mdao.cursedev.cursedev.repository
import com.mdao.cursedev.cursedev.domain.GetAllCourses
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
interface WebService {

    @GET("/get_all_courses")
    suspend fun getAllCourses(): Response<GetAllCourses>

    @GET("/get_course_content/")
    suspend fun getContentCourse(
        @Query("course_id") course_id: Int
    ): Response<GetAllCourses>
}