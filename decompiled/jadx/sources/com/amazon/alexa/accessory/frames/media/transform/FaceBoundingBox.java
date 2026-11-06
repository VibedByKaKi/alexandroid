package com.amazon.alexa.accessory.frames.media.transform;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class FaceBoundingBox {
    final float area;
    final float bottom;
    final float centerX;
    final float centerY;
    final float confidence;
    final float height;
    final float left;
    final float right;
    final float top;
    final float width;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Parameters {
        static final float EYE_DISTANCE_TO_FACE_WIDTH_RATIO = 2.5f;
        static final float EYE_VERTICAL_POSITION_RATIO = 0.4f;
        static final float WIDTH_TO_HEIGHT_ASPECT_RATIO = 1.2f;

        private Parameters() {
        }
    }

    public FaceBoundingBox(float f, float f2, float f3, float f4) {
        float f5 = f3 * 2.5f;
        this.width = f5;
        float f6 = 1.2f * f5;
        this.height = f6;
        float f7 = f2 - (0.4f * f6);
        this.top = f7;
        this.bottom = f7 + f6;
        float f8 = f - (f5 / 2.0f);
        this.left = f8;
        this.right = f8 + f5;
        this.centerX = f;
        this.centerY = (f6 / 2.0f) + f7;
        this.area = f5 * f6;
        this.confidence = f4;
    }
}
