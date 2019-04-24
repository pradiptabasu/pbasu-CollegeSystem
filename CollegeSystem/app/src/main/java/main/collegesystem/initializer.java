package main.collegesystem;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseUser;

public class initializer extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(this);

        //reguler initialization
        /*Parse.initialize(this, getResources().getString(R.string.parse_application_id), getResources().getString(R.string.parse_client_key));*/
        //initialization using basck4app

//        Parse.initialize(new Parse.Configuration.Builder(this)
//                .applicationId(getResources().getString(R.string.parse_application_id))
//                .clientKey(getResources().getString(R.string.parse_client_key))
//                .server("https://parseapi.back4app.com/").build()
//        );


        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ow7TBlBlPg0R16rONG4O7LnM2IIv7ZX3umQ6fdmh")
                .clientKey("kTDsqMbDK7mHpoUq7nFAOk7Sc01G97sWa5racTMv")
                .server("https://parseapi.back4app.com/").build()
        );



        Log.i("Initialization :", "App initialization executed");
        ParseUser.enableRevocableSessionInBackground();

        //Old Parse Method for intializing installation,notification
        /*ParseInstallation.getCurrentInstallation().saveInBackground();*/
        //New Parse Method for intializing installation,notification Setting

        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put("GCMSenderId", "916602821369");
        installation.saveInBackground();
    }
}
