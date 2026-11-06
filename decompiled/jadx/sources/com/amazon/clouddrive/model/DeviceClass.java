package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DeviceClass {
    public static final String DESKTOP = "DESKTOP";
    public static final String MOBILE = "MOBILE";
    public static final String TABLET = "TABLET";
    public static final String TV = "TV";
    public static final String VIRTUAL = "VIRTUAL";
    public static final String WATCH = "WATCH";
    private static final String[] values = {"DESKTOP", "MOBILE", "TABLET", "WATCH", "TV", "VIRTUAL"};

    private DeviceClass() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
