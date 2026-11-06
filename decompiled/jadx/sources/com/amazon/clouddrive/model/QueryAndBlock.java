package com.amazon.clouddrive.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class QueryAndBlock implements Comparable<QueryAndBlock> {
    private List<QueryFilter> filters;

    @Override // java.lang.Comparable
    public int compareTo(QueryAndBlock queryAndBlock) {
        int compare;
        if (queryAndBlock == null) {
            return -1;
        }
        if (queryAndBlock == this || (compare = ObjectComparator.compare(getFilters(), queryAndBlock.getFilters())) == 0) {
            return 0;
        }
        return compare;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof QueryAndBlock) && compareTo((QueryAndBlock) obj) == 0;
    }

    public List<QueryFilter> getFilters() {
        return this.filters;
    }

    public int hashCode() {
        return (getFilters() == null ? 0 : getFilters().hashCode()) + 1;
    }

    public void setFilters(List<QueryFilter> list) {
        this.filters = list;
    }
}
