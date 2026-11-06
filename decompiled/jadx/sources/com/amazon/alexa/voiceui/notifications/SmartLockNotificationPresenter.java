package com.amazon.alexa.voiceui.notifications;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.voiceui.lockscreen.LockscreenController;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes20.dex */
public class SmartLockNotificationPresenter {
    private final SmartLockNotificationView notificationView;
    private final SmartLockNotificationInteractor notificationsInteractor;

    @Inject
    public SmartLockNotificationPresenter(SmartLockNotificationView smartLockNotificationView, SmartLockNotificationInteractor smartLockNotificationInteractor) {
        this.notificationsInteractor = smartLockNotificationInteractor;
        this.notificationView = smartLockNotificationView;
        smartLockNotificationInteractor.setLockscreenCallbacks(new LockscreenCallbacks());
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public class LockscreenCallbacks implements LockscreenController.LockscreenCallbacks {
        public LockscreenCallbacks() {
        }

        @Override // com.amazon.alexa.voiceui.lockscreen.LockscreenController.LockscreenCallbacks
        public void onUnlockSuccess(boolean z, boolean z2) {
            if (SmartLockNotificationPresenter.this.notificationsInteractor.isUsingSecureLockscreen()) {
                SmartLockNotificationPresenter.this.notificationView.showNotification();
            }
        }

        @Override // com.amazon.alexa.voiceui.lockscreen.LockscreenController.LockscreenCallbacks
        public void onUnlockFailure() {
        }
    }
}
