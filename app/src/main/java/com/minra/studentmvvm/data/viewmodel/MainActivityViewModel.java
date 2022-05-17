package com.minra.studentmvvm.data.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.minra.studentmvvm.data.model.Student;
import com.minra.studentmvvm.data.repository.studentRepository;

import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<List<Student>> mStudents;
    private MutableLiveData<Boolean> mIsUpdating = new MutableLiveData<>();

//mainvo s
    private studentRepository mRepo;

    public void init() {
        if(mStudents != null){
            return;
        }
        mRepo = studentRepository.getinstance();
        mStudents = mRepo.getStudents();
    }
    public void add_student() {
        mIsUpdating.postValue(true);
        List<Student> currentPlaces = mStudents.getValue();

        mStudents.getValue().add(new Student(1, "newmohammed", 19, "https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg"));
        mIsUpdating.postValue(false);
    }

    public LiveData<List<Student>> getNicePlaces(){
        return mStudents;
    }

    public LiveData<Boolean> get_is_update(){
        return mIsUpdating;
    }
}
