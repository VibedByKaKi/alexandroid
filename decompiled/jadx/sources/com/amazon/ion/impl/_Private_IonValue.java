package com.amazon.ion.impl;

import com.amazon.ion.IonValue;
import com.amazon.ion.SymbolTable;
import com.amazon.ion.SymbolToken;
import java.io.PrintWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface _Private_IonValue extends IonValue {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SymbolTableProvider {
        SymbolTable getSymbolTable();
    }

    void dump(PrintWriter printWriter);

    int findTypeAnnotation(String str);

    SymbolTable getAssignedSymbolTable();

    int getElementId();

    SymbolToken getFieldNameSymbol(SymbolTableProvider symbolTableProvider);

    SymbolToken[] getTypeAnnotationSymbols(SymbolTableProvider symbolTableProvider);

    void setSymbolTable(SymbolTable symbolTable);

    String validate();
}
