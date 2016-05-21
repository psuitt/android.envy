package com.envyathletics.envy.utils;

import android.test.InstrumentationTestCase;

import com.envyathletics.envy.constants.Assets;

import java.io.IOException;

/**
 * Created by Sora on 5/20/2016.
 */
public class FileUtilTest extends InstrumentationTestCase {

    public void testLoadTrainingListFile() throws IOException {

        final String fileContent = FileUtil.loadAssetsFileJSON(getInstrumentation().getTargetContext(), Assets.TRAINING_LIST_PATH);

        assertNotNull(fileContent);

    }

    public void testAssetsExist() throws IOException {

        final String[] fileContent = FileUtil.listAssets(getInstrumentation().getTargetContext());

        assertTrue(fileContent.length > 0);

    }

    public void testAssetsExistNested() throws IOException {

        final String[] fileContent = FileUtil.listAssets(getInstrumentation().getTargetContext(), "training");

        assertTrue(fileContent.length > 0);

    }

}
