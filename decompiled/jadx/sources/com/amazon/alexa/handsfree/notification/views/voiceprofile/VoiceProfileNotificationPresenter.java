package com.amazon.alexa.handsfree.notification.views.voiceprofile;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.DismissIntentProvider;
import com.amazon.alexa.handsfree.notification.NotificationType;
import com.amazon.alexa.handsfree.notification.views.base.NotificationMetadataProvider;
import com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class VoiceProfileNotificationPresenter extends NotificationViewPresenter {

    @VisibleForTesting
    static final String UVR_ACTION = "com.amazon.alexa.handsfree.UVR";

    public VoiceProfileNotificationPresenter() {
        this(new DismissIntentProvider(), NotificationType.VOICE_PROFILE, new VoiceProfileMetadataProvider());
    }

    @Override // com.amazon.alexa.handsfree.notification.views.base.NotificationViewPresenter
    public PendingIntent getContentIntent(@NonNull Context context) {
        Intent intent = new Intent(UVR_ACTION);
        putNotificationIntentExtras(context, intent);
        return PendingIntent.getActivity(context, 0, intent, 201326592);
    }

    @Inject
    @VisibleForTesting
    public VoiceProfileNotificationPresenter(@NonNull DismissIntentProvider dismissIntentProvider, @NonNull NotificationType notificationType, @NonNull NotificationMetadataProvider notificationMetadataProvider) {
        super(dismissIntentProvider, notificationType, notificationMetadataProvider);
    }
}
