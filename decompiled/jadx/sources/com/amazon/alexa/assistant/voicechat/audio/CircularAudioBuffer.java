package com.amazon.alexa.assistant.voicechat.audio;

import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0003J\u0006\u0010\u0014\u001a\u00020\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/voicechat/audio/CircularAudioBuffer;", "", "durationMs", "", "sampleRate", "<init>", "(II)V", "capacity", "getCapacity", "()I", "buffer", "", "value", "writePosition", "getWritePosition", "write", "", "samples", "extractPreroll", "sampleCount", MetricsConstants.Method.CACHE_CLEAR, "Companion", "voicechat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CircularAudioBuffer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final short[] buffer;
    private final int capacity;
    private int writePosition;

    public CircularAudioBuffer(int i, int i2) {
        int i3 = (i * i2) / 1000;
        this.capacity = i3;
        this.buffer = new short[i3];
    }

    public final synchronized void clear() {
        ArraysKt___ArraysJvmKt.fill$default(this.buffer, (short) 0, 0, 0, 6, (Object) null);
        this.writePosition = 0;
    }

    @NotNull
    public final synchronized short[] extractPreroll(int sampleCount) {
        if (sampleCount <= 0) {
            return new short[0];
        }
        int min = Math.min(sampleCount, this.capacity);
        short[] sArr = new short[min];
        int i = this.writePosition - min;
        int i2 = this.capacity;
        int i3 = (i + i2) % i2;
        for (int i4 = 0; i4 < min; i4++) {
            sArr[i4] = this.buffer[i3];
            i3 = (i3 + 1) % this.capacity;
        }
        return sArr;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final int getWritePosition() {
        return this.writePosition;
    }

    public final synchronized void write(@NotNull short[] samples) {
        samples.getClass();
        if (samples.length == 0) {
            return;
        }
        for (short s : samples) {
            short[] sArr = this.buffer;
            int i = this.writePosition;
            sArr[i] = s;
            this.writePosition = (i + 1) % this.capacity;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0017\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/voicechat/audio/CircularAudioBuffer$Companion;", "", "<init>", "()V", "samplesToLittleEndianBytes", "", "samples", "", "voicechat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final byte[] samplesToLittleEndianBytes(@NotNull short[] samples) {
            samples.getClass();
            byte[] bArr = new byte[samples.length * 2];
            int length = samples.length;
            for (int i = 0; i < length; i++) {
                short s = samples[i];
                int i2 = i * 2;
                bArr[i2] = (byte) (s & 255);
                bArr[i2 + 1] = (byte) ((s >> 8) & 255);
            }
            return bArr;
        }

        private Companion() {
        }
    }
}
