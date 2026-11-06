package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class StartThirdPartyCommissioningRequest {
    private FabricType fabricType;
    private String friendlyName;
    private String setupPayload;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public StartThirdPartyCommissioningRequest() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof StartThirdPartyCommissioningRequest;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartThirdPartyCommissioningRequest)) {
            return false;
        }
        StartThirdPartyCommissioningRequest startThirdPartyCommissioningRequest = (StartThirdPartyCommissioningRequest) obj;
        if (!startThirdPartyCommissioningRequest.canEqual(this)) {
            return false;
        }
        FabricType fabricType = getFabricType();
        FabricType fabricType2 = startThirdPartyCommissioningRequest.getFabricType();
        if (fabricType != null ? !fabricType.equals(fabricType2) : fabricType2 != null) {
            return false;
        }
        String friendlyName = getFriendlyName();
        String friendlyName2 = startThirdPartyCommissioningRequest.getFriendlyName();
        if (friendlyName != null ? !friendlyName.equals(friendlyName2) : friendlyName2 != null) {
            return false;
        }
        String setupPayload = getSetupPayload();
        String setupPayload2 = startThirdPartyCommissioningRequest.getSetupPayload();
        return setupPayload != null ? setupPayload.equals(setupPayload2) : setupPayload2 == null;
    }

    @JsonProperty("fabricType")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public FabricType getFabricType() {
        return this.fabricType;
    }

    @JsonProperty("friendlyName")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getFriendlyName() {
        return this.friendlyName;
    }

    @JsonProperty("setupPayload")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSetupPayload() {
        return this.setupPayload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        FabricType fabricType = getFabricType();
        int hashCode = fabricType == null ? 43 : fabricType.hashCode();
        String friendlyName = getFriendlyName();
        int i = (hashCode + 59) * 59;
        int hashCode2 = friendlyName == null ? 43 : friendlyName.hashCode();
        String setupPayload = getSetupPayload();
        return ((i + hashCode2) * 59) + (setupPayload != null ? setupPayload.hashCode() : 43);
    }

    @JsonProperty("fabricType")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setFabricType(FabricType fabricType) {
        this.fabricType = fabricType;
    }

    @JsonProperty("friendlyName")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setFriendlyName(String str) {
        this.friendlyName = str;
    }

    @JsonProperty("setupPayload")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSetupPayload(String str) {
        this.setupPayload = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "StartThirdPartyCommissioningRequest(fabricType=" + getFabricType() + ", friendlyName=" + getFriendlyName() + ", setupPayload=" + getSetupPayload() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
