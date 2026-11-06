package com.amazon.deecomms.notifications.model.announcement;

import android.content.Context;
import android.text.TextUtils;
import com.amazon.deecomms.R;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AnnouncementPushNotification {
    private String announcementId;
    private String displayText;
    private String mediaId;
    final Integer notificationId;
    final Date originDate;
    private String sourceName;
    private String type;

    public AnnouncementPushNotification(String str, String str2, String str3, Date date, int i, String str4) {
        this.announcementId = str;
        this.sourceName = str2;
        this.displayText = str3;
        this.type = str4;
        this.originDate = date;
        this.notificationId = Integer.valueOf(i);
    }

    private String getDisplayTextOrPlaceholder(Context context) {
        return (TextUtils.isEmpty(this.displayText) || this.displayText.equalsIgnoreCase("null")) ? context.getResources().getString(R.string.notification_announcement_no_content) : this.displayText;
    }

    public String getAnnouncementContent() {
        String str = this.type;
        int hashCode = str.hashCode();
        if (hashCode != -389653234) {
            if (hashCode == 1068011914) {
                str.equals("announcement/text-simple");
            }
        } else if (str.equals("announcement/audio")) {
            return this.mediaId;
        }
        return this.displayText;
    }

    public String getAnnouncementId() {
        return this.announcementId;
    }

    public String getDisplayText() {
        return this.displayText;
    }

    public String getMediaId() {
        return this.mediaId;
    }

    public Integer getNotificationId() {
        return this.notificationId;
    }

    public String getNotificationText(Context context) {
        return this.sourceName + ": " + getDisplayTextOrPlaceholder(context);
    }

    public Date getOriginDate() {
        return this.originDate;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public String getType() {
        return this.type;
    }

    public void setAnnouncementId(String str) {
        this.announcementId = str;
    }

    public void setDisplayText(String str) {
        this.displayText = str;
    }

    public void setMediaId(String str) {
        this.mediaId = str;
    }

    public void setSourceName(String str) {
        this.sourceName = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
