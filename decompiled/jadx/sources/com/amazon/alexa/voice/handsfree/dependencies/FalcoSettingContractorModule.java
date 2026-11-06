package com.amazon.alexa.voice.handsfree.dependencies;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.settings.contract.SettingsContract;
import com.amazon.alexa.handsfree.settings.contract.SettingsSetupFlowContract;
import com.amazon.alexa.handsfree.settings.contract.dependencies.FalcoSettingContractComponent;
import com.amazon.alexa.handsfree.vendor.bridge.VendorAPIWrapper;
import com.amazon.alexa.handsfree.vendor.bridge.VendorAPIWrapperProvider;
import com.amazon.alexa.voice.handsfree.settings.providers.SettingsSetupFlowProvider;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class FalcoSettingContractorModule {
    @AhfScope
    @Provides
    @Named(FalcoSettingContractComponent.AUDIO_PROVIDER_SERVICE)
    @Nullable
    public Intent provideAudioProviderServiceIntent(Context context, VendorAPIWrapperProvider vendorAPIWrapperProvider) {
        VendorAPIWrapper supportedAPIWrapper = vendorAPIWrapperProvider.getSupportedAPIWrapper();
        if (supportedAPIWrapper != null) {
            return supportedAPIWrapper.getAudioProviderServiceIntent(context);
        }
        return null;
    }

    @Nullable
    @AhfScope
    @Provides
    public SettingsContract provideSettingsContract(VendorAPIWrapperProvider vendorAPIWrapperProvider) {
        VendorAPIWrapper supportedAPIWrapper = vendorAPIWrapperProvider.getSupportedAPIWrapper();
        if (supportedAPIWrapper != null) {
            return supportedAPIWrapper.getSettingsContract();
        }
        return null;
    }

    @AhfScope
    @Provides
    public SettingsSetupFlowContract provideSettingsSetupFlowContract() {
        return new SettingsSetupFlowProvider();
    }
}
