package com.amazon.clouddrive.model;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CollectionProperties implements Comparable<CollectionProperties> {
    private Boolean areCoversDesired;
    private List<CoverObject> covers;
    private QueryObject query;

    public Boolean areCoversDesired() {
        return this.areCoversDesired;
    }

    @Override // java.lang.Comparable
    public int compareTo(CollectionProperties collectionProperties) {
        if (collectionProperties == null) {
            return -1;
        }
        if (collectionProperties == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getQuery(), collectionProperties.getQuery());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(areCoversDesired(), collectionProperties.areCoversDesired());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getCovers(), collectionProperties.getCovers());
        if (compare3 != 0) {
            return compare3;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CollectionProperties) && compareTo((CollectionProperties) obj) == 0;
    }

    public List<CoverObject> getCovers() {
        return this.covers;
    }

    public QueryObject getQuery() {
        return this.query;
    }

    public int hashCode() {
        return (getQuery() == null ? 0 : getQuery().hashCode()) + 1 + (areCoversDesired() == null ? 0 : areCoversDesired().hashCode()) + (getCovers() != null ? getCovers().hashCode() : 0);
    }

    public void setCovers(List<CoverObject> list) {
        this.covers = list;
    }

    public void setCoversDesired(Boolean bool) {
        this.areCoversDesired = bool;
    }

    public void setQuery(QueryObject queryObject) {
        this.query = queryObject;
    }
}
