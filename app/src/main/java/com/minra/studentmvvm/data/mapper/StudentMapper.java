package com.minra.studentmvvm.data.mapper;

import com.minra.studentmvvm.data.model.StudenRemot;
import com.minra.studentmvvm.data.model.Student;

public class StudentMapper
{
    public static Student toDomain(StudenRemot studentRemote) {
        return new Student(studentRemote.getId(), studentRemote.getSname(),
                studentRemote.getAge());
    }
}
