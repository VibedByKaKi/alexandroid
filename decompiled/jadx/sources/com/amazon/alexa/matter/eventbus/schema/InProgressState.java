package com.amazon.alexa.matter.eventbus.schema;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class InProgressState {
    private List<ThreadNetwork> scannedThreadNetworks;
    private List<WiFiNetwork> scannedWiFiNetworks;
    private SelectedNetwork selectedNetwork;
    private String selectedNetworkName;
    private CommissioningSessionStage stage;

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public InProgressState() {
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof InProgressState;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InProgressState)) {
            return false;
        }
        InProgressState inProgressState = (InProgressState) obj;
        if (!inProgressState.canEqual(this)) {
            return false;
        }
        List<ThreadNetwork> scannedThreadNetworks = getScannedThreadNetworks();
        List<ThreadNetwork> scannedThreadNetworks2 = inProgressState.getScannedThreadNetworks();
        if (scannedThreadNetworks != null ? !scannedThreadNetworks.equals(scannedThreadNetworks2) : scannedThreadNetworks2 != null) {
            return false;
        }
        List<WiFiNetwork> scannedWiFiNetworks = getScannedWiFiNetworks();
        List<WiFiNetwork> scannedWiFiNetworks2 = inProgressState.getScannedWiFiNetworks();
        if (scannedWiFiNetworks != null ? !scannedWiFiNetworks.equals(scannedWiFiNetworks2) : scannedWiFiNetworks2 != null) {
            return false;
        }
        SelectedNetwork selectedNetwork = getSelectedNetwork();
        SelectedNetwork selectedNetwork2 = inProgressState.getSelectedNetwork();
        if (selectedNetwork != null ? !selectedNetwork.equals(selectedNetwork2) : selectedNetwork2 != null) {
            return false;
        }
        String selectedNetworkName = getSelectedNetworkName();
        String selectedNetworkName2 = inProgressState.getSelectedNetworkName();
        if (selectedNetworkName != null ? !selectedNetworkName.equals(selectedNetworkName2) : selectedNetworkName2 != null) {
            return false;
        }
        CommissioningSessionStage stage = getStage();
        CommissioningSessionStage stage2 = inProgressState.getStage();
        return stage != null ? stage.equals(stage2) : stage2 == null;
    }

    @JsonProperty("scannedThreadNetworks")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<ThreadNetwork> getScannedThreadNetworks() {
        return this.scannedThreadNetworks;
    }

    @JsonProperty("scannedWiFiNetworks")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public List<WiFiNetwork> getScannedWiFiNetworks() {
        return this.scannedWiFiNetworks;
    }

    @JsonProperty("selectedNetwork")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public SelectedNetwork getSelectedNetwork() {
        return this.selectedNetwork;
    }

    @JsonProperty("selectedNetworkName")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSelectedNetworkName() {
        return this.selectedNetworkName;
    }

    @JsonProperty("stage")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public CommissioningSessionStage getStage() {
        return this.stage;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        List<ThreadNetwork> scannedThreadNetworks = getScannedThreadNetworks();
        int hashCode = scannedThreadNetworks == null ? 43 : scannedThreadNetworks.hashCode();
        List<WiFiNetwork> scannedWiFiNetworks = getScannedWiFiNetworks();
        int hashCode2 = ((hashCode + 59) * 59) + (scannedWiFiNetworks == null ? 43 : scannedWiFiNetworks.hashCode());
        SelectedNetwork selectedNetwork = getSelectedNetwork();
        int hashCode3 = (hashCode2 * 59) + (selectedNetwork == null ? 43 : selectedNetwork.hashCode());
        String selectedNetworkName = getSelectedNetworkName();
        int i = hashCode3 * 59;
        int hashCode4 = selectedNetworkName == null ? 43 : selectedNetworkName.hashCode();
        CommissioningSessionStage stage = getStage();
        return ((i + hashCode4) * 59) + (stage != null ? stage.hashCode() : 43);
    }

    @JsonProperty("scannedThreadNetworks")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setScannedThreadNetworks(List<ThreadNetwork> list) {
        this.scannedThreadNetworks = list;
    }

    @JsonProperty("scannedWiFiNetworks")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setScannedWiFiNetworks(List<WiFiNetwork> list) {
        this.scannedWiFiNetworks = list;
    }

    @JsonProperty("selectedNetwork")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSelectedNetwork(SelectedNetwork selectedNetwork) {
        this.selectedNetwork = selectedNetwork;
    }

    @JsonProperty("selectedNetworkName")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSelectedNetworkName(String str) {
        this.selectedNetworkName = str;
    }

    @JsonProperty("stage")
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setStage(CommissioningSessionStage commissioningSessionStage) {
        this.stage = commissioningSessionStage;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "InProgressState(scannedThreadNetworks=" + getScannedThreadNetworks() + ", scannedWiFiNetworks=" + getScannedWiFiNetworks() + ", selectedNetwork=" + getSelectedNetwork() + ", selectedNetworkName=" + getSelectedNetworkName() + ", stage=" + getStage() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
