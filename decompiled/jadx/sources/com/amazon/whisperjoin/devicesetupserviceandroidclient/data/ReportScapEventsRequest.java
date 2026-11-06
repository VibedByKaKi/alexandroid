package com.amazon.whisperjoin.devicesetupserviceandroidclient.data;

import com.amazon.devicesetupservice.scap.v1.Event;
import com.amazon.devicesetupservice.scap.v1.ProvisionerNetwork;
import com.amazon.devicesetupservice.scap.v1.ScapProvisionerDetails;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ReportScapEventsRequest {
    private List<Event> mEventList;
    private String mNonce;
    private ScapProvisionerDetails mProvisionerDetails;
    private ProvisionerNetwork mProvisionerNetwork;
    private String mSessionId;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private List<Event> mEventList;
        private String mNonce;
        private ScapProvisionerDetails mProvisionerDetails;
        private ProvisionerNetwork mProvisionerNetwork;
        private String mSessionId;

        public ReportScapEventsRequest createRequest() {
            return new ReportScapEventsRequest(this.mNonce, this.mEventList, this.mProvisionerDetails, this.mProvisionerNetwork, this.mSessionId);
        }

        public Builder withEventList(List<Event> list) {
            this.mEventList = list;
            return this;
        }

        public Builder withNonce(String str) {
            this.mNonce = str;
            return this;
        }

        public Builder withProvisionerDetails(ScapProvisionerDetails scapProvisionerDetails) {
            this.mProvisionerDetails = scapProvisionerDetails;
            return this;
        }

        public Builder withProvisionerNetwork(ProvisionerNetwork provisionerNetwork) {
            this.mProvisionerNetwork = provisionerNetwork;
            return this;
        }

        public Builder withSessionId(String str) {
            this.mSessionId = str;
            return this;
        }
    }

    private ReportScapEventsRequest(String str, List<Event> list, ScapProvisionerDetails scapProvisionerDetails, ProvisionerNetwork provisionerNetwork, String str2) {
        this.mNonce = str;
        this.mEventList = list;
        this.mProvisionerDetails = scapProvisionerDetails;
        this.mProvisionerNetwork = provisionerNetwork;
        this.mSessionId = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ReportScapEventsRequest reportScapEventsRequest = (ReportScapEventsRequest) obj;
            if (Objects.equal(this.mNonce, reportScapEventsRequest.mNonce) && Objects.equal(this.mEventList, reportScapEventsRequest.mEventList) && Objects.equal(this.mProvisionerDetails, reportScapEventsRequest.mProvisionerDetails) && Objects.equal(this.mProvisionerNetwork, reportScapEventsRequest.mProvisionerNetwork) && Objects.equal(this.mSessionId, reportScapEventsRequest.mSessionId)) {
                return true;
            }
        }
        return false;
    }

    public List<Event> getEventList() {
        return this.mEventList;
    }

    public String getNonce() {
        return this.mNonce;
    }

    public ScapProvisionerDetails getProvisionerDetails() {
        return this.mProvisionerDetails;
    }

    public ProvisionerNetwork getProvisionerNetwork() {
        return this.mProvisionerNetwork;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    public int hashCode() {
        return Objects.hashCode(this.mNonce, this.mEventList, this.mProvisionerDetails, this.mProvisionerNetwork, this.mSessionId);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mNonce", this.mNonce).add("mEventList", this.mEventList).add("mProvisionerDetails", this.mProvisionerDetails).add("mProvisionerNetwork", this.mProvisionerNetwork).add("mSessionId", this.mSessionId).toString();
    }
}
