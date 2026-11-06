package com.amazon.alexa.voiceui.notifications;

import com.amazon.alexa.voiceui.lockscreen.LockscreenController;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
class SmartLockNotificationInteractor {
    private final LockscreenController lockscreenController;

    @Inject
    public SmartLockNotificationInteractor(LockscreenController lockscreenController) {
        this.lockscreenController = lockscreenController;
    }

    public boolean isUsingSecureLockscreen() {
        return this.lockscreenController.isKeyguardSecure();
    }

    public void setLockscreenCallbacks(LockscreenController.LockscreenCallbacks lockscreenCallbacks) {
        this.lockscreenController.addLockscreenCallbacks(lockscreenCallbacks);
    }
}
