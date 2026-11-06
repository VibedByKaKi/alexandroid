package com.amazon.ion;

import com.amazon.ion.BufferConfiguration;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class BufferConfiguration<Configuration extends BufferConfiguration<Configuration>> {
    private final DataHandler dataHandler;
    private final int initialBufferSize;
    private final int maximumBufferSize;
    private final OversizedValueHandler oversizedValueHandler;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Builder<Configuration extends BufferConfiguration<Configuration>, BuilderType extends Builder<Configuration, BuilderType>> {
        static final int DEFAULT_INITIAL_BUFFER_SIZE = 32768;
        private int initialBufferSize = 32768;
        private int maximumBufferSize = Integer.MAX_VALUE;
        private OversizedValueHandler oversizedValueHandler = null;
        private DataHandler dataHandler = null;

        public abstract Configuration build();

        public final DataHandler getDataHandler() {
            return this.dataHandler;
        }

        public final int getInitialBufferSize() {
            return this.initialBufferSize;
        }

        public int getMaximumBufferSize() {
            return this.maximumBufferSize;
        }

        public abstract int getMinimumMaximumBufferSize();

        public abstract DataHandler getNoOpDataHandler();

        public abstract OversizedValueHandler getNoOpOversizedValueHandler();

        public final OversizedValueHandler getOversizedValueHandler() {
            return this.oversizedValueHandler;
        }

        public final BuilderType onData(DataHandler dataHandler) {
            this.dataHandler = dataHandler;
            return this;
        }

        public final BuilderType onOversizedValue(OversizedValueHandler oversizedValueHandler) {
            this.oversizedValueHandler = oversizedValueHandler;
            return this;
        }

        public final BuilderType withInitialBufferSize(int i) {
            this.initialBufferSize = i;
            return this;
        }

        public final BuilderType withMaximumBufferSize(int i) {
            this.maximumBufferSize = i;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DataHandler {
        void onData(int i) throws Exception;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OversizedValueHandler {
        void onOversizedValue() throws Exception;
    }

    public BufferConfiguration(Builder<Configuration, ?> builder) {
        int initialBufferSize = builder.getInitialBufferSize();
        this.initialBufferSize = initialBufferSize;
        int maximumBufferSize = builder.getMaximumBufferSize();
        this.maximumBufferSize = maximumBufferSize;
        if (initialBufferSize > maximumBufferSize) {
            Single$$ExternalSyntheticBUOutline0.m$3("Initial buffer size may not exceed the maximum buffer size.");
            throw null;
        }
        if (maximumBufferSize < builder.getMinimumMaximumBufferSize()) {
            Buffer$$ExternalSyntheticBUOutline0.m("Maximum buffer size must be at least %d bytes.", new Object[]{Integer.valueOf(builder.getMinimumMaximumBufferSize())});
            throw null;
        }
        if (builder.getOversizedValueHandler() == null) {
            requireUnlimitedBufferSize();
            this.oversizedValueHandler = builder.getNoOpOversizedValueHandler();
        } else {
            this.oversizedValueHandler = builder.getOversizedValueHandler();
        }
        if (builder.getDataHandler() == null) {
            this.dataHandler = builder.getNoOpDataHandler();
        } else {
            this.dataHandler = builder.getDataHandler();
        }
    }

    public final DataHandler getDataHandler() {
        return this.dataHandler;
    }

    public final int getInitialBufferSize() {
        return this.initialBufferSize;
    }

    public final int getMaximumBufferSize() {
        return this.maximumBufferSize;
    }

    public final OversizedValueHandler getOversizedValueHandler() {
        return this.oversizedValueHandler;
    }

    public void requireUnlimitedBufferSize() {
        if (this.maximumBufferSize >= Integer.MAX_VALUE) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Must specify an OversizedValueHandler when a maximum buffer size is specified.");
    }
}
