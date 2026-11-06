package com.amazon.alexa.app.notification.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class Constants {
    public static final int AMAZON_MESSAGE_RECEIVER_JOB_ID = 53259214;
    public static final String AMNOTIF_FEATURE_NAMESPACE = "ALEXA_MOBILE_NOTIFICATION_NATIVE";
    public static final String API_URL_PREFIX = "/api/mobilepushnotifications/";
    public static final String APPVERSION_REGISTRATION_ANDROID = "ALEXA_MOBILE_NOTIFICATION_ANDROID_APPVERSION";
    public static final String BRIDGE_ACTION_KEY = "BRIDGE_ACTION_KEY";
    public static final String CONTINUE_ON_NON_FATAL_ERRORS = "CONTINUE_ON_NON_FATAL_ERRORS";
    public static final String DMPS_FEATURE_NAMESPACE = "DMPS";
    public static final String DMPS_RELIABILITY_METRICS_KEY = "DMPS_RELIABILITY_METRICS";
    public static final String HOST_ALLOWLIST_KEY = "HOST_ALLOWLIST_KEY";
    public static final String IS_DOM_STORAGE_ENABLED = "IS_DOM_STORAGE_ENABLED";
    public static final String NOTIFICATION_REGISTRATION_ANDROID = "ALEXA_MOBILE_NOTIFICATION_REGISTRATION_ANDROID";
    public static final String WEB_VIEW_BRIDGE_ACTION_VALUE = "launchExternal";
    public static final String WEB_VIEW_TITLE_ID_KEY = "WEBVIEW_TITLE_ID_KEY";
    public static final String WEB_VIEW_TITLE_ID_VALUE = "Amazon Alexa";
    public static final String WEB_VIEW_URL_REGEX_KEY = "URL_REGEX_KEY";
    public static final String WEB_VIEW_URL_REGEX_VALUE = "^(?!.*alexa.amazon.*/spa/#)(^.*$)";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Media {
        Image
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MetricEvents {
        public static final String ADM_CRYPTO_GET_PUBLIC_KEY_SUCCESS = "ADM_CRYPTO_GET_PUBLIC_KEY_SUCCESS";
        public static final String ADM_REGISTRATION_ERROR = "ADM_REGISTRATION_ERROR";
        public static final String ADM_REGISTRATION_SUCCESS = "ADM_REGISTRATION_SUCESS";
        public static final String CRYPTO_DECRYPT_MESSAGE_ERROR_PERCENT = "CRYPTO_DECRYPT_MESSAGE_ERROR_PERCENT";
        public static final String CRYPTO_DECRYPT_MESSAGE_EVENT = "CRYPTO_DECRYPT_MESSAGE_EVENT";
        public static final String CRYPTO_DESERIALIZE_MESSAGE_ERROR_PERCENT = "CRYPTO_DESERIALIZE_MESSAGE_ERROR_PERCENT";
        public static final String CRYPTO_EXPIRE_KEY_PAIR_ERROR_PERCENT = "CRYPTO_EXPIRE_KEY_PAIR_ERROR_PERCENT";
        public static final String CRYPTO_EXPIRE_KEY_PAIR_EVENT = "CRYPTO_EXPIRE_KEY_PAIR_EVENT";
        public static final String CRYPTO_GENERATE_KEY_PAIR_ERROR_PERCENT = "CRYPTO_GENERATE_KEY_PAIR_ERROR_PERCENT";
        public static final String CRYPTO_NOT_AVAILABLE_PERCENT = "CRYPTO_NOT_AVAILABLE_PERCENT";
        public static final String CRYPTO_RETRIEVE_KEY_PAIR_ERROR_PERCENT = "CRYPTO_RETRIEVE_KEY_PAIR_ERROR_PERCENT";
        public static final String DISMISS_NOTIFICATION_NOTIFS_DISMISSED = "DismissNotification_NotifsDismissed";
        public static final String DISMISS_NOTIFICATION_NO_IDS = "DismissNotification_NoIds";
        public static final String DISMISS_NOTIFICATION_SUCCESS = "DismissNotification_Success";
        public static final String DMPS_DEREGISTRATION_ERROR = "DMPS_DEREGISTRATION_ERROR";
        public static final String DMPS_DEREGISTRATION_SUCCESS = "DMPS_DEREGISTRATION_SUCCESS";
        public static final String DMPS_REGISTRATION_ERROR = "DMPS_REGISTRATION_ERROR";
        public static final String DMPS_REGISTRATION_SUCCESS = "DMPS_REGISTRATION_SUCESS";
        public static final String FCM_APPVERSION_REGISTRATION = "FCM_APPVERSION_REGISTRATION";
        public static final String FCM_CREDENTIALS_VERIFICATION_ERROR = "FCM_CREDENTIALS_VERIFICATION_ERROR";
        public static final String FCM_CREDENTIALS_VERIFICATION_REGISTRATION = "FCM_CREDENTIALS_VERIFICATION_REGISTRATION";
        public static final String FCM_DEREGISTRATION_ERROR = "FCM_DEREGISTRATION_ERROR";
        public static final String FCM_PERIODICAL_REGISTRATION = "FCM_PERIODICAL_REGISTRATION";
        public static final String FCM_PERIODICAL_REGISTRATION_ERROR = "FCM_PERIODICAL_REGISTRATION_ERROR";
        public static final String FCM_REGISTRATION_ERROR = "FCM_REGISTRATION_ERROR";
        public static final String FCM_REGISTRATION_SUCCESS = "FCM_REGISTRATION_SUCESS";
        public static final String FCM_TOKEN_INVALIDATION_ERROR = "FCM_TOKEN_INVALIDATION_ERROR";
        public static final String FIREBASE_CRYPTO_GET_PUBLIC_KEY_SUCCESS = "FIREBASE_CRYPTO_GET_PUBLIC_KEY_SUCCESS";
        public static final String LEGAL_BADGE_UPDATE_FAILURE = "LegalBadgeUpdateFailure";
        public static final String LEGAL_BADGE_UPDATE_SUCCESS = "LegalBadgeUpdateSuccess";
        public static final String MESSAGE_ERROR_PERCENT = "MESSAGE_ERROR_PERCENT";
        public static final String NCS_FETCH_UNREAD_COUNT_SHOW_BADGE = "NCS.FetchUnreadCountShowBadge";
        public static final String NCS_REFRESH_UNREAD_COUNT_FAILURE = "NCS.HomeRefresh.FetchUnreadCountFailure";
        public static final String NCS_REFRESH_UNREAD_COUNT_SUCCESS = "NCS.HomeRefresh.FetchUnreadCountSuccess";
        public static final String NCS_SS_FETCH_UNREAD_COUNT_FAILURE = "NCS.ServerSide.FetchUnreadCountFailure";
        public static final String NCS_SS_FETCH_UNREAD_COUNT_LATENCY = "NCS.ServerSide.FetchUnreadCountLatency";
        public static final String NCS_SS_FETCH_UNREAD_COUNT_SUCCESS = "NCS.ServerSide.FetchUnreadCountSuccess";
        public static final String NOTIFICATIONS_OS_SETTING_DISABLED = "NOTIFICATION_DISABLED";
        public static final String NOTIFICATIONS_OS_SETTING_ENABLED = "NOTIFICATION_ENABLED";
        public static final String NOTIFICATIONS_PERMISSION_ENABLED = "NotificationPermissionsEnabled";
        public static final String NOTIFICATION_ACTION_CREATE_ERROR = "NotificationActionCreate.Error";
        public static final String NOTIFICATION_ACTION_CREATE_FAULT = "NotificationActionCreate.Fault";
        public static final String NOTIFICATION_ACTION_CREATE_SUCCESS = "NotificationActionCreate.Success";
        public static final String NOTIFICATION_BANNER_DISPLAY = "NOTIFICATION_BANNER_DISPLAY";
        public static final String NOTIFICATION_CENTER_LOCAL_CAPTURE_OFFLINE = "NCS.Capture.Local.Offline";
        public static final String NOTIFICATION_CENTER_LOCAL_CAPTURE_ONLINE = "NCS.Capture.Local.Online";
        public static final String NOTIFICATION_CENTER_LOCAL_CAPTURE_SERVERSIDE_EMPTY = "NCS.Capture.Local.ServerSide.Empty";
        public static final String NOTIFICATION_CENTER_LOCAL_CAPTURE_SERVERSIDE_FAILURE = "NCS.Capture.Local.ServerSide.Failure";
        public static final String NOTIFICATION_CENTER_LOCAL_CAPTURE_SERVERSIDE_INVALIDINPUT = "NCS.Capture.Local.ServerSide.InvalidInput";
        public static final String NOTIFICATION_CENTER_LOCAL_CAPTURE_SERVERSIDE_SUCCESS = "NCS.Capture.Local.ServerSide.Success";
        public static final String NOTIFICATION_CENTER_LOCAL_CAPTURE_SERVERSIDE_TRANSIENTERROR = "NCS.Capture.Local.ServerSide.TransientError";
        public static final String NOTIFICATION_CENTER_LOCAL_CAPTURE_SERVERSIDE_UNKNOWNERROR = "NCS.Capture.Local.ServerSide.UnknownError";
        public static final String NOTIFICATION_CENTER_LOCAL_CAPTURE_SERVERSIDE_UNKNOWNNOTIFICATIONID = "NCS.Capture.Local.ServerSide.UnknownNotificationId";
        public static final String NOTIFICATION_CLICK_COUNT = "NOTIFICATION_CLICK_COUNT";
        public static final String NOTIFICATION_CLICK_V2 = "NOTIFICATION_CLICK_V2";
        public static final String NOTIFICATION_CONTAINS_ACTIONS_DATA = "NotificationContainsActionsData";
        public static final String NOTIFICATION_CONTAINS_MEDIA_PERCENT = "NOTIFICATION_CONTAINS_MEDIA_PERCENT";
        public static final String NOTIFICATION_DELIVERY_TIME = "RemoteNotification.android.PushNotificationDeliveryTime";
        public static final String NOTIFICATION_DEPRECATED_CHANNEL_DELETION = "NotificationDeprecatedChannelDeleted";
        public static final String NOTIFICATION_DEPRECATED_HIGH_CHANNEL_DELETION = "NotificationDeprecatedHighChannelDeleted";
        public static final String NOTIFICATION_MEDIA_FETCH_SUCCESS_PERCENT = "NOTIFICATION_MEDIA_FETCH_SUCCESS_PERCENT";
        public static final String NOTIFICATION_RECEIVED_PUSH_MESSAGE_API = "NOTIFICATION_RECEIVED_PUSH_MESSAGE_API";
        public static final String NOTIFICATION_RECEIVED_SEND_TO_PHONE_API = "NOTIFICATION_RECEIVED_SEND_TO_PHONE_API";
        public static final String NOTIFICATION_RECEIVED_USER_MISSMATCH_ERROR = "NOTIFICATION_RECEIVED_USER_MISSMATCH_ERROR";
        public static final String NOTIFICATION_RECEIVED_V2 = "NOTIFICATION_RECEIVED_V2";
        public static final String NOTIFICATION_SUBMIT_SUCCESS_PERCENT = "NOTIFICATION_SUBMIT_SUCCESS_PERCENT";
        public static final String NOTIFICATION_WITHDRAWN = "NOTIFICATION_WITHDRAWN";
        public static final String PERFORMANCE_STARTUP_POST_INIT = "core_startup.dependency_post_init";
        public static final String RECEIVED_NOTIFICATION = "RECEIVED_NOTIFICATION";
        public static final String RECEIVED_NOTIFICATION_V2 = "RECEIVED_NOTIFICATION_V2";
        public static final String UNIVERSAL_DISMISS_INVOKE_OPERATION_SENT = "UniversalDismiss.InvokeOperation.Sent";

        private MetricEvents() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MetricsComponents {
        public static final String CRYPTO_DECRYPT_KEY_PAIR = "CRYPTO_DECRYPT_KEY_PAIR";
        public static final String CRYPTO_DESERIALIZE = "CRYPTO_DESERIALIZE";
        public static final String CRYPTO_GENERATE_KEY_PAIR = "CRYPTO_GENERATE_KEY_PAIR";
        public static final String CRYPTO_RETRIEVE_KEY_PAIR = "CRYPTO_RETRIEVE_KEY_PAIR";
        public static final String DISMISS_NOTIFICATION_RECEIVER_SUBCOMPONENT = "DismissNotificationReceiver";
        public static final String NOTIFICATIONS_CRYPTO_HANDLER_SUBCOMPONENT = "NotificationsCryptoHandler";
        public static final String NOTIFICATIONS_LANDING_PAGE_SUBCOMPONENT = "NotificationsLandingPage";
        public static final String NOTIFICATIONS_RECEIVER_SUBCOMPONENT = "NotificationsReceiver";
        public static final String NOTIFICATIONS_TAP_EVENT_WORKER_SUBCOMPONENT = "NotificationTapEventWorker";
        public static final String NOTIFICATIONS_UI_BUILDER_SUBCOMPONENT = "NotificationsUIBuilder";
        public static final String NOTIFICATION_CENTER_SUBCOMPONENT = "NotificationCenter";
        public static final String PUSH_MESSAGE_DEFAULT_TYPE = "Default";
        public static final String PUSH_NOTIFICATIONS = "PushNotifications";
        public static final String UNIVERSAL_DISMISS_SUBCOMPONENT = "UniversalDismiss";

        private MetricsComponents() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum NotificationInteraction {
        Default,
        Button
    }

    private Constants() {
    }
}
