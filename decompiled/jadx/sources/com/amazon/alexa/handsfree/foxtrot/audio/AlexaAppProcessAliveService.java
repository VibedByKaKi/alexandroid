package com.amazon.alexa.handsfree.foxtrot.audio;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaAppProcessAliveService extends Service {
    public static final String ACTION_BIND_PROCESS_ALIVE = "com.amazon.alexa.handsfree.BIND_PROCESS_ALIVE";
    private static final String TAG = "AlexaAppProcessAliveService";
    private final IBinder mBinder = new Binder();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind() | intent = " + intent);
        return this.mBinder;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Log.d(TAG, "onUnbind() | intent = " + intent);
        return false;
    }
}
