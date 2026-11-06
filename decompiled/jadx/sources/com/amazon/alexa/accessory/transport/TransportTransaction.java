package com.amazon.alexa.accessory.transport;

import com.amazon.alexa.accessory.io.SizedSource;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class TransportTransaction {
    private final boolean attemptAuthorizationIfSupported;
    private final boolean commit;
    private final SizedSource data;
    private final String key;
    private final TransportPriority priority;
    private final int stream;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private boolean attemptAuthenticationIfSupported = false;
        private boolean commit;
        private SizedSource data;
        private String key;
        private TransportPriority priority;
        private int stream;

        public Builder attemptAuthenticationIfSupported(boolean z) {
            this.attemptAuthenticationIfSupported = z;
            return this;
        }

        public TransportTransaction build() {
            if (this.key == null) {
                this.key = UUID.randomUUID().toString();
            }
            if (this.priority == null) {
                this.priority = TransportPriority.MEDIUM;
            }
            return new TransportTransaction(this, 0);
        }

        public Builder commit(boolean z) {
            this.commit = z;
            return this;
        }

        public Builder data(SizedSource sizedSource) {
            this.data = sizedSource;
            return this;
        }

        public Builder key(String str) {
            this.key = str;
            return this;
        }

        public Builder priority(TransportPriority transportPriority) {
            this.priority = transportPriority;
            return this;
        }

        public Builder stream(int i) {
            this.stream = i;
            return this;
        }
    }

    private TransportTransaction(Builder builder) {
        this.key = builder.key;
        this.data = builder.data;
        this.priority = builder.priority;
        this.stream = builder.stream;
        this.attemptAuthorizationIfSupported = builder.attemptAuthenticationIfSupported;
        this.commit = builder.commit;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean attemptAuthorizationIfSupported() {
        return this.attemptAuthorizationIfSupported;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TransportTransaction.class == obj.getClass()) {
            TransportTransaction transportTransaction = (TransportTransaction) obj;
            if (this.stream != transportTransaction.stream || this.commit != transportTransaction.commit) {
                return false;
            }
            SizedSource sizedSource = this.data;
            SizedSource sizedSource2 = transportTransaction.data;
            if (sizedSource == null ? sizedSource2 != null : !sizedSource.equals(sizedSource2)) {
                return false;
            }
            if (this.priority == transportTransaction.priority) {
                return true;
            }
        }
        return false;
    }

    public SizedSource getData() {
        return this.data;
    }

    public String getKey() {
        return this.key;
    }

    public TransportPriority getPriority() {
        return this.priority;
    }

    public int getStream() {
        return this.stream;
    }

    public boolean hasData() {
        return this.data != null;
    }

    public int hashCode() {
        SizedSource sizedSource = this.data;
        return ((((this.priority.hashCode() + ((sizedSource != null ? sizedSource.hashCode() : 0) * 31)) * 31) + this.stream) * 31) + (this.commit ? 1 : 0);
    }

    public boolean isCommit() {
        return this.commit;
    }

    public /* synthetic */ TransportTransaction(Builder builder, int i) {
        this(builder);
    }
}
