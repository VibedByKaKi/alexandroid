package com.amazon.alexa.sharing.sharingsdk.payload;

import com.amazon.alexa.sharing.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum SharingPayloadError {
    noPayloadData("payloadHasNoData"),
    genericDecodingError("decodeError"),
    unknownTypeDecodingError("decodeError.unknownType"),
    missingRequiredFieldDecodingError("decodeError.missingRequiredField"),
    sharedMediaDecodingError("decodeError.sharedMedia"),
    sharedContentDecodingError("decodeError.sharedContent");

    public final String errorCode;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.sharing.sharingsdk.payload.SharingPayloadError$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$sharing$sharingsdk$payload$SharingPayloadError;

        static {
            int[] iArr = new int[SharingPayloadError.values().length];
            $SwitchMap$com$amazon$alexa$sharing$sharingsdk$payload$SharingPayloadError = iArr;
            try {
                iArr[SharingPayloadError.noPayloadData.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$sharing$sharingsdk$payload$SharingPayloadError[SharingPayloadError.missingRequiredFieldDecodingError.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$sharing$sharingsdk$payload$SharingPayloadError[SharingPayloadError.sharedMediaDecodingError.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$sharing$sharingsdk$payload$SharingPayloadError[SharingPayloadError.sharedContentDecodingError.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$alexa$sharing$sharingsdk$payload$SharingPayloadError[SharingPayloadError.unknownTypeDecodingError.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    SharingPayloadError(String str) {
        this.errorCode = str;
    }

    public String getErrorDescription() {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$sharing$sharingsdk$payload$SharingPayloadError[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? Constants.ERROR_GENERIC_PARSE_FAILURE : Constants.ERROR_PAYLOAD_UNKNOWN_TYPE : Constants.ERROR_SHARED_CONTENT_PARSE_FAILURE : Constants.ERROR_SHARED_MEDIA_PARSE_FAILURE : Constants.ERROR_REQUEST_MISSING_REQUIRED_FIELD : Constants.ERROR_PAYLOAD_JSON_PARSE_FAILURE;
    }
}
