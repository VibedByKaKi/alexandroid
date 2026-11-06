package com.amazon.ion;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonBlob extends IonLob {
    @Override // com.amazon.ion.IonLob, com.amazon.ion.IonValue
    IonBlob clone() throws UnknownSymbolException;

    void printBase64(Appendable appendable) throws NullValueException, IOException;
}
