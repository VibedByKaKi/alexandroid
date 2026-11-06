package com.amazon.alexa.voice.ui.onedesign.minicards;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum NativeMiniCardImageShape {
    BOX("Box"),
    ROUND("Round");

    private final String shape;

    NativeMiniCardImageShape(String str) {
        this.shape = str;
    }

    public static NativeMiniCardImageShape from(String str) {
        for (NativeMiniCardImageShape nativeMiniCardImageShape : values()) {
            if (nativeMiniCardImageShape.shape.equals(str)) {
                return nativeMiniCardImageShape;
            }
        }
        return BOX;
    }
}
