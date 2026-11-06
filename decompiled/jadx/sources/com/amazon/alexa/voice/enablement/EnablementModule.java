package com.amazon.alexa.voice.enablement;

import android.content.Context;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.identity.api.IdentityService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class EnablementModule {
    private EnablementModule() {
    }

    @Provides
    @Singleton
    public static ComponentEnabler provideComponentEnabler(Context context, AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2) {
        return new ComponentEnabler(context, alexaMobileFrameworkApisV2);
    }

    @Provides
    @Singleton
    public static VoiceEnablement provideVoiceEnablement(DeviceInformation deviceInformation) {
        return new ApplicationVoiceEnablement(deviceInformation);
    }

    @Provides
    @Singleton
    public static VoiceIdentityAdapter provideVoiceIdentityAdapter(IdentityService identityService, EventBus eventBus, Context context) {
        return new VoiceIdentityAdapter(identityService, eventBus, context);
    }
}
