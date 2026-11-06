package com.amazon.alexa.client.alexaservice.base.capabilities;

import com.amazon.alexa.client.alexaservice.base.capabilities.AutoValue_CapabilityPublishRequest;
import com.amazon.alexa.client.alexaservice.base.capabilities.legacy.LegacyFlags;
import com.amazon.alexa.client.core.capabilities.Capability;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.util.Collection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class CapabilityPublishRequest {
    public static CapabilityPublishRequest create(String str, Collection<Capability> collection, LegacyFlags legacyFlags) {
        return new AutoValue_CapabilityPublishRequest(str, collection, legacyFlags);
    }

    public static TypeAdapter<CapabilityPublishRequest> typeAdapter(Gson gson) {
        return new AutoValue_CapabilityPublishRequest.GsonTypeAdapter(gson);
    }

    public abstract Collection<Capability> getCapabilities();

    public abstract String getEnvelopeVersion();

    public abstract LegacyFlags getLegacyFlags();
}
