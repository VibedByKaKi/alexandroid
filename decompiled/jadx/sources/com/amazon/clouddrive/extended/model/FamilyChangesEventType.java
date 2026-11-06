package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FamilyChangesEventType {
    public static final String UPDATE_NODE = "UPDATE_NODE";
    public static final String UPDATE_FAMILY = "UPDATE_FAMILY";
    public static final String CHECKPOINT = "CHECKPOINT";
    public static final String RESET = "RESET";
    private static final String[] values = {UPDATE_NODE, UPDATE_FAMILY, CHECKPOINT, RESET};

    private FamilyChangesEventType() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
