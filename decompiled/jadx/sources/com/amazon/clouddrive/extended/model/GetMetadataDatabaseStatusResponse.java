package com.amazon.clouddrive.extended.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetMetadataDatabaseStatusResponse {
    private String mLocation;
    private double mPercentComplete;
    private Status mStatus;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Status {
        PENDING,
        IN_PROGRESS,
        ERRORED,
        FAULTED,
        COMPLETED,
        UNKNOWN;

        public static Status fromString(String str) {
            try {
                return valueOf(str.toUpperCase());
            } catch (IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GetMetadataDatabaseStatusResponse getMetadataDatabaseStatusResponse = (GetMetadataDatabaseStatusResponse) obj;
            if (Double.compare(getMetadataDatabaseStatusResponse.mPercentComplete, this.mPercentComplete) != 0) {
                return false;
            }
            String str = this.mLocation;
            String str2 = getMetadataDatabaseStatusResponse.mLocation;
            if (str == null ? str2 != null : !str.equals(str2)) {
                return false;
            }
            if (this.mStatus == getMetadataDatabaseStatusResponse.mStatus) {
                return true;
            }
        }
        return false;
    }

    public String getLocation() {
        return this.mLocation;
    }

    public double getPercentComplete() {
        return this.mPercentComplete;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int hashCode() {
        String str = this.mLocation;
        int hashCode = str != null ? str.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.mPercentComplete);
        return this.mStatus.hashCode() + (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31);
    }

    public void setLocation(String str) {
        this.mLocation = str;
    }

    public void setPercentComplete(double d) {
        this.mPercentComplete = d;
    }

    public void setStatus(Status status) {
        this.mStatus = status;
    }
}
