package com.amazon.clouddrive.extended.model.filters;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class NodeStatusFilter implements NodeFilterBuilder {
    private String mObjectStatus;

    private NodeStatusFilter() {
    }

    public static NodeStatusFilter byAvailable() {
        NodeStatusFilter nodeStatusFilter = new NodeStatusFilter();
        nodeStatusFilter.mObjectStatus = "AVAILABLE";
        return nodeStatusFilter;
    }

    public static NodeStatusFilter byPending() {
        NodeStatusFilter nodeStatusFilter = new NodeStatusFilter();
        nodeStatusFilter.mObjectStatus = "PENDING";
        return nodeStatusFilter;
    }

    public static NodeStatusFilter byPurged() {
        NodeStatusFilter nodeStatusFilter = new NodeStatusFilter();
        nodeStatusFilter.mObjectStatus = "PURGED";
        return nodeStatusFilter;
    }

    public static NodeStatusFilter byTrash() {
        NodeStatusFilter nodeStatusFilter = new NodeStatusFilter();
        nodeStatusFilter.mObjectStatus = "TRASH";
        return nodeStatusFilter;
    }

    @Override // com.amazon.clouddrive.extended.model.filters.NodeFilterBuilder
    public String buildFilterQuery() {
        return "status:" + this.mObjectStatus;
    }
}
