package com.amazon.alexa.sharing.repo.interfaces;

import com.amazon.alexa.sharing.api.exceptions.AlexaSharingException;
import com.amazon.alexa.sharing.repo.models.Result;
import com.amazon.alexa.sharing.repo.models.acms.announcement.Announcement;
import com.amazon.alexa.sharing.repo.models.acms.announcement.SendAudioAnnouncementInput;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public interface IAnnouncement {
    Announcement[] getAllAnnouncements(String str) throws AlexaSharingException;

    void openCreateAnnouncement();

    Result sendAudioAnnouncement(SendAudioAnnouncementInput sendAudioAnnouncementInput, String str);

    Result sendTextAnnouncement(String str, String str2, String str3);
}
