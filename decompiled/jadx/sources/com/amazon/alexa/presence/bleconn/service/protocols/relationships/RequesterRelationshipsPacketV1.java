package com.amazon.alexa.presence.bleconn.service.protocols.relationships;

import com.amazon.alexa.presence.bleconn.helpers.ByteHelper;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class RequesterRelationshipsPacketV1 {
    private static final int HEADER_LENGTH_BYTES = 2;
    public static final byte HEADER_MASK_RELATIONSHIP_COUNT = 15;
    public static final byte HEADER_MASK_REQUESTS_VALIDATION = 1;
    public static final byte HEADER_MASK_VERSION = -16;
    private static final int HEADER_OFFSET_BYTES = 0;
    public static final byte HEADER_VALUE_VERSION_1 = 0;
    private static Logger LOG = LoggerFactory.getLogger((Class<?>) RequesterRelationshipsPacketV1.class);
    private static final int RELATIONSHIPS_OFFSET_BYTES = 2;
    private List<EncryptedRelationshipTokenV1> relationshipTokens;
    private boolean requiresRelationshipValidation;

    public RequesterRelationshipsPacketV1(boolean z, List<EncryptedRelationshipTokenV1> list) {
        this.requiresRelationshipValidation = Boolean.valueOf(z).booleanValue();
        Objects.requireNonNull(list);
        this.relationshipTokens = list;
        validate();
    }

    private static int probeProtocolVersion(byte[] bArr) {
        return (bArr[0] & HEADER_MASK_VERSION) >>> 4;
    }

    public static RequesterRelationshipsPacketV1 tryParse(byte[] bArr) {
        if (bArr.length < 2) {
            LOG.warn("Unable to parse data, header incomplete.  Data size: " + bArr.length);
            return null;
        }
        int probeProtocolVersion = probeProtocolVersion(bArr);
        if (probeProtocolVersion != 0) {
            LOG.warn("Attempted to parse data as V1 relationship packet, but unexpected header version detected : " + probeProtocolVersion);
            return null;
        }
        boolean z = (bArr[0] & 1) == 1;
        int i = bArr[1] & 15;
        int i2 = i * 17;
        if (bArr.length != i2 + 2) {
            LOG.warn("Payload incomplete.  Expected %d bytes, but found %s.", Integer.valueOf(i2), Integer.valueOf(bArr.length));
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.add(EncryptedRelationshipTokenV1.tryParse(ByteHelper.slice(bArr, (i3 * 17) + 2, 17)));
        }
        return new RequesterRelationshipsPacketV1(z, arrayList);
    }

    private void validate() {
        if (this.relationshipTokens.size() <= 15) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Unsupported number of relationships given (to many)");
    }

    public byte[] getBytes() {
        ByteBuffer put = ByteBuffer.allocate((this.relationshipTokens.size() * 17) + 2).put(this.requiresRelationshipValidation ? (byte) 1 : (byte) 0).put((byte) (this.relationshipTokens.size() & 15));
        Iterator<EncryptedRelationshipTokenV1> it2 = this.relationshipTokens.iterator();
        while (it2.hasNext()) {
            put.put(it2.next().getBytes());
        }
        return put.array();
    }

    public List<EncryptedRelationshipTokenV1> relationships() {
        return this.relationshipTokens;
    }

    public boolean requiresValidation() {
        return this.requiresRelationshipValidation;
    }
}
