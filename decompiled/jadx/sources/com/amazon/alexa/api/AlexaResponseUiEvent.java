package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaResponseUiEvent {
    final Bundle customData;
    final UiEventName eventName;
    final long timeOfEvent;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private Bundle customData = new Bundle();
        private UiEventName eventName;
        private long timeOfEvent;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public AlexaResponseUiEvent build() {
            Preconditions.notNull(this.eventName, " event name shouldn't be null");
            Preconditions.notNull(this.customData, " custom data shouldn't be null");
            return new AlexaResponseUiEvent(this);
        }

        public Builder withCustomData(@NonNull Bundle bundle) {
            this.customData = bundle;
            return this;
        }

        public Builder withEventName(@NonNull UiEventName uiEventName) {
            this.eventName = uiEventName;
            return this;
        }

        public Builder withTimeOfEvent(@NonNull long j) {
            this.timeOfEvent = j;
            return this;
        }
    }

    private AlexaResponseUiEvent(Builder builder) {
        this.eventName = builder.eventName;
        this.timeOfEvent = builder.timeOfEvent;
        this.customData = builder.customData;
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(AlexaMetadataBundleKey.UI_EVENT_NAME.name(), this.eventName.name());
        bundle.putLong(AlexaMetadataBundleKey.EVENT_REALTIME_MS.name(), this.timeOfEvent);
        bundle.putBundle(AlexaMetadataBundleKey.UI_EVENT_EXTRA_DATA.name(), this.customData);
        return bundle;
    }
}
