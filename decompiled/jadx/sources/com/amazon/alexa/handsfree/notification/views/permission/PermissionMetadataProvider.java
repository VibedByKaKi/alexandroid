package com.amazon.alexa.handsfree.notification.views.permission;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.notification.notificationmetadata.NotificationMetadata;
import com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class PermissionMetadataProvider implements NotificationMetadataProvider {
    @Override // com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider
    @Nullable
    public NotificationMetadata getNotificationMetadata(@NonNull Context context) {
        return NotificationMetadata.PERMISSION_REQUEST;
    }
}
