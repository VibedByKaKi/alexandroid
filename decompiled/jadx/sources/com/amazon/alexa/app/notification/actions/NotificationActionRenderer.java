package com.amazon.alexa.app.notification.actions;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.amazon.alexa.notification.api.actions.model.NotificationAction;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface NotificationActionRenderer {
    NotificationCompat.Action createAction(Context context, NotificationAction notificationAction, Bundle bundle, String str) throws IllegalArgumentException, RuntimeException;

    void init();
}
