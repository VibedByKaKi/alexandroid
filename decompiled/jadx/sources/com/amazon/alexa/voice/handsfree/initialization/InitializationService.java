package com.amazon.alexa.voice.handsfree.initialization;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.voice.handsfree.metrics.permission.PermissionCheckJobIntentService;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class InitializationService extends Service {
    private static final String MTK_MICROPHONE_PERMISSION_EXTRA_KEY = "VOICE_APP_MICROPHONE_PERMISSION_STATE";
    private static final String MTK_MICROPHONE_PERMISSION_EXTRA_VALUE = "MICROPHONE_PERMISSION_NEEDED";
    private static final String TAG = "InitializationService";
    private final Initializer mInitializer;

    public InitializationService() {
        this(InitializerProvider.getInitializer());
    }

    public void enqueuePermissionCheck(@NonNull Context context, @NonNull Intent intent) {
        PermissionCheckJobIntentService.enqueueWork(context, intent);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NonNull Intent intent) {
        String str = TAG;
        Log.d(str, "onCreate: Initialize via initialization service.");
        this.mInitializer.initialize(this);
        if (!intent.hasExtra(MTK_MICROPHONE_PERMISSION_EXTRA_KEY)) {
            return null;
        }
        String stringExtra = intent.getStringExtra(MTK_MICROPHONE_PERMISSION_EXTRA_KEY);
        Log.d(str, "onBind: the extras is " + stringExtra);
        if (!stringExtra.equals(MTK_MICROPHONE_PERMISSION_EXTRA_VALUE)) {
            return null;
        }
        Log.d(str, "received MICROPHONE_PERMISSION_NEEDED MTK microphone permission extra value");
        enqueuePermissionCheck(this, intent);
        return null;
    }

    @VisibleForTesting
    public InitializationService(@NonNull Initializer initializer) {
        this.mInitializer = initializer;
    }
}
