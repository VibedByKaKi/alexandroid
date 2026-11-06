package androidx.webkit;

import androidx.annotation.IntRange;
import androidx.webkit.Profile;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Profile.ExperimentalUrlPrefetch
/* loaded from: classes14.dex */
public class SpeculativeLoadingConfig {
    private final int mMaxPrefetches;
    private final int mMaxPrerenders;
    private final int mPrefetchTTLSeconds;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Profile.ExperimentalUrlPrefetch
    public static final class Builder {
        private int mMaxPrefetches;
        private int mMaxPrerenders;
        private int mPrefetchTTLSeconds;

        @Profile.ExperimentalUrlPrefetch
        public SpeculativeLoadingConfig build() {
            return new SpeculativeLoadingConfig(this.mPrefetchTTLSeconds, this.mMaxPrefetches, this.mMaxPrerenders);
        }

        public Builder setMaxPrefetches(@IntRange(from = 1) int i) {
            if (i >= 1) {
                this.mMaxPrefetches = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Max prefetches must be greater than 0");
            return null;
        }

        public Builder setMaxPrerenders(@IntRange(from = 1) int i) {
            if (i >= 1) {
                this.mMaxPrerenders = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Max prerenders must be greater than 0");
            return null;
        }

        public Builder setPrefetchTtlSeconds(@IntRange(from = 1) int i) {
            if (i > 0) {
                this.mPrefetchTTLSeconds = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Prefetch TTL must be greater than 0");
            return null;
        }
    }

    private SpeculativeLoadingConfig(int i, int i2, int i3) {
        this.mPrefetchTTLSeconds = i;
        this.mMaxPrefetches = i2;
        this.mMaxPrerenders = i3;
    }

    @IntRange(from = 1)
    public int getMaxPrefetches() {
        return this.mMaxPrefetches;
    }

    @IntRange(from = 1)
    @Profile.ExperimentalUrlPrefetch
    public int getMaxPrerenders() {
        return this.mMaxPrerenders;
    }

    @IntRange(from = 1)
    public int getPrefetchTtlSeconds() {
        return this.mPrefetchTTLSeconds;
    }
}
