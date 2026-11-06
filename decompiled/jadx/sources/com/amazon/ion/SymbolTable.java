package com.amazon.ion;

import java.io.IOException;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface SymbolTable {
    public static final int UNKNOWN_SYMBOL_ID = -1;

    SymbolToken find(String str);

    String findKnownSymbol(int i);

    int findSymbol(String str);

    int getImportedMaxId();

    SymbolTable[] getImportedTables();

    String getIonVersionId();

    int getMaxId();

    String getName();

    SymbolTable getSystemSymbolTable();

    int getVersion();

    SymbolToken intern(String str);

    boolean isLocalTable();

    boolean isReadOnly();

    boolean isSharedTable();

    boolean isSubstitute();

    boolean isSystemTable();

    Iterator<String> iterateDeclaredSymbolNames();

    void makeReadOnly();

    void writeTo(IonWriter ionWriter) throws IOException;
}
