package com.amazon.deecomms.common.util;

import android.content.Context;
import net.danlew.android.joda.JodaTimeAndroid;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class JodaTimeInitializer {
    private static volatile boolean jodaTimeInitialized = false;
    private static final Object lockObject = new Object();

    public JodaTimeInitializer(Context context) {
        if (jodaTimeInitialized) {
            return;
        }
        synchronized (lockObject) {
            try {
                if (jodaTimeInitialized) {
                    return;
                }
                JodaTimeAndroid.init(context);
                jodaTimeInitialized = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
