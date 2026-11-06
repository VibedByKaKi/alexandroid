package com.amazon.ion;

import java.math.BigInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonInt extends IonValue {
    BigInteger bigIntegerValue();

    @Override // com.amazon.ion.IonValue
    IonInt clone() throws UnknownSymbolException;

    IntegerSize getIntegerSize();

    int intValue() throws NullValueException;

    long longValue() throws NullValueException;

    void setValue(int i);

    void setValue(long j);

    void setValue(Number number);
}
