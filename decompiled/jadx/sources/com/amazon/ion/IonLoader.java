package com.amazon.ion;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface IonLoader {
    IonCatalog getCatalog();

    IonSystem getSystem();

    IonDatagram load(IonReader ionReader) throws IonException;

    IonDatagram load(File file) throws IonException, IOException;

    @Deprecated
    IonDatagram load(InputStream inputStream) throws IonException, IOException;

    IonDatagram load(Reader reader) throws IonException, IOException;

    IonDatagram load(String str) throws IonException;

    IonDatagram load(byte[] bArr) throws IonException;
}
