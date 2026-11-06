package com.amazon.alexa.accessory.notificationpublisher.voice;

import com.amazon.alexa.accessory.notificationpublisher.voice.NotificationUploadTracker;
import com.amazon.alexa.externalnotifications.capability.models.NotificationId;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
final class AutoValue_NotificationUploadTracker_UploadedNotification extends NotificationUploadTracker.UploadedNotification {
    private final NotificationId notificationId;
    private final long timestamp;

    public AutoValue_NotificationUploadTracker_UploadedNotification(NotificationId notificationId, long j) {
        if (notificationId == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null notificationId");
            throw null;
        }
        this.notificationId = notificationId;
        this.timestamp = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationUploadTracker.UploadedNotification) {
            NotificationUploadTracker.UploadedNotification uploadedNotification = (NotificationUploadTracker.UploadedNotification) obj;
            if (this.notificationId.equals(uploadedNotification.getNotificationId()) && this.timestamp == uploadedNotification.getTimestamp()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.voice.NotificationUploadTracker.UploadedNotification
    public NotificationId getNotificationId() {
        return this.notificationId;
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.voice.NotificationUploadTracker.UploadedNotification
    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = (this.notificationId.hashCode() ^ 1000003) * 1000003;
        long j = this.timestamp;
        return ((int) (j ^ (j >>> 32))) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UploadedNotification{notificationId=");
        sb.append(this.notificationId);
        sb.append(", timestamp=");
        return a$$ExternalSyntheticOutline0.m(this.timestamp, StringSubstitutor.DEFAULT_VAR_END, sb);
    }
}
