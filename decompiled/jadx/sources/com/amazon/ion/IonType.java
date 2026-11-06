package com.amazon.ion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum IonType {
    NULL,
    BOOL,
    INT,
    FLOAT,
    DECIMAL,
    TIMESTAMP,
    SYMBOL,
    STRING,
    CLOB,
    BLOB,
    LIST,
    SEXP,
    STRUCT,
    DATAGRAM;

    public static boolean isContainer(IonType ionType) {
        return ionType != null && ionType.ordinal() >= LIST.ordinal();
    }

    public static boolean isLob(IonType ionType) {
        return ionType == BLOB || ionType == CLOB;
    }

    public static boolean isText(IonType ionType) {
        return ionType == STRING || ionType == SYMBOL;
    }
}
