package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ConflictResolution {
    public static final String NONE = "NONE";
    public static final String RENAME = "RENAME";
    private static final String[] values = {"NONE", RENAME};

    private ConflictResolution() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
