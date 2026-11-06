package com.amazon.ion;

import java.io.Reader;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonClob extends IonValue, IonLob {
    @Override // com.amazon.ion.IonValue
    IonClob clone() throws UnknownSymbolException;

    Reader newReader(Charset charset);

    String stringValue(Charset charset);
}
