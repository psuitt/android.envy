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

    public static final String INTENT_EXTRA_URL = "url";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_video);

        VideoView videoView = (VideoView) findViewById(R.id.training_video_view);

        try {
            final String url = getIntent().getStringExtra(INTENT_EXTRA_URL);
            videoView.setVideoURI(Uri.parse(url));
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
