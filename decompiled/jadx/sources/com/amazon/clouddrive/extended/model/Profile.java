package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.ObjectComparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Profile implements Comparable<Profile> {
    private Avatar avatar;
    private String customerId;
    private Names names;
    private UnseenAggregations unseenAggregations;

    @Override // java.lang.Comparable
    public int compareTo(Profile profile) {
        if (profile == null) {
            return -1;
        }
        if (profile == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getAvatar(), profile.getAvatar());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getCustomerId(), profile.getCustomerId());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(getNames(), profile.getNames());
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getUnseenAggregations(), profile.getUnseenAggregations());
        if (compare4 != 0) {
            return compare4;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof Profile) && compareTo((Profile) obj) == 0;
    }

    public Avatar getAvatar() {
        return this.avatar;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public Names getNames() {
        return this.names;
    }

    public UnseenAggregations getUnseenAggregations() {
        return this.unseenAggregations;
    }

    public int hashCode() {
        return (((getAvatar() == null ? 0 : getAvatar().hashCode()) + 1 + (getCustomerId() == null ? 0 : getCustomerId().hashCode()) + (getNames() == null ? 0 : getNames().hashCode()) + (getUnseenAggregations() != null ? getUnseenAggregations().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public void setCustomerId(String str) {
        this.customerId = str;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    public void setUnseenAggregations(UnseenAggregations unseenAggregations) {
        this.unseenAggregations = unseenAggregations;
    }
}
