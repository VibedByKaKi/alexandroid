package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.audio;

import android.media.audiofx.AcousticEchoCanceler;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/audio/DefaultAcousticEchoCancelerFactory;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/audio/AcousticEchoCancelerFactory;", "<init>", "()V", "isAvailable", "", "create", "Landroid/media/audiofx/AcousticEchoCanceler;", "audioSessionId", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultAcousticEchoCancelerFactory implements AcousticEchoCancelerFactory {
    @Override // com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.audio.AcousticEchoCancelerFactory
    @Nullable
    public AcousticEchoCanceler create(int audioSessionId) {
        return AcousticEchoCanceler.create(audioSessionId);
    }

    @Override // com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.audio.AcousticEchoCancelerFactory
    public boolean isAvailable() {
        return AcousticEchoCanceler.isAvailable();
    }
}
