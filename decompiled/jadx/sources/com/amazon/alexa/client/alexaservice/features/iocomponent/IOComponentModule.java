package com.amazon.alexa.client.alexaservice.features.iocomponent;

import android.content.Context;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.VoiceActivityDetectionAuthority;
import com.amazon.alexa.client.alexaservice.base.device.Device;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.DeviceIOComponentsStateProviderFactory;
import com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.IOComponentsStateProvider;
import com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.InternalTrustedStatesProvider;
import com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.TrustedStatesProvider;
import com.amazon.alexa.client.alexaservice.ui.core.LockScreenManager;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.devices.DeviceInformation;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.utils.TimeProvider;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class IOComponentModule {
    @Provides
    @Singleton
    public Device providesDevice() {
        return Device.create();
    }

    @Nullable
    @Provides
    @Singleton
    public DeviceInformation providesDeviceInformation(Context context) {
        return DeviceTypeInformationProvider.getInstance(context).getSupportedDeviceInformation(context);
    }

    @Nullable
    @Provides
    @Singleton
    public IOComponentsStateProvider providesIOComponentsStateProvider(Context context, DeviceIOComponentsStateProviderFactory deviceIOComponentsStateProviderFactory) {
        return deviceIOComponentsStateProviderFactory.createStateProvider(DeviceTypeInformationProvider.getInstance(context).getSupportedDeviceInformation(context), AMPDInformationProvider.getInstance(context));
    }

    @Provides
    @Singleton
    public TrustedStatesProvider providesTrustedStatesProvider(LockScreenManager lockScreenManager, TimeProvider timeProvider, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority, Lazy<VoiceActivityDetectionAuthority> lazy) {
        return new InternalTrustedStatesProvider(lockScreenManager, timeProvider, featureFlagConfigurationAuthority, lazy);
    }
}
