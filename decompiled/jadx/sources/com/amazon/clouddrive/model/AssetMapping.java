package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AssetMapping {
    public static final String ALL = "ALL";
    public static final String DESKTOP = "DESKTOP";
    public static final String MOBILE = "MOBILE";
    public static final String NONE = "NONE";
    private static final String[] values = {"NONE", "ALL", "MOBILE", "DESKTOP"};

    private AssetMapping() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
