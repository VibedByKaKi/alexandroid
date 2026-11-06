package com.here.sdk.search;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public enum SearchError {
    AUTHENTICATION_FAILED(1),
    MAX_ITEMS_OUT_OF_RANGE(2),
    PARSING_ERROR(3),
    NO_RESULTS_FOUND(4),
    HTTP_ERROR(5),
    SERVER_UNREACHABLE(6),
    INVALID_PARAMETER(7),
    FORBIDDEN(8),
    EXCEEDED_USAGE_LIMIT(9),
    OPERATION_FAILED(10),
    OPERATION_CANCELLED(11),
    TIMED_OUT(12),
    OFFLINE(13),
    QUERY_TOO_LONG(14),
    FILTER_TOO_LONG(15),
    PROXY_AUTHENTICATION_FAILED(16),
    PROXY_SERVER_UNREACHABLE(17);

    public final int value;

    SearchError(int i) {
        this.value = i;
    }
}
