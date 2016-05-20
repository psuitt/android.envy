package com.envyathletics.envy.training;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import com.envyathletics.envy.R;

public class TrainingVideo extends AppCompatActivity {

    private static final String TAG = "TrainingVideo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_video);

        VideoView videoView = (VideoView) findViewById(R.id.training_video_view);

        try {
            videoView.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=ORUoFcxJAb0"));
            MediaController mc = new MediaController(this);
            videoView.setMediaController(mc);
            videoView.requestFocus();
            videoView.start();
            mc.show();
        } catch (final Exception e) {
            Log.e(TAG, e.getMessage(), e);
        }


    }
}
