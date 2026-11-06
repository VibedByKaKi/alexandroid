package com.amazon.alexa.utils.audio;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class NoOpAcousticEchoCancelerWrapper implements AcousticEchoCancelerWrapper {
    private static final String TAG = "NoOpAcousticEchoCancelerWrapper";

    @Override // com.amazon.alexa.utils.audio.AcousticEchoCancelerWrapper
    public boolean getEnabled() {
        return false;
    }

    @Override // com.amazon.alexa.utils.audio.AcousticEchoCancelerWrapper
    public boolean isAvailable() {
        return false;
    }

    @Override // com.amazon.alexa.utils.audio.AcousticEchoCancelerWrapper
    public void release() {
    }

    @Override // com.amazon.alexa.utils.audio.AcousticEchoCancelerWrapper
    public void setEnabled(boolean z) {
    }
}
