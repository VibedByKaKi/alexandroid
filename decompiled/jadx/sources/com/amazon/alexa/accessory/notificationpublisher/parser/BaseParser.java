package com.amazon.alexa.accessory.notificationpublisher.parser;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.notificationpublisher.utils.GroupNotificationHelper;
import com.amazon.alexa.accessory.notificationpublisher.utils.NotificationConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
abstract class BaseParser {
    static final String[] FIELDS_TO_KEEP = {"notificationId", "uuid", NotificationConstants.PACKAGE_IDENTIFIER_KEY, "appName", NotificationConstants.POST_TIME_KEY, "when", "title", "text", "groupType", "groupName", GroupNotificationHelper.PARSER_GROUP_RENDER_KEY, GroupNotificationHelper.PARSER_IS_GROUP_NOTIFICATION_KEY, BaseCustomAppParser.CUSTOM_GENERIC_APP_CATEGORY, BaseCustomAppParser.NOTIFICATION_STYLE, BaseCustomAppParser.INBOX_TEXT_LINES};
    protected JSONObject notification;

    public BaseParser(@NonNull JSONObject jSONObject) {
        this.notification = jSONObject;
    }

    public abstract JSONObject parse();
}
