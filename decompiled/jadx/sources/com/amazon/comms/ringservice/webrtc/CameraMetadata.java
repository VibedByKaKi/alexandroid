package com.amazon.comms.ringservice.webrtc;

import android.text.TextUtils;
import com.amazon.comms.log.CommsLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CameraMetadata {
    private static final String KEY_COLOR_TEMP = "color-temp";
    private static final String KEY_FACE_1_BRIGHTNESS_8_BITS = "brightness-8-bits-1";
    private static final String KEY_FACE_1_DISTANCE_IN_CM = "distance-in-cm-1";
    private static final String KEY_FACE_2_BRIGHTNESS_8_BITS = "brightness-8-bits-2";
    private static final String KEY_FACE_2_DISTANCE_IN_CM = "distance-in-cm-2";
    private static final String KEY_FACE_DETECTION_ON = "fd-on";
    private static final String KEY_FRAME_COUNT = "frame-count";
    private static final String KEY_HIGHLIGHT_PIXEL_PCT = "highlight-pct";
    private static final String KEY_LUX_LEVEL = "lux-level";
    private static final String KEY_NUM_OF_FACES = "num-of-faces";
    private static final String KEY_SHADOW_PIXEL_PCT = "shadow-pct";
    private static final String KEY_TOTAL_TIME_IN_SEC = "time-in-second";
    private static final CommsLogger log = CommsLogger.getLogger(CameraMetadata.class);
    private final LinkedHashMap<String, String> mMap = new LinkedHashMap<>();

    public int getColorTemperature() {
        return getInt(KEY_COLOR_TEMP);
    }

    public int getFaceBrightness(int i) {
        if (i == 1) {
            return getInt(KEY_FACE_1_BRIGHTNESS_8_BITS);
        }
        if (i == 2) {
            return getInt(KEY_FACE_2_BRIGHTNESS_8_BITS);
        }
        return -1;
    }

    public int getFaceDetectionMode() {
        return getInt(KEY_FACE_DETECTION_ON);
    }

    public int getFaceDistance(int i) {
        if (i == 1) {
            return getInt(KEY_FACE_1_DISTANCE_IN_CM);
        }
        if (i == 2) {
            return getInt(KEY_FACE_2_DISTANCE_IN_CM);
        }
        return -1;
    }

    public int getFrameCount() {
        return getInt(KEY_FRAME_COUNT);
    }

    public int getHighlightPixelPercentage() {
        return getInt(KEY_HIGHLIGHT_PIXEL_PCT);
    }

    public int getInt(String str) {
        if (this.mMap.isEmpty()) {
            return -1;
        }
        try {
            return Integer.parseInt(this.mMap.get(str));
        } catch (RuntimeException e) {
            log.w("Retrieve key: " + str + " with int vaule from map failed with: " + e);
            return -1;
        }
    }

    public int getLuxLevel() {
        return getInt(KEY_LUX_LEVEL);
    }

    public int getNumOfFaces() {
        return getInt(KEY_NUM_OF_FACES);
    }

    public int getShadowPixelPercentage() {
        return getInt(KEY_SHADOW_PIXEL_PCT);
    }

    public int getTotalTime() {
        return getInt(KEY_TOTAL_TIME_IN_SEC);
    }

    public void unflatten(String str) {
        int indexOf;
        this.mMap.clear();
        if (str == null) {
            log.w("metadata is null String.");
            return;
        }
        try {
            TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(AbstractJsonLexerKt.COMMA);
            simpleStringSplitter.setString(str);
            Iterator<String> it2 = simpleStringSplitter.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                if (next != null && (indexOf = next.indexOf(58)) != -1) {
                    this.mMap.put(next.substring(0, indexOf), next.substring(indexOf + 1));
                }
            }
        } catch (RuntimeException e) {
            log.w("unflatten failed with error: " + e);
        }
    }
}
