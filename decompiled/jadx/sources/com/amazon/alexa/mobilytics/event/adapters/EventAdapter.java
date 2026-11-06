package com.amazon.alexa.mobilytics.event.adapters;

import androidx.annotation.NonNull;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsErrorEvent;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsMetricsCounter;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsMetricsTimer;
import com.amazon.alexa.mobilytics.event.operational.DefaultMobilyticsOperationalEvent;
import com.amazon.alexa.mobilytics.internal.JsonConverter;
import com.google.common.base.Preconditions;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import javax.inject.Inject;
import javax.inject.Named;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class EventAdapter {
    private static final String LOCK = "lock";
    static final String OPERATIONAL_EVENT_TYPE_KEY = "operationalEventType";
    private static final String READ_LOCK = "readLock";
    private static final String WRITE_LOCK = "writeLock";
    private final JsonConverter jsonConverter;

    @Inject
    public EventAdapter(@NonNull @Named("NON_TRANSIENT_JSON_CONVERTER") JsonConverter jsonConverter) {
        this.jsonConverter = (JsonConverter) Preconditions.checkNotNull(jsonConverter);
    }

    public MobilyticsEvent deserialize(@NonNull String str) throws JsonSyntaxException {
        JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
        if (!asJsonObject.has("operationalEventType")) {
            return null;
        }
        String asString = asJsonObject.get("operationalEventType").getAsString();
        asString.getClass();
        switch (asString) {
            case "error":
                return (MobilyticsEvent) this.jsonConverter.fromJson(str, DefaultMobilyticsErrorEvent.class);
            case "timer":
                asJsonObject.remove("lock");
                asJsonObject.remove(READ_LOCK);
                asJsonObject.remove(WRITE_LOCK);
                DefaultMobilyticsMetricsTimer defaultMobilyticsMetricsTimer = (DefaultMobilyticsMetricsTimer) this.jsonConverter.fromJson(asJsonObject.toString(), DefaultMobilyticsMetricsTimer.class);
                defaultMobilyticsMetricsTimer.initLocks();
                return defaultMobilyticsMetricsTimer;
            case "counter":
                return (MobilyticsEvent) this.jsonConverter.fromJson(str, DefaultMobilyticsMetricsCounter.class);
            default:
                return (MobilyticsEvent) this.jsonConverter.fromJson(str, DefaultMobilyticsOperationalEvent.class);
        }
    }

    public String serialize(@NonNull MobilyticsEvent mobilyticsEvent) {
        return this.jsonConverter.toJson(mobilyticsEvent);
    }
}
