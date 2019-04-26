package com.mithun.carnumberreader;

import android.app.Application;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;

public class VehicleNumberReaderApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (OpenCVLoader.initDebug()) {
            Toast.makeText(this, "openCv successfully loaded", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "openCv cannot be loaded", Toast.LENGTH_SHORT).show();
        }
    }
}
