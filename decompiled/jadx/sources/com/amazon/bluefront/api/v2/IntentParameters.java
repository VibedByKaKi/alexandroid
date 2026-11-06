package com.amazon.bluefront.api.v2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class IntentParameters implements Comparable<IntentParameters> {
    private int mMaxNBest;

    @Override // java.lang.Comparable
    public int compareTo(IntentParameters intentParameters) {
        if (intentParameters == null) {
            return -1;
        }
        if (intentParameters == this) {
            return 0;
        }
        if (getMaxNBest() < intentParameters.getMaxNBest()) {
            return -1;
        }
        return getMaxNBest() > intentParameters.getMaxNBest() ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof IntentParameters) && compareTo((IntentParameters) obj) == 0;
    }

    public int getMaxNBest() {
        return this.mMaxNBest;
    }

    public int hashCode() {
        return getMaxNBest() + 1;
    }

    public void setMaxNBest(int i) {
        this.mMaxNBest = i;
    }
}
