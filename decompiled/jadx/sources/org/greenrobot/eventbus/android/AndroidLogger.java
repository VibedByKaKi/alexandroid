package org.greenrobot.eventbus.android;

import android.util.Log;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.logging.Level;
import org.greenrobot.eventbus.Logger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AndroidLogger implements Logger {
    private final String tag;

    public AndroidLogger(String str) {
        this.tag = str;
    }

    private int mapLevel(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        }
        if (intValue < 900) {
            return 4;
        }
        return intValue < 1000 ? 5 : 6;
    }

    @Override // org.greenrobot.eventbus.Logger
    public void log(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int mapLevel = mapLevel(level);
            String str2 = this.tag;
            StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, "\n");
            m1m.append(Log.getStackTraceString(th));
            Log.println(mapLevel, str2, m1m.toString());
        }
    }

    @Override // org.greenrobot.eventbus.Logger
    public void log(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(mapLevel(level), this.tag, str);
        }
    }
}
