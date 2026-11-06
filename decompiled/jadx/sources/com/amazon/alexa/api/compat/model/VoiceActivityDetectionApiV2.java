package com.amazon.alexa.api.compat.model;

import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0010H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/VoiceActivityDetectionApiV2;", "", "registerListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/api/compat/model/VoiceActivityDetectionListener;", "deregisterListener", "startVoiceActivityDetection", "stopVoiceActivityDetection", "reason", "Lcom/amazon/alexa/api/compat/model/VoiceChatModeChangeReason;", "stopVoiceActivityDetectionIfSilenced", "muteVoiceActivityDetection", "unmuteVoiceActivityDetection", "setLiveModeOnboardingVisible", ViewProps.VISIBLE, "", "isVoiceActivityDetectionActive", "isMuted", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface VoiceActivityDetectionApiV2 {
    void deregisterListener(@NotNull VoiceActivityDetectionListener listener);

    boolean isMuted();

    boolean isVoiceActivityDetectionActive();

    void muteVoiceActivityDetection();

    void registerListener(@NotNull VoiceActivityDetectionListener listener);

    void startVoiceActivityDetection();

    void stopVoiceActivityDetection();

    default void stopVoiceActivityDetection(@NotNull VoiceChatModeChangeReason reason) {
        reason.getClass();
        stopVoiceActivityDetection();
    }

    void unmuteVoiceActivityDetection();

    default void stopVoiceActivityDetectionIfSilenced() {
    }

    default void setLiveModeOnboardingVisible(boolean visible) {
    }
}
