package com.udacity.gradle.builditbigger.backend;

import com.example.jokelib.MyClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        myData = new MyClass().getJoke();
        return myData;
    }
}