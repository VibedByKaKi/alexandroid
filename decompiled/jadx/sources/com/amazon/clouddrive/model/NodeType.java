package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeType {
    public static final String FILE = "FILE";
    public static final String GROUP = "GROUP";
    public static final String SOURCE = "SOURCE";
    private static final String[] values = {"FILE", "GROUP", SOURCE};

    private NodeType() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
