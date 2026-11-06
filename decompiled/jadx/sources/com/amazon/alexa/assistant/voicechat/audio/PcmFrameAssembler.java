package com.amazon.alexa.assistant.voicechat.audio;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/assistant/voicechat/audio/PcmFrameAssembler;", "", "frameSize", "", "<init>", "(I)V", "frameBytes", "carry", "", "carryLen", "append", "", "", "pcm", "offset", "length", "reset", "", "toShorts", "bytes", "byteLen", "Companion", "voicechat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PcmFrameAssembler {
    private static final int BYTES_PER_SAMPLE = 2;

    @NotNull
    private final byte[] carry;
    private int carryLen;
    private final int frameBytes;
    private final int frameSize;

    public PcmFrameAssembler(int i) {
        this.frameSize = i;
        int i2 = i * 2;
        this.frameBytes = i2;
        this.carry = new byte[i2];
    }

    private final short[] toShorts(byte[] bytes, int offset, int byteLen) {
        int i = byteLen / 2;
        short[] sArr = new short[i];
        for (int i2 = 0; i2 < i; i2++) {
            sArr[i2] = (short) ((bytes[offset] & 255) | (bytes[offset + 1] << 8));
            offset += 2;
        }
        return sArr;
    }

    @NotNull
    public final List<short[]> append(@NotNull byte[] pcm, int offset, int length) {
        int i;
        pcm.getClass();
        if (length <= 0) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = length + offset;
        int i3 = this.carryLen;
        if (i3 > 0) {
            int min = Math.min(this.frameBytes - i3, i2 - offset);
            System.arraycopy(pcm, offset, this.carry, this.carryLen, min);
            int i4 = this.carryLen + min;
            this.carryLen = i4;
            offset += min;
            int i5 = this.frameBytes;
            if (i4 == i5) {
                arrayList.add(toShorts(this.carry, 0, i5));
                this.carryLen = 0;
            }
        }
        while (true) {
            i = i2 - offset;
            int i6 = this.frameBytes;
            if (i < i6) {
                break;
            }
            arrayList.add(toShorts(pcm, offset, i6));
            offset += this.frameBytes;
        }
        if (i > 0) {
            System.arraycopy(pcm, offset, this.carry, 0, i);
            this.carryLen = i;
        }
        return arrayList;
    }

    public final void reset() {
        this.carryLen = 0;
    }
}
