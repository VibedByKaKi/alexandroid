package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CloudDriveBenefit implements Comparable<CloudDriveBenefit> {
    private String benefit;
    private String expiration;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveBenefit cloudDriveBenefit) {
        if (cloudDriveBenefit == null) {
            return -1;
        }
        if (cloudDriveBenefit == this) {
            return 0;
        }
        String expiration = getExpiration();
        String expiration2 = cloudDriveBenefit.getExpiration();
        if (expiration != expiration2) {
            if (expiration == null) {
                return -1;
            }
            if (expiration2 == null) {
                return 1;
            }
            int compareTo = expiration.compareTo(expiration2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        String benefit = getBenefit();
        String benefit2 = cloudDriveBenefit.getBenefit();
        if (benefit != benefit2) {
            if (benefit == null) {
                return -1;
            }
            if (benefit2 == null) {
                return 1;
            }
            int compareTo2 = benefit.compareTo(benefit2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CloudDriveBenefit) && compareTo((CloudDriveBenefit) obj) == 0;
    }

    public String getBenefit() {
        return this.benefit;
    }

    public String getExpiration() {
        return this.expiration;
    }

    public int hashCode() {
        String str = this.expiration;
        int hashCode = (str == null ? 0 : str.hashCode()) + 1;
        String str2 = this.benefit;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public CloudDriveBenefit setBenefit(String str) {
        this.benefit = str;
        return this;
    }

    public CloudDriveBenefit setExpiration(String str) {
        this.expiration = str;
        return this;
    }
}
