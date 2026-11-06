package org.commonmark.internal.util;

import java.util.BitSet;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AsciiMatcher implements CharMatcher {
    private final BitSet set;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private final BitSet set;

        private Builder(BitSet bitSet) {
            this.set = bitSet;
        }

        public AsciiMatcher build() {
            return new AsciiMatcher(this);
        }

        public Builder c(char c) {
            if (c <= 127) {
                this.set.set(c);
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can only match ASCII characters");
            return null;
        }

        public Builder range(char c, char c2) {
            while (c <= c2) {
                c(c);
                c = (char) (c + 1);
            }
            return this;
        }
    }

    private AsciiMatcher(Builder builder) {
        this.set = builder.set;
    }

    public static Builder builder() {
        return new Builder(new BitSet());
    }

    @Override // org.commonmark.internal.util.CharMatcher
    public boolean matches(char c) {
        return this.set.get(c);
    }

    public Builder newBuilder() {
        return new Builder((BitSet) this.set.clone());
    }
}
