package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.amazon.devicesetupservice.smarthome.SmartHomeCredential;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetCustomerDevicesCredentialsResponse {
    private List<SmartHomeCredential> mAssociatedCredentials;

    public GetCustomerDevicesCredentialsResponse(List<SmartHomeCredential> list) {
        this.mAssociatedCredentials = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equal(this.mAssociatedCredentials, ((GetCustomerDevicesCredentialsResponse) obj).mAssociatedCredentials);
    }

    public List<SmartHomeCredential> getAssociatedCredentials() {
        return this.mAssociatedCredentials;
    }

    public int hashCode() {
        return Objects.hashCode(this.mAssociatedCredentials);
    }

    public void setAssociatedCredentials(List<SmartHomeCredential> list) {
        this.mAssociatedCredentials = list;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mAssociatedCredentials", this.mAssociatedCredentials.toString()).toString();
    }
}
