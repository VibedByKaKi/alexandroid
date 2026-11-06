package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.amazon.devicesetupservice.smarthome.CredentialRequest;
import com.amazon.devicesetupservice.v1.ProvisionerInfo;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetCustomerDevicesCredentialsRequest {
    private List<CredentialRequest> mCredentialRequests;
    private ProvisionerInfo mProvisionerInfo;

    public GetCustomerDevicesCredentialsRequest(List<CredentialRequest> list, ProvisionerInfo provisionerInfo) {
        this.mCredentialRequests = list;
        this.mProvisionerInfo = provisionerInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GetCustomerDevicesCredentialsRequest getCustomerDevicesCredentialsRequest = (GetCustomerDevicesCredentialsRequest) obj;
            if (Objects.equal(this.mCredentialRequests, getCustomerDevicesCredentialsRequest.mCredentialRequests) && Objects.equal(this.mProvisionerInfo, getCustomerDevicesCredentialsRequest.mProvisionerInfo)) {
                return true;
            }
        }
        return false;
    }

    public List<CredentialRequest> getCredentialRequests() {
        return this.mCredentialRequests;
    }

    public ProvisionerInfo getProvisionerInfo() {
        return this.mProvisionerInfo;
    }

    public int hashCode() {
        return Objects.hashCode(this.mCredentialRequests, this.mProvisionerInfo);
    }

    public void setCredentialRequests(List<CredentialRequest> list) {
        this.mCredentialRequests = list;
    }

    public void setProvisionerInfo(ProvisionerInfo provisionerInfo) {
        this.mProvisionerInfo = provisionerInfo;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mCredentialRequests", this.mCredentialRequests.toString()).add("mProvisionerInfo", this.mProvisionerInfo.toString()).toString();
    }
}
