package com.amazon.deecomms.smsmessaging.messagingcontroller;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MessagingControllerConstant {
    public static final String CAPABILITY_INTERFACE_VERSION = "0.1";
    public static final int MAX_TOTAL_MESSAGE_COUNT = 40;
    public static final String MESSAGING_CONTROLLER_ADDRESS = "address";
    public static final String MESSAGING_CONTROLLER_CONTEXT_STATE_NAME = "MessagingControllerState";
    public static final String MESSAGING_CONTROLLER_CONVERSATIONS_JSON_KEY = "conversations";
    public static final String MESSAGING_CONTROLLER_CONVERSATION_ID_KEY = "id";
    public static final String MESSAGING_CONTROLLER_CREATED_TIME_KEY = "createdTime";
    public static final String MESSAGING_CONTROLLER_DETAIL_KEY = "detail";
    public static final String MESSAGING_CONTROLLER_ENDPOINT_PERMISSIONS_KEY = "permissions";
    public static final String MESSAGING_CONTROLLER_ENDPOINT_READ_PERMISSION_KEY = "readPermission";
    public static final String MESSAGING_CONTROLLER_ENDPOINT_SEND_PERMISSION_KEY = "sendPermission";
    public static final String MESSAGING_CONTROLLER_FILTER_KEY = "filter";
    public static final String MESSAGING_CONTROLLER_MAP_STATUS_READ = "READ";
    public static final String MESSAGING_CONTROLLER_MESSAGES_KEY = "clientMessages";
    public static final String MESSAGING_CONTROLLER_MESSAGE_ID_KEY = "id";
    public static final String MESSAGING_CONTROLLER_MESSAGE_PAYLOAD = "messagePayload";
    public static final String MESSAGING_CONTROLLER_NAMESPACE = "Alexa.Comms.MessagingController";
    public static final String MESSAGING_CONTROLLER_OTHER_PARTICIPANTS_KEY = "otherParticipants";
    public static final String MESSAGING_CONTROLLER_OWNER_ID_KEY = "ownerId";
    public static final String MESSAGING_CONTROLLER_PAYLOAD_KEY = "payload";
    public static final String MESSAGING_CONTROLLER_PAYLOAD_TEXT = "text";
    public static final String MESSAGING_CONTROLLER_PAYLOAD_TYPE = "@type";
    public static final String MESSAGING_CONTROLLER_PERMISSION_OFF = "OFF";
    public static final String MESSAGING_CONTROLLER_PERMISSION_ON = "ON";
    public static final String MESSAGING_CONTROLLER_RECIPIENTS = "recipients";
    public static final String MESSAGING_CONTROLLER_SENDER_FORMAT_KEY = "addressType";
    public static final String MESSAGING_CONTROLLER_SENDER_ID_KEY = "address";
    public static final String MESSAGING_CONTROLLER_SENDER_KEY = "sender";
    public static final String MESSAGING_CONTROLLER_SEND_MESSAGE_REQUEST_ID = "sendMessageRequestId";
    public static final String MESSAGING_CONTROLLER_STATUS_KEY = "status";
    public static final String MESSAGING_CONTROLLER_STATUS_MAP_KEY = "statusMap";
    public static final String MESSAGING_CONTROLLER_STATUS_REASON_KEY = "statusReason";
    public static final String MESSAGING_CONTROLLER_UNREAD_COUNT_KEY = "unreadMessageCount";
    public static final String MESSAGING_CONTROLLER_UPLOAD_MODE_JSON_KEY = "uploadMode";
    public static final int MMS_RECEIVER_TYPE = 151;
    public static final int MMS_SENDER_TYPE = 137;
    public static final String NO_REQUEST_ID = "";
    public static final String NO_SMS_PERMISSION = "Error - No SMS permission.";
    public static final int READ_MESSAGE = 1;
    public static final String REQUEST_UPLOAD_CONVERSATIONS = "UploadConversations";
    public static final String SEND_MESSAGE = "SendMessage";
    public static final int UNREAD_MESSAGE = 0;
    public static final String UPDATE_MESSAGES_STATUS = "UpdateMessagesStatus";
    public static final String[] PROJECTION = {"*"};
    public static final String[] SEARCH_SMS_CONVERSATION_PROJECTION = {"_id", "thread_id", "date"};
    public static final String[] SEARCH_MMS_CONVERSATION_PROJECTION = {"_id", "thread_id", "date"};
    public static final String[] MMS_PAYLOAD_PROJECTION = {"ct", "text"};
    public static final String[] MMS_SENDER_ADDRESS_PROJECTION = {"address"};
    public static final String[] MMS_ADDRESS_PROJECTION = {"address", "type"};
    public static final String[] UNREAD_SMS_CONVERSATION_PROJECTION = {"_id", "date", "body", "address"};
    public static final String[] UNREAD_MMS_CONVERSATION_PROJECTION = {"_id", "date"};
    public static final String[] CONVERSATION_RECIPIENT_PROJECTION = {"recipient_ids"};
    public static final String[] COUNT_PROJECTION = {"count(*) AS count"};

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ConversationUploadMode {
        DELETE_ALL_AND_STORE,
        APPEND_NEW_MESSAGES
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MessagingControllerEvents {
        UploadConversations,
        UpdateSendMessageStatus
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SendMessageStatus {
        SUCCESS,
        DEVICE_FAILURE,
        SERVICE_FAILURE
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SendMessageStatusReason {
        NONE,
        GENERIC_FAILURE,
        DUPLICATED,
        DIRECTIVE_EXPIRED,
        NO_PERMISSION,
        INVALID_INPUT,
        NO_CONNECTIVITY
    }

    private MessagingControllerConstant() {
    }
}
