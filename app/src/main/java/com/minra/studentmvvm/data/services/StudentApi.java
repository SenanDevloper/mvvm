package com.minra.studentmvvm.data.services;

import com.minra.studentmvvm.data.repository.student.studentRepository;

import retrofit2.Call;
import retrofit2.http.GET;

public interface StudentApi {
    @GET("movies/")
    Call<studentRepository> getMovies();
}
