package com.google.android.exoplayer2.util;

import android.os.Build;
import com.amazon.alexa.mobilytics.event.LogLevel;
import com.dee.app.metrics.MetricsConstants;
import com.google.android.exoplayer2.util.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class AmazonQuirks {
    private static final String AMAZON = "Amazon";
    private static final int AUDIO_HARDWARE_LATENCY_FOR_TABLETS = 90000;
    private static final String DEVICEMODEL;
    private static final String FIRETV_GEN1_DEVICE_MODEL = "AFTB";
    private static final String FIRETV_GEN2_DEVICE_MODEL = "AFTS";
    private static final String FIRETV_STICK_DEVICE_MODEL = "AFTM";
    private static final String FIRETV_STICK_GEN2_DEVICE_MODEL = "AFTT";
    private static final String FIRE_PHONE_DEVICE_MODEL = "SD";
    private static final String KINDLE_TABLET_DEVICE_MODEL = "KF";
    private static final String MANUFACTURER;
    private static final String TAG = "AmazonQuirks";
    private static final boolean isAmazonDevice;
    private static final boolean isFirePhone;
    private static final boolean isFireTVGen1;
    private static final boolean isFireTVGen2;
    private static final boolean isFireTVStick;
    private static final boolean isKindleTablet;
    private static boolean skipProfileLevelCheck;

    static {
        String str = Build.MODEL;
        DEVICEMODEL = str;
        String str2 = Build.MANUFACTURER;
        MANUFACTURER = str2;
        boolean equalsIgnoreCase = str2.equalsIgnoreCase("Amazon");
        isAmazonDevice = equalsIgnoreCase;
        boolean z = false;
        isFireTVGen1 = equalsIgnoreCase && str.equalsIgnoreCase(FIRETV_GEN1_DEVICE_MODEL);
        isFireTVGen2 = equalsIgnoreCase && str.equalsIgnoreCase(FIRETV_GEN2_DEVICE_MODEL);
        isFireTVStick = equalsIgnoreCase && str.equalsIgnoreCase(FIRETV_STICK_DEVICE_MODEL);
        isKindleTablet = equalsIgnoreCase && str.startsWith(KINDLE_TABLET_DEVICE_MODEL);
        if (equalsIgnoreCase && str.startsWith(FIRE_PHONE_DEVICE_MODEL)) {
            z = true;
        }
        isFirePhone = z;
        loadForcedLogSettings();
    }

    private AmazonQuirks() {
    }

    public static int getAudioHWLatency() {
        return AUDIO_HARDWARE_LATENCY_FOR_TABLETS;
    }

    public static String getSystemProperty(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(MetricsConstants.Method.CACHE_GET, String.class).invoke(null, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isAmazonDevice() {
        return isAmazonDevice;
    }

    public static boolean isDolbyPassthroughQuirkEnabled() {
        return isFireTVGen1Family();
    }

    public static boolean isFireTVGen1Family() {
        return isFireTVGen1 || isFireTVStick;
    }

    public static boolean isFireTVGen2() {
        return isFireTVGen2;
    }

    public static boolean isLatencyQuirkEnabled() {
        if (Util.SDK_INT <= 19) {
            return isKindleTablet || isFirePhone;
        }
        return false;
    }

    private static void loadForcedLogSettings() {
        int i;
        String systemProperty = getSystemProperty("com.amazon.exoplayer.forcelog");
        if (systemProperty == null || systemProperty.equals("")) {
            return;
        }
        try {
            for (String str : systemProperty.split("#")) {
                String[] split = str.split(":");
                Logger.Module valueOf = Logger.Module.valueOf(split[0]);
                String lowerCase = split[1].toLowerCase();
                switch (lowerCase.hashCode()) {
                    case 3237038:
                        if (lowerCase.equals(LogLevel.INFO)) {
                            i = 4;
                            break;
                        }
                        i = 3;
                        break;
                    case 3641990:
                        if (lowerCase.equals(LogLevel.WARN)) {
                            i = 5;
                            break;
                        }
                        i = 3;
                        break;
                    case 96784904:
                        if (lowerCase.equals("error")) {
                            i = 6;
                            break;
                        }
                        i = 3;
                        break;
                    case 351107458:
                        if (lowerCase.equals("verbose")) {
                            i = 2;
                            break;
                        }
                        i = 3;
                        break;
                    default:
                        i = 3;
                        break;
                }
                Logger.setLogLevel(valueOf, i);
            }
        } catch (Exception e) {
            android.util.Log.e(TAG, "Could not set logging level.", e);
        }
    }

    public static boolean shouldSkipProfileLevelCheck() {
        return skipProfileLevelCheck;
    }

    public static void skipProfileLevelCheck(boolean z) {
        skipProfileLevelCheck = z;
    }

    public static boolean useDefaultPassthroughDecoder() {
        if (isFireTVGen1Family()) {
            android.util.Log.i(TAG, "Using platform Dolby decoder");
            return false;
        }
        android.util.Log.i(TAG, "Using default Dolby pass-through decoder");
        return true;
    }
}
