package com.amazon.dee.app.ui.comms;

import android.content.Context;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver;
import com.amazon.dee.app.services.core.MainActivityLifecycleService;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CommsViewModel implements MainActivityLifecycleObserver {
    private static final String TAG = Log.tag((Class<?>) CommsViewModel.class);
    private final Context context;
    private volatile boolean isInitialized;
    private final MainActivityLifecycleService mainActivityLifecycleService;

    public CommsViewModel(Context context, MainActivityLifecycleService mainActivityLifecycleService) {
        this.context = context;
        this.mainActivityLifecycleService = mainActivityLifecycleService;
    }

    private static void updateSharedPref(Context context, String str) {
        context.getSharedPreferences(Constants.MAIN_IN_FG, 0).edit().putString(Constants.MAIN_IN_FG, str).apply();
    }

    public void initialize() {
        if (this.isInitialized) {
            return;
        }
        this.mainActivityLifecycleService.addObserver(this);
        this.isInitialized = true;
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityCreated() {
        updateSharedPref(this.context, Constants.FOREGROUND);
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityDestroy() {
        updateSharedPref(this.context, Constants.GONE);
        this.mainActivityLifecycleService.removeObserver(this);
        this.isInitialized = false;
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityPause() {
        updateSharedPref(this.context, Constants.FOREGROUND);
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityResume() {
        updateSharedPref(this.context, Constants.FOREGROUND);
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityStart() {
        updateSharedPref(this.context, Constants.FOREGROUND);
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityStop() {
        updateSharedPref(this.context, "BACKGROUND");
    }
}
