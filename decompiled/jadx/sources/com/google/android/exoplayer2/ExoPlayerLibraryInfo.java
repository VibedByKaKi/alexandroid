package com.google.android.exoplayer2;

import android.os.Build;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class ExoPlayerLibraryInfo {
    public static final boolean ASSERTIONS_ENABLED = true;
    public static final boolean GL_ASSERTIONS_ENABLED = false;
    public static final String TAG = "ExoPlayer";
    public static final boolean TRACE_ENABLED = true;
    public static final String VERSION = "2.13.3";
    public static final int VERSION_INT = 2013003;
    public static final String VERSION_SLASHY = "AmznExoPlayerLib/2.13.3";

    @Deprecated
    public static final String DEFAULT_USER_AGENT = a$$ExternalSyntheticOutline0.m(new StringBuilder("AmznExoPlayerLib/2.13.3 (Linux; Android "), Build.VERSION.RELEASE, ") AmznExoPlayerLib/2.13.3");
    private static final HashSet<String> registeredModules = new HashSet<>();
    private static String registeredModulesString = "goog.exo.core";

    private ExoPlayerLibraryInfo() {
    }

    public static synchronized void registerModule(String str) {
        synchronized (ExoPlayerLibraryInfo.class) {
            if (registeredModules.add(str)) {
                registeredModulesString += ", " + str;
            }
        }
    }

    public static synchronized String registeredModules() {
        String str;
        synchronized (ExoPlayerLibraryInfo.class) {
            str = registeredModulesString;
        }
        return str;
    }
}
