package com.envyathletics.envy.training;

import android.content.Context;
import android.util.Log;

import com.envyathletics.envy.beans.TrainingItem;
import com.envyathletics.envy.constants.Assets;
import com.envyathletics.envy.enums.Training;
import com.envyathletics.envy.utils.FileUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sora on 5/22/2016.
 */
public class TrainingListUtil {

    private static final String TAG = "TrainingListUtil";

    public static List<TrainingItem> loadAchievements(final Context context) {

        final List<TrainingItem> trainingItems = new ArrayList<TrainingItem>();

        try {

            final JSONArray array =
                    new JSONArray(FileUtil.loadAssetsFileJSON(context, Assets.TRAINING_LIST_PATH));

            for (int i = 0; i < array.length(); i++) {

                final JSONObject object = array.getJSONObject(i);

                trainingItems.add(new TrainingItem(
                        object.getString(Training.NAME.field),
                        object.getString(Training.DETAIL.field),
                        object.getString(Training.URL.field)
                ));

            }

        } catch (final IOException io) {

            Log.e(TAG, "Unable to open file.");

        } catch (final JSONException je) {

            Log.e(TAG, "Unable find field.");

        }

        return trainingItems;

    }

}
