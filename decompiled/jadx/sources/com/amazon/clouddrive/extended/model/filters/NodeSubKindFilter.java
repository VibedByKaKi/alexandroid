package com.amazon.clouddrive.extended.model.filters;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeSubKindFilter implements NodeFilterBuilder {
    private String mNodeSubKind;

    private NodeSubKindFilter() {
    }

    public static NodeSubKindFilter bySonyBurstPhoto() {
        NodeSubKindFilter nodeSubKindFilter = new NodeSubKindFilter();
        nodeSubKindFilter.mNodeSubKind = "SONY_BURST_PHOTO";
        return nodeSubKindFilter;
    }

    @Override // com.amazon.clouddrive.extended.model.filters.NodeFilterBuilder
    public String buildFilterQuery() {
        return "subKinds:" + this.mNodeSubKind;
    }
}
