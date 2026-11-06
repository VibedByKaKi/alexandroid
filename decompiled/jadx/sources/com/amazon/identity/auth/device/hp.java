package com.amazon.identity.auth.device;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.identity.auth.device.api.MultipleAccountManager;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class hp {
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final tn f710a;

    public hp(tn tnVar) {
        this.f710a = tnVar;
    }

    public final boolean a(String str, String str2, Set set) {
        if (TextUtils.equals(str, dh.a(this.f710a).a(MultipleAccountManager.PrimaryUserMappingType.createPrimaryMappingForProfile(i4.a())))) {
            return true;
        }
        if (set.contains(str)) {
            b.get();
            yf.a("TokenAccessInterceptor");
            "user".equalsIgnoreCase(Build.TYPE);
            Log.e(yf.a("TokenAccessInterceptor"), "App(Unknown) fetching token (key: " + str2 + ") for a different android user is forbidden. Please contact MOBI team if you do have a valid use case for cross user token fetch", new Throwable());
        } else {
            yf.a("TokenAccessInterceptor");
            "user".equalsIgnoreCase(Build.TYPE);
        }
        return false;
    }
}
