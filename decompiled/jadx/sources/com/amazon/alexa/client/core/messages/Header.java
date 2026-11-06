package com.amazon.alexa.client.core.messages;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.core.messages.AutoValue_Header;
import com.google.auto.value.AutoValue;
import com.google.gson.JsonElement;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class Header {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Header build();

        public abstract Builder setAdditionalFields(Map<String, JsonElement> map);

        public abstract Builder setCorrelationToken(@Nullable CorrelationToken correlationToken);

        public abstract Builder setDialogRequestIdentifier(DialogRequestIdentifier dialogRequestIdentifier);

        public abstract Builder setMessageIdentifier(MessageIdentifier messageIdentifier);

        public abstract Builder setName(Name name);

        public abstract Builder setNamespace(Namespace namespace);

        public abstract Builder setPayloadVersion(@Nullable PayloadVersion payloadVersion);
    }

    public static Builder builder() {
        return new AutoValue_Header.Builder().setAdditionalFields(Collections.EMPTY_MAP).setMessageIdentifier(MessageIdentifier.createRandom());
    }

    @Nullable
    public abstract Map<String, JsonElement> getAdditionalFields();

    @Nullable
    public abstract CorrelationToken getCorrelationToken();

    @Nullable
    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract MessageIdentifier getMessageIdentifier();

    public abstract Name getName();

    public abstract Namespace getNamespace();

    @Nullable
    public abstract PayloadVersion getPayloadVersion();

    public boolean hasAdditionalFields() {
        return (getAdditionalFields() == null || getAdditionalFields().isEmpty()) ? false : true;
    }

    public boolean hasCorrelationToken() {
        return (getCorrelationToken() == null || getCorrelationToken().getValue().isEmpty()) ? false : true;
    }

    public boolean hasDialogRequestIdentifier() {
        return (getDialogRequestIdentifier() == null || getDialogRequestIdentifier() == DialogRequestIdentifier.NONE) ? false : true;
    }

    public boolean hasPayloadVersion() {
        return (getPayloadVersion() == null || getPayloadVersion().getValue().isEmpty()) ? false : true;
    }
}
