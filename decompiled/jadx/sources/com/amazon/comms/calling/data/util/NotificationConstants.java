package com.amazon.comms.calling.data.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/data/util/NotificationConstants;", "", "<init>", "()V", "AMP_KEY", "", "NOTIFICATIONS_CALLING_HEADUP_CHANNEL", "NOTIFICATIONS_CALLING_ONGOING_CHANNEL", "ONGOING_CALL_NOTIFICATION_ID", "", "HEADUP_CALL_NOTIFICATION_ID", "MISSED_CALL_NOTIFICATION_ID", "GCM_MESSAGE_ID_KEY", "BUNDLE_KEY_NOTIFICATION_TARGET", "NOTIFICATION_TARGET_CALLING", "CALL_INVITE_KEY", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class NotificationConstants {

    @NotNull
    public static final String AMP_KEY = "amznMessage";

    @NotNull
    public static final String BUNDLE_KEY_NOTIFICATION_TARGET = "target";

    @NotNull
    public static final String CALL_INVITE_KEY = "callInvite";

    @NotNull
    public static final String GCM_MESSAGE_ID_KEY = "google.message_id";
    public static final int HEADUP_CALL_NOTIFICATION_ID = 3;

    @NotNull
    public static final NotificationConstants INSTANCE = new NotificationConstants();
    public static final int MISSED_CALL_NOTIFICATION_ID = 4;

    @NotNull
    public static final String NOTIFICATIONS_CALLING_HEADUP_CHANNEL = "com.amazon.deecomms.notifications.channel.calling.headup";

    @NotNull
    public static final String NOTIFICATIONS_CALLING_ONGOING_CHANNEL = "com.amazon.deecomms.notifications.channel.calling.headup.ongoing";

    @NotNull
    public static final String NOTIFICATION_TARGET_CALLING = "CALLING";
    public static final int ONGOING_CALL_NOTIFICATION_ID = 200;

    private NotificationConstants() {
    }
}
