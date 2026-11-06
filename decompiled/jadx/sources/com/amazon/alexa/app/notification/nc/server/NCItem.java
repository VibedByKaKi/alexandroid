package com.amazon.alexa.app.notification.nc.server;

import androidx.annotation.NonNull;
import com.amazon.alexa.app.notification.nc.NotificationImportance;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.amazon.alexa.notification.api.model.Deeplink;
import com.amazon.alexa.notification.api.model.NCLocalNotificationV2;
import com.amazon.alexa.sharing.api.models.Message;
import com.google.gson.annotations.SerializedName;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class NCItem {

    @NonNull
    @SerializedName("actionType")
    public Deeplink.Type actionType;

    @SerializedName("arrivalTimestamp")
    public long arrivalTimestamp;

    @NonNull
    @SerializedName("deeplink")
    public String deeplink;

    @SerializedName(PayloadUtils.PayloadKeys.DELETION_TTL)
    public Long deletionTTL;

    @SerializedName("entityType")
    public EntityType entityType;

    @SerializedName(PayloadUtils.PayloadKeys.EXPIRATION_TTL)
    public Long expirationTTL;

    @SerializedName("imageUrl")
    public String imageUrl;

    @NonNull
    @SerializedName(PayloadUtils.PayloadKeys.IMPORTANCE)
    public NotificationImportance importance;

    @NonNull
    @SerializedName("notificationId")
    public String notificationId;

    @SerializedName("personal")
    public boolean personal;

    @SerializedName("read")
    public boolean read;

    @NonNull
    @SerializedName(Message.SERIALIZED_NAME_SENDER_ID)
    public String senderId;

    @SerializedName("text")
    public String text;

    @NonNull
    @SerializedName("title")
    public String title;
    private static final Duration DEFAULT_EXPIRY_DURATION = Duration.ofDays(30);
    private static final Duration DEFAULT_DELETION_DURATION = Duration.ofDays(30);

    public NCItem(@NonNull NCLocalNotificationV2 nCLocalNotificationV2) {
        this.notificationId = nCLocalNotificationV2.getUuid();
        this.senderId = nCLocalNotificationV2.getSenderId() != null ? nCLocalNotificationV2.getSenderId() : "";
        this.title = nCLocalNotificationV2.getTitle();
        this.text = nCLocalNotificationV2.getText();
        this.read = false;
        this.arrivalTimestamp = new Date().getTime();
        this.personal = nCLocalNotificationV2.isPersonal();
        this.importance = NotificationImportance.DEFAULT;
        this.entityType = EntityType.LOCAL_NOTIFICATION;
        this.actionType = nCLocalNotificationV2.getDeeplink().getType();
        this.deeplink = nCLocalNotificationV2.getDeeplink().getUrl();
        this.imageUrl = nCLocalNotificationV2.getImageUrl();
        Instant now = Instant.now();
        this.expirationTTL = Long.valueOf(nCLocalNotificationV2.getExpirationTTL() <= 0 ? now.plus((TemporalAmount) DEFAULT_EXPIRY_DURATION).getEpochSecond() : nCLocalNotificationV2.getExpirationTTL());
        this.deletionTTL = Long.valueOf(nCLocalNotificationV2.getDeletionTTL() <= 0 ? now.plus((TemporalAmount) DEFAULT_DELETION_DURATION).getEpochSecond() : nCLocalNotificationV2.getDeletionTTL());
    }
}
