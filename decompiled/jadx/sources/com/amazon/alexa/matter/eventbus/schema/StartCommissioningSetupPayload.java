package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class StartCommissioningSetupPayload {
    private SetupPayload data;
    private String manualCode;
    private String qrCode;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public StartCommissioningSetupPayload() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof StartCommissioningSetupPayload;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartCommissioningSetupPayload)) {
            return false;
        }
        StartCommissioningSetupPayload startCommissioningSetupPayload = (StartCommissioningSetupPayload) obj;
        if (!startCommissioningSetupPayload.canEqual(this)) {
            return false;
        }
        String qrCode = getQrCode();
        String qrCode2 = startCommissioningSetupPayload.getQrCode();
        if (qrCode != null ? !qrCode.equals(qrCode2) : qrCode2 != null) {
            return false;
        }
        String manualCode = getManualCode();
        String manualCode2 = startCommissioningSetupPayload.getManualCode();
        if (manualCode != null ? !manualCode.equals(manualCode2) : manualCode2 != null) {
            return false;
        }
        SetupPayload data = getData();
        SetupPayload data2 = startCommissioningSetupPayload.getData();
        return data != null ? data.equals(data2) : data2 == null;
    }

    @JsonProperty("data")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SetupPayload getData() {
        return this.data;
    }

    @JsonProperty("manualCode")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getManualCode() {
        return this.manualCode;
    }

    @JsonProperty("qrCode")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getQrCode() {
        return this.qrCode;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        String qrCode = getQrCode();
        int hashCode = qrCode == null ? 43 : qrCode.hashCode();
        String manualCode = getManualCode();
        int i = (hashCode + 59) * 59;
        int hashCode2 = manualCode == null ? 43 : manualCode.hashCode();
        SetupPayload data = getData();
        return ((i + hashCode2) * 59) + (data != null ? data.hashCode() : 43);
    }

    @JsonProperty("data")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setData(SetupPayload setupPayload) {
        this.data = setupPayload;
    }

    @JsonProperty("manualCode")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setManualCode(String str) {
        this.manualCode = str;
    }

    @JsonProperty("qrCode")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setQrCode(String str) {
        this.qrCode = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "StartCommissioningSetupPayload(qrCode=" + getQrCode() + ", manualCode=" + getManualCode() + ", data=" + getData() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
