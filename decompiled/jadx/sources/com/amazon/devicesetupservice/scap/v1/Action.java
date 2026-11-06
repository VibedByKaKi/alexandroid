package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("Action")
@Documentation("Provisioner action.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class Action {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.Action");
    private BlacklistParameters blacklistParameters;
    private String bleConnectionPriority;
    private BleParameters bleParameters;
    private SmartHomeCredentialData credentialData;
    private List<ScanFilter> scanFilters;
    private int sequenceNumber;
    private String timeout;
    private String type;
    private boolean useChunking;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected BlacklistParameters blacklistParameters;
        protected String bleConnectionPriority;
        protected BleParameters bleParameters;
        protected SmartHomeCredentialData credentialData;
        protected List<ScanFilter> scanFilters;
        protected int sequenceNumber;
        protected String timeout;
        protected String type;
        protected boolean useChunking;

        public Action build() {
            Action action = new Action();
            populate(action);
            return action;
        }

        public void populate(Action action) {
            action.setType(this.type);
            action.setSequenceNumber(this.sequenceNumber);
            action.setBleParameters(this.bleParameters);
            action.setUseChunking(this.useChunking);
            action.setBlacklistParameters(this.blacklistParameters);
            action.setTimeout(this.timeout);
            action.setCredentialData(this.credentialData);
            action.setScanFilters(this.scanFilters);
            action.setBleConnectionPriority(this.bleConnectionPriority);
        }

        public Builder withBlacklistParameters(BlacklistParameters blacklistParameters) {
            this.blacklistParameters = blacklistParameters;
            return this;
        }

        public Builder withBleConnectionPriority(String str) {
            this.bleConnectionPriority = str;
            return this;
        }

        public Builder withBleParameters(BleParameters bleParameters) {
            this.bleParameters = bleParameters;
            return this;
        }

        public Builder withCredentialData(SmartHomeCredentialData smartHomeCredentialData) {
            this.credentialData = smartHomeCredentialData;
            return this;
        }

        public Builder withScanFilters(List<ScanFilter> list) {
            this.scanFilters = list;
            return this;
        }

        public Builder withSequenceNumber(int i) {
            this.sequenceNumber = i;
            return this;
        }

        public Builder withTimeout(String str) {
            this.timeout = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withUseChunking(boolean z) {
            this.useChunking = z;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Action)) {
            return false;
        }
        Action action = (Action) obj;
        return Objects.equals(getType(), action.getType()) && Integer.valueOf(getSequenceNumber()).equals(Integer.valueOf(action.getSequenceNumber())) && Objects.equals(getBleParameters(), action.getBleParameters()) && Boolean.valueOf(isUseChunking()).equals(Boolean.valueOf(action.isUseChunking())) && Objects.equals(getBlacklistParameters(), action.getBlacklistParameters()) && Objects.equals(getTimeout(), action.getTimeout()) && Objects.equals(getCredentialData(), action.getCredentialData()) && Objects.equals(getScanFilters(), action.getScanFilters()) && Objects.equals(getBleConnectionPriority(), action.getBleConnectionPriority());
    }

    @Documentation("Blacklisting parameters.")
    public BlacklistParameters getBlacklistParameters() {
        return this.blacklistParameters;
    }

    @EnumValues({BleConnectionPriority.HIGH, BleConnectionPriority.BALANCED, BleConnectionPriority.LOW})
    @Documentation("BLE Connection Priority.")
    public String getBleConnectionPriority() {
        return this.bleConnectionPriority;
    }

    @Documentation("BLE action/event parameters")
    public BleParameters getBleParameters() {
        return this.bleParameters;
    }

    @Documentation("Encapsulates data needed to set credentials in the provisioner.")
    public SmartHomeCredentialData getCredentialData() {
        return this.credentialData;
    }

    @Documentation("List of BLE scan filter")
    public List<ScanFilter> getScanFilters() {
        return this.scanFilters;
    }

    @Required
    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getTimeout() {
        return this.timeout;
    }

    @EnumValues({ActionType.WAIT, "END_SESSION", ActionType.START_SCANNING, ActionType.STOP_SCANNING, ActionType.CONNECT_PERIPHERAL, ActionType.DISCONNECT_PERIPHERAL, ActionType.START_SERVICE_DISCOVERY, ActionType.STOP_SERVICE_DISCOVERY, ActionType.START_CHARACTERISTIC_DISCOVERY, ActionType.STOP_CHARACTERISTIC_DISCOVERY, ActionType.SUBSCRIBE_CHARACTERISTIC, ActionType.UNSUBSCRIBE_CHARACTERISTIC, ActionType.READ_CHARACTERISTIC, ActionType.WRITE_CHARACTERISTIC, ActionType.BLACKLIST_PERIPHERALS, ActionType.GENERATE_CBL_TOKEN, ActionType.SET_SMARTHOME_CREDENTIALS})
    @Required
    @Documentation("Provisioner action.")
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getType(), Integer.valueOf(getSequenceNumber()), getBleParameters(), Boolean.valueOf(isUseChunking()), getBlacklistParameters(), getTimeout(), getCredentialData(), getScanFilters(), getBleConnectionPriority());
    }

    @Documentation("Read or write the payload using the low-level WhisperJoin v2 chunking protocol.")
    public boolean isUseChunking() {
        return this.useChunking;
    }

    public void setBlacklistParameters(BlacklistParameters blacklistParameters) {
        this.blacklistParameters = blacklistParameters;
    }

    public void setBleConnectionPriority(String str) {
        this.bleConnectionPriority = str;
    }

    public void setBleParameters(BleParameters bleParameters) {
        this.bleParameters = bleParameters;
    }

    public void setCredentialData(SmartHomeCredentialData smartHomeCredentialData) {
        this.credentialData = smartHomeCredentialData;
    }

    public void setScanFilters(List<ScanFilter> list) {
        this.scanFilters = list;
    }

    public void setSequenceNumber(int i) {
        this.sequenceNumber = i;
    }

    public void setTimeout(String str) {
        this.timeout = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUseChunking(boolean z) {
        this.useChunking = z;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withType(getType());
        builder.withSequenceNumber(getSequenceNumber());
        builder.withBleParameters(getBleParameters());
        builder.withUseChunking(isUseChunking());
        builder.withBlacklistParameters(getBlacklistParameters());
        builder.withTimeout(getTimeout());
        builder.withCredentialData(getCredentialData());
        builder.withScanFilters(getScanFilters());
        builder.withBleConnectionPriority(getBleConnectionPriority());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Action(type=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.type, ", sequenceNumber=", sb);
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", bleParameters=", this.sequenceNumber, sb);
        sb.append(String.valueOf(this.bleParameters));
        sb.append(", useChunking=");
        sb.append(String.valueOf(this.useChunking));
        sb.append(", blacklistParameters=");
        sb.append(String.valueOf(this.blacklistParameters));
        sb.append(", timeout=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.timeout, ", credentialData=", sb);
        sb.append(String.valueOf(this.credentialData));
        sb.append(", scanFilters=");
        CredentialConfig$$ExternalSyntheticOutline0.m21225m(", bleConnectionPriority=", (List) this.scanFilters, sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.bleConnectionPriority, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
