package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.audio;

import android.media.audiofx.AcousticEchoCanceler;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/audio/AcousticEchoCancelerFactory;", "", "isAvailable", "", "create", "Landroid/media/audiofx/AcousticEchoCanceler;", "audioSessionId", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface AcousticEchoCancelerFactory {
    @Nullable
    AcousticEchoCanceler create(int audioSessionId);

    boolean isAvailable();
}
