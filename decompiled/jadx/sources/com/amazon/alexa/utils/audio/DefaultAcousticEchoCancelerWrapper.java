package com.amazon.alexa.utils.audio;

import android.media.audiofx.AcousticEchoCanceler;
import com.amazon.alexa.client.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class DefaultAcousticEchoCancelerWrapper implements AcousticEchoCancelerWrapper {
    private static final String TAG = "DefaultAcousticEchoCancelerWrapper";
    private final AcousticEchoCanceler acousticEchoCanceler;

    public DefaultAcousticEchoCancelerWrapper(@NonNull AcousticEchoCanceler acousticEchoCanceler) {
        this.acousticEchoCanceler = acousticEchoCanceler;
    }

    @Override // com.amazon.alexa.utils.audio.AcousticEchoCancelerWrapper
    public boolean getEnabled() {
        return this.acousticEchoCanceler.getEnabled();
    }

    @Override // com.amazon.alexa.utils.audio.AcousticEchoCancelerWrapper
    public boolean isAvailable() {
        return true;
    }

    @Override // com.amazon.alexa.utils.audio.AcousticEchoCancelerWrapper
    public void release() {
        this.acousticEchoCanceler.release();
    }

    @Override // com.amazon.alexa.utils.audio.AcousticEchoCancelerWrapper
    public void setEnabled(boolean z) {
        this.acousticEchoCanceler.setEnabled(z);
    }
}
