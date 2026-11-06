package com.amazon.alexa.app.notification.nc;

import android.util.Log;
import com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class NotificationCenterLifecycleObserver implements MainActivityLifecycleObserver {
    private static final String TAG = "NotificationCenterLifecycleObserver";
    private final NotificationCenterService notificationCenterService;

    public NotificationCenterLifecycleObserver(NotificationCenterService notificationCenterService) {
        this.notificationCenterService = notificationCenterService;
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityResume() {
        Log.i(TAG, "=== NOTIFICATION BADGE UPDATE === onActivityResume");
        this.notificationCenterService.updateNotificationBadge();
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityCreated() {
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityDestroy() {
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityPause() {
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityStart() {
    }

    @Override // com.amazon.alexa.protocols.lifecycle.MainActivityLifecycleObserver
    public void onActivityStop() {
    }
}
