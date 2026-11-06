package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MaxLength;
import com.amazon.coral.annotation.MinLength;
import com.amazon.coral.annotation.Required;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazon.devicesetup.common.v1.ErrorInfo;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("Event")
@Documentation("Provisioner event.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class Event {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.Event");
    private ActionDetails actionDetails;
    private BleEventParameters bleParameters;
    private String cblToken;
    private CorrelationToken correlationToken;
    private ErrorInfo errorDetails;
    private int sequenceNumber;
    private String timestamp;
    private String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected ActionDetails actionDetails;
        protected BleEventParameters bleParameters;
        protected String cblToken;
        protected CorrelationToken correlationToken;
        protected ErrorInfo errorDetails;
        protected int sequenceNumber;
        protected String timestamp;
        protected String type;

        public Event build() {
            Event event = new Event();
            populate(event);
            return event;
        }

        public void populate(Event event) {
            event.setType(this.type);
            event.setTimestamp(this.timestamp);
            event.setSequenceNumber(this.sequenceNumber);
            event.setBleParameters(this.bleParameters);
            event.setActionDetails(this.actionDetails);
            event.setCblToken(this.cblToken);
            event.setErrorDetails(this.errorDetails);
            event.setCorrelationToken(this.correlationToken);
        }

        public Builder withActionDetails(ActionDetails actionDetails) {
            this.actionDetails = actionDetails;
            return this;
        }

        public Builder withBleParameters(BleEventParameters bleEventParameters) {
            this.bleParameters = bleEventParameters;
            return this;
        }

        public Builder withCblToken(String str) {
            this.cblToken = str;
            return this;
        }

        public Builder withCorrelationToken(CorrelationToken correlationToken) {
            this.correlationToken = correlationToken;
            return this;
        }

        public Builder withErrorDetails(ErrorInfo errorInfo) {
            this.errorDetails = errorInfo;
            return this;
        }

        public Builder withSequenceNumber(int i) {
            this.sequenceNumber = i;
            return this;
        }

        public Builder withTimestamp(String str) {
            this.timestamp = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
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
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return Objects.equals(getType(), event.getType()) && Objects.equals(getTimestamp(), event.getTimestamp()) && Integer.valueOf(getSequenceNumber()).equals(Integer.valueOf(event.getSequenceNumber())) && Objects.equals(getBleParameters(), event.getBleParameters()) && Objects.equals(getActionDetails(), event.getActionDetails()) && Objects.equals(getCblToken(), event.getCblToken()) && Objects.equals(getErrorDetails(), event.getErrorDetails()) && Objects.equals(getCorrelationToken(), event.getCorrelationToken());
    }

    @Documentation("Provisioner action details returned by the provisionee on \"timeout\" or \"error\".")
    public ActionDetails getActionDetails() {
        return this.actionDetails;
    }

    @Documentation("BLE action/event parameters")
    public BleEventParameters getBleParameters() {
        return this.bleParameters;
    }

    @MaxLength(128)
    @MinLength(0)
    @Documentation("Code-based-linking token.")
    public String getCblToken() {
        return this.cblToken;
    }

    @Documentation("A structure containing information about if the Event was triggered\n        by some event in cloud. e.g. DSES service asking provisioner\n        to start scanning. In that case, this field will contain\n        info about the token it received from cloud which can then\n        be used to link the events together.\n        Example value:")
    public CorrelationToken getCorrelationToken() {
        return this.correlationToken;
    }

    public ErrorInfo getErrorDetails() {
        return this.errorDetails;
    }

    @Required
    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    @Required
    public String getTimestamp() {
        return this.timestamp;
    }

    @EnumValues({EventType.SESSION_STARTED, "SESSION_ENDED", EventType.SCANNING_STARTED, EventType.SCANNING_STOPPED, EventType.RECEIVED_SCAN_RESULT, EventType.PERIPHERAL_CONNECTED, EventType.PERIPHERAL_DISCONNECTED, EventType.CONNECTION_PARAMETERS_UPDATED, EventType.SERVICE_DISCOVERED, EventType.SERVICE_DISCOVERY_DONE, EventType.CHARACTERISTIC_DISCOVERED, EventType.CHARACTERISTIC_DISCOVERY_DONE, EventType.CHARACTERISTIC_SUBSCRIBED, EventType.CHARACTERISTIC_UNSUBSCRIBED, EventType.CHARACTERISTIC_READ, EventType.CHARACTERISTIC_WRITTEN, EventType.CHARACTERISTIC_UPDATED, EventType.CBL_TOKEN_GENERATED, EventType.SMART_HOME_CREDENTIALS_SET, "TIMEOUT", EventType.HTTP_BACK_OFF_RECOVERY, "ERROR"})
    @Required
    @Documentation("Provisioner event.")
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getType(), getTimestamp(), Integer.valueOf(getSequenceNumber()), getBleParameters(), getActionDetails(), getCblToken(), getErrorDetails(), getCorrelationToken());
    }

    public void setActionDetails(ActionDetails actionDetails) {
        this.actionDetails = actionDetails;
    }

    public void setBleParameters(BleEventParameters bleEventParameters) {
        this.bleParameters = bleEventParameters;
    }

    public void setCblToken(String str) {
        this.cblToken = str;
    }

    public void setCorrelationToken(CorrelationToken correlationToken) {
        this.correlationToken = correlationToken;
    }

    public void setErrorDetails(ErrorInfo errorInfo) {
        this.errorDetails = errorInfo;
    }

    public void setSequenceNumber(int i) {
        this.sequenceNumber = i;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withType(getType());
        builder.withTimestamp(getTimestamp());
        builder.withSequenceNumber(getSequenceNumber());
        builder.withBleParameters(getBleParameters());
        builder.withActionDetails(getActionDetails());
        builder.withCblToken(getCblToken());
        builder.withErrorDetails(getErrorDetails());
        builder.withCorrelationToken(getCorrelationToken());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Event(type=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.type, ", timestamp=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.timestamp, ", sequenceNumber=", sb);
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", bleParameters=", this.sequenceNumber, sb);
        sb.append(String.valueOf(this.bleParameters));
        sb.append(", actionDetails=");
        sb.append(String.valueOf(this.actionDetails));
        sb.append(", cblToken=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.cblToken, ", errorDetails=", sb);
        sb.append(String.valueOf(this.errorDetails));
        sb.append(", correlationToken=");
        sb.append(String.valueOf(this.correlationToken));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
