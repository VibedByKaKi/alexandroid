package com.here.sdk.traffic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum TrafficQueryError {
    FAILED_TO_RETRIEVE_RESULT(0),
    AUTHENTICATION_FAILED(1),
    FORBIDDEN(2),
    SERVER_UNREACHABLE(3),
    TIMED_OUT(4),
    OFFLINE(5),
    HTTP_ERROR(6),
    INVALID_IN(7),
    INVALID_GEOMETRY(8),
    INVALID_INCIDENT(9),
    INCIDENT_ID_NOT_FOUND(10),
    INVALID_FILTER_OPTIONS(11),
    INVALID_PARAMETER(12),
    INTERNAL_ERROR(13),
    OPERATION_CANCELLED(14),
    PROXY_AUTHENTICATION_FAILED(15),
    PROXY_SERVER_UNREACHABLE(16),
    BAD_REQUEST(17),
    TOO_MANY_REQUESTS(18);

    public final int value;

    TrafficQueryError(int i) {
        this.value = i;
    }
}
