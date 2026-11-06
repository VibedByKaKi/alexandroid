package com.amazon.alexa.mobilytics.lifecycle;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.amazon.alexa.mobilytics.lifecycle.Lifecycle;
import com.amazon.alexa.mobilytics.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes18.dex */
final class LifecycleDispatcher {
    private static final String TAG = Log.tag((Class<?>) LifecycleDispatcher.class);
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean(false);
    private static final LifecycleCallbackListener callbackListener = new LifecycleCallbackListener();

    private LifecycleDispatcher() {
    }

    public static void initialize(@NonNull Context context) {
        if (INITIALIZED.getAndSet(true)) {
            return;
        }
        Log.i(TAG, "Initializing ActivityLifecycleCallback listener.");
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(callbackListener);
    }

    public static Observable<Lifecycle.Event> onEvent() {
        return callbackListener.onEvent();
    }
}
