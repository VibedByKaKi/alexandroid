package com.amazon.alexa.handsfree.notification.api;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface ConfigurationProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConfigComponent {
        HANDS_FREE,
        LOCK_SCREEN,
        NOTIFICATION
    }

    Integer getMaxAllowedNotificationsBeforeTerms(@NonNull Context context);

    Integer getMaxDaysAfterFirstUtterance(@NonNull Context context, @NonNull String str);

    Integer getMinHoursBeforeNextUtterance(@NonNull Context context, @NonNull String str);

    List<Long> getNotificationTimeIntervals(@NonNull Context context, @NonNull String str);

    Integer getUtteranceNotificationMaxCount(@NonNull Context context, @NonNull String str);

    boolean isActive(@NonNull Context context, @NonNull ConfigComponent configComponent);
}
