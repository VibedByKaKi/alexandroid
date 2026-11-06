package com.amazon.alexa.presence.bleconn.service.protocols.relationships;

import com.amazon.alexa.presence.bleconn.helpers.ByteHelper;
import java.nio.ByteBuffer;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DecryptedRequesterRelationshipV1 {
    private static final int REQUESTER_VALIDATION_LENGTH_BYTES = 8;
    private static final int REQUESTER_VALIDATION_OFFSET_BYTES = 8;
    public static final int SIZE_BYTES = 16;
    private static final int TARGET_VALIDATION_LENGTH_BYTES = 8;
    private static final int TARGET_VALIDATION_OFFSET_BYTES = 0;
    private final byte[] requesterValidation;
    private final byte[] targetValidation;

    public DecryptedRequesterRelationshipV1(byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(bArr);
        this.targetValidation = bArr;
        Objects.requireNonNull(bArr2);
        this.requesterValidation = bArr2;
        validate();
    }

    public static DecryptedRequesterRelationshipV1 tryParse(byte[] bArr) {
        if (bArr.length != 16) {
            return null;
        }
        return new DecryptedRequesterRelationshipV1(ByteHelper.slice(bArr, 0, 8), ByteHelper.slice(bArr, 8, 8));
    }

    public byte[] getBytes() {
        return ByteBuffer.allocate(16).put(this.targetValidation).put(this.requesterValidation).array();
    }

    public byte[] getRequesterValidationData() {
        return this.requesterValidation;
    }

    public byte[] getTargetValidationData() {
        return this.targetValidation;
    }

    public boolean targetDataValidates() {
        int i = 0;
        while (true) {
            byte[] bArr = this.targetValidation;
            if (i >= bArr.length) {
                return true;
            }
            if (bArr[i] != 0) {
                return false;
            }
            i++;
        }
    }

    public void validate() {
        if (this.targetValidation.length != 8) {
            Single$$ExternalSyntheticBUOutline0.m$2("Target validation data length invalid");
        } else {
            if (this.requesterValidation.length == 8) {
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Requester validation data length invalid");
        }
    }

    public DecryptedRequesterRelationshipV1(byte[] bArr) {
        this(new byte[8], bArr);
    }
}
