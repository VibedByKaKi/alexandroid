package org.apache.thrift.orig;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class TConfiguration {
    public static final TConfiguration DEFAULT = new Builder().build();
    public static final int DEFAULT_MAX_FRAME_SIZE = 16384000;
    public static final int DEFAULT_MAX_MESSAGE_SIZE = 104857600;
    public static final int DEFAULT_RECURSION_DEPTH = 64;
    private int maxFrameSize;
    private int maxMessageSize;
    private int recursionLimit;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private int maxFrameSize = TConfiguration.DEFAULT_MAX_FRAME_SIZE;
        private int maxMessageSize = TConfiguration.DEFAULT_MAX_MESSAGE_SIZE;
        private int recursionLimit = 64;

        public TConfiguration build() {
            return new TConfiguration(this.maxMessageSize, this.maxFrameSize, this.recursionLimit);
        }

        public Builder setMaxFrameSize(int i) {
            this.maxFrameSize = i;
            return this;
        }

        public Builder setMaxMessageSize(int i) {
            this.maxMessageSize = i;
            return this;
        }

        public Builder setRecursionLimit(int i) {
            this.recursionLimit = i;
            return this;
        }
    }

    public TConfiguration() {
        this(DEFAULT_MAX_MESSAGE_SIZE, DEFAULT_MAX_FRAME_SIZE, 64);
    }

    public static Builder custom() {
        return new Builder();
    }

    public int getMaxFrameSize() {
        return this.maxFrameSize;
    }

    public int getMaxMessageSize() {
        return this.maxMessageSize;
    }

    public int getRecursionLimit() {
        return this.recursionLimit;
    }

    public void setMaxFrameSize(int i) {
        this.maxFrameSize = i;
    }

    public void setMaxMessageSize(int i) {
        this.maxMessageSize = i;
    }

    public void setRecursionLimit(int i) {
        this.recursionLimit = i;
    }

    public TConfiguration(int i, int i2, int i3) {
        this.maxFrameSize = i2;
        this.maxMessageSize = i;
        this.recursionLimit = i3;
    }
}
