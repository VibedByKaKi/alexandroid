package com.amazon.clouddrive.cdasdk.retry;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;
import okhttp3.Response;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class RetryUtil {
    static final int ERROR_CODE_BAD_GATEWAY = 502;
    static final int ERROR_CODE_GATEWAY_TIMEOUT = 504;
    static final int ERROR_CODE_INTERNAL_SERVICE_ERROR = 500;
    static final int ERROR_CODE_REQUEST_TIMEOUT = 408;
    static final int ERROR_CODE_SERVICE_UNAVAILABLE = 503;
    static final int ERROR_CODE_TOO_MANY_REQUESTS = 429;
    private static final Set<Integer> RETRYABLE_STATUS_CODES;
    private static final Set<Integer> THROTTLING_ERROR_CODES;

    static {
        HashSet hashSet = new HashSet();
        THROTTLING_ERROR_CODES = hashSet;
        hashSet.add(408);
        hashSet.add(429);
        HashSet hashSet2 = new HashSet();
        RETRYABLE_STATUS_CODES = hashSet2;
        hashSet2.add(500);
        hashSet2.add(502);
        hashSet2.add(503);
        hashSet2.add(504);
    }

    private RetryUtil() {
    }

    public static boolean isRetryableError(@NonNull Response response) {
        return RETRYABLE_STATUS_CODES.contains(Integer.valueOf(response.code()));
    }

    public static boolean isThrottlingError(@NonNull Response response) {
        return THROTTLING_ERROR_CODES.contains(Integer.valueOf(response.code()));
    }
}
