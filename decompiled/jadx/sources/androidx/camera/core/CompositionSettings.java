package androidx.camera.core;

import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class CompositionSettings {
    public static final CompositionSettings DEFAULT = new Builder().setAlpha(1.0f).setOffset(0.0f, 0.0f).setScale(1.0f, 1.0f).build();
    private final float mAlpha;
    private final Pair<Float, Float> mOffset;
    private final Pair<Float, Float> mScale;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private float mAlpha;
        private Pair<Float, Float> mOffset;
        private Pair<Float, Float> mScale;

        public Builder() {
            Float valueOf = Float.valueOf(1.0f);
            this.mAlpha = 1.0f;
            Float valueOf2 = Float.valueOf(0.0f);
            this.mOffset = Pair.create(valueOf2, valueOf2);
            this.mScale = Pair.create(valueOf, valueOf);
        }

        @NonNull
        public CompositionSettings build() {
            return new CompositionSettings(this.mAlpha, this.mOffset, this.mScale);
        }

        @NonNull
        public Builder setAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f) {
            this.mAlpha = f;
            return this;
        }

        @NonNull
        public Builder setOffset(@FloatRange(from = -1.0d, to = 1.0d) float f, @FloatRange(from = -1.0d, to = 1.0d) float f2) {
            this.mOffset = Pair.create(Float.valueOf(f), Float.valueOf(f2));
            return this;
        }

        @NonNull
        public Builder setScale(float f, float f2) {
            this.mScale = Pair.create(Float.valueOf(f), Float.valueOf(f2));
            return this;
        }
    }

    private CompositionSettings(float f, Pair<Float, Float> pair, Pair<Float, Float> pair2) {
        this.mAlpha = f;
        this.mOffset = pair;
        this.mScale = pair2;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    @NonNull
    public Pair<Float, Float> getOffset() {
        return this.mOffset;
    }

    @NonNull
    public Pair<Float, Float> getScale() {
        return this.mScale;
    }
}
