package com.amazon.alexa.handsfree.notification.api;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.notification.notificationmetadata.NotificationMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface HandsFreeSetupStateProvider {
    boolean canEnableWakeWord(@NonNull Context context);

    NotificationMetadata getNotificationMetadata(@NonNull Context context);

    Intent getSetupFlowIntent(@NonNull Context context);

    boolean isHandsFreeSetupComplete(@NonNull Context context);
}
