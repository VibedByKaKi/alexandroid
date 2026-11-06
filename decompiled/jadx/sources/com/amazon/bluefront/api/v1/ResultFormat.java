package com.amazon.bluefront.api.v1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class ResultFormat implements Comparable<ResultFormat> {
    private int mMaxNBest;
    private String mType;

    @Override // java.lang.Comparable
    public int compareTo(ResultFormat resultFormat) {
        if (resultFormat == null) {
            return -1;
        }
        if (resultFormat == this) {
            return 0;
        }
        String type = getType();
        String type2 = resultFormat.getType();
        if (type != type2) {
            if (type == null) {
                return -1;
            }
            if (type2 == null) {
                return 1;
            }
            int compareTo = type.compareTo(type2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (getMaxNBest() < resultFormat.getMaxNBest()) {
            return -1;
        }
        return getMaxNBest() > resultFormat.getMaxNBest() ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ResultFormat) && compareTo((ResultFormat) obj) == 0;
    }

    public int getMaxNBest() {
        return this.mMaxNBest;
    }

    public String getType() {
        return this.mType;
    }

    public int hashCode() {
        return getMaxNBest() + (getType() == null ? 0 : getType().hashCode()) + 1;
    }

    public void setMaxNBest(int i) {
        this.mMaxNBest = i;
    }

    public void setType(String str) {
        this.mType = str;
    }
}
