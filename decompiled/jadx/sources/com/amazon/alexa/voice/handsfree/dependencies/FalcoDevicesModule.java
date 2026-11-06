package com.amazon.alexa.voice.handsfree.dependencies;

import android.content.Context;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider.AHFSdkSupporter;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.utils.VoiceAppStatusProvider;
import dagger.Module;
import dagger.Provides;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class FalcoDevicesModule {
    @AhfScope
    @Provides
    public AMPDInformationProvider ampdInformationProvider(Context context) {
        return AMPDInformationProvider.getInstance(context);
    }

    @AhfScope
    @Provides
    public DeviceTypeInformationProvider provideDeviceTypeInformationProvider(Context context) {
        return DeviceTypeInformationProvider.getInstance(context);
    }

    @AhfScope
    @Provides
    public VoiceAppStatusProvider provideVoiceAppStatusProvider(AMPDInformationProvider aMPDInformationProvider) {
        Objects.requireNonNull(aMPDInformationProvider);
        return aMPDInformationProvider.new AHFSdkSupporter();
    }
}
