package com.amazon.alexa.voice.ftue;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.voice.features.VoiceFeature;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class WakeWordDisableChecker {
    private static final String TAG = "WakeWordDisableChecker";
    private final FeatureServiceV2 featureServiceV2;

    public WakeWordDisableChecker(FeatureServiceV2 featureServiceV2) {
        this.featureServiceV2 = featureServiceV2;
    }

    public boolean shouldDisableWakeWord() {
        VoiceFeature voiceFeature = VoiceFeature.WW_DISABLE_NEW_SIGNUPS;
        boolean z = false;
        boolean hasAccess = this.featureServiceV2.hasAccess(voiceFeature.getFeatureNamespace(), voiceFeature.getName(), false);
        Locale locale = Locale.getDefault();
        boolean z2 = "en".equals(locale.getLanguage()) && "US".equals(locale.getCountry());
        if (hasAccess && z2) {
            z = true;
        }
        locale.toString();
        return z;
    }
}
