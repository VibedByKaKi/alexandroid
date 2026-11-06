package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.EnumValues;
import com.amazon.coral.annotation.Generated;
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
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("GetDeviceRegistrationStatusOutput")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class GetDeviceRegistrationStatusOutput {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.GetDeviceRegistrationStatusOutput");
    private String durationToWait;
    private String lastRegisteredTime;
    private String registrationState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String durationToWait;
        protected String lastRegisteredTime;
        protected String registrationState;

        public GetDeviceRegistrationStatusOutput build() {
            GetDeviceRegistrationStatusOutput getDeviceRegistrationStatusOutput = new GetDeviceRegistrationStatusOutput();
            populate(getDeviceRegistrationStatusOutput);
            return getDeviceRegistrationStatusOutput;
        }

        public void populate(GetDeviceRegistrationStatusOutput getDeviceRegistrationStatusOutput) {
            getDeviceRegistrationStatusOutput.setRegistrationState(this.registrationState);
            getDeviceRegistrationStatusOutput.setLastRegisteredTime(this.lastRegisteredTime);
            getDeviceRegistrationStatusOutput.setDurationToWait(this.durationToWait);
        }

        public Builder withDurationToWait(String str) {
            this.durationToWait = str;
            return this;
        }

        public Builder withLastRegisteredTime(String str) {
            this.lastRegisteredTime = str;
            return this;
        }

        public Builder withRegistrationState(String str) {
            this.registrationState = str;
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
        if (!(obj instanceof GetDeviceRegistrationStatusOutput)) {
            return false;
        }
        GetDeviceRegistrationStatusOutput getDeviceRegistrationStatusOutput = (GetDeviceRegistrationStatusOutput) obj;
        return Objects.equals(getRegistrationState(), getDeviceRegistrationStatusOutput.getRegistrationState()) && Objects.equals(getLastRegisteredTime(), getDeviceRegistrationStatusOutput.getLastRegisteredTime()) && Objects.equals(getDurationToWait(), getDeviceRegistrationStatusOutput.getDurationToWait());
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getDurationToWait() {
        return this.durationToWait;
    }

    public String getLastRegisteredTime() {
        return this.lastRegisteredTime;
    }

    @EnumValues({"NOT_REGISTERED", DeviceRegistrationState.RECENTLY_REGISTERED, DeviceRegistrationState.PAST_REGISTERED})
    @Documentation("Registration state of a device")
    public String getRegistrationState() {
        return this.registrationState;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getRegistrationState(), getLastRegisteredTime(), getDurationToWait());
    }

    public void setDurationToWait(String str) {
        this.durationToWait = str;
    }

    public void setLastRegisteredTime(String str) {
        this.lastRegisteredTime = str;
    }

    public void setRegistrationState(String str) {
        this.registrationState = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withRegistrationState(getRegistrationState());
        builder.withLastRegisteredTime(getLastRegisteredTime());
        builder.withDurationToWait(getDurationToWait());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetDeviceRegistrationStatusOutput(registrationState=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.registrationState, ", lastRegisteredTime=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.lastRegisteredTime, ", durationToWait=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.durationToWait, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
