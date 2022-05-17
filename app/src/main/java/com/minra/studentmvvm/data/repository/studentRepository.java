package com.minra.studentmvvm.data.repository;

import androidx.lifecycle.MutableLiveData;

import com.minra.studentmvvm.data.model.Student;

import java.util.ArrayList;
import java.util.List;

public class studentRepository {
    static studentRepository myinstance;
    private ArrayList<Student> dataSet = new ArrayList<>();

    public static studentRepository getinstance() {
        if (myinstance == null) {
            myinstance = new studentRepository();
        }
        return myinstance;
    }

    // Pretend to get data from a webservice or online source
    public MutableLiveData<List<Student>> getStudents() {
        SetStudents();
        MutableLiveData<List<Student>> data = new MutableLiveData<>();
        data.setValue(dataSet);
        return data;
    }



    void SetStudents() {
        dataSet.add(new Student(1, "mohammed", 19, "https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg"));
        dataSet.add(new Student(2, "Ali", 34, "https://i.redd.it/tpsnoz5bzo501.jpg"));
        dataSet.add(new Student(3, "Saleh", 20, "https://i.redd.it/qn7f9oqu7o501.jpg"));
        dataSet.add(new Student(4, "Hussain", 22, "https://i.redd.it/j6myfqglup501.jpg"));
        dataSet.add(new Student(5, "Jabreel", 32, "https://i.redd.it/0h2gm1ix6p501.jpg"));
        dataSet.add(new Student(6, "Kasem", 33, "https://i.redd.it/0h2gm1ix6p501.jpg"));
        dataSet.add(new Student(7, "asil", 33, "https://i.redd.it/0h2gm1ix6p501.jpg"));
        dataSet.add(new Student(8, "hameed", 33, "https://i.redd.it/0h2gm1ix6p501.jpg"));
        dataSet.add(new Student(9, "yaser", 33, "https://i.redd.it/0h2gm1ix6p501.jpg"));
    }

}
