package com.amazon.ion.impl;

import com.amazon.ion.BufferConfiguration;
import com.amazon.ion.IonReader;
import com.amazon.ion.system.IonReaderBuilder;
import java.io.InputStream;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
abstract class ReaderLookaheadBufferBase implements ReaderLookaheadBuffer {
    protected final BufferConfiguration.DataHandler dataHandler;
    private final InputStream input;
    private boolean isSkippingCurrentValue;
    private int markedAvailable;
    private int markedReadIndex;
    private final int maximumBufferSize;
    protected final BufferConfiguration.OversizedValueHandler oversizedValueHandler;
    protected final ResizingPipedInputStream pipe;

    public ReaderLookaheadBufferBase(BufferConfiguration<?> bufferConfiguration, InputStream inputStream) {
        this.input = inputStream;
        this.pipe = new ResizingPipedInputStream(bufferConfiguration.getInitialBufferSize(), bufferConfiguration.getMaximumBufferSize(), true);
        this.maximumBufferSize = bufferConfiguration.getMaximumBufferSize();
        this.oversizedValueHandler = bufferConfiguration.getOversizedValueHandler();
        this.dataHandler = bufferConfiguration.getDataHandler();
        clearMark();
    }

    @Override // com.amazon.ion.impl.ReaderLookaheadBuffer
    public final int available() {
        return this.pipe.available();
    }

    public final void clearMark() {
        this.markedAvailable = -1;
        this.markedReadIndex = -1;
    }

    @Override // com.amazon.ion.impl.ReaderLookaheadBuffer
    public final void fillInput() throws Exception {
        clearMark();
        fillInputHelper();
    }

    public abstract void fillInputHelper() throws Exception;

    public InputStream getInput() {
        return this.input;
    }

    public int getMaximumBufferSize() {
        return this.maximumBufferSize;
    }

    public InputStream getPipe() {
        return this.pipe;
    }

    public boolean isSkippingCurrentValue() {
        return this.isSkippingCurrentValue;
    }

    public final void mark() {
        if (moreDataRequired()) {
            Single$$ExternalSyntheticBUOutline0.m$2("moreDataRequired() must be false before calling mark().");
        } else {
            uncheckedMark();
        }
    }

    @Override // com.amazon.ion.impl.ReaderLookaheadBuffer
    public final IonReader newIonReader(IonReaderBuilder ionReaderBuilder) {
        return ionReaderBuilder.build(this.pipe);
    }

    public final void rewind() {
        int i;
        int i2 = this.markedReadIndex;
        if (i2 < 0 || (i = this.markedAvailable) < 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("Must call mark() before rewind().");
        } else {
            this.pipe.rewind(i2, i);
        }
    }

    public void startNewValue() {
        this.isSkippingCurrentValue = false;
    }

    public void startSkippingValue() throws Exception {
        if (this.isSkippingCurrentValue) {
            return;
        }
        this.isSkippingCurrentValue = true;
        truncateToEndOfPreviousValue();
    }

    public abstract void truncateToEndOfPreviousValue() throws Exception;

    public final void uncheckedMark() {
        this.markedAvailable = available();
        this.markedReadIndex = this.pipe.getReadIndex();
    }
}
