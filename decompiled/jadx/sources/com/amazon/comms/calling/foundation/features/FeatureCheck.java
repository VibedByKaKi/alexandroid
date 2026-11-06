package com.amazon.comms.calling.foundation.features;

import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/foundation/features/FeatureCheck;", "", "isRealTimeTextEnabled", "", "isPublishingMetricsToInsightsEnabled", "isCallCaptioningEnabled", "isCaptioningTranslationEnabled", "isEffectEnabled", "isReactionEnabled", "isMPUCallOrientationEnabled", "isDynamicPipEnabled", "isCommsAllFeaturesEnabled", "isCallingMpuVideoEventEnabled", "isFrostedEffectDisclaimerEnabled", "isAuthTokenWithHandler", "isMovablePIPEnabled", "isSiegeEncryptionEnabled", "isSIPModernizationEnabled", "isMetricEncodingEnabled", "isDisableSIPInitializationEnabled", "isNewAppLifecycleHandlingEnabled", "isHideAudioDowngradeMessageEnabled", "isAutoModeSunsetEnabled", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface FeatureCheck {
    boolean isAuthTokenWithHandler();

    boolean isAutoModeSunsetEnabled();

    boolean isCallCaptioningEnabled();

    boolean isCallingMpuVideoEventEnabled();

    boolean isCaptioningTranslationEnabled();

    boolean isCommsAllFeaturesEnabled();

    boolean isDisableSIPInitializationEnabled();

    boolean isDynamicPipEnabled();

    boolean isEffectEnabled();

    boolean isFrostedEffectDisclaimerEnabled();

    boolean isHideAudioDowngradeMessageEnabled();

    boolean isMPUCallOrientationEnabled();

    boolean isMetricEncodingEnabled();

    boolean isMovablePIPEnabled();

    boolean isNewAppLifecycleHandlingEnabled();

    boolean isPublishingMetricsToInsightsEnabled();

    boolean isReactionEnabled();

    boolean isRealTimeTextEnabled();

    boolean isSIPModernizationEnabled();

    boolean isSiegeEncryptionEnabled();
}
