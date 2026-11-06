package com.amazon.ion.system;

import com.amazon.ion.IonBufferConfiguration;
import com.amazon.ion.IonCatalog;
import com.amazon.ion.IonReader;
import com.amazon.ion.IonTextReader;
import com.amazon.ion.IonValue;
import com.amazon.ion.impl._Private_IonReaderBuilder;
import java.io.InputStream;
import java.io.Reader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class IonReaderBuilder {
    private IonBufferConfiguration bufferConfiguration;
    private IonCatalog catalog;
    private boolean isAnnotationIteratorReuseEnabled;
    private boolean isIncrementalReadingEnabled;

    public IonReaderBuilder(IonReaderBuilder ionReaderBuilder) {
        this.catalog = null;
        this.isIncrementalReadingEnabled = false;
        this.bufferConfiguration = null;
        this.isAnnotationIteratorReuseEnabled = true;
        this.catalog = ionReaderBuilder.catalog;
        this.isIncrementalReadingEnabled = ionReaderBuilder.isIncrementalReadingEnabled;
        this.bufferConfiguration = ionReaderBuilder.bufferConfiguration;
        this.isAnnotationIteratorReuseEnabled = ionReaderBuilder.isAnnotationIteratorReuseEnabled;
    }

    public static IonReaderBuilder standard() {
        return new _Private_IonReaderBuilder.Mutable();
    }

    public abstract IonReader build(IonValue ionValue);

    public abstract IonReader build(InputStream inputStream);

    public abstract IonReader build(Reader reader);

    public IonReader build(byte[] bArr) {
        return build(bArr, 0, bArr.length);
    }

    public abstract IonReader build(byte[] bArr, int i, int i2);

    public abstract IonTextReader build(String str);

    public IonReaderBuilder copy() {
        return new _Private_IonReaderBuilder.Mutable(this);
    }

    public IonBufferConfiguration getBufferConfiguration() {
        return this.bufferConfiguration;
    }

    public IonCatalog getCatalog() {
        return this.catalog;
    }

    public boolean isAnnotationIteratorReuseEnabled() {
        return this.isAnnotationIteratorReuseEnabled;
    }

    public boolean isIncrementalReadingEnabled() {
        return this.isIncrementalReadingEnabled;
    }

    public IonReaderBuilder mutable() {
        return copy();
    }

    public void mutationCheck() {
        throw new UnsupportedOperationException("This builder is immutable");
    }

    public void setAnnotationIteratorReuseDisabled() {
        mutationCheck();
        this.isAnnotationIteratorReuseEnabled = false;
    }

    public void setAnnotationIteratorReuseEnabled() {
        mutationCheck();
        this.isAnnotationIteratorReuseEnabled = true;
    }

    public void setBufferConfiguration(IonBufferConfiguration ionBufferConfiguration) {
        mutationCheck();
        this.bufferConfiguration = ionBufferConfiguration;
    }

    public void setCatalog(IonCatalog ionCatalog) {
        mutationCheck();
        this.catalog = ionCatalog;
    }

    public void setIncrementalReadingDisabled() {
        mutationCheck();
        this.isIncrementalReadingEnabled = false;
    }

    public void setIncrementalReadingEnabled() {
        mutationCheck();
        this.isIncrementalReadingEnabled = true;
    }

    public IonCatalog validateCatalog() {
        IonCatalog ionCatalog = this.catalog;
        return ionCatalog != null ? ionCatalog : new SimpleCatalog();
    }

    public IonReaderBuilder withAnnotationIteratorReuseEnabled(boolean z) {
        IonReaderBuilder mutable = mutable();
        if (z) {
            mutable.setAnnotationIteratorReuseEnabled();
            return mutable;
        }
        mutable.setAnnotationIteratorReuseDisabled();
        return mutable;
    }

    public IonReaderBuilder withBufferConfiguration(IonBufferConfiguration ionBufferConfiguration) {
        IonReaderBuilder mutable = mutable();
        mutable.setBufferConfiguration(ionBufferConfiguration);
        return mutable;
    }

    public IonReaderBuilder withCatalog(IonCatalog ionCatalog) {
        IonReaderBuilder mutable = mutable();
        mutable.setCatalog(ionCatalog);
        return mutable;
    }

    public IonReaderBuilder withIncrementalReadingEnabled(boolean z) {
        IonReaderBuilder mutable = mutable();
        if (z) {
            mutable.setIncrementalReadingEnabled();
            return mutable;
        }
        mutable.setIncrementalReadingDisabled();
        return mutable;
    }

    public IonReaderBuilder immutable() {
        return this;
    }

    public IonReaderBuilder() {
        this.catalog = null;
        this.isIncrementalReadingEnabled = false;
        this.bufferConfiguration = null;
        this.isAnnotationIteratorReuseEnabled = true;
    }
}
