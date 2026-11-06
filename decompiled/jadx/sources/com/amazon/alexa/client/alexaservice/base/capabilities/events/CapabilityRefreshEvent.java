package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.capabilities.Capability;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class CapabilityRefreshEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class TimedOutEvent extends CapabilityRefreshEvent {
        public TimedOutEvent() {
            super(0);
        }

        public static TimedOutEvent create(long j) {
            return new AutoValue_CapabilityRefreshEvent_TimedOutEvent(j);
        }

        public abstract long getTimeoutLengthMs();
    }

    public /* synthetic */ CapabilityRefreshEvent(int i) {
        this();
    }

    private CapabilityRefreshEvent() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class FinishedEvent extends CapabilityRefreshEvent {
        public FinishedEvent() {
            super(0);
        }

        public static FinishedEvent create(long j, int i, int i2) {
            return new AutoValue_CapabilityRefreshEvent_FinishedEvent(false, false, Collections.EMPTY_SET, j, i, i2);
        }

        public static FinishedEvent createInternal(Set<Capability> set) {
            return new AutoValue_CapabilityRefreshEvent_FinishedEvent(true, true, set, -1L, 1, 1);
        }

        public abstract boolean areCapabilityAgentsInternal();

        public abstract boolean getCapabilitiesWereUpdated();

        public abstract int getCountOfCapabilityAgentsResponded();

        public abstract int getCountOfCapabilityAgentsToContact();

        public boolean getFoundAllCapabilities() {
            return getCountOfCapabilityAgentsToContact() == getCountOfCapabilityAgentsResponded();
        }

        public abstract long getTimeToRefreshCapabilitiesMs();

        public abstract Set<Capability> getUpdatedCapabilities();

        public static FinishedEvent create(long j, int i, int i2, Set<Capability> set) {
            return new AutoValue_CapabilityRefreshEvent_FinishedEvent(true, false, set, j, i, i2);
        }
    }
}
