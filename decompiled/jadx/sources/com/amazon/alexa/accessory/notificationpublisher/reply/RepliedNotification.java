package com.amazon.alexa.accessory.notificationpublisher.reply;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class RepliedNotification {
    private final String notificationId;
    private final String replyText;
    private final String title;

    public RepliedNotification(String str, String str2, String str3) {
        this.notificationId = str;
        this.title = str2;
        this.replyText = str3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RepliedNotification)) {
            return false;
        }
        RepliedNotification repliedNotification = (RepliedNotification) obj;
        return Objects.equals(this.notificationId, repliedNotification.notificationId) && Objects.equals(this.title, repliedNotification.title) && Objects.equals(this.replyText, repliedNotification.replyText);
    }

    public int hashCode() {
        return Objects.hash(this.notificationId, this.title, this.replyText);
    }
}
