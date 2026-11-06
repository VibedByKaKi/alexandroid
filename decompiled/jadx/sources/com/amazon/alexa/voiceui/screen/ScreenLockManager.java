package com.amazon.alexa.voiceui.screen;

import android.content.Context;
import android.os.Handler;
import android.os.PowerManager;
import android.view.Window;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voiceui.screen.ScreenDisplayStateBroadcastReceiver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class ScreenLockManager {

    @VisibleForTesting
    static final long SCREEN_OFF_AFTER_INTERACTION_MS = 45000;
    private final BehaviorSubject<Boolean> displayObservable;
    private final Handler handler;
    private final PowerManager powerManager;
    private final ScreenDisplayStateBroadcastReceiver screenDisplayStateBroadcastReceiver;
    private Runnable screenOffRunnable;
    private final WakeLockWrapper wakeLock;
    private final Window window;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DisplayListener implements ScreenDisplayStateBroadcastReceiver.DisplayStateChangeListener {
        private final BehaviorSubject<Boolean> screenOnObservable;

        public DisplayListener(BehaviorSubject<Boolean> behaviorSubject) {
            this.screenOnObservable = behaviorSubject;
        }

        @Override // com.amazon.alexa.voiceui.screen.ScreenDisplayStateBroadcastReceiver.DisplayStateChangeListener
        public void onScreenEvent(boolean z) {
            this.screenOnObservable.onNext(Boolean.valueOf(z));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static class WakeLockWrapper {
        private final PowerManager.WakeLock wakeLock;

        public WakeLockWrapper(PowerManager.WakeLock wakeLock) {
            this.wakeLock = wakeLock;
        }

        public void acquire() {
            this.wakeLock.acquire(600000L);
        }

        public boolean isHeld() {
            return this.wakeLock.isHeld();
        }

        public void release() {
            this.wakeLock.release();
        }
    }

    public ScreenLockManager(Window window, Handler handler, Context context, PowerManager powerManager) {
        this.window = window;
        this.handler = handler;
        this.powerManager = powerManager;
        this.wakeLock = getWakeLock(context);
        BehaviorSubject<Boolean> createDefault = BehaviorSubject.createDefault(Boolean.valueOf(isScreenOn()));
        this.displayObservable = createDefault;
        this.screenDisplayStateBroadcastReceiver = getScreenDisplayStateBroadcastReceiver(context, new DisplayListener(createDefault));
    }

    private void acquireWakeLock() {
        if (this.wakeLock.isHeld()) {
            return;
        }
        this.wakeLock.acquire();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void disableKeepScreenOn() {
        this.window.clearFlags(128);
        releaseWakeLock();
    }

    private void keepScreenOn() {
        this.window.addFlags(128);
        acquireWakeLock();
    }

    private void releaseWakeLock() {
        if (this.wakeLock.isHeld()) {
            this.wakeLock.release();
        }
    }

    public void deregisterForDisplayStateUpdates() {
        this.screenDisplayStateBroadcastReceiver.deregister();
    }

    @VisibleForTesting
    public ScreenDisplayStateBroadcastReceiver getScreenDisplayStateBroadcastReceiver(Context context, ScreenDisplayStateBroadcastReceiver.DisplayStateChangeListener displayStateChangeListener) {
        return new ScreenDisplayStateBroadcastReceiver(context, displayStateChangeListener);
    }

    @VisibleForTesting
    public WakeLockWrapper getWakeLock(Context context) {
        return new WakeLockWrapper(this.powerManager.newWakeLock(268435466, context.getPackageName() + ":screenlock"));
    }

    public boolean isScreenOn() {
        return this.powerManager.isInteractive();
    }

    public void registerForDisplayStateUpdates() {
        this.screenDisplayStateBroadcastReceiver.register();
    }

    public void releaseLock() {
        this.handler.removeCallbacks(this.screenOffRunnable);
        disableKeepScreenOn();
    }

    public void requestLock() {
        this.handler.removeCallbacks(this.screenOffRunnable);
        Runnable runnable = new Runnable() { // from class: com.amazon.alexa.voiceui.screen.ScreenLockManager.1
            @Override // java.lang.Runnable
            public void run() {
                boolean shouldDisableKeepScreenOn = ScreenLockManager.this.shouldDisableKeepScreenOn();
                ScreenLockManager screenLockManager = ScreenLockManager.this;
                if (shouldDisableKeepScreenOn) {
                    screenLockManager.disableKeepScreenOn();
                } else {
                    screenLockManager.handler.postDelayed(this, 45000L);
                }
            }
        };
        this.screenOffRunnable = runnable;
        this.handler.postDelayed(runnable, 45000L);
        keepScreenOn();
    }

    public abstract boolean shouldDisableKeepScreenOn();

    public Observable<Boolean> subscribeToScreenOn() {
        return this.displayObservable.distinctUntilChanged();
    }
}
