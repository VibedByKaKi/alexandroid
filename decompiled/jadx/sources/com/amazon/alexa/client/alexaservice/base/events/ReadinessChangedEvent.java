package com.amazon.alexa.client.alexaservice.base.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class ReadinessChangedEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class NotReadyToConnectedEvent extends ReadinessChangedEvent {
        public static NotReadyToConnectedEvent create(long j) {
            return new AutoValue_ReadinessChangedEvent_NotReadyToConnectedEvent(j);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class NotReadyToReadyEvent extends ReadinessChangedEvent {
        public static NotReadyToReadyEvent create(long j) {
            return new AutoValue_ReadinessChangedEvent_NotReadyToReadyEvent(j);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class ReadyToConnectedEvent extends ReadinessChangedEvent {
        public static ReadyToConnectedEvent create(long j) {
            return new AutoValue_ReadinessChangedEvent_ReadyToConnectedEvent(j);
        }
    }

    public abstract long timeElapsedMs();
}
