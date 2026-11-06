package com.amazon.alexa.matter.utils.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes14.dex */
public final class AndroidLogMatterLogger implements MatterLogger {
    private static final String TAG = "AlexaMobileAndroidMatter";

    @Inject
    public AndroidLogMatterLogger() {
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void error(@NonNull String str, @Nullable Throwable th) {
        if (th == null) {
            Log.e(TAG, str);
        } else {
            Log.e(TAG, str, th);
        }
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void info(@NonNull String str) {
        Log.i(TAG, str);
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void warn(@NonNull String str, @Nullable Throwable th) {
        if (th == null) {
            Log.w(TAG, str);
        } else {
            Log.w(TAG, str, th);
        }
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void error(@NonNull String str) {
        error(str, null);
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void warn(@NonNull String str) {
        warn(str, null);
    }

    @Override // com.amazon.alexa.matter.utils.logging.MatterLogger
    public void debug(@NonNull String str) {
    }
}
