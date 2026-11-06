package com.amazon.identity.auth.device;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class zo extends y4 {
    private static final ExecutorService d;
    private final yo c;

    static {
        fh fhVar = fp.f623a;
        d = Executors.newFixedThreadPool(4, new gh("MAP-SyncBoundServiceCallerThreadPool"));
    }

    public zo(Context context, Intent intent) {
        this.c = new yo(this, context, intent);
    }

    public void doneUsingService() {
        this.c.unbind();
        asyncOperationComplete();
    }

    @Override // com.amazon.identity.auth.device.y4
    public void startAsyncOperation() {
        if (this.c.call()) {
            return;
        }
        doneUsingService();
    }

    public void useService(ComponentName componentName, IBinder iBinder) {
        useService(iBinder);
    }

    public abstract void useService(IBinder iBinder);
}
