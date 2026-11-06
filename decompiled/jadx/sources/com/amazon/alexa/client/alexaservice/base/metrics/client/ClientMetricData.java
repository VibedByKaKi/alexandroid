package com.amazon.alexa.client.alexaservice.base.metrics.client;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.ApiCallIdentifier;
import com.amazon.alexa.client.alexaservice.base.metrics.client.AutoValue_ClientMetricData;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ClientMetricData {

    @VisibleForTesting
    private static final String NO_API_CALL_ID = "";

    @VisibleForTesting
    public static final Long NO_LATENCY = -1L;
    private static final Integer NO_EVENT_VALUE = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ClientMetricData autoBuild();

        public ClientMetricData build() {
            if (getLatencyMs() == null) {
                setLatencyMs(ClientMetricData.NO_LATENCY);
            }
            if (getApiCallId() == null) {
                setApiCallId("");
            }
            if (getEventValue() == null) {
                setEventValue(ClientMetricData.NO_EVENT_VALUE);
            }
            return autoBuild();
        }

        @Nullable
        public abstract String getApiCallId();

        @Nullable
        public abstract Integer getEventValue();

        @Nullable
        public abstract Long getLatencyMs();

        public abstract Builder setApiCallId(@Nullable String str);

        public abstract Builder setClientPackageName(String str);

        public abstract Builder setDialogTurnId(@Nullable String str);

        public abstract Builder setEventId(String str);

        public abstract Builder setEventName(String str);

        public abstract Builder setEventTimestampMs(long j);

        public abstract Builder setEventValue(@Nullable Integer num);

        public abstract Builder setInvocationType(@Nullable String str);

        public abstract Builder setLatencyMs(@Nullable Long l);

        public abstract Builder setSoftwareVersion(String str);

        public abstract Builder setSourcePackageName(String str);
    }

    public static Builder builder() {
        return new AutoValue_ClientMetricData.Builder().setApiCallId(ApiCallIdentifier.NONE.getValue());
    }

    @Nullable
    public abstract String getApiCallId();

    public abstract String getClientPackageName();

    @Nullable
    public abstract String getDialogTurnId();

    public abstract String getEventId();

    public abstract String getEventName();

    public abstract long getEventTimestampMs();

    @Nullable
    public abstract Integer getEventValue();

    @Nullable
    public abstract String getInvocationType();

    @Nullable
    public abstract Long getLatencyMs();

    public abstract String getSoftwareVersion();

    public abstract String getSourcePackageName();
}
