package com.amazon.identity.auth.device;

import android.content.ComponentName;
import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class y5 {

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f1083a;

    public y5(ComponentName componentName) {
        this.f1083a = componentName;
    }

    public static ComponentName a(Context context, String str) {
        pq pqVar = new pq(context, false);
        ComponentName[] componentNameArr = {new ComponentName("com.amazon.imp", str), new ComponentName("com.amazon.sso", str), new ComponentName("com.amazon.dcp", str), new ComponentName("com.amazon.fv", str), new ComponentName("com.amazon.canary", str), new ComponentName(context, str)};
        for (int i = 0; i < 6; i++) {
            ComponentName componentName = componentNameArr[i];
            if (jn.a(pqVar, componentName)) {
                return componentName;
            }
        }
        Iterator it2 = pqVar.b().iterator();
        while (it2.hasNext()) {
            ComponentName componentName2 = new ComponentName((String) it2.next(), str);
            if (jn.a(pqVar, componentName2)) {
                return componentName2;
            }
        }
        return null;
    }
}
