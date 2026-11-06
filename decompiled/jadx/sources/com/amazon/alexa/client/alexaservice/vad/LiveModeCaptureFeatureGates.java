package com.amazon.alexa.client.alexaservice.vad;

import androidx.annotation.NonNull;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.ra.features.featurecheck.FeatureSource;
import com.amazon.alexa.utils.device.FireTabletUtils;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class LiveModeCaptureFeatureGates {
    private static final String TAG = "LiveModeCaptureGates";

    @NonNull
    private final FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority;

    @Inject
    public LiveModeCaptureFeatureGates(@NonNull FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        this.featureFlagConfigurationAuthority = featureFlagConfigurationAuthority;
    }

    public boolean isNoiseSuppressionOff() {
        if (FireTabletUtils.isKHTablet()) {
            return this.featureFlagConfigurationAuthority.isEnabled(FeatureSource.AVS_ANDROID_NAMESPACE, Feature.ALEXA_VOICE_ANDROID_LIVE_MODE_NOISE_SUPPRESSION_OFF_KH);
        }
        return false;
    }

    public boolean isOnsetWalkBackEnabled() {
        return this.featureFlagConfigurationAuthority.isEnabled(FeatureSource.AVS_ANDROID_NAMESPACE, FireTabletUtils.isKHTablet() ? Feature.ALEXA_VOICE_ANDROID_LIVE_MODE_ONSET_WALKBACK_KH : Feature.ALEXA_VOICE_ANDROID_LIVE_MODE_ONSET_WALKBACK_ANDROID);
    }
}
