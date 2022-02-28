package com.bluemoonl.ch16simpleyoutube.service

import com.bluemoonl.ch16simpleyoutube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("/v3/5acce72f-1222-4dbc-a023-b2d8ee8523da")
    fun listVideoes(): Call<VideoDto>
}
