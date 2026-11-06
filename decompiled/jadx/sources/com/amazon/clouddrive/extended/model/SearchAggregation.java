package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SearchAggregation {
    private Integer mCount;
    private String mMatch;
    private SearchMetadata mMetadata;

    public int compareTo(SearchAggregation searchAggregation) {
        if (searchAggregation == null) {
            return -1;
        }
        if (searchAggregation == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getCount(), searchAggregation.getCount());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getMatch(), searchAggregation.getMatch());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getMetadata(), searchAggregation.getMetadata());
        if (compare3 != 0) {
            return compare3;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof SearchAggregation) && compareTo((SearchAggregation) obj) == 0;
    }

    public Integer getCount() {
        return this.mCount;
    }

    public String getMatch() {
        return this.mMatch;
    }

    public SearchMetadata getMetadata() {
        return this.mMetadata;
    }

    public int hashCode() {
        return (getCount() == null ? 0 : getCount().hashCode()) + 1 + (getMatch() == null ? 0 : getMatch().hashCode()) + (getMetadata() != null ? getMetadata().hashCode() : 0);
    }

    public void setCount(Integer num) {
        this.mCount = num;
    }

    public void setMatch(String str) {
        this.mMatch = str;
    }

    public void setMetadata(SearchMetadata searchMetadata) {
        this.mMetadata = searchMetadata;
    }

    public SearchAggregation withCount(Integer num) {
        setCount(num);
        return this;
    }

    public SearchAggregation withMatch(String str) {
        setMatch(str);
        return this;
    }

    public SearchAggregation withMetadata(SearchMetadata searchMetadata) {
        setMetadata(searchMetadata);
        return this;
    }
}
