package com.bluemoonl.ch16simpleyoutube.service

import com.bluemoonl.ch16simpleyoutube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {
    @GET("/v3/4b905368-03f3-4768-afee-ffca7af00821")
    fun listVideoes(): Call<VideoDto>
}