package com.amazon.identity.auth.device.framework;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class AmazonIntentService extends IntentService {
    public AmazonIntentService(String str) {
        super(str);
    }

    public abstract void a();

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            Log.w(yf.a("AmazonIntentService"), "Ignore: Received (null) Intent");
            return;
        }
        try {
            Log.i(yf.a("AmazonIntentService"), "Service Received: " + intent);
            a();
        } catch (Error e) {
            stopSelf();
            throw e;
        } catch (RuntimeException e2) {
            stopSelf();
            throw e2;
        }
    }
}
