package com.amazon.alexa.client.alexaservice.eventing;

import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import java.util.Objects;
import java.util.function.Predicate;
import org.greenrobot.eventbus.EventBus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class AlexaClientEventBus {
    public static final int PRIORITY_HIGH = 100;
    public static final int PRIORITY_NONE = 0;
    private static final String TAG = "AlexaClientEventBus";
    protected final EventBus eventBus;
    private final FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority;

    public AlexaClientEventBus(EventBus eventBus, FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority) {
        this.eventBus = eventBus;
        this.featureFlagConfigurationAuthority = featureFlagConfigurationAuthority;
    }

    private boolean isAllowed(Event event) {
        return !event.hasGatingFeature() || this.featureFlagConfigurationAuthority.isEnabled(event.getGatingFeature());
    }

    public abstract void doPost(Event event);

    public abstract void doPostSticky(Event event);

    public boolean hasSubscriberForEvent(Class<?> cls) {
        return this.eventBus.hasSubscriberForEvent(cls);
    }

    public boolean isRegistered(Object obj) {
        return this.eventBus.isRegistered(obj);
    }

    public void post(Event event) {
        if (isAllowed(event)) {
            doPost(event);
        } else {
            Objects.toString(event);
        }
    }

    public void postSticky(Event event) {
        if (isAllowed(event)) {
            doPostSticky(event);
        } else {
            Objects.toString(event);
        }
    }

    public void register(Object obj) {
        this.eventBus.register(obj);
    }

    public void unregister(Object obj) {
        this.eventBus.unregister(obj);
    }

    public abstract <T extends Event> T waitForEvent(Class<T> cls, Predicate<T> predicate, long j, boolean z) throws InterruptedException;
}
