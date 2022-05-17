package com.minra.studentmvvm.data.services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class studentService
{
    private static final String URL = "https://demo2458961.mockable.io/";
    private static studentService singleton;
    StudentApi studentapi;

    private studentService() {
        Retrofit mRetrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(URL).build();

        studentapi = mRetrofit.create(StudentApi.class);
    }
    public static studentService getInstance() {
        if (singleton == null) {
            synchronized (studentService.class) {
                if (singleton == null) {
                    singleton = new studentService();
                }
            }
        }
        return singleton;
    }

    public StudentApi getMovieApi() {
        return studentapi;
    }
}
