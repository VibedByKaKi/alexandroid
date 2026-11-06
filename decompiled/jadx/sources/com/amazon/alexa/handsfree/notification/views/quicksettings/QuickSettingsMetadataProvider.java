package com.amazon.alexa.handsfree.notification.views.quicksettings;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.notificationmetadata.NotificationMetadata;
import com.amazon.alexa.handsfree.notification.views.NotificationStateProvider;
import com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class QuickSettingsMetadataProvider implements NotificationMetadataProvider {
    private final NotificationStateProvider mNotificationStateProvider;

    public QuickSettingsMetadataProvider() {
        this(new NotificationStateProvider());
    }

    @Override // com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider
    @Nullable
    public NotificationMetadata getNotificationMetadata(@NonNull Context context) {
        if (this.mNotificationStateProvider.isNotificationDisabled(context)) {
            return null;
        }
        return NotificationMetadata.QUICK_SETTINGS;
    }

    @Inject
    @VisibleForTesting
    public QuickSettingsMetadataProvider(@NonNull NotificationStateProvider notificationStateProvider) {
        this.mNotificationStateProvider = notificationStateProvider;
    }
}
