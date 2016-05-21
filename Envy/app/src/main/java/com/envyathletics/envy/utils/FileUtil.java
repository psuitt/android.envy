package com.envyathletics.envy.utils;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Sora on 5/20/2016.
 */
public final class FileUtil {

    public static final String STRING_UTF_8 = "UTF-8";

    /**
     * Returns a string version of a file.
     *
     * @param context - The activity.
     * @param fileName - File path and name.
     *
     * @return String - File content.
     *
     * @throws IOException - Thrown on file errors.
     */
    public static String loadAssetsFileJSON(final Context context, final String fileName)
            throws IOException {

        // Get the file input steam.
        final InputStream is = context.getAssets().open(fileName);

        final int size = is.available();

        final byte[] buffer = new byte[size];

        // Read to buffer
        is.read(buffer);

        // Close the input stream.
        is.close();

        return new String(buffer, STRING_UTF_8);

    }

    public static String[] listAssets(final Context context)
            throws IOException {

        return listAssets(context, "");

    }

    public static String[] listAssets(final Context context, final String assetsPath)
            throws IOException {

        return context.getAssets().list(assetsPath);

    }

    /**
     * Private constructor.
     */
    private FileUtil() {
    }

}
