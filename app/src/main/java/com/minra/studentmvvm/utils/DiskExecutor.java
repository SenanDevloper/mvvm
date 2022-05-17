package com.minra.studentmvvm.utils;


import androidx.annotation.NonNull;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Mohammed Senanon 31/03/2022.
 */
public class DiskExecutor implements Executor {

    private final Executor diskExecutor;

    public DiskExecutor() {
        this.diskExecutor = Executors.newSingleThreadExecutor();
    }

    @Override
    public void execute(@NonNull Runnable runnable) {
        diskExecutor.execute(runnable);
    }
}
