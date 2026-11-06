package com.amazon.clouddrive.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class QueryFilter implements Comparable<QueryFilter> {
    private final String filterType;
    private List<String> values;

    public QueryFilter(String str) {
        this.filterType = str;
    }

    @Override // java.lang.Comparable
    public int compareTo(QueryFilter queryFilter) {
        if (queryFilter == null) {
            return -1;
        }
        if (queryFilter == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getFilterType(), queryFilter.getFilterType());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getValues(), queryFilter.getValues());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof QueryFilter) && compareTo((QueryFilter) obj) == 0;
    }

    public String getFilterType() {
        return this.filterType;
    }

    public List<String> getValues() {
        return this.values;
    }

    public int hashCode() {
        return this.filterType.hashCode() + (getValues() == null ? 0 : getValues().hashCode());
    }

    public void setValues(List<String> list) {
        this.values = list;
    }
}
