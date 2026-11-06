package com.amazon.ion;

import com.amazon.ion.BufferConfiguration;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class IonBufferConfiguration extends BufferConfiguration<IonBufferConfiguration> {
    private final OversizedSymbolTableHandler oversizedSymbolTableHandler;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends BufferConfiguration.Builder<IonBufferConfiguration, Builder> {
        private static final int MINIMUM_MAX_VALUE_SIZE = 5;
        private OversizedSymbolTableHandler oversizedSymbolTableHandler = null;
        private static final BufferConfiguration.OversizedValueHandler NO_OP_OVERSIZED_VALUE_HANDLER = new BufferConfiguration.OversizedValueHandler() { // from class: com.amazon.ion.IonBufferConfiguration.Builder.1
            @Override // com.amazon.ion.BufferConfiguration.OversizedValueHandler
            public void onOversizedValue() {
            }
        };
        private static final BufferConfiguration.DataHandler NO_OP_DATA_HANDLER = new BufferConfiguration.DataHandler() { // from class: com.amazon.ion.IonBufferConfiguration.Builder.2
            @Override // com.amazon.ion.BufferConfiguration.DataHandler
            public void onData(int i) {
            }
        };
        private static final OversizedSymbolTableHandler NO_OP_OVERSIZED_SYMBOL_TABLE_HANDLER = new OversizedSymbolTableHandler() { // from class: com.amazon.ion.IonBufferConfiguration.Builder.3
            @Override // com.amazon.ion.IonBufferConfiguration.OversizedSymbolTableHandler
            public void onOversizedSymbolTable() {
            }
        };

        private Builder() {
        }

        public static Builder standard() {
            return new Builder();
        }

        @Override // com.amazon.ion.BufferConfiguration.Builder
        public IonBufferConfiguration build() {
            return new IonBufferConfiguration(this);
        }

        @Override // com.amazon.ion.BufferConfiguration.Builder
        public int getMinimumMaximumBufferSize() {
            return 5;
        }

        @Override // com.amazon.ion.BufferConfiguration.Builder
        public BufferConfiguration.DataHandler getNoOpDataHandler() {
            return NO_OP_DATA_HANDLER;
        }

        public OversizedSymbolTableHandler getNoOpOversizedSymbolTableHandler() {
            return NO_OP_OVERSIZED_SYMBOL_TABLE_HANDLER;
        }

        @Override // com.amazon.ion.BufferConfiguration.Builder
        public BufferConfiguration.OversizedValueHandler getNoOpOversizedValueHandler() {
            return NO_OP_OVERSIZED_VALUE_HANDLER;
        }

        public OversizedSymbolTableHandler getOversizedSymbolTableHandler() {
            return this.oversizedSymbolTableHandler;
        }

        public Builder onOversizedSymbolTable(OversizedSymbolTableHandler oversizedSymbolTableHandler) {
            this.oversizedSymbolTableHandler = oversizedSymbolTableHandler;
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OversizedSymbolTableHandler {
        void onOversizedSymbolTable() throws Exception;
    }

    private IonBufferConfiguration(Builder builder) {
        super(builder);
        if (builder.getOversizedSymbolTableHandler() != null) {
            this.oversizedSymbolTableHandler = builder.getOversizedSymbolTableHandler();
        } else {
            requireUnlimitedBufferSize();
            this.oversizedSymbolTableHandler = builder.getNoOpOversizedSymbolTableHandler();
        }
    }

    public OversizedSymbolTableHandler getOversizedSymbolTableHandler() {
        return this.oversizedSymbolTableHandler;
    }
}
