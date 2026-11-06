package com.amazon.alexa.voice.handsfree.initialization;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class InitializationActivity extends Activity {
    private static final String TAG = "InitializationActivity";
    private Initializer mInitializer = InitializerProvider.getInitializer();

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Log.d(TAG, "onCreate: Initialize via initialization activity.");
        this.mInitializer.initialize(this);
        finish();
    }

    @VisibleForTesting
    public void setInitializer(@NonNull Initializer initializer) {
        this.mInitializer = initializer;
    }
}
