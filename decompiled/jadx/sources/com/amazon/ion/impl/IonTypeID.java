package com.amazon.ion.impl;

import com.amazon.ion.IonType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
final class IonTypeID {
    private static final int ANNOTATION_WRAPPER_MAX_LENGTH = 14;
    private static final int ANNOTATION_WRAPPER_MIN_LENGTH = 3;
    private static final int BITS_PER_NIBBLE = 4;
    static final IonType[] ION_TYPES;
    static final IonType ION_TYPE_ANNOTATION_WRAPPER;
    private static final int LOW_NIBBLE_BITMASK = 15;
    private static final int NEGATIVE_INT_TYPE_CODE = 3;
    private static final int NULL_VALUE_NIBBLE = 15;
    private static final int NUMBER_OF_BYTES = 256;
    static final int ORDERED_STRUCT_NIBBLE = 1;
    private static final int TYPE_CODE_INVALID = 15;
    static final IonTypeID[] TYPE_IDS;
    private static final int VARIABLE_LENGTH_NIBBLE = 14;
    final boolean isNegativeInt;
    final boolean isNopPad;
    final boolean isNull;
    final boolean isValid;
    final byte length;
    final byte lowerNibble;
    final IonType type;
    final boolean variableLength;

    static {
        IonType ionType = IonType.DATAGRAM;
        ION_TYPE_ANNOTATION_WRAPPER = ionType;
        IonType ionType2 = IonType.NULL;
        IonType ionType3 = IonType.BOOL;
        IonType ionType4 = IonType.INT;
        ION_TYPES = new IonType[]{ionType2, ionType3, ionType4, ionType4, IonType.FLOAT, IonType.DECIMAL, IonType.TIMESTAMP, IonType.SYMBOL, IonType.STRING, IonType.CLOB, IonType.BLOB, IonType.LIST, IonType.SEXP, IonType.STRUCT, ionType, null};
        TYPE_IDS = new IonTypeID[256];
        for (int i = 0; i < 256; i++) {
            TYPE_IDS[i] = new IonTypeID((byte) i);
        }
    }

    private IonTypeID(byte b) {
        byte b2 = (byte) ((b >> 4) & 15);
        byte b3 = (byte) (b & 15);
        this.lowerNibble = b3;
        IonType ionType = ION_TYPES[b2];
        this.type = ionType;
        boolean isValid = isValid(b2, b3, ionType);
        this.isValid = isValid;
        boolean z = b3 == 15;
        this.isNull = z;
        IonType ionType2 = IonType.NULL;
        boolean z2 = ionType == ionType2 && !z;
        this.isNopPad = z2;
        if ((ionType == ionType2 && !z2) || ionType == IonType.BOOL || !isValid) {
            this.variableLength = false;
            b3 = 0;
        } else if (ionType == IonType.STRUCT && b3 == 1) {
            this.variableLength = true;
        } else {
            this.variableLength = b3 == 14;
        }
        b3 = z ? (byte) 0 : b3;
        this.isNegativeInt = ionType == IonType.INT && b2 == 3;
        this.length = b3;
    }

    private static boolean isValid(byte b, byte b2, IonType ionType) {
        if (b == 15) {
            return false;
        }
        if (ionType == IonType.BOOL) {
            return b2 <= 1 || b2 == 15;
        }
        if (ionType == IonType.INT && b == 3) {
            return b2 != 0;
        }
        if (ionType == IonType.FLOAT) {
            return b2 == 0 || b2 == 4 || b2 == 8 || b2 == 15;
        }
        if (ionType == IonType.TIMESTAMP) {
            return b2 > 1;
        }
        if (ionType == ION_TYPE_ANNOTATION_WRAPPER) {
            return b2 >= 3 && b2 <= 14;
        }
        return true;
    }
}
