package org.hyperledger.indy.sdk.utils;

import androidx.test.platform.app.InstrumentationRegistry;

public class EnvironmentUtils {
    static String getTestPoolIP() {
        // TODO this is not as usefull on android. Could be configured through buildConfigField
        //  on test apk. DSL does not allow that at the moment.
        String testPoolIp = System.getenv("TEST_POOL_IP");
        return testPoolIp != null ? testPoolIp : "10.0.0.2";
    }

    public static String getIndyHomePath() {
        return InstrumentationRegistry.getInstrumentation().getContext().getCacheDir().getAbsolutePath() + "/indy_client/";
    }

    public static String getIndyHomePath(String filename) {
        return getIndyHomePath() + filename;
    }

    public static String getTmpPath() {
        return InstrumentationRegistry.getInstrumentation().getContext().getCacheDir().getAbsolutePath() + "/tmp/";
    }

    public static String getTmpPath(String filename) {
        return getTmpPath() + filename;
    }
}
