package com.amazon.ion.system;

import com.amazon.ion.IonCatalog;
import com.amazon.ion.SymbolTable;
import com.amazon.ion.system.IonWriterBuilderBase;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class IonWriterBuilderBase<T extends IonWriterBuilderBase> extends IonWriterBuilder {
    private IonCatalog myCatalog;
    private SymbolTable[] myImports;

    public IonWriterBuilderBase(IonWriterBuilderBase ionWriterBuilderBase) {
        this.myCatalog = ionWriterBuilderBase.myCatalog;
        this.myImports = ionWriterBuilderBase.myImports;
    }

    private static SymbolTable[] safeCopy(SymbolTable[] symbolTableArr) {
        return (symbolTableArr == null || symbolTableArr.length == 0) ? symbolTableArr : (SymbolTable[]) symbolTableArr.clone();
    }

    public abstract T copy();

    public IonCatalog getCatalog() {
        return this.myCatalog;
    }

    public SymbolTable[] getImports() {
        return safeCopy(this.myImports);
    }

    public abstract T immutable();

    public abstract T mutable();

    public void mutationCheck() {
        throw new UnsupportedOperationException("This builder is immutable");
    }

    public void setCatalog(IonCatalog ionCatalog) {
        mutationCheck();
        this.myCatalog = ionCatalog;
    }

    public void setImports(SymbolTable... symbolTableArr) {
        mutationCheck();
        this.myImports = safeCopy(symbolTableArr);
    }

    public T withCatalog(IonCatalog ionCatalog) {
        T mutable = mutable();
        mutable.setCatalog(ionCatalog);
        return mutable;
    }

    public T withImports(SymbolTable... symbolTableArr) {
        T mutable = mutable();
        mutable.setImports(symbolTableArr);
        return mutable;
    }

    public IonWriterBuilderBase() {
    }
}
