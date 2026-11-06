package com.amazon.alexa.api;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public enum Exposure {
    HIDDEN,
    RESTRICTED,
    PUBLIC;

    public static final String OPTION_KEY = Exposure.class.getCanonicalName();

    public static final Exposure valueOfIgnoresCase(String str) {
        if (str == null) {
            return null;
        }
        return valueOf(str.toUpperCase());
    }
}
