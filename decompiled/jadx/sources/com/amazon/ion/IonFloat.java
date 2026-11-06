package com.amazon.ion;

import java.math.BigDecimal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonFloat extends IonValue {
    BigDecimal bigDecimalValue() throws NullValueException;

    @Override // com.amazon.ion.IonValue
    IonFloat clone() throws UnknownSymbolException;

    double doubleValue() throws NullValueException;

    float floatValue() throws NullValueException;

    boolean isNumericValue();

    void setValue(double d);

    void setValue(float f);

    void setValue(BigDecimal bigDecimal);
}
