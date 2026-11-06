package com.amazon.alexa.client.alexaservice.audio.core;

import com.amazon.alexa.utils.validation.Preconditions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
class Id3FrameHeaderParser {
    private static final int HEADER_FLAGS_LENGTH = 2;
    private static final int HEADER_ID_LENGTH = 4;
    private static final int HEADER_LENGTH = 10;

    @Inject
    public Id3FrameHeaderParser() {
    }

    public Id3FrameHeader parse(byte[] bArr) throws IllegalArgumentException {
        Preconditions.isFalse(bArr.length < 10, "Invalid Id3 frame length");
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[2];
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.readBytes(bArr2, 0, 4);
        int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
        parsableByteArray.readBytes(bArr3, 0, 2);
        return new Id3FrameHeader(bArr2, readSynchSafeInt, bArr3);
    }
}
