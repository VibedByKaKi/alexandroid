package com.amazon.alexa.accessory.notificationpublisher.announcewithcontent;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.notificationpublisher.UseCase;
import com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.dependencies.NotificationsMultipartCapabilityAgentModule;
import com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.events.MultipartEventSender;
import com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.models.Announcement;
import com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.models.Content;
import com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.models.NotificationId;
import com.amazon.alexa.externalnotifications.capability.dependencies.AlexaMobileFrameworkModule;
import com.amazon.alexa.externalnotifications.capability.dependencies.ContextModule;
import com.amazon.alexa.externalnotifications.capability.dependencies.GsonModule;
import com.google.common.base.Preconditions;
import dagger.Component;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class NotificationsMultipartCapabilityAgent {
    private static final String TAG = "NotificationsMultipartCapabilityAgent";
    private static NotificationsMultipartCapabilityAgent notificationsMultipartCapabilityAgent;
    private Context context;

    @Inject
    public MultipartEventSender eventSender;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Component(modules = {ContextModule.class, GsonModule.class, AlexaMobileFrameworkModule.class, NotificationsMultipartCapabilityAgentModule.class})
    @Singleton
    public interface Injector {
        void inject(NotificationsMultipartCapabilityAgent notificationsMultipartCapabilityAgent);
    }

    public NotificationsMultipartCapabilityAgent(Context context) {
        Preconditions.checkNotNull(context, "Context cannot be null");
        this.context = context;
    }

    public static NotificationsMultipartCapabilityAgent createNotificationsMultipartCapabilityAgent(Context context) {
        if (getNotificationsMultipartCapabilityAgent() == null) {
            synchronized (NotificationsMultipartCapabilityAgent.class) {
                try {
                    if (getNotificationsMultipartCapabilityAgent() == null) {
                        notificationsMultipartCapabilityAgent = new NotificationsMultipartCapabilityAgent(context);
                    }
                } finally {
                }
            }
        }
        return notificationsMultipartCapabilityAgent;
    }

    @Nullable
    public static NotificationsMultipartCapabilityAgent getNotificationsMultipartCapabilityAgent() {
        return notificationsMultipartCapabilityAgent;
    }

    private void injectDependencies() {
        DaggerNotificationsMultipartCapabilityAgent_Injector.builder().contextModule(new ContextModule(this.context)).notificationsMultipartCapabilityAgentModule(new NotificationsMultipartCapabilityAgentModule()).build().inject(this);
    }

    public void destroy() {
        this.eventSender.teardown();
    }

    public void initialize() {
        injectDependencies();
        this.eventSender.initialize();
    }

    public void sendAnnounceEvent(NotificationId notificationId, Announcement announcement, Content content, String str, UseCase useCase) {
        this.eventSender.sendAnnounceEvent(notificationId, announcement, content, str, useCase);
    }

    @VisibleForTesting
    public NotificationsMultipartCapabilityAgent(Context context, MultipartEventSender multipartEventSender) {
        this.context = context;
        this.eventSender = multipartEventSender;
    }
}
