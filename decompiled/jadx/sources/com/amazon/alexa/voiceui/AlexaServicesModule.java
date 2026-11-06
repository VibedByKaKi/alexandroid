package com.amazon.alexa.voiceui;

import android.content.Context;
import com.amazon.alexa.api.AlexaMobileFrameworkApis;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
class AlexaServicesModule {
    @Provides
    @Singleton
    public AlexaMobileFrameworkApis providesAlexaMobileFrameworkApis(Context context) {
        return new AlexaMobileFrameworkApis(context);
    }

    @Provides
    @Singleton
    public AlexaServicesApis providesAlexaServicesApis(AlexaMobileFrameworkApis alexaMobileFrameworkApis) {
        return new AlexaServicesWrapper(alexaMobileFrameworkApis);
    }
}
