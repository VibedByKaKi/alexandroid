package com.amazon.alexa.smarthomecameras.util;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class CamerasLogger {
    private static final String CAMERAS_TAG = "cameras";
    public static final String LVC_TAG = "LVC";

    public static final void logInfo(String str, String str2) {
        ParcelCompat$$ExternalSyntheticOutline0.m7657m(MarkdownConstants.LEFT_BRACKET, str, "] ", str2, "[cameras]");
    }
}
