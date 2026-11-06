package com.amazon.devicesetupservice.scap.v1;

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
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.devicesetupservice.scap.v1/")
@CoralSuppressWarnings
@Generated
@XmlName("ActionDetails")
@Documentation("Provisioner action details returned by the provisionee on \"timeout\" or \"error\".")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ActionDetails {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.ActionDetails");
    private int sequenceNumber;
    private String type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected int sequenceNumber;
        protected String type;

        public ActionDetails build() {
            ActionDetails actionDetails = new ActionDetails();
            populate(actionDetails);
            return actionDetails;
        }

        public void populate(ActionDetails actionDetails) {
            actionDetails.setType(this.type);
            actionDetails.setSequenceNumber(this.sequenceNumber);
        }

        public Builder withSequenceNumber(int i) {
            this.sequenceNumber = i;
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
        if (!(obj instanceof ActionDetails)) {
            return false;
        }
        ActionDetails actionDetails = (ActionDetails) obj;
        return Objects.equals(getType(), actionDetails.getType()) && Integer.valueOf(getSequenceNumber()).equals(Integer.valueOf(actionDetails.getSequenceNumber()));
    }

    @Required
    public int getSequenceNumber() {
        return this.sequenceNumber;
    }

    @EnumValues({ActionType.WAIT, "END_SESSION", ActionType.START_SCANNING, ActionType.STOP_SCANNING, ActionType.CONNECT_PERIPHERAL, ActionType.DISCONNECT_PERIPHERAL, ActionType.START_SERVICE_DISCOVERY, ActionType.STOP_SERVICE_DISCOVERY, ActionType.START_CHARACTERISTIC_DISCOVERY, ActionType.STOP_CHARACTERISTIC_DISCOVERY, ActionType.SUBSCRIBE_CHARACTERISTIC, ActionType.UNSUBSCRIBE_CHARACTERISTIC, ActionType.READ_CHARACTERISTIC, ActionType.WRITE_CHARACTERISTIC, ActionType.BLACKLIST_PERIPHERALS, ActionType.GENERATE_CBL_TOKEN, ActionType.SET_SMARTHOME_CREDENTIALS})
    @Required
    @Documentation("Provisioner action.")
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getType(), Integer.valueOf(getSequenceNumber()));
    }

    public void setSequenceNumber(int i) {
        this.sequenceNumber = i;
    }

    public void setType(String str) {
        this.type = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withType(getType());
        builder.withSequenceNumber(getSequenceNumber());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ActionDetails(type=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.type, ", sequenceNumber=", sb);
        sb.append(String.valueOf(this.sequenceNumber));
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }
}
