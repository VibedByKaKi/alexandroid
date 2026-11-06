package com.amazon.alexa.client.alexaservice.audio.core;

import com.amazon.alexa.utils.validation.Preconditions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
class Id3HeaderParser {
    private static final int HEADER_FLAGS_LENGTH = 1;
    private static final int HEADER_ID_LENGTH = 3;
    private static final int HEADER_LENGTH = 10;
    private static final int HEADER_VERSION_LENGTH = 2;

    @Inject
    public Id3HeaderParser() {
    }

    public Id3Header parse(byte[] bArr) throws IllegalArgumentException {
        Preconditions.isFalse(bArr.length < 10, "Invalid Id3 frame length");
        byte[] bArr2 = new byte[3];
        byte[] bArr3 = new byte[2];
        byte[] bArr4 = new byte[1];
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.readBytes(bArr2, 0, 3);
        parsableByteArray.readBytes(bArr3, 0, 2);
        parsableByteArray.readBytes(bArr4, 0, 1);
        return new Id3Header(bArr2, bArr3, bArr4, parsableByteArray.readSynchSafeInt());
    }
}
