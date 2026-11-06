package com.amazon.alexa.voice.locale;

import android.content.Context;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.voice.metrics.VoxMetricEventProcessingService;
import com.amazon.alexa.voice.sdk.SdkSelectionOrchestrator;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class LocaleModule {
    private LocaleModule() {
    }

    @Provides
    @Singleton
    public static LocaleInteractor provideLocaleInteractor(AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2, LocalePreference localePreference, IdentityService identityService, VoxMetricEventProcessingService voxMetricEventProcessingService, SdkSelectionOrchestrator sdkSelectionOrchestrator) {
        return new AlexaLocaleInteractor(alexaMobileFrameworkApisV2, localePreference, identityService, voxMetricEventProcessingService, sdkSelectionOrchestrator);
    }

    @Provides
    public static LocalePreference provideLocaleSetting(Context context) {
        return new UserLocalePreference(context);
    }
}
