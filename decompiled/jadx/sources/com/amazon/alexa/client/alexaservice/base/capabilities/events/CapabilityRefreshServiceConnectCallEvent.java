package com.amazon.alexa.client.alexaservice.base.capabilities.events;

import android.content.ComponentName;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CapabilityRefreshServiceConnectCallEvent extends Event.NotGated {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class FailedEvent extends CapabilityRefreshServiceConnectCallEvent {
        public FailedEvent() {
            super(0);
        }

        public static FailedEvent create(ComponentName componentName, long j) {
            return new AutoValue_CapabilityRefreshServiceConnectCallEvent_FailedEvent(componentName, j);
        }

        public abstract ComponentName getComponentName();

        public abstract long getTimeTaken();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class SucceededEvent extends CapabilityRefreshServiceConnectCallEvent {
        public SucceededEvent() {
            super(0);
        }

        public static SucceededEvent create(ComponentName componentName, long j) {
            return new AutoValue_CapabilityRefreshServiceConnectCallEvent_SucceededEvent(componentName, j);
        }

        public abstract ComponentName getComponentName();

        public abstract long getTimeTaken();
    }

    public /* synthetic */ CapabilityRefreshServiceConnectCallEvent(int i) {
        this();
    }

    private CapabilityRefreshServiceConnectCallEvent() {
    }
}
