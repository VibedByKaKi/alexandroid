package com.amazon.commscore.commsbridge;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.assistant.transport.MissingTokenPull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
abstract class BridgeMessage {
    public static final String MSG_ID_KEY = "id";
    public static final String MSG_NAME_KEY = "name";
    public static final String MSG_PAYLOAD_KEY = "payload";
    public static final String MSG_TYPE_KEY = "type";
    private final String id;
    private final String name;
    private final Object payload;
    private final MessageType type;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum MessageType {
        REQUEST(MissingTokenPull.TRIGGER_REQUEST),
        RESPONSE("response"),
        EVENT("event");

        private final String key;

        MessageType(String str) {
            this.key = str;
        }

        public static MessageType fromString(String str) {
            for (MessageType messageType : values()) {
                if (messageType.getKey().equalsIgnoreCase(str)) {
                    return messageType;
                }
            }
            return null;
        }

        public String getKey() {
            return this.key;
        }

        public String toMetricKey() {
            return this.key.equals(MissingTokenPull.TRIGGER_REQUEST) ? "req" : this.key.equals("event") ? "event" : "resp";
        }
    }

    public BridgeMessage(@NonNull String str, @NonNull String str2, @NonNull MessageType messageType, @Nullable Object obj) {
        this.name = str;
        this.id = str2;
        this.type = messageType;
        this.payload = obj;
    }

    @NonNull
    public String getId() {
        return this.id;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @Nullable
    public Object getPayload() {
        return this.payload;
    }

    @NonNull
    public MessageType getType() {
        return this.type;
    }
}
