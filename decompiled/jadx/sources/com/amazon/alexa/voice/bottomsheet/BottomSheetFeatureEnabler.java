package com.amazon.alexa.voice.bottomsheet;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.voice.features.FeatureEnabler;
import com.amazon.alexa.voice.features.VoiceFeature;
import com.amazon.alexa.voice.locale.LocaleInteractor;
import com.amazon.alexa.voice.metrics.BottomSheetMetricEventName;
import com.amazon.alexa.voice.metrics.service.MetricsService;
import com.amazon.alexa.voice.model.VoiceService;
import com.amazon.alexa.voice.tta.TypeToAlexaFeatureEnabler;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class BottomSheetFeatureEnabler implements FeatureEnabler {
    private static final String TAG = "BottomSheetFeatureEnabler";

    @VisibleForTesting
    public static final Set<VoiceService.InvocationType> TYPE_FIRST_INVOCATION_TYPES = new HashSet(Arrays.asList(VoiceService.InvocationType.SEARCH_BAR, VoiceService.InvocationType.APP_INGRESS, VoiceService.InvocationType.CARD, VoiceService.InvocationType.DEVICE_ASSISTANT, VoiceService.InvocationType.INTENT, VoiceService.InvocationType.SHORTCUT, VoiceService.InvocationType.QUICK_ACTIONS_WIDGET, VoiceService.InvocationType.UNKNOWN));
    Locale avsLocale;
    Locale deviceLocale;
    boolean isFeatureEnabled = false;
    final LocaleInteractor localeInteractor;
    final MetricsService metricsService;

    @Inject
    public BottomSheetFeatureEnabler(LocaleInteractor localeInteractor, MetricsService metricsService) {
        this.localeInteractor = localeInteractor;
        this.metricsService = metricsService;
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public void enableFeature(boolean z) {
        Automotive$$ExternalSyntheticOutline0.m8396m("enableFeature shouldEnable ", TAG, z);
        this.isFeatureEnabled = z;
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public VoiceFeature getFeature() {
        Locale stripExtensions = Locale.getDefault().stripExtensions();
        this.deviceLocale = TypeToAlexaFeatureEnabler.DEVICE_LOCALE_AVS_LOCALE_MAP.getOrDefault(stripExtensions, stripExtensions);
        return VoiceFeature.FAB_BOTTOM_SHEET_I18N;
    }

    public boolean isBottomSheetEnabled() {
        this.avsLocale = this.localeInteractor.getPrimaryLocale();
        recordLocaleMismatchMetricForBottomSheet();
        if (Locale.US.equals(this.avsLocale) && isDeviceAndAvsLocaleSame()) {
            return true;
        }
        return this.isFeatureEnabled;
    }

    public boolean isDeviceAndAvsLocaleSame() {
        Objects.toString(this.deviceLocale);
        Objects.toString(this.avsLocale);
        Locale locale = this.deviceLocale;
        if (locale != null) {
            locale.toLanguageTag();
        }
        Locale locale2 = this.avsLocale;
        return locale2 != null && this.deviceLocale != null && locale2.getCountry().equals(this.deviceLocale.getCountry()) && this.avsLocale.getLanguage().equals(this.deviceLocale.getLanguage());
    }

    public boolean isTypeFirstBottomSheet(VoiceService.InvocationType invocationType) {
        Objects.toString(invocationType);
        return TYPE_FIRST_INVOCATION_TYPES.contains(invocationType);
    }

    public void recordLocaleMismatchMetricForBottomSheet() {
        if (isDeviceAndAvsLocaleSame()) {
            return;
        }
        this.metricsService.recordEvent(BottomSheetMetricEventName.BS_LOCALE_MISMATCH, "vox_speech", null);
    }

    public boolean isBottomSheetEnabled(VoiceService.InvocationType invocationType) {
        return (invocationType != VoiceService.InvocationType.VOICE_ENROLLMENT && invocationType != VoiceService.InvocationType.DRIVE_MODE_TAP && invocationType != VoiceService.InvocationType.UNKNOWN) && isBottomSheetEnabled();
    }
}
