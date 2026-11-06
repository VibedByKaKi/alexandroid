package com.amazon.identity.auth.accounts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.amazon.identity.auth.device.fp;
import com.amazon.identity.auth.device.un;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes5.dex */
public class SessionUserChangedToAccountForPackageChangedAdpater extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f385a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        yf.a("SessionUserChangedToAccountForPackageChangedAdpater");
        "user".equalsIgnoreCase(Build.TYPE);
        fp.b(new un(context));
    }
}
