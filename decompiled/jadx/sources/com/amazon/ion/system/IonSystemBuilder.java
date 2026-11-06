package com.amazon.ion.system;

import com.amazon.ion.IonCatalog;
import com.amazon.ion.IonSystem;
import com.amazon.ion.impl._Private_IonBinaryWriterBuilder;
import com.amazon.ion.impl._Private_Utils;
import com.amazon.ion.impl.lite._Private_LiteDomTrampoline;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class IonSystemBuilder {
    private static final IonSystemBuilder STANDARD = new IonSystemBuilder();
    IonCatalog myCatalog;
    boolean myStreamCopyOptimized;
    IonReaderBuilder readerBuilder;

    private IonSystemBuilder(IonSystemBuilder ionSystemBuilder) {
        this.myStreamCopyOptimized = false;
        this.myCatalog = ionSystemBuilder.myCatalog;
        this.myStreamCopyOptimized = ionSystemBuilder.myStreamCopyOptimized;
        this.readerBuilder = ionSystemBuilder.readerBuilder;
    }

    public static IonSystemBuilder standard() {
        return STANDARD;
    }

    public final IonSystem build() {
        IonCatalog ionCatalog = this.myCatalog;
        if (ionCatalog == null) {
            ionCatalog = new SimpleCatalog();
        }
        IonTextWriterBuilder withCharsetAscii = IonTextWriterBuilder.standard().withCharsetAscii();
        withCharsetAscii.setCatalog(ionCatalog);
        _Private_IonBinaryWriterBuilder standard = _Private_IonBinaryWriterBuilder.standard();
        standard.setCatalog(ionCatalog);
        standard.setStreamCopyOptimized(this.myStreamCopyOptimized);
        standard.setInitialSymbolTable(_Private_Utils.systemSymtab(1));
        IonReaderBuilder ionReaderBuilder = this.readerBuilder;
        if (ionReaderBuilder == null) {
            ionReaderBuilder = IonReaderBuilder.standard();
        }
        return _Private_LiteDomTrampoline.newLiteSystem(withCharsetAscii, standard, ionReaderBuilder.withCatalog(ionCatalog));
    }

    public final IonSystemBuilder copy() {
        return new Mutable();
    }

    public final IonCatalog getCatalog() {
        return this.myCatalog;
    }

    public final IonReaderBuilder getReaderBuilder() {
        return this.readerBuilder;
    }

    public final boolean isStreamCopyOptimized() {
        return this.myStreamCopyOptimized;
    }

    public IonSystemBuilder mutable() {
        return copy();
    }

    public void mutationCheck() {
        throw new UnsupportedOperationException("This builder is immutable");
    }

    public final void setCatalog(IonCatalog ionCatalog) {
        mutationCheck();
        this.myCatalog = ionCatalog;
    }

    public final void setReaderBuilder(IonReaderBuilder ionReaderBuilder) {
        mutationCheck();
        this.readerBuilder = ionReaderBuilder;
    }

    public final void setStreamCopyOptimized(boolean z) {
        mutationCheck();
        this.myStreamCopyOptimized = z;
    }

    public final IonSystemBuilder withCatalog(IonCatalog ionCatalog) {
        IonSystemBuilder mutable = mutable();
        mutable.setCatalog(ionCatalog);
        return mutable;
    }

    public final IonSystemBuilder withReaderBuilder(IonReaderBuilder ionReaderBuilder) {
        IonSystemBuilder mutable = mutable();
        mutable.setReaderBuilder(ionReaderBuilder);
        return mutable;
    }

    public final IonSystemBuilder withStreamCopyOptimized(boolean z) {
        IonSystemBuilder mutable = mutable();
        mutable.setStreamCopyOptimized(z);
        return mutable;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Mutable extends IonSystemBuilder {
        private Mutable(IonSystemBuilder ionSystemBuilder) {
            super();
        }

        @Override // com.amazon.ion.system.IonSystemBuilder
        public IonSystemBuilder immutable() {
            return new IonSystemBuilder();
        }

        @Override // com.amazon.ion.system.IonSystemBuilder
        public IonSystemBuilder mutable() {
            return this;
        }

        @Override // com.amazon.ion.system.IonSystemBuilder
        public void mutationCheck() {
        }
    }

    public IonSystemBuilder immutable() {
        return this;
    }

    private IonSystemBuilder() {
        this.myStreamCopyOptimized = false;
    }
}
