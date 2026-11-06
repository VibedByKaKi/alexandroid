package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class ProvideNetworkCredentialsRequest {
    private String commissioningSessionID;
    private Credentials credentials;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ProvideNetworkCredentialsRequest() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ProvideNetworkCredentialsRequest;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProvideNetworkCredentialsRequest)) {
            return false;
        }
        ProvideNetworkCredentialsRequest provideNetworkCredentialsRequest = (ProvideNetworkCredentialsRequest) obj;
        if (!provideNetworkCredentialsRequest.canEqual(this)) {
            return false;
        }
        String commissioningSessionID = getCommissioningSessionID();
        String commissioningSessionID2 = provideNetworkCredentialsRequest.getCommissioningSessionID();
        if (commissioningSessionID != null ? !commissioningSessionID.equals(commissioningSessionID2) : commissioningSessionID2 != null) {
            return false;
        }
        Credentials credentials = getCredentials();
        Credentials credentials2 = provideNetworkCredentialsRequest.getCredentials();
        return credentials != null ? credentials.equals(credentials2) : credentials2 == null;
    }

    @JsonProperty("commissioningSessionID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCommissioningSessionID() {
        return this.commissioningSessionID;
    }

    @JsonProperty("credentials")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Credentials getCredentials() {
        return this.credentials;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String commissioningSessionID = getCommissioningSessionID();
        int hashCode = commissioningSessionID == null ? 43 : commissioningSessionID.hashCode();
        Credentials credentials = getCredentials();
        return ((hashCode + 59) * 59) + (credentials != null ? credentials.hashCode() : 43);
    }

    @JsonProperty("commissioningSessionID")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCommissioningSessionID(String str) {
        this.commissioningSessionID = str;
    }

    @JsonProperty("credentials")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "ProvideNetworkCredentialsRequest(commissioningSessionID=" + getCommissioningSessionID() + ", credentials=" + getCredentials() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
