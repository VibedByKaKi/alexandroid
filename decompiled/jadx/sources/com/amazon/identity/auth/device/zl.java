package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.amazon.identity.auth.device.framework.MAPSmsReceiver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class zl {
    public static void a(Context context, MAPSmsReceiver mAPSmsReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(mAPSmsReceiver, intentFilter, null, null, 2);
        } else {
            context.registerReceiver(mAPSmsReceiver, intentFilter, null, null);
        }
    }
}
