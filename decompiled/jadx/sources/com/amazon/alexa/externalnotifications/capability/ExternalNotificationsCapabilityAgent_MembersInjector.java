package com.amazon.alexa.externalnotifications.capability;

import com.amazon.alexa.externalnotifications.capability.events.ExternalNotificationsEventSender;
import dagger.MembersInjector;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class ExternalNotificationsCapabilityAgent_MembersInjector implements MembersInjector<ExternalNotificationsCapabilityAgent> {
    private final Provider<ExternalNotificationsDirectiveReceiver> directiveReceiverProvider;
    private final Provider<ExternalNotificationsEventSender> eventSenderProvider;

    public ExternalNotificationsCapabilityAgent_MembersInjector(Provider<ExternalNotificationsEventSender> provider, Provider<ExternalNotificationsDirectiveReceiver> provider2) {
        this.eventSenderProvider = provider;
        this.directiveReceiverProvider = provider2;
    }

    public static MembersInjector<ExternalNotificationsCapabilityAgent> create(Provider<ExternalNotificationsEventSender> provider, Provider<ExternalNotificationsDirectiveReceiver> provider2) {
        return new ExternalNotificationsCapabilityAgent_MembersInjector(provider, provider2);
    }

    public static void injectDirectiveReceiver(ExternalNotificationsCapabilityAgent externalNotificationsCapabilityAgent, ExternalNotificationsDirectiveReceiver externalNotificationsDirectiveReceiver) {
        externalNotificationsCapabilityAgent.directiveReceiver = externalNotificationsDirectiveReceiver;
    }

    public static void injectEventSender(ExternalNotificationsCapabilityAgent externalNotificationsCapabilityAgent, ExternalNotificationsEventSender externalNotificationsEventSender) {
        externalNotificationsCapabilityAgent.eventSender = externalNotificationsEventSender;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ExternalNotificationsCapabilityAgent externalNotificationsCapabilityAgent) {
        injectEventSender(externalNotificationsCapabilityAgent, this.eventSenderProvider.get());
        injectDirectiveReceiver(externalNotificationsCapabilityAgent, this.directiveReceiverProvider.get());
    }
}
