package com.amazon.alexa.accessory.frames.media.transform;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class SmartCropConfig {
    private static final float DEFAULT_BODY_EXTENSION_FACTOR = 1.5f;
    private static final int DEFAULT_DESIRED_FACE_WIDTH = 300;
    private static final float DEFAULT_FACE_AREA_THRESHOLD = 0.35f;
    private static final float DEFAULT_FACE_PADDING = 0.1f;
    private static final int DEFAULT_MAX_FACE_COUNT = 2;
    private static final float DEFAULT_MIN_CROP_RATIO = 0.8f;
    private static final float MAX_BODY_EXTENSION_FACTOR = 4.0f;
    private final float bodyExtensionFactor;
    private final int desiredFaceWidth;
    private final float faceAreaThreshold;
    private final float facePadding;
    private final int maxFaceCount;
    private final float minCropRatio;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private float minCropRatio = 0.8f;
        private int maxFaceCount = 2;
        private int desiredFaceWidth = 300;
        private float facePadding = 0.1f;
        private float faceAreaThreshold = 0.35f;
        private float bodyExtensionFactor = 1.5f;

        public Builder bodyExtensionFactor(float f) {
            if (f < 0.0f || f > 4.0f) {
                Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("bodyExtensionFactor must be in [0.0, 4.0], was: ", f));
                return null;
            }
            this.bodyExtensionFactor = f;
            return this;
        }

        public SmartCropConfig build() {
            return new SmartCropConfig(this, 0);
        }

        public Builder desiredFaceWidth(int i) {
            if (i > 0) {
                this.desiredFaceWidth = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "desiredFaceWidth must be > 0, was: "));
            return null;
        }

        public Builder faceAreaThreshold(float f) {
            if (f < 0.0f || f > 1.0f) {
                Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("faceAreaThreshold must be in [0.0, 1.0], was: ", f));
                return null;
            }
            this.faceAreaThreshold = f;
            return this;
        }

        public Builder facePadding(float f) {
            if (f >= 0.0f) {
                this.facePadding = f;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("facePadding must be >= 0.0, was: ", f));
            return null;
        }

        public Builder maxFaceCount(int i) {
            if (i > 0) {
                this.maxFaceCount = i;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "maxFaceCount must be > 0, was: "));
            return null;
        }

        public Builder minCropRatio(float f) {
            if (f <= 0.0f || f > 1.0f) {
                Single$$ExternalSyntheticBUOutline0.m$3(ArcMode$$ExternalSyntheticOutline0.m("minCropRatio must be in (0.0, 1.0], was: ", f));
                return null;
            }
            this.minCropRatio = f;
            return this;
        }
    }

    private SmartCropConfig(Builder builder) {
        this.minCropRatio = builder.minCropRatio;
        this.maxFaceCount = builder.maxFaceCount;
        this.desiredFaceWidth = builder.desiredFaceWidth;
        this.facePadding = builder.facePadding;
        this.faceAreaThreshold = builder.faceAreaThreshold;
        this.bodyExtensionFactor = builder.bodyExtensionFactor;
    }

    public static SmartCropConfig getDefault() {
        return new Builder().build();
    }

    public float getBodyExtensionFactor() {
        return this.bodyExtensionFactor;
    }

    public int getDesiredFaceWidth() {
        return this.desiredFaceWidth;
    }

    public float getFaceAreaThreshold() {
        return this.faceAreaThreshold;
    }

    public float getFacePadding() {
        return this.facePadding;
    }

    public int getMaxFaceCount() {
        return this.maxFaceCount;
    }

    public float getMinCropRatio() {
        return this.minCropRatio;
    }

    public /* synthetic */ SmartCropConfig(Builder builder, int i) {
        this(builder);
    }
}
