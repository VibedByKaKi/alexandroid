package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.amazon.devicesetupservice.scap.v1.Action;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ReportScapEventsResponse {
    private Action mAction;
    private String mEndpointToUse;
    private String mSessionId;
    private String mSignature;

    public ReportScapEventsResponse(Action action, String str, String str2, String str3) {
        this.mAction = action;
        this.mEndpointToUse = str;
        this.mSessionId = str2;
        this.mSignature = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ReportScapEventsResponse reportScapEventsResponse = (ReportScapEventsResponse) obj;
            if (Objects.equal(this.mAction, reportScapEventsResponse.mAction) && Objects.equal(this.mEndpointToUse, reportScapEventsResponse.mEndpointToUse) && Objects.equal(this.mSessionId, reportScapEventsResponse.mSessionId) && Objects.equal(this.mSignature, reportScapEventsResponse.mSignature)) {
                return true;
            }
        }
        return false;
    }

    public Action getAction() {
        return this.mAction;
    }

    public String getEndpointToUse() {
        return this.mEndpointToUse;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public String getSignature() {
        return this.mSignature;
    }

    public int hashCode() {
        return Objects.hashCode(this.mAction, this.mEndpointToUse, this.mSessionId, this.mSignature);
    }

    public void setAction(Action action) {
        this.mAction = action;
    }

    public void setEndpointToUse(String str) {
        this.mEndpointToUse = str;
    }

    public void setSessionId(String str) {
        this.mSessionId = str;
    }

    public void setSignature(String str) {
        this.mSignature = str;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mAction", this.mAction).add("mEndpointToUse", this.mEndpointToUse).add("mSessionId", this.mSessionId).add("mSignature", this.mSignature).toString();
    }
}
