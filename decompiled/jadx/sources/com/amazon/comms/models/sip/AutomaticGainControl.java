package com.amazon.comms.models.sip;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import defpackage.a$$ExternalSyntheticOutline0;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes20.dex */
public class AutomaticGainControl {

    @NonNull
    private TxRxMediaConfiguration receiveConfiguration;

    @NonNull
    private TxRxMediaConfiguration transmitConfiguration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AutomaticGainControlBuilder {
        private TxRxMediaConfiguration receiveConfiguration;
        private TxRxMediaConfiguration transmitConfiguration;

        public AutomaticGainControl build() {
            return new AutomaticGainControl(this.transmitConfiguration, this.receiveConfiguration);
        }

        public AutomaticGainControlBuilder receiveConfiguration(@NonNull TxRxMediaConfiguration txRxMediaConfiguration) {
            if (txRxMediaConfiguration != null) {
                this.receiveConfiguration = txRxMediaConfiguration;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("receiveConfiguration is marked non-null but is null");
            return null;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("AutomaticGainControl.AutomaticGainControlBuilder(transmitConfiguration=", String.valueOf(this.transmitConfiguration), ", receiveConfiguration=", String.valueOf(this.receiveConfiguration), MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public AutomaticGainControlBuilder transmitConfiguration(@NonNull TxRxMediaConfiguration txRxMediaConfiguration) {
            if (txRxMediaConfiguration != null) {
                this.transmitConfiguration = txRxMediaConfiguration;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("transmitConfiguration is marked non-null but is null");
            return null;
        }
    }

    public AutomaticGainControl(@NonNull TxRxMediaConfiguration txRxMediaConfiguration, @NonNull TxRxMediaConfiguration txRxMediaConfiguration2) {
        if (txRxMediaConfiguration == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("transmitConfiguration is marked non-null but is null");
            throw null;
        }
        if (txRxMediaConfiguration2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("receiveConfiguration is marked non-null but is null");
            throw null;
        }
        this.transmitConfiguration = txRxMediaConfiguration;
        this.receiveConfiguration = txRxMediaConfiguration2;
    }

    public static AutomaticGainControlBuilder builder() {
        return new AutomaticGainControlBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AutomaticGainControl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutomaticGainControl)) {
            return false;
        }
        AutomaticGainControl automaticGainControl = (AutomaticGainControl) obj;
        if (!automaticGainControl.canEqual(this)) {
            return false;
        }
        TxRxMediaConfiguration transmitConfiguration = getTransmitConfiguration();
        TxRxMediaConfiguration transmitConfiguration2 = automaticGainControl.getTransmitConfiguration();
        if (transmitConfiguration != null ? !transmitConfiguration.equals(transmitConfiguration2) : transmitConfiguration2 != null) {
            return false;
        }
        TxRxMediaConfiguration receiveConfiguration = getReceiveConfiguration();
        TxRxMediaConfiguration receiveConfiguration2 = automaticGainControl.getReceiveConfiguration();
        return receiveConfiguration != null ? receiveConfiguration.equals(receiveConfiguration2) : receiveConfiguration2 == null;
    }

    @NonNull
    public TxRxMediaConfiguration getReceiveConfiguration() {
        return this.receiveConfiguration;
    }

    @NonNull
    public TxRxMediaConfiguration getTransmitConfiguration() {
        return this.transmitConfiguration;
    }

    public int hashCode() {
        TxRxMediaConfiguration transmitConfiguration = getTransmitConfiguration();
        int hashCode = transmitConfiguration == null ? 43 : transmitConfiguration.hashCode();
        TxRxMediaConfiguration receiveConfiguration = getReceiveConfiguration();
        return ((hashCode + 59) * 59) + (receiveConfiguration != null ? receiveConfiguration.hashCode() : 43);
    }

    public void setReceiveConfiguration(@NonNull TxRxMediaConfiguration txRxMediaConfiguration) {
        if (txRxMediaConfiguration != null) {
            this.receiveConfiguration = txRxMediaConfiguration;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("receiveConfiguration is marked non-null but is null");
        }
    }

    public void setTransmitConfiguration(@NonNull TxRxMediaConfiguration txRxMediaConfiguration) {
        if (txRxMediaConfiguration != null) {
            this.transmitConfiguration = txRxMediaConfiguration;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("transmitConfiguration is marked non-null but is null");
        }
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("AutomaticGainControl(transmitConfiguration=", String.valueOf(getTransmitConfiguration()), ", receiveConfiguration=", String.valueOf(getReceiveConfiguration()), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public AutomaticGainControl() {
    }
}
