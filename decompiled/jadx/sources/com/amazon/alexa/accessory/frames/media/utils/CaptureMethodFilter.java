package com.amazon.alexa.accessory.frames.media.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum CaptureMethodFilter {
    ALL("all"),
    AUTO("auto"),
    MANUAL("manual");

    private final String value;

    CaptureMethodFilter(String str) {
        this.value = str;
    }

    public static CaptureMethodFilter fromString(String str) {
        if (str == null || str.trim().isEmpty()) {
            return ALL;
        }
        String lowerCase = str.trim().toLowerCase();
        for (CaptureMethodFilter captureMethodFilter : values()) {
            if (captureMethodFilter.value.equals(lowerCase)) {
                return captureMethodFilter;
            }
        }
        return ALL;
    }

    public String getValue() {
        return this.value;
    }
}
