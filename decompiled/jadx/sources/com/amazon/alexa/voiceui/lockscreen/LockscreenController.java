package com.amazon.alexa.voiceui.lockscreen;

import android.app.Activity;
import android.app.KeyguardManager;
import android.media.MediaPlayer;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.voiceui.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
public class LockscreenController {
    private static final String TAG = "LockscreenController";
    private final Activity activity;
    private final KeyguardManager keyguardManager;
    private Boolean wasScreenLocked;
    private boolean keyguardUnlockRequested = false;
    private boolean playedKeyguardUnlockSound = false;
    private boolean showOverLockscreen = false;
    private boolean lockscreenFlagsAddedToWindow = false;
    private int onStartCount = 0;
    private final BehaviorSubject<Boolean> canDisplayVoiceUiObservable = BehaviorSubject.createDefault(Boolean.valueOf(canDisplayVoiceUI()));
    private final List<LockscreenCallbacks> lockscreenCallbacks = new ArrayList();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface LockscreenCallbacks {
        void onUnlockFailure();

        void onUnlockSuccess(boolean z, boolean z2);
    }

    @Inject
    public LockscreenController(KeyguardManager keyguardManager, Activity activity) {
        this.keyguardManager = keyguardManager;
        this.activity = activity;
    }

    private void bringUpKeyguard() {
        if (this.keyguardUnlockRequested) {
            return;
        }
        this.keyguardUnlockRequested = true;
        final boolean isDeviceLocked = this.keyguardManager.isDeviceLocked();
        final boolean isKeyguardLocked = this.keyguardManager.isKeyguardLocked();
        this.keyguardManager.requestDismissKeyguard(this.activity, new KeyguardManager.KeyguardDismissCallback() { // from class: com.amazon.alexa.voiceui.lockscreen.LockscreenController.1
            @Override // android.app.KeyguardManager.KeyguardDismissCallback
            public void onDismissCancelled() {
                LockscreenController.this.keyguardUnlockRequested = false;
                LockscreenController.this.canDisplayVoiceUiObservable.onNext(Boolean.valueOf(LockscreenController.this.canDisplayVoiceUI()));
                synchronized (LockscreenController.this.lockscreenCallbacks) {
                    try {
                        Iterator it2 = LockscreenController.this.lockscreenCallbacks.iterator();
                        while (it2.hasNext()) {
                            ((LockscreenCallbacks) it2.next()).onUnlockFailure();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // android.app.KeyguardManager.KeyguardDismissCallback
            public void onDismissError() {
                LockscreenController.this.keyguardUnlockRequested = false;
                LockscreenController.this.canDisplayVoiceUiObservable.onNext(Boolean.valueOf(LockscreenController.this.canDisplayVoiceUI()));
                synchronized (LockscreenController.this.lockscreenCallbacks) {
                    try {
                        Iterator it2 = LockscreenController.this.lockscreenCallbacks.iterator();
                        while (it2.hasNext()) {
                            ((LockscreenCallbacks) it2.next()).onUnlockFailure();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // android.app.KeyguardManager.KeyguardDismissCallback
            public void onDismissSucceeded() {
                LockscreenController.this.keyguardUnlockRequested = false;
                LockscreenController.this.canDisplayVoiceUiObservable.onNext(Boolean.valueOf(LockscreenController.this.canDisplayVoiceUI()));
                synchronized (LockscreenController.this.lockscreenCallbacks) {
                    try {
                        Iterator it2 = LockscreenController.this.lockscreenCallbacks.iterator();
                        while (it2.hasNext()) {
                            ((LockscreenCallbacks) it2.next()).onUnlockSuccess(isDeviceLocked, isKeyguardLocked);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    private void informUserToUnlockPhone() {
        if (this.playedKeyguardUnlockSound) {
            return;
        }
        this.playedKeyguardUnlockSound = true;
        playUnlockSound();
    }

    private void playUnlockSound() {
        MediaPlayer mediaPlayer = getMediaPlayer();
        if (mediaPlayer == null) {
            Log.w(TAG, "Unable to play unlock sound. MediaPlayer was null.");
            return;
        }
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.amazon.alexa.voiceui.lockscreen.LockscreenController.2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer2) {
                mediaPlayer2.release();
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.amazon.alexa.voiceui.lockscreen.LockscreenController.3
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                ArcMode$$ExternalSyntheticOutline0.m(i, "Unable to play unlock sound. Error code = ", LockscreenController.TAG);
                return false;
            }
        });
        mediaPlayer.start();
    }

    public void addLockscreenCallbacks(LockscreenCallbacks lockscreenCallbacks) {
        synchronized (this.lockscreenCallbacks) {
            this.lockscreenCallbacks.add(lockscreenCallbacks);
        }
    }

    public boolean canDisplayVoiceUI() {
        return this.showOverLockscreen || !isOnLockScreen();
    }

    @VisibleForTesting
    public MediaPlayer getMediaPlayer() {
        return MediaPlayer.create(this.activity, R.raw.unlock_device_to_make_request);
    }

    public boolean isExpectingSubsequentLifecycleCallbacks() {
        if (!isOnLockScreen()) {
            return false;
        }
        boolean z = this.lockscreenFlagsAddedToWindow;
        return (z && this.onStartCount == 1) || !(z || this.keyguardManager.isDeviceLocked());
    }

    public boolean isKeyguardSecure() {
        return this.keyguardManager.isKeyguardSecure();
    }

    public boolean isOnLockScreen() {
        return this.keyguardManager.isKeyguardLocked();
    }

    public boolean isOnSecureLockScreen() {
        return this.keyguardManager.inKeyguardRestrictedInputMode() && isOnLockScreen() && isKeyguardSecure();
    }

    public Observable<Boolean> onCanDisplayVoiceUI() {
        return this.canDisplayVoiceUiObservable.distinctUntilChanged();
    }

    public void promptUserToUnlockPhoneIfRequired() {
        if (!isOnSecureLockScreen() || this.showOverLockscreen) {
            return;
        }
        informUserToUnlockPhone();
    }

    public boolean requestPhoneUnlockIfRequired() {
        this.onStartCount++;
        if (!isOnLockScreen() || !wasScreenLocked() || this.showOverLockscreen) {
            return false;
        }
        Log.i(TAG, "Bringing up keyguard");
        bringUpKeyguard();
        return true;
    }

    public void setShouldShowOverLockscreen(boolean z) {
        this.showOverLockscreen = z;
        this.canDisplayVoiceUiObservable.onNext(Boolean.valueOf(canDisplayVoiceUI()));
    }

    public void setWasScreenLocked(boolean z) {
        this.wasScreenLocked = Boolean.valueOf(z);
    }

    public boolean showKeyguardIfDeviceLocked() {
        if (!this.keyguardManager.isDeviceLocked()) {
            return false;
        }
        bringUpKeyguard();
        return true;
    }

    public void showOverLockscreenIfRequired() {
        if (isOnLockScreen() && wasScreenLocked() && this.showOverLockscreen) {
            this.lockscreenFlagsAddedToWindow = true;
            this.activity.getWindow().addFlags(525312);
        }
    }

    @VisibleForTesting
    public boolean wasScreenLocked() {
        Boolean bool = this.wasScreenLocked;
        return bool == null ? this.keyguardManager.isKeyguardLocked() : bool.booleanValue();
    }
}
