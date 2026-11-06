package com.amazon.alexa.voice.bottomsheet;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.features.VoiceFeature;
import com.amazon.alexa.voice.locale.LocaleInteractor;
import com.amazon.alexa.voice.metrics.service.MetricsService;
import com.amazon.alexa.voice.model.VoiceService;
import com.amazon.alexa.voice.tta.TypeToAlexaFeatureEnabler;
import java.util.Locale;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class GrootBottomSheetFeatureEnabler extends BottomSheetFeatureEnabler {
    private static final String TAG = "GrootBottomSheetFeatureEnabler";

    @Inject
    public GrootBottomSheetFeatureEnabler(LocaleInteractor localeInteractor, MetricsService metricsService) {
        super(localeInteractor, metricsService);
    }

    @Override // com.amazon.alexa.voice.bottomsheet.BottomSheetFeatureEnabler, com.amazon.alexa.voice.features.FeatureEnabler
    public void enableFeature(boolean z) {
        Automotive$$ExternalSyntheticOutline0.m8396m("enableFeature shouldEnable ", TAG, z);
        this.isFeatureEnabled = z;
    }

    @Override // com.amazon.alexa.voice.bottomsheet.BottomSheetFeatureEnabler, com.amazon.alexa.voice.features.FeatureEnabler
    public VoiceFeature getFeature() {
        Locale locale = Locale.getDefault();
        this.deviceLocale = TypeToAlexaFeatureEnabler.DEVICE_LOCALE_AVS_LOCALE_MAP.getOrDefault(locale, locale);
        return VoiceFeature.FAB_BOTTOM_SHEET_I18N;
    }

    @Override // com.amazon.alexa.voice.bottomsheet.BottomSheetFeatureEnabler
    public boolean isBottomSheetEnabled(VoiceService.InvocationType invocationType) {
        return (invocationType != null && invocationType != VoiceService.InvocationType.VOICE_ENROLLMENT && invocationType != VoiceService.InvocationType.DRIVE_MODE_TAP && invocationType != VoiceService.InvocationType.UNKNOWN) && isBottomSheetEnabled();
    }

    @Override // com.amazon.alexa.voice.bottomsheet.BottomSheetFeatureEnabler
    public boolean isBottomSheetEnabled() {
        this.avsLocale = this.localeInteractor.getPrimaryLocale();
        recordLocaleMismatchMetricForBottomSheet();
        return true;
    }
}
