package com.amazon.alexa.cantilever.utils;

import android.content.Context;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class FileUtils {
    private static final String EMPTY_FILE = "";
    private static final String TAG = "FileUtils";
    private static final String UTF_8 = "UTF-8";

    private FileUtils() {
    }

    public static String readFile(Context context, String str) {
        try {
            InputStream open = context.getAssets().open(str);
            if (open == null) {
                return "";
            }
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            return new String(bArr, "UTF-8");
        } catch (Exception e) {
            a$$ExternalSyntheticOutline0.m("Failed to load File: ", str, TAG, e);
            return "";
        }
    }
}
