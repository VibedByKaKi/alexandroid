package com.amazon.dee.app.ui.fullscreentakeover;

import android.content.Context;
import android.view.ViewGroup;
import com.amazon.dee.app.services.logging.Log;
import com.facebook.react.ReactHost;
import com.facebook.react.interfaces.fabric.ReactSurface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class FullScreenTakeoverViewModel {
    private static final String ELEMENTS_FST_MODULE_NAME = "ElementsFullScreenTakeover";
    private static final String TAG = Log.tag((Class<?>) FullScreenTakeoverViewModel.class);
    private ReactSurface currentSurface;
    private volatile boolean isInitialized;
    private final ReactHost reactHost;

    public FullScreenTakeoverViewModel(ReactHost reactHost) {
        this.reactHost = reactHost;
    }

    public void initialize(Context context, ViewGroup viewGroup) {
        if (this.isInitialized) {
            return;
        }
        ReactSurface createSurface = this.reactHost.createSurface(context, ELEMENTS_FST_MODULE_NAME, null);
        this.reactHost.start();
        ViewGroup view = createSurface.getView();
        if (view == null) {
            Log.e(TAG, "Surface view is null for FullScreenTakeover");
            createSurface.stop();
            this.isInitialized = true;
        } else {
            view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            viewGroup.addView(view);
            createSurface.start();
            this.currentSurface = createSurface;
            this.isInitialized = true;
        }
    }

    public boolean isSurfaceActive() {
        ReactSurface reactSurface;
        return this.isInitialized && (reactSurface = this.currentSurface) != null && reactSurface.isRunning();
    }

    public void reset() {
        ReactSurface reactSurface = this.currentSurface;
        if (reactSurface != null) {
            reactSurface.stop();
            this.currentSurface = null;
        }
        this.isInitialized = false;
    }
}
