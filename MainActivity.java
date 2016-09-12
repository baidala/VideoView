package com.example.student.videoview;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "VideoView";
    VideoView vvOutPut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vvOutPut = (VideoView)findViewById(R.id.vvOutPut);

        /*
        //Uri source = Uri.parse("android.resource://com.example.student.videoview/raw/video");

        File homePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String videoPath = homePath.getPath()+"/video.mp4";

        //Log.d(LOG_TAG, videoPath);


        //vvOutPut.setVideoURI(source);
        vvOutPut.setVideoPath(videoPath);
        vvOutPut.requestFocus();
        //vvOutPut.start();

        vvOutPut.setMediaController(new MediaController(this));
        */


        // need permission INTERNET
        Uri webUri = Uri.parse("http://www.funnymasti.com/data/17227.html");
        vvOutPut.setVideoUri(webUri);

        vvOutPut.setMediaController(new MediaController(this));
        vvOutPut.requestFocus();

        vvOutPut.setCompletionListener(new OnCompletionListener ());
        //vvOutPut.start();




    }
}
