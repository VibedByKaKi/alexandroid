package com.amazon.alexa.client.alexaservice.dialog.text;

import com.amazon.alexa.client.alexaservice.eventing.Event;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class StreamingTextMetricEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PartialSentEvent extends StreamingTextMetricEvent {
        private static final PartialSentEvent INSTANCE = new PartialSentEvent();

        public static PartialSentEvent create() {
            return INSTANCE;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PartialToCompleteEvent extends StreamingTextMetricEvent {
        private final String dialogRequestId;

        private PartialToCompleteEvent(String str) {
            this.dialogRequestId = str;
        }

        public static PartialToCompleteEvent create(String str) {
            return new PartialToCompleteEvent(str);
        }

        public String getDialogRequestId() {
            return this.dialogRequestId;
        }
    }
}
