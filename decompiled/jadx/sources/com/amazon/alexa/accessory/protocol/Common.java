package com.amazon.alexa.accessory.protocol;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.Internal;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class Common {
    private Common() {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ErrorCode implements Internal.EnumLite {
        SUCCESS(0),
        UNKNOWN(1),
        INTERNAL(2),
        UNSUPPORTED(3),
        USER_CANCELLED(4),
        NOT_FOUND(5),
        INVALID(6),
        BUSY(7),
        UNRECOGNIZED(-1);

        public static final int BUSY_VALUE = 7;
        public static final int INTERNAL_VALUE = 2;
        public static final int INVALID_VALUE = 6;
        public static final int NOT_FOUND_VALUE = 5;
        public static final int SUCCESS_VALUE = 0;
        public static final int UNKNOWN_VALUE = 1;
        public static final int UNSUPPORTED_VALUE = 3;
        public static final int USER_CANCELLED_VALUE = 4;
        private static final Internal.EnumLiteMap<ErrorCode> internalValueMap = new Internal.EnumLiteMap<ErrorCode>() { // from class: com.amazon.alexa.accessory.protocol.Common.ErrorCode.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ErrorCode findValueByNumber(int i) {
                return ErrorCode.forNumber(i);
            }
        };
        private final int value;

        ErrorCode(int i) {
            this.value = i;
        }

        public static ErrorCode forNumber(int i) {
            switch (i) {
                case 0:
                    return SUCCESS;
                case 1:
                    return UNKNOWN;
                case 2:
                    return INTERNAL;
                case 3:
                    return UNSUPPORTED;
                case 4:
                    return USER_CANCELLED;
                case 5:
                    return NOT_FOUND;
                case 6:
                    return INVALID;
                case 7:
                    return BUSY;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<ErrorCode> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static ErrorCode valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum SpeechInitiationType implements Internal.EnumLite {
        PRESS_AND_HOLD(0),
        TAP(1),
        WAKEWORD(2),
        SERVER(3),
        UNRECOGNIZED(-1);

        public static final int PRESS_AND_HOLD_VALUE = 0;
        public static final int SERVER_VALUE = 3;
        public static final int TAP_VALUE = 1;
        public static final int WAKEWORD_VALUE = 2;
        private static final Internal.EnumLiteMap<SpeechInitiationType> internalValueMap = new Internal.EnumLiteMap<SpeechInitiationType>() { // from class: com.amazon.alexa.accessory.protocol.Common.SpeechInitiationType.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SpeechInitiationType findValueByNumber(int i) {
                return SpeechInitiationType.forNumber(i);
            }
        };
        private final int value;

        SpeechInitiationType(int i) {
            this.value = i;
        }

        public static SpeechInitiationType forNumber(int i) {
            if (i == 0) {
                return PRESS_AND_HOLD;
            }
            if (i == 1) {
                return TAP;
            }
            if (i == 2) {
                return WAKEWORD;
            }
            if (i != 3) {
                return null;
            }
            return SERVER;
        }

        public static Internal.EnumLiteMap<SpeechInitiationType> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static SpeechInitiationType valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum StreamIdentifier implements Internal.EnumLite {
        CONTROL(0),
        VOICE(1),
        FIRMWARE(2),
        DIAGNOSTICS(3),
        FITNESS(4),
        BULKDATA(5),
        ALEXAAPI(6),
        SIDEWALK(7),
        IMAGE(8),
        UNRECOGNIZED(-1);

        public static final int ALEXAAPI_VALUE = 6;
        public static final int BULKDATA_VALUE = 5;
        public static final int CONTROL_VALUE = 0;
        public static final int DIAGNOSTICS_VALUE = 3;
        public static final int FIRMWARE_VALUE = 2;
        public static final int FITNESS_VALUE = 4;
        public static final int IMAGE_VALUE = 8;
        public static final int SIDEWALK_VALUE = 7;
        public static final int VOICE_VALUE = 1;
        private static final Internal.EnumLiteMap<StreamIdentifier> internalValueMap = new Internal.EnumLiteMap<StreamIdentifier>() { // from class: com.amazon.alexa.accessory.protocol.Common.StreamIdentifier.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public StreamIdentifier findValueByNumber(int i) {
                return StreamIdentifier.forNumber(i);
            }
        };
        private final int value;

        StreamIdentifier(int i) {
            this.value = i;
        }

        public static StreamIdentifier forNumber(int i) {
            switch (i) {
                case 0:
                    return CONTROL;
                case 1:
                    return VOICE;
                case 2:
                    return FIRMWARE;
                case 3:
                    return DIAGNOSTICS;
                case 4:
                    return FITNESS;
                case 5:
                    return BULKDATA;
                case 6:
                    return ALEXAAPI;
                case 7:
                    return SIDEWALK;
                case 8:
                    return IMAGE;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<StreamIdentifier> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static StreamIdentifier valueOf(int i) {
            return forNumber(i);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Transport implements Internal.EnumLite {
        BLUETOOTH_LOW_ENERGY(0),
        BLUETOOTH_RFCOMM(1),
        BLUETOOTH_IAP(2),
        BLUETOOTH_LOW_ENERGY_L2CAP(3),
        WIFI_HTTPS(4),
        WIFI_WEBSOCKET(5),
        UNRECOGNIZED(-1);

        public static final int BLUETOOTH_IAP_VALUE = 2;
        public static final int BLUETOOTH_LOW_ENERGY_L2CAP_VALUE = 3;
        public static final int BLUETOOTH_LOW_ENERGY_VALUE = 0;
        public static final int BLUETOOTH_RFCOMM_VALUE = 1;
        public static final int WIFI_HTTPS_VALUE = 4;
        public static final int WIFI_WEBSOCKET_VALUE = 5;
        private static final Internal.EnumLiteMap<Transport> internalValueMap = new Internal.EnumLiteMap<Transport>() { // from class: com.amazon.alexa.accessory.protocol.Common.Transport.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Transport findValueByNumber(int i) {
                return Transport.forNumber(i);
            }
        };
        private final int value;

        Transport(int i) {
            this.value = i;
        }

        public static Transport forNumber(int i) {
            if (i == 0) {
                return BLUETOOTH_LOW_ENERGY;
            }
            if (i == 1) {
                return BLUETOOTH_RFCOMM;
            }
            if (i == 2) {
                return BLUETOOTH_IAP;
            }
            if (i == 3) {
                return BLUETOOTH_LOW_ENERGY_L2CAP;
            }
            if (i == 4) {
                return WIFI_HTTPS;
            }
            if (i != 5) {
                return null;
            }
            return WIFI_WEBSOCKET;
        }

        public static Internal.EnumLiteMap<Transport> internalGetValueMap() {
            return internalValueMap;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static Transport valueOf(int i) {
            return forNumber(i);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
