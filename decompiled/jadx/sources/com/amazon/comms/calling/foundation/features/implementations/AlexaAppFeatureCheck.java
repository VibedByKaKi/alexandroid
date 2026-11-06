package com.amazon.comms.calling.foundation.features.implementations;

import com.amazon.comms.calling.foundation.features.FeatureCheck;
import com.amazon.comms.calling.foundation.features.providers.FeatureCheckProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u0007H\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/amazon/comms/calling/foundation/features/implementations/AlexaAppFeatureCheck;", "Lcom/amazon/comms/calling/foundation/features/FeatureCheck;", "provider", "Lcom/amazon/comms/calling/foundation/features/providers/FeatureCheckProvider;", "<init>", "(Lcom/amazon/comms/calling/foundation/features/providers/FeatureCheckProvider;)V", "isCommsAllFeaturesEnabled", "", "isEnabled", "feature", "Lcom/amazon/comms/calling/foundation/features/implementations/Features;", "includesCommsAllFeatures", "isNamespaceFeatureEnabled", "isRealTimeTextEnabled", "isPublishingMetricsToInsightsEnabled", "isCallCaptioningEnabled", "isCaptioningTranslationEnabled", "isEffectEnabled", "isReactionEnabled", "isMPUCallOrientationEnabled", "isDynamicPipEnabled", "isCallingMpuVideoEventEnabled", "isFrostedEffectDisclaimerEnabled", "isAuthTokenWithHandler", "isMovablePIPEnabled", "isSiegeEncryptionEnabled", "isSIPModernizationEnabled", "isMetricEncodingEnabled", "isDisableSIPInitializationEnabled", "isNewAppLifecycleHandlingEnabled", "isHideAudioDowngradeMessageEnabled", "isAutoModeSunsetEnabled", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AlexaAppFeatureCheck implements FeatureCheck {

    @NotNull
    private final FeatureCheckProvider provider;

    public AlexaAppFeatureCheck(@NotNull FeatureCheckProvider featureCheckProvider) {
        featureCheckProvider.getClass();
        this.provider = featureCheckProvider;
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isAuthTokenWithHandler() {
        return true;
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isAutoModeSunsetEnabled() {
        return isEnabled(Features.AUTO_MODE_SUNSET, false);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isCallCaptioningEnabled() {
        return isEnabled(Features.TACHYON_FEATURE_MIAOYU, true);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isCallingMpuVideoEventEnabled() {
        return isNamespaceFeatureEnabled(Features.CALLING_MPU_VIDEO_EVENT, false);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isCaptioningTranslationEnabled() {
        return isNamespaceFeatureEnabled(Features.TACHYON_FEATURE_SCRIBE_TRANSLATE_ANDROID, true);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isCommsAllFeaturesEnabled() {
        return this.provider.isEnabled(Features.COMMS_ALL_FEATURES.getFeatureName()) || this.provider.isEnabled(Features.COMMS_ALL_FEATURES_NEW.getFeatureName());
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isDisableSIPInitializationEnabled() {
        return isNamespaceFeatureEnabled(Features.CALLING_DECOUPLING_DISABLE_SIP_INITIALIZATION, false);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isDynamicPipEnabled() {
        return isEnabled(Features.MPU_DYNAMIC_PIP, true);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isEffectEnabled() {
        return isEnabled(Features.SEPIA, true);
    }

    public final boolean isEnabled(@NotNull Features feature, boolean includesCommsAllFeatures) {
        feature.getClass();
        if (includesCommsAllFeatures && isCommsAllFeaturesEnabled()) {
            return true;
        }
        return this.provider.isEnabled(feature.getFeatureName());
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isFrostedEffectDisclaimerEnabled() {
        return isNamespaceFeatureEnabled(Features.CALLING_ENABLE_FROSTED_EFFECT_DISMISS, false);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isHideAudioDowngradeMessageEnabled() {
        return isNamespaceFeatureEnabled(Features.CALLING_HIDE_AUDIO_DOWNGRADE_MESSAGE_ANDROID, false);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isMPUCallOrientationEnabled() {
        return isEnabled(Features.DESPACITO, true);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isMetricEncodingEnabled() {
        return isNamespaceFeatureEnabled(Features.CALLING_DECOUPLING_ENABLE_METRICS, true);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isMovablePIPEnabled() {
        return isNamespaceFeatureEnabled(Features.CALLING_MOVABLE_PIP, true);
    }

    public final boolean isNamespaceFeatureEnabled(@NotNull Features feature, boolean includesCommsAllFeatures) {
        feature.getClass();
        if (includesCommsAllFeatures && isCommsAllFeaturesEnabled()) {
            return true;
        }
        return this.provider.isNamespaceFeatureEnabled(feature);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isNewAppLifecycleHandlingEnabled() {
        return isNamespaceFeatureEnabled(Features.CALLING_DECOUPLING_APP_LIFECYCLE_HANDLING, true);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isPublishingMetricsToInsightsEnabled() {
        return isEnabled(Features.ALEXA_COMMS_ENABLE_INSIGHTS_ON_AMA, false);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isReactionEnabled() {
        return isEnabled(Features.REACTIONS, true);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isRealTimeTextEnabled() {
        return isEnabled(Features.TACHYON_FEATURE_LINDAIYU, true);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isSIPModernizationEnabled() {
        return isNamespaceFeatureEnabled(Features.CALLING_ENABLE_SIP_MODERNIZATION, false);
    }

    @Override // com.amazon.comms.calling.foundation.features.FeatureCheck
    public boolean isSiegeEncryptionEnabled() {
        return isNamespaceFeatureEnabled(Features.ANDROID_CALLING_DECOUPLING_ENABLE_SIEGE_ENCRYPTION, false);
    }
}
