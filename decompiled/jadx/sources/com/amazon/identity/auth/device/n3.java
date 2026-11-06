package com.amazon.identity.auth.device;

import android.app.AlarmManager;
import android.util.Log;
import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final AlarmManager f823a;

    public n3(tn tnVar) {
        this.f823a = (AlarmManager) tnVar.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    public final void a(long j, com.amazon.identity.auth.device.framework.n nVar) {
        try {
            this.f823a.set(1, j, nVar.f658a);
        } catch (SecurityException e) {
            Log.e(yf.a("AlarmManagerWrapper"), "AlarmManagerWrapper set failed!", e);
        }
    }
}
