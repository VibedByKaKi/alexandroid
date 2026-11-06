package com.jakewharton.threetenabp;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import org.threeten.bp.zone.ZoneRulesInitializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final class AndroidThreeTen {
    private static final AtomicBoolean initialized = new AtomicBoolean();

    private AndroidThreeTen() {
        throw new AssertionError();
    }

    public static void init(Context context, String str) {
        if (initialized.getAndSet(true)) {
            return;
        }
        ZoneRulesInitializer.setInitializer(new AssetsZoneRulesInitializer(context, str));
    }

    public static void init(Context context) {
        init(context, "org/threeten/bp/TZDB.dat");
    }

    public static void init(Application application) {
        init((Context) application);
    }
}
