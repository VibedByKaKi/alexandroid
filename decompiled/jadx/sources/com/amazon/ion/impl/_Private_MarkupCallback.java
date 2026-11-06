package com.amazon.ion.impl;

import com.amazon.ion.IonType;
import com.amazon.ion.SymbolToken;
import com.amazon.ion.util._Private_FastAppendable;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class _Private_MarkupCallback {
    private final _Private_FastAppendable myAppendable;

    public _Private_MarkupCallback(_Private_FastAppendable _private_fastappendable) {
        this.myAppendable = _private_fastappendable;
    }

    public final _Private_FastAppendable getAppendable() {
        return this.myAppendable;
    }

    public void afterAnnotations(IonType ionType) throws IOException {
    }

    public void afterSeparator(IonType ionType) throws IOException {
    }

    public void afterStepIn(IonType ionType) throws IOException {
    }

    public void afterValue(IonType ionType) throws IOException {
    }

    public void beforeAnnotations(IonType ionType) throws IOException {
    }

    public void beforeSeparator(IonType ionType) throws IOException {
    }

    public void beforeStepOut(IonType ionType) throws IOException {
    }

    public void beforeValue(IonType ionType) throws IOException {
    }

    public void afterEachAnnotation(IonType ionType, SymbolToken symbolToken) throws IOException {
    }

    public void afterFieldName(IonType ionType, SymbolToken symbolToken) throws IOException {
    }

    public void beforeEachAnnotation(IonType ionType, SymbolToken symbolToken) throws IOException {
    }

    public void beforeFieldName(IonType ionType, SymbolToken symbolToken) throws IOException {
    }
}
