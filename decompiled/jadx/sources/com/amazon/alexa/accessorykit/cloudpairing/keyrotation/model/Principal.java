package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.AutoValue_Principal;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_Principal.Builder.class)
@JsonSerialize(as = Principal.class)
/* loaded from: classes16.dex */
public abstract class Principal {
    private static final String CUSTOMER_ID_KEY = "customerId";
    public static final String REFERENCE = "@ref";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Principal build();

        @JsonProperty("customerId")
        public abstract Builder setCustomerId(String str);
    }

    public static Builder builder() {
        return new AutoValue_Principal.Builder();
    }

    @JsonProperty("customerId")
    public abstract String getCustomerId();
}
