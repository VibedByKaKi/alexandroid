package com.amazon.alexa.accessory.capabilities.bulkdata.identifiers;

import com.amazon.alexa.accessory.capabilities.bulkdata.BulkDataUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class DataIdentifier {
    public static final int PROTOCOL_MAX_BYTES = 16;
    private final byte[] dataIdentifier;

    public DataIdentifier(byte[] bArr) {
        this.dataIdentifier = bArr;
    }

    public byte[] getBytes() {
        byte[] bArr = this.dataIdentifier;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public String toString() {
        return BulkDataUtils.toHexString(this.dataIdentifier, 16);
    }
}
