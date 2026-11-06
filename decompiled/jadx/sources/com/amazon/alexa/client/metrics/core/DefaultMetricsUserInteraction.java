package com.amazon.alexa.client.metrics.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class DefaultMetricsUserInteraction extends DefaultAlexaMetricsEvent {
    private final InteractionDetails interactionDetails;
    private final String interactionType;

    public DefaultMetricsUserInteraction(String str, String str2, String str3, @Nullable String str4, Map<String, Object> map) {
        this(str, str2, str3, null, str4, map);
    }

    @Nullable
    public InteractionDetails getInteractionDetails() {
        return this.interactionDetails;
    }

    @NonNull
    public String getInteractionType() {
        return this.interactionType;
    }

    public DefaultMetricsUserInteraction(String str, String str2, String str3, @Nullable InteractionDetails interactionDetails, @Nullable String str4, Map<String, Object> map) {
        super(str, str2, str4, map);
        this.interactionType = str3;
        this.interactionDetails = interactionDetails;
    }
}
