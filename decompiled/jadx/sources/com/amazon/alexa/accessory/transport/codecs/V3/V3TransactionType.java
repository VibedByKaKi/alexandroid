package com.amazon.alexa.accessory.transport.codecs.V3;

import com.amazon.alexa.accessory.transport.codecs.V3.V3TransportCodec;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.amazon.alexa.accessory.transport.codecs.V3.V3TransactionType, still in use, count: 1, list:
  (r0v0 com.amazon.alexa.accessory.transport.codecs.V3.V3TransactionType) from 0x002e: FILLED_NEW_ARRAY 
  (r0v0 com.amazon.alexa.accessory.transport.codecs.V3.V3TransactionType)
  (r1v1 com.amazon.alexa.accessory.transport.codecs.V3.V3TransactionType)
  (r2v2 com.amazon.alexa.accessory.transport.codecs.V3.V3TransactionType)
  (r3v2 com.amazon.alexa.accessory.transport.codecs.V3.V3TransactionType)
 A[WRAPPED] (LINE:47) elemType: com.amazon.alexa.accessory.transport.codecs.V3.V3TransactionType
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class V3TransactionType {
    FIRST_PACKET(0),
    NORMAL_PACKET(1),
    FINAL_PACKET(2),
    CONTROL_PACKET(3);

    private static final V3TransactionType[] VALUES = {new V3TransactionType(0), new V3TransactionType(1), new V3TransactionType(2), new V3TransactionType(3)};
    private final int value;

    static {
    }

    private V3TransactionType(int i) {
        this.value = i;
    }

    public static V3TransactionType fromValue(int i) throws V3TransportCodec.InvalidTransactionTypeException {
        if (i >= 0) {
            V3TransactionType[] v3TransactionTypeArr = VALUES;
            if (i < v3TransactionTypeArr.length) {
                return v3TransactionTypeArr[i];
            }
        }
        throw new V3TransportCodec.InvalidTransactionTypeException(i);
    }

    public static V3TransactionType valueOf(String str) {
        return (V3TransactionType) Enum.valueOf(V3TransactionType.class, str);
    }

    public static V3TransactionType[] values() {
        return (V3TransactionType[]) $VALUES.clone();
    }

    public int getValue() {
        return this.value;
    }
}
