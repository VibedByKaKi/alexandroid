package com.amazon.deecomms.calling.model.notification;

import com.amazonaws.auth.policy.internal.JsonDocumentFields;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class CallerIdentity {

    @JsonProperty(JsonDocumentFields.POLICY_ID)
    private String commsId;

    @JsonProperty("Uri")
    private String sipUri;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallerIdentity)) {
            return false;
        }
        CallerIdentity callerIdentity = (CallerIdentity) obj;
        return Objects.equal(getCommsId(), callerIdentity.getCommsId()) && Objects.equal(getSipUri(), callerIdentity.getSipUri());
    }

    public String getCommsId() {
        return this.commsId;
    }

    public String getSipUri() {
        return this.sipUri;
    }

    public int hashCode() {
        return Objects.hashCode(getCommsId(), getSipUri());
    }

    public void setCommsId(String str) {
        this.commsId = str;
    }

    public void setSipUri(String str) {
        this.sipUri = str;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add(JsonDocumentFields.POLICY_ID, getCommsId()).add("Uri", getSipUri()).toString();
    }
}
