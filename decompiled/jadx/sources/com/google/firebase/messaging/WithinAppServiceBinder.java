package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import androidx.webkit.WebStorageCompat$$ExternalSyntheticLambda0;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.WithinAppServiceConnection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class WithinAppServiceBinder extends Binder {
    private final IntentHandler intentHandler;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface IntentHandler {
        Task<Void> handle(Intent intent);
    }

    public WithinAppServiceBinder(IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    public void send(WithinAppServiceConnection.BindRequest bindRequest) {
        if (Binder.getCallingUid() != Process.myUid()) {
            AtomicFile$$ExternalSyntheticBUOutline0.m("Binding only allowed within app");
        } else {
            Log.isLoggable(Constants.TAG, 3);
            this.intentHandler.handle(bindRequest.intent).addOnCompleteListener(new WebStorageCompat$$ExternalSyntheticLambda0(3), new GmsRpc$$ExternalSyntheticLambda0(bindRequest, 2));
        }
    }
}
