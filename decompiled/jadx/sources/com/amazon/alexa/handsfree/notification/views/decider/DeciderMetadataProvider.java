package com.amazon.alexa.handsfree.notification.views.decider;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.NotificationModule;
import com.amazon.alexa.handsfree.notification.api.HandsFreeSetupStateProvider;
import com.amazon.alexa.handsfree.notification.notificationmetadata.NotificationMetadata;
import com.amazon.alexa.handsfree.notification.views.NotificationStateProvider;
import com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DeciderMetadataProvider implements NotificationMetadataProvider {
    private static final String TAG = "DeciderMetadataProvider";
    private final HandsFreeSetupStateProvider mHandsFreeSetupStateProvider;
    private final NotificationStateProvider mNotificationStateProvider;

    public DeciderMetadataProvider() {
        this(new NotificationStateProvider(), NotificationModule.getInstance().getContract().getHandsFreeSetupStateProvider());
    }

    @Override // com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider
    @Nullable
    public NotificationMetadata getNotificationMetadata(@NonNull Context context) {
        if (this.mNotificationStateProvider.isNotificationDisabled(context)) {
            return null;
        }
        Log.d(TAG, "Decider to fetch metadata");
        return this.mHandsFreeSetupStateProvider.getNotificationMetadata(context);
    }

    @Inject
    @VisibleForTesting
    public DeciderMetadataProvider(@NonNull NotificationStateProvider notificationStateProvider, @NonNull HandsFreeSetupStateProvider handsFreeSetupStateProvider) {
        this.mNotificationStateProvider = notificationStateProvider;
        this.mHandsFreeSetupStateProvider = handsFreeSetupStateProvider;
    }
}
