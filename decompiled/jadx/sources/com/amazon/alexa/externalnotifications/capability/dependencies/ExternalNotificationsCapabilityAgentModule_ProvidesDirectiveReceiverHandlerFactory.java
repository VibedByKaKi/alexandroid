package com.amazon.alexa.externalnotifications.capability.dependencies;

import android.os.Handler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ExternalNotificationsCapabilityAgentModule_ProvidesDirectiveReceiverHandlerFactory implements Factory<Handler> {
    private final ExternalNotificationsCapabilityAgentModule module;

    public ExternalNotificationsCapabilityAgentModule_ProvidesDirectiveReceiverHandlerFactory(ExternalNotificationsCapabilityAgentModule externalNotificationsCapabilityAgentModule) {
        this.module = externalNotificationsCapabilityAgentModule;
    }

    public static ExternalNotificationsCapabilityAgentModule_ProvidesDirectiveReceiverHandlerFactory create(ExternalNotificationsCapabilityAgentModule externalNotificationsCapabilityAgentModule) {
        return new ExternalNotificationsCapabilityAgentModule_ProvidesDirectiveReceiverHandlerFactory(externalNotificationsCapabilityAgentModule);
    }

    public static Handler providesDirectiveReceiverHandler(ExternalNotificationsCapabilityAgentModule externalNotificationsCapabilityAgentModule) {
        return (Handler) Preconditions.checkNotNull(externalNotificationsCapabilityAgentModule.providesDirectiveReceiverHandler(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public Handler get() {
        return providesDirectiveReceiverHandler(this.module);
    }
}
