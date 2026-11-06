package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeKind {
    public static final String ASSET = "ASSET";
    public static final String FILE = "FILE";
    public static final String FOLDER = "FOLDER";
    public static final String GROUP = "GROUP";
    public static final String RESOURCE_FILE = "RESOURCE_FILE";
    public static final String SHARED_COLLECTION = "SHARED_COLLECTION";
    public static final String VISUAL_COLLECTION = "VISUAL_COLLECTION";
    private static final String[] values = {"FILE", "RESOURCE_FILE", "GROUP", "ASSET", "FOLDER", "VISUAL_COLLECTION", "SHARED_COLLECTION"};

    private NodeKind() {
        throw new UnsupportedOperationException();
    }

    public static String[] values() {
        return values;
    }
}
