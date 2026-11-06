package com.amazon.alexa.accessory;

import android.graphics.Bitmap;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface AccessoryServiceConfigurationSupplier {
    @NonNull
    default List<String> blockedRfcommNamePrefixes() {
        return Collections.EMPTY_LIST;
    }

    @NonNull
    CharSequence getCompanionDeviceNotificationBodyText(String str, String str2);

    @ColorInt
    int getCompanionDeviceNotificationColor();

    @Nullable
    Bitmap getCompanionDeviceNotificationLargeIcon();

    @DrawableRes
    int getCompanionDeviceNotificationLargeIconRes();

    @DrawableRes
    int getCompanionDeviceNotificationSmallIconRes();

    @NonNull
    CharSequence getCompanionDeviceNotificationTitleText(String str, String str2);

    @ColorInt
    int getNotificationColor();

    @NonNull
    CharSequence getNotificationContentText(int i);

    @NonNull
    CharSequence getNotificationContentTitle();

    @Nullable
    Bitmap getNotificationLargeIcon();

    @DrawableRes
    int getNotificationLargeIconRes();

    @DrawableRes
    int getNotificationSmallIcon();

    @NonNull
    CharSequence highPriorityChannelDescription();

    String highPriorityChannelId();

    @NonNull
    CharSequence highPriorityChannelName();

    @NonNull
    CharSequence lowPriorityChannelDescription();

    String lowPriorityChannelId();

    @NonNull
    CharSequence lowPriorityChannelName();

    default boolean shouldExcludeInquirySession() {
        return false;
    }

    default boolean shouldInquirySessionTimeout() {
        return false;
    }

    default boolean shouldShowHighPriorityChannelBadge() {
        return false;
    }

    default boolean shouldShowLowPriorityChannelBadge() {
        return false;
    }

    boolean showCompanionDeviceNotification();

    boolean showCompanionDeviceNotificationBeforeSetupComplete();

    int showCompanionDeviceNotificationForApiLevelAndAbove();
}
