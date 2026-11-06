package com.amazon.identity.auth.device.storage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.device.hn;
import com.amazon.identity.auth.device.qb;
import com.amazon.identity.auth.device.tn;
import com.amazon.identity.auth.device.v9;
import com.amazon.identity.auth.device.x9;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f959a;
    public final /* synthetic */ Context b;

    public f(Context context, Intent intent) {
        this.f959a = intent;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String action = this.f959a.getAction();
        if (!"android.intent.action.TIME_SET".equals(action)) {
            Log.e(yf.a("LambortishClock"), "Cannot Handle intent with action " + action);
            return;
        }
        tn a2 = tn.a(this.b);
        int i = LambortishClock$ChangeTimestampsBroadcastReceiver.f953a;
        v9 a3 = ((x9) a2.getSystemService("dcp_data_storage_factory")).a();
        if (!(a3 instanceof qb ? true : a3 instanceof hn ? ((hn) a3).c : false)) {
            yf.a("LambortishClock");
            "user".equalsIgnoreCase(Build.TYPE);
        } else {
            g a4 = g.a(a2);
            synchronized (a4) {
                yf.a("LambortishClock", "Users clock moved. System time is %s and timestamp is %s", Long.toString(a4.b.currentTimeMillis()), Long.toString(a4.a().getTime()));
            }
        }
    }
}
