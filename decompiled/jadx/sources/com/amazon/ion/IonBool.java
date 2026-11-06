package com.amazon.ion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonBool extends IonValue {
    boolean booleanValue() throws NullValueException;

    @Override // com.amazon.ion.IonValue
    IonBool clone() throws UnknownSymbolException;

    void setValue(Boolean bool);

    void setValue(boolean z);
}
