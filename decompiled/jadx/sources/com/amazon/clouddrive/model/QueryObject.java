package com.amazon.clouddrive.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class QueryObject implements Comparable<QueryObject> {
    private List<String> excludedIds;
    private List<QueryAndBlock> include;

    @Override // java.lang.Comparable
    public int compareTo(QueryObject queryObject) {
        if (queryObject == null) {
            return -1;
        }
        if (queryObject == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getExcludedIds(), queryObject.getExcludedIds());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getInclude(), queryObject.getInclude());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof QueryObject) && compareTo((QueryObject) obj) == 0;
    }

    public List<String> getExcludedIds() {
        return this.excludedIds;
    }

    public List<QueryAndBlock> getInclude() {
        return this.include;
    }

    public int hashCode() {
        return (getExcludedIds() == null ? 0 : getExcludedIds().hashCode()) + 1 + (getInclude() != null ? getInclude().hashCode() : 0);
    }

    public void setExcludedIds(List<String> list) {
        this.excludedIds = list;
    }

    public void setInclude(List<QueryAndBlock> list) {
        this.include = list;
    }
}
