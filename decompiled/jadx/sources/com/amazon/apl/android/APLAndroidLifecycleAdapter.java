package com.amazon.apl.android;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.amazon.apl.enums.DisplayState;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class APLAndroidLifecycleAdapter implements LifecycleObserver {
    private final boolean mIsBackgroundProcessingEnabled;
    private final WeakReference<IAPLController> mWeakController;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Action {
        NONE,
        PAUSE,
        RESUME
    }

    public APLAndroidLifecycleAdapter(@NonNull IAPLController iAPLController) {
        this.mWeakController = new WeakReference<>(iAPLController);
        this.mIsBackgroundProcessingEnabled = iAPLController.getDocVersion() >= 8;
    }

    private void updateController(DisplayState displayState, Action action) {
        IAPLController iAPLController = this.mWeakController.get();
        if (iAPLController == null) {
            return;
        }
        iAPLController.updateDisplayState(displayState);
        if (action == Action.PAUSE) {
            iAPLController.pauseDocument();
        } else if (action == Action.RESUME) {
            iAPLController.resumeDocument();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        updateController(DisplayState.kDisplayStateBackground, this.mIsBackgroundProcessingEnabled ? Action.NONE : Action.PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        updateController(DisplayState.kDisplayStateForeground, this.mIsBackgroundProcessingEnabled ? Action.NONE : Action.RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        updateController(DisplayState.kDisplayStateBackground, this.mIsBackgroundProcessingEnabled ? Action.RESUME : Action.NONE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        updateController(DisplayState.kDisplayStateHidden, this.mIsBackgroundProcessingEnabled ? Action.PAUSE : Action.NONE);
    }
}
