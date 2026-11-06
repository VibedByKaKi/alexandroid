package com.amazon.dee.app.ui.clouddrive;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum CropRect {
    TOP,
    LEFT,
    BOTTOM,
    RIGHT;

    private float mPosition;

    public static float getHeight() {
        return BOTTOM.getPosition() - TOP.getPosition();
    }

    public static float getWidth() {
        return RIGHT.getPosition() - LEFT.getPosition();
    }

    public float getPosition() {
        return this.mPosition;
    }

    public void setPosition(float f) {
        this.mPosition = f;
    }
}
