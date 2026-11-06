package com.amazon.alexa.voice.bottomsheet;

import android.content.Context;
import com.amazon.alexa.utils.device.FireTabletUtils;
import com.amazon.alexa.voice.locale.LocaleInteractor;
import com.amazon.alexa.voice.metrics.service.MetricsService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class BottomSheetModule {
    private BottomSheetModule() {
    }

    @Provides
    @Singleton
    public static BottomSheetFeatureEnabler provideBottomSheetEnabler(Context context, LocaleInteractor localeInteractor, MetricsService metricsService) {
        return FireTabletUtils.shouldGrootBeEnabled(context) ? new GrootBottomSheetFeatureEnabler(localeInteractor, metricsService) : new BottomSheetFeatureEnabler(localeInteractor, metricsService);
    }
}
