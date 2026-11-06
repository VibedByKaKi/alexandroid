package com.amazon.ion.impl.bin;

import com.amazon.ion.IonType;
import com.amazon.ion.IonWriter;
import com.amazon.ion.SymbolTable;
import com.amazon.ion.SymbolToken;
import com.amazon.ion.SystemSymbols;
import java.io.IOException;
import java.util.Iterator;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
abstract class AbstractSymbolTable implements SymbolTable {
    private final String name;
    private final int version;

    public AbstractSymbolTable(String str, int i) {
        this.name = str;
        this.version = i;
    }

    @Override // com.amazon.ion.SymbolTable
    public final int findSymbol(String str) {
        SymbolToken find = find(str);
        if (find == null) {
            return -1;
        }
        return find.getSid();
    }

    @Override // com.amazon.ion.SymbolTable
    public final String getIonVersionId() {
        return SystemSymbols.ION_1_0;
    }

    @Override // com.amazon.ion.SymbolTable
    public final String getName() {
        return this.name;
    }

    @Override // com.amazon.ion.SymbolTable
    public final int getVersion() {
        return this.version;
    }

    @Override // com.amazon.ion.SymbolTable
    public final void writeTo(IonWriter ionWriter) throws IOException {
        if (isSharedTable()) {
            ionWriter.setTypeAnnotationSymbols(Symbols.systemSymbol(9));
        } else {
            if (!isLocalTable()) {
                Single$$ExternalSyntheticBUOutline0.m$2("Invalid symbol table, neither shared nor local");
                return;
            }
            ionWriter.setTypeAnnotationSymbols(Symbols.systemSymbol(3));
        }
        ionWriter.stepIn(IonType.STRUCT);
        if (isSharedTable()) {
            ionWriter.setFieldNameSymbol(Symbols.systemSymbol(4));
            ionWriter.writeString(this.name);
            ionWriter.setFieldNameSymbol(Symbols.systemSymbol(5));
            ionWriter.writeInt(this.version);
        }
        SymbolTable[] importedTables = getImportedTables();
        if (importedTables != null && importedTables.length > 0) {
            ionWriter.setFieldNameSymbol(Symbols.systemSymbol(6));
            ionWriter.stepIn(IonType.LIST);
            for (SymbolTable symbolTable : importedTables) {
                ionWriter.stepIn(IonType.STRUCT);
                ionWriter.setFieldNameSymbol(Symbols.systemSymbol(4));
                ionWriter.writeString(symbolTable.getName());
                ionWriter.setFieldNameSymbol(Symbols.systemSymbol(5));
                ionWriter.writeInt(symbolTable.getVersion());
                ionWriter.setFieldNameSymbol(Symbols.systemSymbol(8));
                ionWriter.writeInt(symbolTable.getMaxId());
                ionWriter.stepOut();
            }
            ionWriter.stepOut();
        }
        ionWriter.setFieldNameSymbol(Symbols.systemSymbol(7));
        ionWriter.stepIn(IonType.LIST);
        Iterator<String> iterateDeclaredSymbolNames = iterateDeclaredSymbolNames();
        while (iterateDeclaredSymbolNames.hasNext()) {
            ionWriter.writeString(iterateDeclaredSymbolNames.next());
        }
        ionWriter.stepOut();
        ionWriter.stepOut();
    }

    @Override // com.amazon.ion.SymbolTable
    public void makeReadOnly() {
    }
}
