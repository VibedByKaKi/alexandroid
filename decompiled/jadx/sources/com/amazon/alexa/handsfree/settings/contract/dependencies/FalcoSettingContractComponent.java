package com.amazon.alexa.handsfree.settings.contract.dependencies;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentProtocol;
import com.amazon.alexa.handsfree.settings.contract.SettingsContract;
import com.amazon.alexa.handsfree.settings.contract.SettingsSetupFlowContract;
import dagger.Subcomponent;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Subcomponent
/* loaded from: classes17.dex */
public interface FalcoSettingContractComponent extends AhfComponentProtocol {
    public static final String AUDIO_PROVIDER_SERVICE = "AudioProviderService";

    @Nullable
    @Named(AUDIO_PROVIDER_SERVICE)
    Intent audioProviderServiceIntent();

    @Nullable
    SettingsContract settingsContract();

    @Nullable
    SettingsSetupFlowContract settingsSetupFlowContract();
}
