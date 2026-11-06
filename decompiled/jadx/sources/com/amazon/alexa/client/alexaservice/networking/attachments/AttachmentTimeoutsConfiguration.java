package com.amazon.alexa.client.alexaservice.networking.attachments;

import com.amazon.alexa.client.core.configuration.ClientConfiguration;
import com.amazon.alexa.utils.validation.Preconditions;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class AttachmentTimeoutsConfiguration {
    public static AttachmentTimeoutsConfiguration create(ClientConfiguration clientConfiguration, boolean z) {
        Preconditions.notNull(clientConfiguration, "config is null");
        return new AutoValue_AttachmentTimeoutsConfiguration((z ? clientConfiguration.getFirstTurnNetworkTotalWriteTimeout() : clientConfiguration.getNetworkTotalWriteTimeout()).longValue(), clientConfiguration.getNetworkWriteBytesTimeout().longValue(), clientConfiguration.getMaxUtteranceDuration().longValue());
    }

    public abstract long getDurationLimit();

    public abstract long getTotalWriteTimeout();

    public abstract long getWriteBytesTimeout();

    public static AttachmentTimeoutsConfiguration create(ClientConfiguration clientConfiguration, boolean z, long j) {
        Long networkTotalWriteTimeout;
        Preconditions.notNull(clientConfiguration, "config is null");
        if (z) {
            networkTotalWriteTimeout = clientConfiguration.getFirstTurnNetworkTotalWriteTimeout();
        } else {
            networkTotalWriteTimeout = clientConfiguration.getNetworkTotalWriteTimeout();
        }
        return new AutoValue_AttachmentTimeoutsConfiguration(networkTotalWriteTimeout.longValue(), j, clientConfiguration.getMaxUtteranceDuration().longValue());
    }
}
