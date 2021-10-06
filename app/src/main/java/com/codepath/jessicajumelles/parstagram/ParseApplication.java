package com.codepath.jessicajumelles.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("65CpR2Oi5AZqKuw7LRDlhNNKaLbF5nTowcEb8FPj")
                .clientKey("r9avnY2RxSv0EmKwMSk7rsKrjSEtBAN6kzCbCc8h")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
