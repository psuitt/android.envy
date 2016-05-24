package com.envyathletics.envy;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.envyathletics.envy.activity.generic.MainNavigationActivity;
import com.envyathletics.envy.training.TrainingList;

public class EnvyActivity extends MainNavigationActivity {

    @Override
    public void afterOnCreate(Bundle savedInstanceState) {

    }

    @Override
    public int getContentViewLayout() {
        return R.layout.activity_envy;
    }
}
