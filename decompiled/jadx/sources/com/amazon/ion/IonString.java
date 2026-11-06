package com.amazon.ion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonString extends IonText {
    @Override // com.amazon.ion.IonText, com.amazon.ion.IonValue
    IonString clone() throws UnknownSymbolException;

    @Override // com.amazon.ion.IonText
    void setValue(String str);

    @Override // com.amazon.ion.IonText
    String stringValue();
}
