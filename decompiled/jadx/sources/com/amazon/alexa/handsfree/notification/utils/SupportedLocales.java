package com.amazon.alexa.handsfree.notification.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.handsfree.devices.locales.NotificationsSupportedLocales;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SupportedLocales {
    private final Context mContext;
    private final NotificationsSupportedLocales mNotificationsSupportedLocales;

    @Inject
    @VisibleForTesting
    public SupportedLocales(@NonNull Context context, @NonNull DeviceTypeInformationProvider deviceTypeInformationProvider) {
        this.mContext = context;
        this.mNotificationsSupportedLocales = deviceTypeInformationProvider.getDeviceInformationForCurrentDevice(context).getNotificationsSupportedLocales();
    }

    public boolean isCurrentLocaleSupported() {
        return this.mNotificationsSupportedLocales.isLocaleSupported(this.mContext, this.mContext.getResources().getConfiguration().getLocales().get(0).toLanguageTag());
    }

    public SupportedLocales(@NonNull Context context) {
        this(context, DeviceTypeInformationProvider.getInstance(context));
    }
}
