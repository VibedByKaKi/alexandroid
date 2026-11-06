package com.amazon.clouddrive.extended.model.filters;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeKindFilter implements NodeFilterBuilder {
    private String mNodeKind;

    private NodeKindFilter() {
    }

    public static NodeKindFilter byAsset() {
        NodeKindFilter nodeKindFilter = new NodeKindFilter();
        nodeKindFilter.mNodeKind = "ASSET";
        return nodeKindFilter;
    }

    public static NodeKindFilter byFile() {
        NodeKindFilter nodeKindFilter = new NodeKindFilter();
        nodeKindFilter.mNodeKind = "FILE";
        return nodeKindFilter;
    }

    public static NodeKindFilter byFolder() {
        NodeKindFilter nodeKindFilter = new NodeKindFilter();
        nodeKindFilter.mNodeKind = "FOLDER";
        return nodeKindFilter;
    }

    public static NodeKindFilter byGroup() {
        NodeKindFilter nodeKindFilter = new NodeKindFilter();
        nodeKindFilter.mNodeKind = "GROUP";
        return nodeKindFilter;
    }

    @Override // com.amazon.clouddrive.extended.model.filters.NodeFilterBuilder
    public String buildFilterQuery() {
        return "kind:" + this.mNodeKind;
    }
}
