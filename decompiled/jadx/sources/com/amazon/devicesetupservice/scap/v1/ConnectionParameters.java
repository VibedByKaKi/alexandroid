package com.amazon.devicesetupservice.scap.v1;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.MinValue;
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
@XmlName("ConnectionParameters")
@Documentation("BLE connection parameters.")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class ConnectionParameters {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.scap.v1.ConnectionParameters");
    private String connectionInterval;
    private String connectionLatency;
    private int mtu;
    private String supervisionTimeout;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String connectionInterval;
        protected String connectionLatency;
        protected int mtu;
        protected String supervisionTimeout;

        public ConnectionParameters build() {
            ConnectionParameters connectionParameters = new ConnectionParameters();
            populate(connectionParameters);
            return connectionParameters;
        }

        public void populate(ConnectionParameters connectionParameters) {
            connectionParameters.setMtu(this.mtu);
            connectionParameters.setConnectionInterval(this.connectionInterval);
            connectionParameters.setConnectionLatency(this.connectionLatency);
            connectionParameters.setSupervisionTimeout(this.supervisionTimeout);
        }

        public Builder withConnectionInterval(String str) {
            this.connectionInterval = str;
            return this;
        }

        public Builder withConnectionLatency(String str) {
            this.connectionLatency = str;
            return this;
        }

        public Builder withMtu(int i) {
            this.mtu = i;
            return this;
        }

        public Builder withSupervisionTimeout(String str) {
            this.supervisionTimeout = str;
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
        if (!(obj instanceof ConnectionParameters)) {
            return false;
        }
        ConnectionParameters connectionParameters = (ConnectionParameters) obj;
        return Integer.valueOf(getMtu()).equals(Integer.valueOf(connectionParameters.getMtu())) && Objects.equals(getConnectionInterval(), connectionParameters.getConnectionInterval()) && Objects.equals(getConnectionLatency(), connectionParameters.getConnectionLatency()) && Objects.equals(getSupervisionTimeout(), connectionParameters.getSupervisionTimeout());
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getConnectionInterval() {
        return this.connectionInterval;
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getConnectionLatency() {
        return this.connectionLatency;
    }

    @Documentation("BLE connection maximum transfer unit.")
    @MinValue("23")
    public int getMtu() {
        return this.mtu;
    }

    @Documentation("Durations define the amount of intervening time in a time interval.\n        refer https://en.wikipedia.org/wiki/ISO_8601#Durations for further details.")
    public String getSupervisionTimeout() {
        return this.supervisionTimeout;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), Integer.valueOf(getMtu()), getConnectionInterval(), getConnectionLatency(), getSupervisionTimeout());
    }

    public void setConnectionInterval(String str) {
        this.connectionInterval = str;
    }

    public void setConnectionLatency(String str) {
        this.connectionLatency = str;
    }

    public void setMtu(int i) {
        this.mtu = i;
    }

    public void setSupervisionTimeout(String str) {
        this.supervisionTimeout = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withMtu(getMtu());
        builder.withConnectionInterval(getConnectionInterval());
        builder.withConnectionLatency(getConnectionLatency());
        builder.withSupervisionTimeout(getSupervisionTimeout());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectionParameters(mtu=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m(", connectionInterval=", this.mtu, sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.connectionInterval, ", connectionLatency=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.connectionLatency, ", supervisionTimeout=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.supervisionTimeout, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
