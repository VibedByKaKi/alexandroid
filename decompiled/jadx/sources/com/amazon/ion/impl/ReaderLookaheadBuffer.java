package com.amazon.ion.impl;

import com.amazon.ion.IonReader;
import com.amazon.ion.system.IonReaderBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface ReaderLookaheadBuffer {
    int available();

    void fillInput() throws Exception;

    boolean moreDataRequired();

    IonReader newIonReader(IonReaderBuilder ionReaderBuilder);
}
