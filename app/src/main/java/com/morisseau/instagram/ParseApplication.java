package com.morisseau.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this).applicationId("gnRWGOR5N9RZFNX334IHVRZJolfxOl009C7bvSas")
                .clientKey("h5YLD8rcRSui0hYeDvBdQpqMvjVcsOoZG2x0wa4q").server("https://parseapi.back4app.com").build()
        );
    }
}
