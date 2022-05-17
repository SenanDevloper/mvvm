package com.minra.studentmvvm.data.repository.student;

import com.minra.studentmvvm.data.model.Student;

import java.util.List;

/**
 * Created by Mohammed Senan on 05/04/2021
 */
public interface studentRepository {

    interface LoadStudentsCallback {
        void onStudentsLoaded(List<Student> movies);
        void onDataNotAvailable();
        void onError();
    }

    void getStudents(LoadStudentsCallback callback);
    void saveStudents(List<Student> movies);
}
