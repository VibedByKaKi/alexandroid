package com.amazon.ion.impl;

import com.amazon.ion.IonCatalog;
import com.amazon.ion.IonWriter;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface _Private_IonWriter extends IonWriter {
    IonCatalog getCatalog();

    int getDepth();

    boolean isFieldNameSet();

    boolean isStreamCopyOptimized();

    void writeIonVersionMarker() throws IOException;
}
