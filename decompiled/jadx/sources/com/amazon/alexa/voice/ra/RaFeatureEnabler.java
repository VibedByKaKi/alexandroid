package com.amazon.alexa.voice.ra;

import android.content.Context;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.utils.device.FireTabletUtils;
import com.amazon.alexa.voice.features.FeatureEnabler;
import com.amazon.alexa.voice.features.VoiceFeature;
import com.amazon.alexa.voice.locale.LocaleInteractor;
import com.amazon.alexa.voice.model.VoiceService;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class RaFeatureEnabler implements FeatureEnabler {
    private static final String TAG = "RaFeatureEnabler";

    @Inject
    BenefitsEntitlementAuthority benefitsEntitlementAuthority;
    private final Context context;
    private boolean enabled;
    private final LocaleInteractor localeInteractor;

    @Inject
    RaInternationalFeatureEnabler raInternationalFeatureEnabler;

    public RaFeatureEnabler(Context context, LocaleInteractor localeInteractor, BenefitsEntitlementAuthority benefitsEntitlementAuthority, RaInternationalFeatureEnabler raInternationalFeatureEnabler) {
        this.context = context;
        this.localeInteractor = localeInteractor;
        this.benefitsEntitlementAuthority = benefitsEntitlementAuthority;
        this.raInternationalFeatureEnabler = raInternationalFeatureEnabler;
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public void enableFeature(boolean z) {
        Automotive$$ExternalSyntheticOutline0.m8396m("enableFeature ", TAG, z);
        this.enabled = z;
    }

    @Override // com.amazon.alexa.voice.features.FeatureEnabler
    public VoiceFeature getFeature() {
        return VoiceFeature.REMARKABLE_ALEXA_UI;
    }

    public boolean isAvailable(VoiceService.InvocationType invocationType) {
        return (invocationType != VoiceService.InvocationType.VOICE_ENROLLMENT && invocationType != VoiceService.InvocationType.DRIVE_MODE_TAP) && isAvailable();
    }

    public boolean isEnabled() {
        boolean isBMCLEntitled = this.benefitsEntitlementAuthority.isBMCLEntitled();
        boolean shouldGrootBeEnabled = FireTabletUtils.shouldGrootBeEnabled(this.context);
        boolean isEnabled = this.raInternationalFeatureEnabler.isEnabled();
        boolean z = (shouldGrootBeEnabled || this.enabled || isEnabled) && isBMCLEntitled;
        String str = TAG;
        StringBuilder m = DoubleList$$ExternalSyntheticOutline0.m("RA Access is ", " -- params: ", z);
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, this.enabled, " - ", isEnabled, " - ");
        a$$ExternalSyntheticOutline0.m5m(m, isBMCLEntitled, str);
        return z;
    }

    public boolean isAvailable() {
        return isEnabled();
    }
}
