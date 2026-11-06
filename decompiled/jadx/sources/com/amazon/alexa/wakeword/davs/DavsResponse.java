package com.amazon.alexa.wakeword.davs;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum DavsResponse {
    SUCCESS(200),
    ILLEGAL_ARGUMENT(400),
    UNAUTHORIZED(401),
    FORBIDDEN(403),
    NO_ARTIFACT_FOUND(404),
    UP_TO_DATE(304),
    OTHER(-999);

    private final int code;

    DavsResponse(int i) {
        this.code = i;
    }

    public static DavsResponse valueOf(int i) {
        for (DavsResponse davsResponse : values()) {
            if (davsResponse.code == i) {
                return davsResponse;
            }
        }
        return OTHER;
    }

    public boolean isError() {
        return (SUCCESS == this || UP_TO_DATE == this) ? false : true;
    }
}
