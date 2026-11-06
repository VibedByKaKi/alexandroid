package org.apache.thrift.orig.transport.sasl;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.orig.transport.sasl.TSaslNegotiationException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public enum NegotiationStatus {
    START((byte) 1),
    OK((byte) 2),
    BAD((byte) 3),
    ERROR((byte) 4),
    COMPLETE((byte) 5);

    private static final Map<Byte, NegotiationStatus> reverseMap = new HashMap();
    private final byte value;

    static {
        for (NegotiationStatus negotiationStatus : values()) {
            reverseMap.put(Byte.valueOf(negotiationStatus.getValue()), negotiationStatus);
        }
    }

    NegotiationStatus(byte b) {
        this.value = b;
    }

    public static NegotiationStatus byValue(byte b) throws TSaslNegotiationException {
        Map<Byte, NegotiationStatus> map = reverseMap;
        if (map.containsKey(Byte.valueOf(b))) {
            return map.get(Byte.valueOf(b));
        }
        throw new TSaslNegotiationException(TSaslNegotiationException.ErrorType.PROTOCOL_ERROR, a$$ExternalSyntheticOutline0.m(b, "Invalid status "));
    }

    public byte getValue() {
        return this.value;
    }
}
