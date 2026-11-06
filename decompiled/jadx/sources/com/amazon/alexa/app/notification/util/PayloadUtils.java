package com.amazon.alexa.app.notification.util;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.app.notification.util.Constants;
import com.amazon.alexa.mobilytics.event.MobilyticsEvent;
import com.amazon.alexa.notification.api.model.Deeplink;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class PayloadUtils {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class PayloadKeys {
        public static final String ACTIONS_DATA = "actionsData";
        public static final String ADDITIONAL_ATTRIBUTES = "additionalAttributes";
        public static final String ADM_PAYLOAD = "ADMPayload";
        public static final String ALEXA_ID = "alexaId";
        public static final String ALEXA_URL = "alexaUrl";
        public static final String CID_HASH = "cidHash";
        public static final String CRYPTO = "crypto";
        public static final String DEEPLINK_URL = "deepLinkUrl";
        public static final String DELETION_TTL = "deletionTTL";
        public static final String DICT = "dict";
        public static final String EXPERIMENT_ID = "experimentId";
        public static final String EXPIRATION_TTL = "expirationTTL";
        public static final String IMAGE_URL = "imageUrl";
        public static final String IMPORTANCE = "importance";
        public static final String IS_PERSONAL = "isPersonal";
        public static final String MESSAGE = "message";
        public static final String NOTIFICATION_ID = "notificationId";
        public static final String ORIGIN_TIMESTAMP = "originTimestamp";
        public static final String PAYLOAD = "payload";
        public static final String PUBLISHER_CONTENT_ID = "publisherContentId";
        public static final String PUBLISHER_DETAILS = "publisherDetails";
        public static final String PUBLISHER_ID = "publisherId";
        public static final String PUBLISHER_STAGE = "publisherStage";
        public static final String SCHEMA = "key";
        public static final String SCHEMA_TYPE = "schemaType";
        public static final String SENDER = "sender";
        public static final String SIGNATURE = "signature";
        public static final String STORE_URL = "storeUrl";
        public static final String TEXT = "text";
        public static final String TITLE = "title";
        public static final String TOPIC_ID = "topicId";
        public static final String TYPE = "type";
        public static final String UUID = "uuid";
        public static final String WEB_URL = "webUrl";

        private PayloadKeys() {
        }
    }

    private PayloadUtils() {
    }

    @Nullable
    public static String getActionType(@NonNull Bundle bundle) {
        if (bundle.containsKey(PayloadKeys.ALEXA_URL)) {
            return Deeplink.Type.alexaUrl.name();
        }
        if (bundle.containsKey(PayloadKeys.DEEPLINK_URL) || bundle.containsKey(PayloadKeys.STORE_URL)) {
            return Deeplink.Type.deepLinkUrl.name();
        }
        if (bundle.containsKey(PayloadKeys.WEB_URL)) {
            return Deeplink.Type.webUrl.name();
        }
        return null;
    }

    @Nullable
    public static String getActionsData(@NonNull Bundle bundle) {
        return Utils.bundleToString(bundle);
    }

    public static String getAlexaId(@NonNull Bundle bundle) {
        return bundle.getString(PayloadKeys.ALEXA_ID, "Unknown");
    }

    @Nullable
    public static String getDeeplinkUrlV2(@NonNull Bundle bundle) {
        if (bundle.containsKey(PayloadKeys.ALEXA_URL)) {
            return bundle.getString(PayloadKeys.ALEXA_URL);
        }
        if (bundle.containsKey(PayloadKeys.DEEPLINK_URL)) {
            return bundle.getString(PayloadKeys.DEEPLINK_URL);
        }
        if (bundle.containsKey(PayloadKeys.WEB_URL)) {
            return bundle.getString(PayloadKeys.WEB_URL);
        }
        return null;
    }

    public static String getExperimentId(@NonNull Bundle bundle) {
        return bundle.getString(PayloadKeys.EXPERIMENT_ID, "");
    }

    @Nullable
    public static String getImageUrl(@NonNull Bundle bundle) {
        return bundle.getString("imageUrl", null);
    }

    @Nullable
    public static String getPublisherContentId(@NonNull Bundle bundle) {
        return bundle.getString("publisherContentId", null);
    }

    @Nullable
    public static String getPublisherId(@NonNull Bundle bundle) {
        return bundle.getString(PayloadKeys.PUBLISHER_ID, null);
    }

    @Nullable
    public static String getPublisherStage(@NonNull Bundle bundle) {
        return bundle.getString(PayloadKeys.PUBLISHER_STAGE, null);
    }

    public static String getSender(@NonNull Bundle bundle) {
        return bundle.getString("sender", "");
    }

    public static String getSignature(@NonNull Bundle bundle) {
        return bundle.getString(PayloadKeys.SIGNATURE, "");
    }

    public static String getText(@NonNull Bundle bundle) {
        return bundle.getString("text", "");
    }

    public static String getTitle(@NonNull Bundle bundle) {
        return bundle.getString("title", "");
    }

    @Nullable
    public static String getTopicId(@NonNull Bundle bundle) {
        return bundle.getString("topicId", null);
    }

    public static String getUUID(@NonNull Bundle bundle) {
        return bundle.getString("uuid", UUID.randomUUID().toString());
    }

    public static void setNotificationMetricDimensionsV2(MobilyticsEvent mobilyticsEvent, Bundle bundle) {
        if (bundle == null || bundle.isEmpty()) {
            return;
        }
        if (bundle.containsKey("uuid")) {
            mobilyticsEvent.setContentId(bundle.getString("uuid", null));
        }
        if (bundle.containsKey("imageUrl")) {
            mobilyticsEvent.setContentType(Constants.Media.Image.toString());
        }
    }
}
