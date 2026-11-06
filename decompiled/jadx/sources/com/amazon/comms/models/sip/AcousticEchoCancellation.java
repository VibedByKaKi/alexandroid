package com.amazon.comms.models.sip;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import defpackage.a$$ExternalSyntheticOutline0;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes20.dex */
public class AcousticEchoCancellation {

    @NonNull
    TxRxMediaConfiguration configuration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AcousticEchoCancellationBuilder {
        private TxRxMediaConfiguration configuration;

        public AcousticEchoCancellation build() {
            return new AcousticEchoCancellation(this.configuration);
        }

        public AcousticEchoCancellationBuilder configuration(@NonNull TxRxMediaConfiguration txRxMediaConfiguration) {
            if (txRxMediaConfiguration != null) {
                this.configuration = txRxMediaConfiguration;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("configuration is marked non-null but is null");
            return null;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("AcousticEchoCancellation.AcousticEchoCancellationBuilder(configuration=", String.valueOf(this.configuration), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public AcousticEchoCancellation(@NonNull TxRxMediaConfiguration txRxMediaConfiguration) {
        if (txRxMediaConfiguration != null) {
            this.configuration = txRxMediaConfiguration;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("configuration is marked non-null but is null");
            throw null;
        }
    }

    public static AcousticEchoCancellationBuilder builder() {
        return new AcousticEchoCancellationBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AcousticEchoCancellation;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AcousticEchoCancellation)) {
            return false;
        }
        AcousticEchoCancellation acousticEchoCancellation = (AcousticEchoCancellation) obj;
        if (!acousticEchoCancellation.canEqual(this)) {
            return false;
        }
        TxRxMediaConfiguration configuration = getConfiguration();
        TxRxMediaConfiguration configuration2 = acousticEchoCancellation.getConfiguration();
        return configuration != null ? configuration.equals(configuration2) : configuration2 == null;
    }

    @NonNull
    public TxRxMediaConfiguration getConfiguration() {
        return this.configuration;
    }

    public int hashCode() {
        TxRxMediaConfiguration configuration = getConfiguration();
        return 59 + (configuration == null ? 43 : configuration.hashCode());
    }

    public void setConfiguration(@NonNull TxRxMediaConfiguration txRxMediaConfiguration) {
        if (txRxMediaConfiguration != null) {
            this.configuration = txRxMediaConfiguration;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("configuration is marked non-null but is null");
        }
    }

    public String toString() {
        return a$$ExternalSyntheticOutline0.m("AcousticEchoCancellation(configuration=", String.valueOf(getConfiguration()), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public AcousticEchoCancellation() {
    }
}
