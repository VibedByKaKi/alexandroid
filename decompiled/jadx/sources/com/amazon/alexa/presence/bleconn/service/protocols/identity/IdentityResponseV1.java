package com.amazon.alexa.presence.bleconn.service.protocols.identity;

import com.amazon.alexa.presence.bleconn.helpers.ByteHelper;
import java.nio.ByteBuffer;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class IdentityResponseV1 {
    protected static final byte HEADER_BYTE_V1_WITH_RELATIONSHIP_VALIDATION_FLAG = 1;
    protected static final int HEADER_LENGTH_BYTES = 1;
    protected static final int HEADER_OFFSET_BYTES = 0;
    protected static final int MAX_SIZE = 265;
    protected static final int MIN_SIZE = 9;
    protected static final int RELATIONSHIP_DATA_LENGTH_BYTES = 8;
    protected static final int RELATIONSHIP_DATA_OFFSET_BYTES = 1;
    protected static final int TOKEN_DATA_OFFSET_BYTES = 9;
    protected static final int TOKEN_LENGTH_BYTES = 256;
    private byte[] relationshipValidationData = new byte[8];
    private byte[] tokenData = new byte[0];

    public static IdentityResponseV1 tryParse(byte[] bArr) {
        if (bArr.length < 9 || bArr.length > MAX_SIZE || bArr[0] != 1) {
            return null;
        }
        byte[] slice = ByteHelper.slice(bArr, 1, 8);
        byte[] sliceToEnd = ByteHelper.sliceToEnd(bArr, 9);
        if (sliceToEnd.length == 0 || sliceToEnd.length == 256) {
            return new IdentityResponseV1().withRelationshipData(slice).withToken(sliceToEnd);
        }
        return null;
    }

    public byte[] toBytes() {
        byte[] bArr = this.tokenData;
        ByteBuffer allocate = ByteBuffer.allocate((bArr == null ? 0 : bArr.length) + 9);
        allocate.put((byte) 1);
        allocate.put(this.relationshipValidationData);
        allocate.put(this.tokenData);
        return allocate.array();
    }

    public IdentityResponseV1 withRelationshipData(byte[] bArr) {
        Objects.requireNonNull(bArr, "Relationship data provided must not be null.");
        if (bArr.length == 8) {
            System.arraycopy(bArr, 0, this.relationshipValidationData, 0, 8);
            return this;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Relationship data provided not valid.");
        return null;
    }

    public IdentityResponseV1 withToken(byte[] bArr) {
        Objects.requireNonNull(bArr, "Token provided not valid.");
        if (bArr.length == 0 || bArr.length == 256) {
            this.tokenData = bArr;
            return this;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Unexpected token length found.  Size not a multiple of 256");
        return null;
    }
}
