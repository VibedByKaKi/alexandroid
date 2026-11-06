package com.amazon.identity.auth.device;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.MAPAgeClassificationManager;
import com.amazon.identity.auth.device.api.MAPRegulationConfig;
import com.mapbox.common.HttpHeaders;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ed {

    /* renamed from: a, reason: collision with root package name */
    public final fd f599a;
    public final MAPAgeClassificationManager b;

    public ed(Context context) {
        MAPAgeClassificationManager mAPAgeClassificationManager = new MAPAgeClassificationManager(context);
        fd fdVar = new fd(context);
        this.b = mAPAgeClassificationManager;
        this.f599a = fdVar;
    }

    public final MAPAgeClassificationManager.AgeClassification a() {
        try {
            Bundle a2 = this.f599a.a();
            if (a2 == null || !a2.getBoolean(MAPRegulationConfig.KEY_IS_AGE_VERIFICATION_REQUIRED)) {
                return null;
            }
            return this.b.getAge(null);
        } catch (UnsupportedOperationException unused) {
            Log.i(yf.a("InternalMAPAgeClassificationManager"), "Age verification is not supported on this platform.");
            return null;
        }
    }

    public final String a(String str) {
        MAPAgeClassificationManager.AgeClassification a2 = a();
        if (a2 == null) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter(HttpHeaders.AGE, a2.toString());
        return buildUpon.build().toString();
    }
}
