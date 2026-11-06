package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword;

import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAssistantSdkApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/WakeWordAudioExtract;", "", "samples", "", "wakeWordEndOffset", "", "<init>", "([SI)V", "getSamples", "()[S", "getWakeWordEndOffset", "()I", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WakeWordAudioExtract {

    @NotNull
    private final short[] samples;
    private final int wakeWordEndOffset;

    public WakeWordAudioExtract(@NotNull short[] sArr, int i) {
        sArr.getClass();
        this.samples = sArr;
        this.wakeWordEndOffset = i;
    }

    @NotNull
    public final short[] getSamples() {
        return this.samples;
    }

    public final int getWakeWordEndOffset() {
        return this.wakeWordEndOffset;
    }
}
