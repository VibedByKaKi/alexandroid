package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2;
import com.amazon.alexa.api.compat.model.VoiceActivityDetectionListener;
import com.amazon.alexa.api.compat.model.VoiceChatModeChangeReason;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/api/compat/VoiceActivityDetectionAssistantSubcomponentV2;", "Lcom/amazon/alexa/api/compat/model/VoiceActivityDetectionApiV2;", "<init>", "()V", "registerListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/api/compat/model/VoiceActivityDetectionListener;", "deregisterListener", "startVoiceActivityDetection", "stopVoiceActivityDetection", "reason", "Lcom/amazon/alexa/api/compat/model/VoiceChatModeChangeReason;", "muteVoiceActivityDetection", "unmuteVoiceActivityDetection", "isVoiceActivityDetectionActive", "", "isMuted", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoiceActivityDetectionAssistantSubcomponentV2 implements VoiceActivityDetectionApiV2 {
    @Override // com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2
    public void deregisterListener(@NotNull VoiceActivityDetectionListener listener) {
        listener.getClass();
    }

    @Override // com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2
    public boolean isMuted() {
        return false;
    }

    @Override // com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2
    public boolean isVoiceActivityDetectionActive() {
        return false;
    }

    @Override // com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2
    public void registerListener(@NotNull VoiceActivityDetectionListener listener) {
        listener.getClass();
    }

    @Override // com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2
    public void stopVoiceActivityDetection(@NotNull VoiceChatModeChangeReason reason) {
        reason.getClass();
    }

    @Override // com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2
    public void stopVoiceActivityDetection() {
    }

    @Override // com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2
    public void muteVoiceActivityDetection() {
    }

    @Override // com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2
    public void startVoiceActivityDetection() {
    }

    @Override // com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2
    public void unmuteVoiceActivityDetection() {
    }
}
