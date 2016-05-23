package com.envyathletics.envy;

import com.envyathletics.envy.utils.FileUtil;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Sora on 5/22/2016.
 */
public class FileTest {

    /**
     * Opens a file and returns the contents.
     *
     * @param file - File contents.
     *
     * @return String - Content.
     *
     * @throws IOException - Exception on file errors.
     */
    public String openFile(final String file) throws IOException {

        final InputStream is = this.getClass().getClassLoader().getResourceAsStream(file);

        final int size = is.available();

        final byte[] buffer = new byte[size];

        // Read to buffer
        is.read(buffer);

        // Close the input stream.
        is.close();

        return new String(buffer, FileUtil.STRING_UTF_8);

    }

}
