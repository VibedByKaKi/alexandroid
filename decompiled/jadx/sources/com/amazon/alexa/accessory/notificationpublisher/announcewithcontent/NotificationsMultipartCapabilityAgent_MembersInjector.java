package com.amazon.alexa.accessory.notificationpublisher.announcewithcontent;

import com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.events.MultipartEventSender;
import dagger.MembersInjector;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class NotificationsMultipartCapabilityAgent_MembersInjector implements MembersInjector<NotificationsMultipartCapabilityAgent> {
    private final Provider<MultipartEventSender> eventSenderProvider;

    public NotificationsMultipartCapabilityAgent_MembersInjector(Provider<MultipartEventSender> provider) {
        this.eventSenderProvider = provider;
    }

    public static MembersInjector<NotificationsMultipartCapabilityAgent> create(Provider<MultipartEventSender> provider) {
        return new NotificationsMultipartCapabilityAgent_MembersInjector(provider);
    }

    public static void injectEventSender(NotificationsMultipartCapabilityAgent notificationsMultipartCapabilityAgent, MultipartEventSender multipartEventSender) {
        notificationsMultipartCapabilityAgent.eventSender = multipartEventSender;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(NotificationsMultipartCapabilityAgent notificationsMultipartCapabilityAgent) {
        injectEventSender(notificationsMultipartCapabilityAgent, this.eventSenderProvider.get());
    }
}
