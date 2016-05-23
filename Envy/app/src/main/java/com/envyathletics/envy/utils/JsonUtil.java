package com.envyathletics.envy.utils;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Sora on 5/20/2016.
 */
public class JsonUtil {

    /** Tag for logging. */
    private static final String TAG = "JsonUtil";

    /**
     * Gets a json array from an object and returns a string list.
     *
     * @param object - {@link JSONObject} - Contains the array.
     * @param field - String - Array field.
     *
     * @return List&lt;String&gt; - List of objects.
     */
    public static List<String> getListString(final JSONObject object, final String field) {

        final List<String> list = new ArrayList<>();

        try {
            final JSONArray array = object.getJSONArray(field);

            for (int i = 0; i < array.length(); i++) {

                list.add(array.getString(i));

            }

        } catch (final JSONException e) {
            Log.w(TAG, "This object doesn't contain the input field [field=" + field + "]");
        }

        return list;
    }

    public static JSONArray stringToJSONArray(final String list) {

        try {

            return new JSONArray(list);

        } catch (final JSONException e) {
            Log.w(TAG, "Unable to parse json.");
        }

        return null;

    }

    public static JSONArray stringListToJSONArray(final List<String> list) {

        return new JSONArray(list);

    }

    public static String getString(final JSONObject object, final String field) {

        try {
            return object.getString(field);
        } catch (final JSONException e) {
            Log.w(TAG, "This object doesn't contain the input field [field=" + field + "]");
        }

        return "";
    }


    public static boolean getBoolean(final JSONObject profileObj, final String field,
                                     final boolean defaultValue) {
        try {
            return profileObj.getBoolean(field);
        } catch (final JSONException e) {
            Log.w(TAG, "This object doesn't contain the input field [field=" + field + "]");
        }
        return defaultValue;
    }

}
