package com.amazon.alexa.accessory.speech.events.activitydetection;

import com.amazon.alexa.accessory.avsclient.utils.JsonConverter;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazon.alexa.accessory.repositories.ambient.ActivityState;
import com.amazon.alexa.accessory.repositories.ambient.AmbientContextCategory;
import com.amazon.alexa.accessory.repositories.ambient.AmbientContextSignalData;
import com.amazon.alexa.accessory.speech.events.activitydetection.ActivityDetectionEventPayload;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class ActivityDetectionEventGenerator {
    private static final String STATUS_DETECTED = "DETECTED";
    private final JsonConverter jsonConverter;

    public ActivityDetectionEventGenerator(JsonConverter jsonConverter) {
        Preconditions.notNull(jsonConverter, "jsonConverter");
        this.jsonConverter = jsonConverter;
    }

    public String generatePayload(List<AmbientContextSignalData> list) {
        ActivityState activityState;
        Preconditions.notNull(list, "signals");
        ArrayList arrayList = new ArrayList();
        for (AmbientContextSignalData ambientContextSignalData : list) {
            if (ambientContextSignalData.getSignalType() == AmbientContextCategory.ACTIVITY_DETECTION && (activityState = ambientContextSignalData.getActivityState()) != null && activityState != ActivityState.UNKNOWN) {
                arrayList.add(new ActivityDetectionEventPayload.ActivityDetectionEntry(activityState.name(), STATUS_DETECTED, ambientContextSignalData.getTimestamp(), ambientContextSignalData.getUncertaintyInMillis(), ambientContextSignalData.getConfidenceScore() / 100.0d));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return this.jsonConverter.toJson(new ActivityDetectionEventPayload(arrayList));
    }
}
