package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CoverObject implements Comparable<CoverObject> {
    private String id;
    private Boolean isDefault;
    private String ownerId;
    private String tempLink;

    @Override // java.lang.Comparable
    public int compareTo(CoverObject coverObject) {
        if (coverObject == null) {
            return -1;
        }
        if (coverObject == this) {
            return 0;
        }
        int compare = ObjectComparator.compare(getId(), coverObject.getId());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getTempLink(), coverObject.getTempLink());
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = ObjectComparator.compare(isDefault(), coverObject.isDefault());
        if (compare3 != 0) {
            return compare3;
        }
        int compare4 = ObjectComparator.compare(getOwnerId(), coverObject.getOwnerId());
        if (compare4 != 0) {
            return compare4;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CoverObject) && compareTo((CoverObject) obj) == 0;
    }

    public String getId() {
        return this.id;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public String getTempLink() {
        return this.tempLink;
    }

    public int hashCode() {
        return (getOwnerId() == null ? 0 : getOwnerId().hashCode()) + 1 + (getId() == null ? 0 : getId().hashCode()) + (getTempLink() == null ? 0 : getTempLink().hashCode()) + (isDefault() != null ? isDefault().hashCode() : 0);
    }

    public Boolean isDefault() {
        return this.isDefault;
    }

    public void setDefault(Boolean bool) {
        this.isDefault = bool;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setTempLink(String str) {
        this.tempLink = str;
    }
}
