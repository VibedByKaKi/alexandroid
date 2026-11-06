package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class RequestBody {
    private BypassSoftAttestationFailureRequest bypassSoftAttestationFailure;
    private CancelCommissioningSessionRequest cancelCommissioningSession;
    private DiscoverOverBleRequest discoverOverBle;
    private FinalizeCommissioningRequest finalizeCommissioning;
    private GetCommissioningSessionStateRequest getCommissioningSessionState;
    private ProvideNetworkCredentialsRequest provideNetworkCredentials;
    private StartCommissioningRequest startCommissioning;
    private StartThirdPartyCommissioningRequest startThirdPartyCommissioning;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public RequestBody() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof RequestBody;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestBody)) {
            return false;
        }
        RequestBody requestBody = (RequestBody) obj;
        if (!requestBody.canEqual(this)) {
            return false;
        }
        BypassSoftAttestationFailureRequest bypassSoftAttestationFailure = getBypassSoftAttestationFailure();
        BypassSoftAttestationFailureRequest bypassSoftAttestationFailure2 = requestBody.getBypassSoftAttestationFailure();
        if (bypassSoftAttestationFailure != null ? !bypassSoftAttestationFailure.equals(bypassSoftAttestationFailure2) : bypassSoftAttestationFailure2 != null) {
            return false;
        }
        CancelCommissioningSessionRequest cancelCommissioningSession = getCancelCommissioningSession();
        CancelCommissioningSessionRequest cancelCommissioningSession2 = requestBody.getCancelCommissioningSession();
        if (cancelCommissioningSession != null ? !cancelCommissioningSession.equals(cancelCommissioningSession2) : cancelCommissioningSession2 != null) {
            return false;
        }
        DiscoverOverBleRequest discoverOverBle = getDiscoverOverBle();
        DiscoverOverBleRequest discoverOverBle2 = requestBody.getDiscoverOverBle();
        if (discoverOverBle != null ? !discoverOverBle.equals(discoverOverBle2) : discoverOverBle2 != null) {
            return false;
        }
        FinalizeCommissioningRequest finalizeCommissioning = getFinalizeCommissioning();
        FinalizeCommissioningRequest finalizeCommissioning2 = requestBody.getFinalizeCommissioning();
        if (finalizeCommissioning != null ? !finalizeCommissioning.equals(finalizeCommissioning2) : finalizeCommissioning2 != null) {
            return false;
        }
        GetCommissioningSessionStateRequest getCommissioningSessionState = getGetCommissioningSessionState();
        GetCommissioningSessionStateRequest getCommissioningSessionState2 = requestBody.getGetCommissioningSessionState();
        if (getCommissioningSessionState != null ? !getCommissioningSessionState.equals(getCommissioningSessionState2) : getCommissioningSessionState2 != null) {
            return false;
        }
        ProvideNetworkCredentialsRequest provideNetworkCredentials = getProvideNetworkCredentials();
        ProvideNetworkCredentialsRequest provideNetworkCredentials2 = requestBody.getProvideNetworkCredentials();
        if (provideNetworkCredentials != null ? !provideNetworkCredentials.equals(provideNetworkCredentials2) : provideNetworkCredentials2 != null) {
            return false;
        }
        StartCommissioningRequest startCommissioning = getStartCommissioning();
        StartCommissioningRequest startCommissioning2 = requestBody.getStartCommissioning();
        if (startCommissioning != null ? !startCommissioning.equals(startCommissioning2) : startCommissioning2 != null) {
            return false;
        }
        StartThirdPartyCommissioningRequest startThirdPartyCommissioning = getStartThirdPartyCommissioning();
        StartThirdPartyCommissioningRequest startThirdPartyCommissioning2 = requestBody.getStartThirdPartyCommissioning();
        return startThirdPartyCommissioning != null ? startThirdPartyCommissioning.equals(startThirdPartyCommissioning2) : startThirdPartyCommissioning2 == null;
    }

    @JsonProperty("bypassSoftAttestationFailure")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public BypassSoftAttestationFailureRequest getBypassSoftAttestationFailure() {
        return this.bypassSoftAttestationFailure;
    }

    @JsonProperty("cancelCommissioningSession")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CancelCommissioningSessionRequest getCancelCommissioningSession() {
        return this.cancelCommissioningSession;
    }

    @JsonProperty("discoverOverBle")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public DiscoverOverBleRequest getDiscoverOverBle() {
        return this.discoverOverBle;
    }

    @JsonProperty("finalizeCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public FinalizeCommissioningRequest getFinalizeCommissioning() {
        return this.finalizeCommissioning;
    }

    @JsonProperty("getCommissioningSessionState")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetCommissioningSessionStateRequest getGetCommissioningSessionState() {
        return this.getCommissioningSessionState;
    }

    @JsonProperty("provideNetworkCredentials")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public ProvideNetworkCredentialsRequest getProvideNetworkCredentials() {
        return this.provideNetworkCredentials;
    }

    @JsonProperty("startCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public StartCommissioningRequest getStartCommissioning() {
        return this.startCommissioning;
    }

    @JsonProperty("startThirdPartyCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public StartThirdPartyCommissioningRequest getStartThirdPartyCommissioning() {
        return this.startThirdPartyCommissioning;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        BypassSoftAttestationFailureRequest bypassSoftAttestationFailure = getBypassSoftAttestationFailure();
        int hashCode = bypassSoftAttestationFailure == null ? 43 : bypassSoftAttestationFailure.hashCode();
        CancelCommissioningSessionRequest cancelCommissioningSession = getCancelCommissioningSession();
        int hashCode2 = ((hashCode + 59) * 59) + (cancelCommissioningSession == null ? 43 : cancelCommissioningSession.hashCode());
        DiscoverOverBleRequest discoverOverBle = getDiscoverOverBle();
        int hashCode3 = (hashCode2 * 59) + (discoverOverBle == null ? 43 : discoverOverBle.hashCode());
        FinalizeCommissioningRequest finalizeCommissioning = getFinalizeCommissioning();
        int hashCode4 = (hashCode3 * 59) + (finalizeCommissioning == null ? 43 : finalizeCommissioning.hashCode());
        GetCommissioningSessionStateRequest getCommissioningSessionState = getGetCommissioningSessionState();
        int hashCode5 = (hashCode4 * 59) + (getCommissioningSessionState == null ? 43 : getCommissioningSessionState.hashCode());
        ProvideNetworkCredentialsRequest provideNetworkCredentials = getProvideNetworkCredentials();
        int hashCode6 = (hashCode5 * 59) + (provideNetworkCredentials == null ? 43 : provideNetworkCredentials.hashCode());
        StartCommissioningRequest startCommissioning = getStartCommissioning();
        int i = hashCode6 * 59;
        int hashCode7 = startCommissioning == null ? 43 : startCommissioning.hashCode();
        StartThirdPartyCommissioningRequest startThirdPartyCommissioning = getStartThirdPartyCommissioning();
        return ((i + hashCode7) * 59) + (startThirdPartyCommissioning != null ? startThirdPartyCommissioning.hashCode() : 43);
    }

    @JsonProperty("bypassSoftAttestationFailure")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setBypassSoftAttestationFailure(BypassSoftAttestationFailureRequest bypassSoftAttestationFailureRequest) {
        this.bypassSoftAttestationFailure = bypassSoftAttestationFailureRequest;
    }

    @JsonProperty("cancelCommissioningSession")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCancelCommissioningSession(CancelCommissioningSessionRequest cancelCommissioningSessionRequest) {
        this.cancelCommissioningSession = cancelCommissioningSessionRequest;
    }

    @JsonProperty("discoverOverBle")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setDiscoverOverBle(DiscoverOverBleRequest discoverOverBleRequest) {
        this.discoverOverBle = discoverOverBleRequest;
    }

    @JsonProperty("finalizeCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setFinalizeCommissioning(FinalizeCommissioningRequest finalizeCommissioningRequest) {
        this.finalizeCommissioning = finalizeCommissioningRequest;
    }

    @JsonProperty("getCommissioningSessionState")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setGetCommissioningSessionState(GetCommissioningSessionStateRequest getCommissioningSessionStateRequest) {
        this.getCommissioningSessionState = getCommissioningSessionStateRequest;
    }

    @JsonProperty("provideNetworkCredentials")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setProvideNetworkCredentials(ProvideNetworkCredentialsRequest provideNetworkCredentialsRequest) {
        this.provideNetworkCredentials = provideNetworkCredentialsRequest;
    }

    @JsonProperty("startCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setStartCommissioning(StartCommissioningRequest startCommissioningRequest) {
        this.startCommissioning = startCommissioningRequest;
    }

    @JsonProperty("startThirdPartyCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setStartThirdPartyCommissioning(StartThirdPartyCommissioningRequest startThirdPartyCommissioningRequest) {
        this.startThirdPartyCommissioning = startThirdPartyCommissioningRequest;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "RequestBody(bypassSoftAttestationFailure=" + getBypassSoftAttestationFailure() + ", cancelCommissioningSession=" + getCancelCommissioningSession() + ", discoverOverBle=" + getDiscoverOverBle() + ", finalizeCommissioning=" + getFinalizeCommissioning() + ", getCommissioningSessionState=" + getGetCommissioningSessionState() + ", provideNetworkCredentials=" + getProvideNetworkCredentials() + ", startCommissioning=" + getStartCommissioning() + ", startThirdPartyCommissioning=" + getStartThirdPartyCommissioning() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
