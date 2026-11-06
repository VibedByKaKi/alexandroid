package com.amazon.clouddrive.extended.model.filters;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CompositeFilterBuilder implements NodeFilterBuilder {
    private static final String AND = " AND ";
    private List<NodeFilterBuilder> mNodeFilterBuilders = new ArrayList();

    private CompositeFilterBuilder() {
    }

    public static CompositeFilterBuilder with(NodeFilterBuilder nodeFilterBuilder) {
        CompositeFilterBuilder compositeFilterBuilder = new CompositeFilterBuilder();
        compositeFilterBuilder.mNodeFilterBuilders.add(nodeFilterBuilder);
        return compositeFilterBuilder;
    }

    public CompositeFilterBuilder and(NodeFilterBuilder nodeFilterBuilder) {
        this.mNodeFilterBuilders.add(nodeFilterBuilder);
        return this;
    }

    @Override // com.amazon.clouddrive.extended.model.filters.NodeFilterBuilder
    public String buildFilterQuery() {
        int size = this.mNodeFilterBuilders.size();
        List<NodeFilterBuilder> list = this.mNodeFilterBuilders;
        boolean z = false;
        if (size == 1) {
            return list.get(0).buildFilterQuery();
        }
        StringBuilder sb = new StringBuilder();
        for (NodeFilterBuilder nodeFilterBuilder : list) {
            if (z) {
                sb.append(AND);
            } else {
                z = true;
            }
            sb.append(nodeFilterBuilder.buildFilterQuery());
        }
        return sb.toString();
    }
}
