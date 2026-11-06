package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ResubscribeResponse implements CloudDriveResponse {
    private CloudDriveSubscription subscription;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof ResubscribeResponse)) {
            return 1;
        }
        CloudDriveSubscription subscription = getSubscription();
        CloudDriveSubscription subscription2 = ((ResubscribeResponse) cloudDriveResponse).getSubscription();
        if (subscription != subscription2) {
            if (subscription == null) {
                return -1;
            }
            if (subscription2 == null) {
                return 1;
            }
            int compareTo = subscription.compareTo(subscription2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ResubscribeResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    public CloudDriveSubscription getSubscription() {
        return this.subscription;
    }

    public int hashCode() {
        return (((getSubscription() == null ? 0 : getSubscription().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setSubscription(CloudDriveSubscription cloudDriveSubscription) {
        this.subscription = cloudDriveSubscription;
    }
}
