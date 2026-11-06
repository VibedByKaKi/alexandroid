package com.amazon.alexa.location;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public enum LocationErrorCode {
    GENERIC_ERROR(1),
    PERMISSION_ERROR(2),
    BEYOND_20_LIMIT(3),
    FEATURE_NOT_AVAILABLE(4),
    ALS_TIMEOUT(5),
    ALS_NOT_RECOGNIZE(6),
    ALS_PAYLOAD_ERROR(7),
    ALS_AUTH_TOKEN_ERROR(8),
    ALS_400(400),
    ALS_401(401),
    ALS_403(403),
    ALS_404(404),
    ALS_500(500),
    ALS_503(503);

    int errorCode;

    LocationErrorCode(int i) {
        this.errorCode = i;
    }

    public int getValue() {
        return this.errorCode;
    }
}
