package com.google.android.play.core.appupdate.internal;

import com.amazon.dee.app.services.metrics.AlexaMetricsConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.apache.commons.text.lookup.StringLookupFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzi {
    private static final Set zza = new HashSet(Arrays.asList(AlexaMetricsConstants.EventConstants.APP_UPDATE, "review"));
    private static final Set zzb = new HashSet(Arrays.asList("native", "unity"));
    private static final Map zzc = new HashMap();
    private static final zzm zzd = new zzm("PlayCoreVersion");

    public static synchronized Map zza(String str) {
        Map map;
        synchronized (zzi.class) {
            try {
                Map map2 = zzc;
                if (!map2.containsKey(AlexaMetricsConstants.EventConstants.APP_UPDATE)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(StringLookupFactory.KEY_JAVA, 11004);
                    map2.put(AlexaMetricsConstants.EventConstants.APP_UPDATE, hashMap);
                }
                map = (Map) map2.get(AlexaMetricsConstants.EventConstants.APP_UPDATE);
            } catch (Throwable th) {
                throw th;
            }
        }
        return map;
    }
}
