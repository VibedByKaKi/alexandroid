package com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model;

import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.model.AutoValue_DtDsn;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
@JsonDeserialize(builder = AutoValue_DtDsn.Builder.class)
@JsonSerialize(as = DtDsn.class)
/* loaded from: classes16.dex */
public abstract class DtDsn {
    private static final String DT_DSN_KEY = "dtDsn";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract DtDsn build();

        @JsonProperty(DtDsn.DT_DSN_KEY)
        public abstract Builder setDtDsn(DeviceIdentifier deviceIdentifier);
    }

    public static Builder builder() {
        return new AutoValue_DtDsn.Builder();
    }

    @JsonProperty(DT_DSN_KEY)
    public abstract DeviceIdentifier getDtDsn();
}
