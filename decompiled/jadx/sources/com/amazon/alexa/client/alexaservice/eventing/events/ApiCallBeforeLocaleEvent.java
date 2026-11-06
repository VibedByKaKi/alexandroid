package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ApiCallBeforeLocaleEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ApiName {
        START_LISTENING("startListening"),
        SEND_TEXT("sendText"),
        SET_WAKEWORDS("setWakewords");

        private final String apiName;

        ApiName(String str) {
            this.apiName = str;
        }

        public String getAsString() {
            return this.apiName;
        }
    }

    public static ApiCallBeforeLocaleEvent create(ApiName apiName) {
        return new AutoValue_ApiCallBeforeLocaleEvent(apiName);
    }

    public abstract ApiName getApiName();
}
