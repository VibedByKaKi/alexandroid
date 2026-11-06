package com.google.android.play.core.review;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.commons.text.lookup.StringLookupFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzj {
    private static final Set zza = new HashSet(Arrays.asList("native", "unity"));
    private static final Map zzb = new HashMap();
    private static final com.google.android.play.core.review.internal.zzi zzc = new com.google.android.play.core.review.internal.zzi("PlayCoreVersion");

    public static Bundle zza() {
        Bundle bundle = new Bundle();
        Map zzb2 = zzb();
        bundle.putInt("playcore_version_code", ((Integer) zzb2.get(StringLookupFactory.KEY_JAVA)).intValue());
        if (zzb2.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) zzb2.get("native")).intValue());
        }
        if (zzb2.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) zzb2.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map zzb() {
        Map map;
        synchronized (zzj.class) {
            map = zzb;
            map.put(StringLookupFactory.KEY_JAVA, 11004);
        }
        return map;
    }
}
