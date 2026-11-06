package com.amazon.identity.platform.setting;

import android.content.Context;
import com.amazon.identity.auth.device.ap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class a {
    public static a c;

    /* renamed from: a, reason: collision with root package name */
    public final ap f1126a = new ap();
    public final Context b;

    public a(Context context) {
        this.b = context;
    }

    public static synchronized a a(Context context) {
        synchronized (a.class) {
            a aVar = c;
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a(context);
            c = aVar2;
            return aVar2;
        }
    }
}
