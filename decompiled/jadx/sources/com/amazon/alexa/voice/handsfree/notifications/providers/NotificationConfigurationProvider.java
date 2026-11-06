package com.amazon.alexa.voice.handsfree.notifications.providers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.notification.api.ConfigurationProvider;
import com.amazon.alexa.handsfree.remotecontentservice.apigateway.remoteconfig.RemoteConfigManager;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NotificationConfigurationProvider implements ConfigurationProvider {
    private final RemoteConfigManager mRemoteConfigManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.voice.handsfree.notifications.providers.NotificationConfigurationProvider$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$handsfree$notification$api$ConfigurationProvider$ConfigComponent;

        static {
            int[] iArr = new int[ConfigurationProvider.ConfigComponent.values().length];
            $SwitchMap$com$amazon$alexa$handsfree$notification$api$ConfigurationProvider$ConfigComponent = iArr;
            try {
                iArr[ConfigurationProvider.ConfigComponent.HANDS_FREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$handsfree$notification$api$ConfigurationProvider$ConfigComponent[ConfigurationProvider.ConfigComponent.NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$handsfree$notification$api$ConfigurationProvider$ConfigComponent[ConfigurationProvider.ConfigComponent.LOCK_SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NotificationConfigurationProvider(@NonNull RemoteConfigManager remoteConfigManager) {
        this.mRemoteConfigManager = remoteConfigManager;
    }

    @Override // com.amazon.alexa.handsfree.notification.api.ConfigurationProvider
    @Nullable
    public Integer getMaxAllowedNotificationsBeforeTerms(@NonNull Context context) {
        return this.mRemoteConfigManager.getMaxAllowedNotificationsBeforeTerms();
    }

    @Override // com.amazon.alexa.handsfree.notification.api.ConfigurationProvider
    @Nullable
    public Integer getMaxDaysAfterFirstUtterance(@NonNull Context context, @NonNull String str) {
        return this.mRemoteConfigManager.getMaxDaysAfterFirstUtterance(str);
    }

    @Override // com.amazon.alexa.handsfree.notification.api.ConfigurationProvider
    @Nullable
    public Integer getMinHoursBeforeNextUtterance(@NonNull Context context, @NonNull String str) {
        return this.mRemoteConfigManager.getMinHoursBeforeNextUtterance(str);
    }

    @Override // com.amazon.alexa.handsfree.notification.api.ConfigurationProvider
    @Nullable
    public List<Long> getNotificationTimeIntervals(@NonNull Context context, @NonNull String str) {
        return this.mRemoteConfigManager.getNotificationDisplayIntervals(str);
    }

    @Override // com.amazon.alexa.handsfree.notification.api.ConfigurationProvider
    @Nullable
    public Integer getUtteranceNotificationMaxCount(@NonNull Context context, @NonNull String str) {
        return this.mRemoteConfigManager.getUtteranceNotificationMaxCount(str);
    }

    @Override // com.amazon.alexa.handsfree.notification.api.ConfigurationProvider
    public boolean isActive(@NonNull Context context, @NonNull ConfigurationProvider.ConfigComponent configComponent) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$handsfree$notification$api$ConfigurationProvider$ConfigComponent[configComponent.ordinal()];
        if (i == 1) {
            return this.mRemoteConfigManager.isHandsFreeActive();
        }
        if (i == 2) {
            return this.mRemoteConfigManager.isNotificationsActive();
        }
        if (i != 3) {
            return true;
        }
        return this.mRemoteConfigManager.isLockScreenActive();
    }
}
