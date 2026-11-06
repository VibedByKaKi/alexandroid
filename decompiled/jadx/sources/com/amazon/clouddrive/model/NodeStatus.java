package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeStatus {
    public static final String AVAILABLE = "AVAILABLE";
    public static final String PENDING = "PENDING";
    public static final String PURGED = "PURGED";
    public static final String TRASH = "TRASH";
    private static final String[] values = {"AVAILABLE", "PENDING", "TRASH", "PURGED"};

    private NodeStatus() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
