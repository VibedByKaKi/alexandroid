package com.amazon.comms.models.sip;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import defpackage.a$$ExternalSyntheticOutline0;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes20.dex */
public class ResidualEchoSuppression {

    @NonNull
    TxRxMediaConfiguration configuration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ResidualEchoSuppressionBuilder {
        private TxRxMediaConfiguration configuration;

        public ResidualEchoSuppression build() {
            return new ResidualEchoSuppression(this.configuration);
        }

        public ResidualEchoSuppressionBuilder configuration(@NonNull TxRxMediaConfiguration txRxMediaConfiguration) {
            if (txRxMediaConfiguration != null) {
                this.configuration = txRxMediaConfiguration;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("configuration is marked non-null but is null");
            return null;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m("ResidualEchoSuppression.ResidualEchoSuppressionBuilder(configuration=", String.valueOf(this.configuration), MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public ResidualEchoSuppression(@NonNull TxRxMediaConfiguration txRxMediaConfiguration) {
        if (txRxMediaConfiguration != null) {
            this.configuration = txRxMediaConfiguration;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("configuration is marked non-null but is null");
            throw null;
        }
    }

    public static ResidualEchoSuppressionBuilder builder() {
        return new ResidualEchoSuppressionBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ResidualEchoSuppression;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResidualEchoSuppression)) {
            return false;
        }
        ResidualEchoSuppression residualEchoSuppression = (ResidualEchoSuppression) obj;
        if (!residualEchoSuppression.canEqual(this)) {
            return false;
        }
        TxRxMediaConfiguration configuration = getConfiguration();
        TxRxMediaConfiguration configuration2 = residualEchoSuppression.getConfiguration();
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
        return a$$ExternalSyntheticOutline0.m("ResidualEchoSuppression(configuration=", String.valueOf(getConfiguration()), MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public ResidualEchoSuppression() {
    }
}
