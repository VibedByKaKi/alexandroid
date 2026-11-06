package com.amazon.alexa.voice.handsfree.notifications.providers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.api.DeviceInformationProvider;
import com.amazon.alexa.handsfree.vendor.bridge.VoiceAppPackageInfoProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NotificationDeviceInformationProvider implements DeviceInformationProvider {
    private final VoiceAppPackageInfoProvider mVoiceAppPackageInfoProvider;

    public NotificationDeviceInformationProvider(@NonNull Context context) {
        this(new VoiceAppPackageInfoProvider(context));
    }

    @Override // com.amazon.alexa.handsfree.notification.api.DeviceInformationProvider
    public boolean isTrueTurnkey() {
        return this.mVoiceAppPackageInfoProvider.getSupportedVoiceApp() != null;
    }

    @VisibleForTesting
    public NotificationDeviceInformationProvider(@NonNull VoiceAppPackageInfoProvider voiceAppPackageInfoProvider) {
        this.mVoiceAppPackageInfoProvider = voiceAppPackageInfoProvider;
    }
}
