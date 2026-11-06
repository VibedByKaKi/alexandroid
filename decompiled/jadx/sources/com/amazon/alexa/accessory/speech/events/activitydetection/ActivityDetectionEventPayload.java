package com.amazon.alexa.accessory.speech.events.activitydetection;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class ActivityDetectionEventPayload {

    @SerializedName("events")
    private final List<ActivityDetectionEntry> events;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ActivityDetectionEntry {

        @SerializedName("confidence")
        private final double confidence;

        @SerializedName("status")
        private final String status;

        @SerializedName("timestamp")
        private final String timestamp;

        @SerializedName("type")
        private final String type;

        @SerializedName("uncertaintyInMilliseconds")
        private final int uncertaintyInMilliseconds;

        public ActivityDetectionEntry(String str, String str2, String str3, int i, double d) {
            this.type = str;
            this.status = str2;
            this.timestamp = str3;
            this.uncertaintyInMilliseconds = i;
            this.confidence = d;
        }

        public double getConfidence() {
            return this.confidence;
        }

        public String getStatus() {
            return this.status;
        }

        public String getTimestamp() {
            return this.timestamp;
        }

        public String getType() {
            return this.type;
        }

        public int getUncertaintyInMilliseconds() {
            return this.uncertaintyInMilliseconds;
        }
    }

    public ActivityDetectionEventPayload(List<ActivityDetectionEntry> list) {
        this.events = list;
    }

    public List<ActivityDetectionEntry> getEvents() {
        return this.events;
    }
}
