package com.amazon.alexa.voice.ui.onedesign.minicards;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum NativeMiniCardLayoutType {
    UNKNOWN("Unknown"),
    BACKGROUND_IMAGE("BackgroundImage"),
    DETAIL("Detail"),
    CAROUSEL("Carousel");

    private final String layoutType;

    NativeMiniCardLayoutType(String str) {
        this.layoutType = str;
    }

    public static NativeMiniCardLayoutType from(String str) {
        for (NativeMiniCardLayoutType nativeMiniCardLayoutType : values()) {
            if (nativeMiniCardLayoutType.layoutType.equalsIgnoreCase(str)) {
                return nativeMiniCardLayoutType;
            }
        }
        return UNKNOWN;
    }
}
