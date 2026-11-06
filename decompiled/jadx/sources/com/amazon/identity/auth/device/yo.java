package com.amazon.identity.auth.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class yo extends c7 {
    public final /* synthetic */ zo h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(zo zoVar, Context context, Intent intent) {
        super(context, intent);
        this.h = zoVar;
    }

    @Override // com.amazon.identity.auth.device.c7
    public final void useService(ComponentName componentName, IBinder iBinder) {
        ExecutorService executorService;
        executorService = zo.d;
        executorService.execute(new xo(this, componentName, iBinder));
    }

    @Override // com.amazon.identity.auth.device.c7
    public final void useService(IBinder iBinder) {
    }
}
