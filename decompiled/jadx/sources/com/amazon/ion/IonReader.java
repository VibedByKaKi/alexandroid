package com.amazon.ion;

import com.amazon.ion.facet.Faceted;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonReader extends Closeable, Faceted {
    BigDecimal bigDecimalValue();

    BigInteger bigIntegerValue();

    boolean booleanValue();

    int byteSize();

    Date dateValue();

    Decimal decimalValue();

    double doubleValue();

    int getBytes(byte[] bArr, int i, int i2);

    int getDepth();

    @Deprecated
    int getFieldId();

    String getFieldName();

    SymbolToken getFieldNameSymbol();

    IntegerSize getIntegerSize();

    SymbolTable getSymbolTable();

    IonType getType();

    SymbolToken[] getTypeAnnotationSymbols();

    String[] getTypeAnnotations();

    @Deprecated
    boolean hasNext();

    int intValue();

    boolean isInStruct();

    boolean isNullValue();

    Iterator<String> iterateTypeAnnotations();

    long longValue();

    byte[] newBytes();

    IonType next();

    void stepIn();

    void stepOut();

    String stringValue();

    SymbolToken symbolValue();

    Timestamp timestampValue();
}
