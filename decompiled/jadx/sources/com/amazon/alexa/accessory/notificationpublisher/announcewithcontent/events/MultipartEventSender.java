package com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.events;

import com.amazon.alexa.accessory.notificationpublisher.UseCase;
import com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.models.Announcement;
import com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.models.Content;
import com.amazon.alexa.accessory.notificationpublisher.announcewithcontent.models.NotificationId;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface MultipartEventSender {
    void initialize();

    void sendAnnounceEvent(NotificationId notificationId, Announcement announcement, Content content, String str, UseCase useCase);

    void teardown();
}
