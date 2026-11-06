package com.amazon.alexa.accessory.nearmiss;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class AudioContentType {
    private final int bitRate;
    private final int frameSize;
    private final String name;
    private final int preambleSize;
    private final int rate;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        public int bitRate;
        public int frameSize;
        public String name;
        public int preambleSize;
        public int rate;

        public Builder bitRate(int i) {
            this.bitRate = i;
            return this;
        }

        public AudioContentType build() {
            Preconditions.notNull(this.name, "name");
            return new AudioContentType(this);
        }

        public Builder frameSize(int i) {
            this.frameSize = i;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder preambleSize(int i) {
            this.preambleSize = i;
            return this;
        }

        public Builder rate(int i) {
            this.rate = i;
            return this;
        }
    }

    public AudioContentType(Builder builder) {
        Preconditions.notNull(builder, "builder");
        this.preambleSize = builder.preambleSize;
        this.name = builder.name;
        this.rate = builder.rate;
        this.bitRate = builder.bitRate;
        this.frameSize = builder.frameSize;
    }

    public String toString() {
        Locale locale = Locale.US;
        return this.name + "; rate=" + this.rate + "; preamble-size=" + this.preambleSize + "; bit-rate=" + this.bitRate + "; frame-size-milliseconds=" + this.frameSize;
    }
}
