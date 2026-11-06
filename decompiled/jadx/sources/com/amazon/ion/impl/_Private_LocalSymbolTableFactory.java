package com.amazon.ion.impl;

import com.amazon.ion.IonCatalog;
import com.amazon.ion.IonReader;
import com.amazon.ion.SymbolTable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface _Private_LocalSymbolTableFactory {
    SymbolTable newLocalSymtab(IonCatalog ionCatalog, IonReader ionReader, boolean z);

    SymbolTable newLocalSymtab(SymbolTable symbolTable, SymbolTable... symbolTableArr);
}
