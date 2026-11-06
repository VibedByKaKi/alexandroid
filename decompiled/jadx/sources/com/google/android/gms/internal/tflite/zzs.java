package com.google.android.gms.internal.tflite;

import android.content.SharedPreferences;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzs {

    @GuardedBy("SharedPreferencesLoader.class")
    private static final Map zza = new ArrayMap();
    private final SharedPreferences zzb;
    private SharedPreferences.OnSharedPreferenceChangeListener zzc;

    public static synchronized void zza() {
        synchronized (zzs.class) {
            Map map = zza;
            Iterator it2 = map.values().iterator();
            if (it2.hasNext()) {
                SharedPreferences sharedPreferences = ((zzs) it2.next()).zzb;
                throw null;
            }
            map.clear();
        }
    }
}
