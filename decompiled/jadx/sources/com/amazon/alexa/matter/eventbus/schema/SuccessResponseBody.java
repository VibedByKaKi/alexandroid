package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class SuccessResponseBody {
    private Map<String, Object> bypassSoftAttestationFailure;
    private Map<String, Object> cancelCommissioningSession;
    private DiscoverOverBleResponse discoverOverBle;
    private Map<String, Object> finalizeCommissioning;
    private GetCommissioningSessionStateResponse getCommissioningSessionState;
    private Map<String, Object> provideNetworkCredentials;
    private StartCommissioningResponse startCommissioning;
    private Map<String, Object> startThirdPartyCommissioning;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SuccessResponseBody() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SuccessResponseBody;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SuccessResponseBody)) {
            return false;
        }
        SuccessResponseBody successResponseBody = (SuccessResponseBody) obj;
        if (!successResponseBody.canEqual(this)) {
            return false;
        }
        Map<String, Object> bypassSoftAttestationFailure = getBypassSoftAttestationFailure();
        Map<String, Object> bypassSoftAttestationFailure2 = successResponseBody.getBypassSoftAttestationFailure();
        if (bypassSoftAttestationFailure != null ? !bypassSoftAttestationFailure.equals(bypassSoftAttestationFailure2) : bypassSoftAttestationFailure2 != null) {
            return false;
        }
        Map<String, Object> cancelCommissioningSession = getCancelCommissioningSession();
        Map<String, Object> cancelCommissioningSession2 = successResponseBody.getCancelCommissioningSession();
        if (cancelCommissioningSession != null ? !cancelCommissioningSession.equals(cancelCommissioningSession2) : cancelCommissioningSession2 != null) {
            return false;
        }
        DiscoverOverBleResponse discoverOverBle = getDiscoverOverBle();
        DiscoverOverBleResponse discoverOverBle2 = successResponseBody.getDiscoverOverBle();
        if (discoverOverBle != null ? !discoverOverBle.equals(discoverOverBle2) : discoverOverBle2 != null) {
            return false;
        }
        Map<String, Object> finalizeCommissioning = getFinalizeCommissioning();
        Map<String, Object> finalizeCommissioning2 = successResponseBody.getFinalizeCommissioning();
        if (finalizeCommissioning != null ? !finalizeCommissioning.equals(finalizeCommissioning2) : finalizeCommissioning2 != null) {
            return false;
        }
        GetCommissioningSessionStateResponse getCommissioningSessionState = getGetCommissioningSessionState();
        GetCommissioningSessionStateResponse getCommissioningSessionState2 = successResponseBody.getGetCommissioningSessionState();
        if (getCommissioningSessionState != null ? !getCommissioningSessionState.equals(getCommissioningSessionState2) : getCommissioningSessionState2 != null) {
            return false;
        }
        Map<String, Object> provideNetworkCredentials = getProvideNetworkCredentials();
        Map<String, Object> provideNetworkCredentials2 = successResponseBody.getProvideNetworkCredentials();
        if (provideNetworkCredentials != null ? !provideNetworkCredentials.equals(provideNetworkCredentials2) : provideNetworkCredentials2 != null) {
            return false;
        }
        StartCommissioningResponse startCommissioning = getStartCommissioning();
        StartCommissioningResponse startCommissioning2 = successResponseBody.getStartCommissioning();
        if (startCommissioning != null ? !startCommissioning.equals(startCommissioning2) : startCommissioning2 != null) {
            return false;
        }
        Map<String, Object> startThirdPartyCommissioning = getStartThirdPartyCommissioning();
        Map<String, Object> startThirdPartyCommissioning2 = successResponseBody.getStartThirdPartyCommissioning();
        return startThirdPartyCommissioning != null ? startThirdPartyCommissioning.equals(startThirdPartyCommissioning2) : startThirdPartyCommissioning2 == null;
    }

    @JsonProperty("bypassSoftAttestationFailure")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Map<String, Object> getBypassSoftAttestationFailure() {
        return this.bypassSoftAttestationFailure;
    }

    @JsonProperty("cancelCommissioningSession")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Map<String, Object> getCancelCommissioningSession() {
        return this.cancelCommissioningSession;
    }

    @JsonProperty("discoverOverBle")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public DiscoverOverBleResponse getDiscoverOverBle() {
        return this.discoverOverBle;
    }

    @JsonProperty("finalizeCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Map<String, Object> getFinalizeCommissioning() {
        return this.finalizeCommissioning;
    }

    @JsonProperty("getCommissioningSessionState")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public GetCommissioningSessionStateResponse getGetCommissioningSessionState() {
        return this.getCommissioningSessionState;
    }

    @JsonProperty("provideNetworkCredentials")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Map<String, Object> getProvideNetworkCredentials() {
        return this.provideNetworkCredentials;
    }

    @JsonProperty("startCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public StartCommissioningResponse getStartCommissioning() {
        return this.startCommissioning;
    }

    @JsonProperty("startThirdPartyCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Map<String, Object> getStartThirdPartyCommissioning() {
        return this.startThirdPartyCommissioning;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        Map<String, Object> bypassSoftAttestationFailure = getBypassSoftAttestationFailure();
        int hashCode = bypassSoftAttestationFailure == null ? 43 : bypassSoftAttestationFailure.hashCode();
        Map<String, Object> cancelCommissioningSession = getCancelCommissioningSession();
        int hashCode2 = ((hashCode + 59) * 59) + (cancelCommissioningSession == null ? 43 : cancelCommissioningSession.hashCode());
        DiscoverOverBleResponse discoverOverBle = getDiscoverOverBle();
        int hashCode3 = (hashCode2 * 59) + (discoverOverBle == null ? 43 : discoverOverBle.hashCode());
        Map<String, Object> finalizeCommissioning = getFinalizeCommissioning();
        int hashCode4 = (hashCode3 * 59) + (finalizeCommissioning == null ? 43 : finalizeCommissioning.hashCode());
        GetCommissioningSessionStateResponse getCommissioningSessionState = getGetCommissioningSessionState();
        int hashCode5 = (hashCode4 * 59) + (getCommissioningSessionState == null ? 43 : getCommissioningSessionState.hashCode());
        Map<String, Object> provideNetworkCredentials = getProvideNetworkCredentials();
        int hashCode6 = (hashCode5 * 59) + (provideNetworkCredentials == null ? 43 : provideNetworkCredentials.hashCode());
        StartCommissioningResponse startCommissioning = getStartCommissioning();
        int i = hashCode6 * 59;
        int hashCode7 = startCommissioning == null ? 43 : startCommissioning.hashCode();
        Map<String, Object> startThirdPartyCommissioning = getStartThirdPartyCommissioning();
        return ((i + hashCode7) * 59) + (startThirdPartyCommissioning != null ? startThirdPartyCommissioning.hashCode() : 43);
    }

    @JsonProperty("bypassSoftAttestationFailure")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setBypassSoftAttestationFailure(Map<String, Object> map) {
        this.bypassSoftAttestationFailure = map;
    }

    @JsonProperty("cancelCommissioningSession")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCancelCommissioningSession(Map<String, Object> map) {
        this.cancelCommissioningSession = map;
    }

    @JsonProperty("discoverOverBle")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setDiscoverOverBle(DiscoverOverBleResponse discoverOverBleResponse) {
        this.discoverOverBle = discoverOverBleResponse;
    }

    @JsonProperty("finalizeCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setFinalizeCommissioning(Map<String, Object> map) {
        this.finalizeCommissioning = map;
    }

    @JsonProperty("getCommissioningSessionState")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setGetCommissioningSessionState(GetCommissioningSessionStateResponse getCommissioningSessionStateResponse) {
        this.getCommissioningSessionState = getCommissioningSessionStateResponse;
    }

    @JsonProperty("provideNetworkCredentials")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setProvideNetworkCredentials(Map<String, Object> map) {
        this.provideNetworkCredentials = map;
    }

    @JsonProperty("startCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setStartCommissioning(StartCommissioningResponse startCommissioningResponse) {
        this.startCommissioning = startCommissioningResponse;
    }

    @JsonProperty("startThirdPartyCommissioning")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setStartThirdPartyCommissioning(Map<String, Object> map) {
        this.startThirdPartyCommissioning = map;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "SuccessResponseBody(bypassSoftAttestationFailure=" + getBypassSoftAttestationFailure() + ", cancelCommissioningSession=" + getCancelCommissioningSession() + ", discoverOverBle=" + getDiscoverOverBle() + ", finalizeCommissioning=" + getFinalizeCommissioning() + ", getCommissioningSessionState=" + getGetCommissioningSessionState() + ", provideNetworkCredentials=" + getProvideNetworkCredentials() + ", startCommissioning=" + getStartCommissioning() + ", startThirdPartyCommissioning=" + getStartThirdPartyCommissioning() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
