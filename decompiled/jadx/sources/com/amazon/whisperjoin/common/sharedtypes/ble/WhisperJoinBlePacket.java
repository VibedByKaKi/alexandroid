package com.amazon.whisperjoin.common.sharedtypes.ble;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import defpackage.a$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WhisperJoinBlePacket {
    private static final int MAX_PACKET_PAYLOAD_SIZE = 494;
    private static final int PACKET_OVERHEAD = 18;
    private static final String TAG = "WhisperJoinBlePacket";
    private final boolean mAdditionalChunks;
    private final int mChunkIndex;
    private final int mPacketKey;
    private final byte[] mPayload;

    public WhisperJoinBlePacket(int i, int i2, boolean z, byte[] bArr) {
        if (i2 < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("chunkIndex cannot be negative.");
            throw null;
        }
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("payload cannot be null.");
            throw null;
        }
        if (bArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("payload cannot be empty.");
            throw null;
        }
        this.mPacketKey = i;
        this.mChunkIndex = i2;
        this.mAdditionalChunks = z;
        this.mPayload = (byte[]) bArr.clone();
    }

    private int copyData(byte[] bArr, byte[] bArr2, int i) {
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        return i + bArr2.length;
    }

    public static WhisperJoinBlePacket createNextResponsePacket(WhisperJoinBlePacket whisperJoinBlePacket) {
        return new WhisperJoinBlePacket(whisperJoinBlePacket.getPacketKey(), whisperJoinBlePacket.getChunkIndex(), whisperJoinBlePacket.hasAdditionalChunks(), new byte[1]);
    }

    public static List<WhisperJoinBlePacket> createPackets(byte[] bArr) {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("payload cannot be null.");
            return null;
        }
        if (bArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("payload cannot be empty.");
            return null;
        }
        byte[] bArr2 = new byte[4];
        new SecureRandom().nextBytes(bArr2);
        int i = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN).getInt();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i2, Math.min(i2 + MAX_PACKET_PAYLOAD_SIZE, bArr.length));
            i2 += copyOfRange.length;
            int i4 = i3 + 1;
            arrayList.add(new WhisperJoinBlePacket(i, i3, i2 < bArr.length, copyOfRange));
            i3 = i4;
        }
        WJLog.d(TAG, arrayList.size() + " WhisperJoinBlePackets created for payload of " + bArr.length + " bytes.");
        return arrayList;
    }

    public int getChunkIndex() {
        return this.mChunkIndex;
    }

    public int getPacketKey() {
        return this.mPacketKey;
    }

    public byte[] getPayload() {
        return (byte[]) this.mPayload.clone();
    }

    public boolean hasAdditionalChunks() {
        return this.mAdditionalChunks;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WhisperJoinBlePacket [key=");
        sb.append(this.mPacketKey);
        sb.append(", chunk=");
        sb.append(this.mChunkIndex);
        sb.append(", additional-chunks=");
        return a$$ExternalSyntheticOutline0.m(sb, this.mAdditionalChunks, MarkdownConstants.RIGHT_BRACKET);
    }
}
