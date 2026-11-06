package com.amazon.photos.uploader.internal.metrics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/amazon/photos/uploader/internal/metrics/UploadMetrics;", "", "()V", "Companion", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UploadMetrics {

    @NotNull
    public static final String ABANDONED_SOCKET_TIME_OUT_EXCEPTION = "ABANDONED_SOCKET_TIME_OUT_EXCEPTION";

    @NotNull
    public static final String ALL_DIGESTS_COMPUTED = "ALL_DIGESTS_COMPUTED";

    @NotNull
    public static final String AVERAGE_BACKOFF_TIER_ON_CLEAR = "AVERAGE_BACKOFF_TIER_ON_CLEAR";

    @NotNull
    public static final String BACKOFF_CLEARED = "BACKOFF_CLEARED";

    @NotNull
    public static final String BAIL_UPLOAD_ACCOUNT_NOT_LOGIN = "BAIL_UPLOAD_ACCOUNT_NOT_LOGIN";

    @NotNull
    public static final String BAIL_UPLOAD_REQUEST_CANCELLED = "BAIL_UPLOAD_REQUEST_CANCELLED";

    @NotNull
    public static final String BAIL_UPLOAD_REQUEST_NOT_FOUND = "BAIL_UPLOAD_REQUEST_NOT_FOUND";

    @NotNull
    public static final String BLOCKED_REQUEST_COUNT = "BLOCKED_REQUEST_COUNT";

    @NotNull
    public static final String CLEAR_BLOCKER_CACHE = "CLEAR_BLOCKER_CACHE";

    @NotNull
    public static final String EXPONENTIAL_BACKOFF_APPLIED = "EXPONENTIAL_BACKOFF_APPLIED";

    @NotNull
    public static final String INJECT_FAILED = "INJECT_FAILED";

    @NotNull
    public static final String MAX_BACKOFF_APPLIED = "MAX_BACKOFF_APPLIED";

    @NotNull
    public static final String MAX_BACKOFF_WEAK_OR_METERED_CONNECTION_APPLIED = "MAX_BACKOFF_WEAK_OR_METERED_CONNECTION_APPLIED";

    @NotNull
    public static final String MD5_COMPUTED = "MD5_COMPUTED";

    @NotNull
    public static final String MD5_COMPUTE_EXCEPTION = "MD5_COMPUTE_EXCEPTION";

    @NotNull
    public static final String MULTIPARTUPLOAD_PARTS_COMPLETE_DURATION = "MULTIPARTUPLOAD_PARTS_COMPLETE_DURATION";

    @NotNull
    public static final String NOTIFICATION_UPDATE_FAILED = "NOTIFICATION_UPDATE_FAILED";

    @NotNull
    public static final String NOTIFY_WAIT_FOR_RUNNING_WORKER_TIMEOUT = "NOTIFY_WAIT_FOR_RUNNING_WORKER_TIMEOUT";

    @NotNull
    public static final String OVERRIDE_CANCELLED_UPLOAD_REQUEST = "OVERRIDE_CANCELLED_UPLOAD_REQUEST";

    @NotNull
    public static final String OVERRIDE_SUCCEEDED_UPLOAD_REQUEST = "OVERRIDE_SUCCEEDED_UPLOAD_REQUEST";

    @NotNull
    public static final String PART_MD5_COMPUTE_EXCEPTION = "PART_MD5_COMPUTE_EXCEPTION";

    @NotNull
    public static final String QUERY_REQUEST_STATE_COUNT = "QUERY_REQUEST_STATE_COUNT";

    @NotNull
    public static final String QUEUE_NEW_ADDED = "QUEUE_NEW_ADDED";

    @NotNull
    public static final String QUEUE_NEW_ADDED_ALREADY_EXISTS = "QUEUE_NEW_ADDED_ALREADY_EXISTS";

    @NotNull
    public static final String QUEUE_PROPERTIES_CHANGED = "QUEUE_PROPERTIES_CHANGED";

    @NotNull
    public static final String QUEUE_PROPERTIES_UPDATE_FAILED = "QUEUE_PROPERTIES_UPDATE_FAILED";

    @NotNull
    public static final String TOO_MANY_REQUESTS_BACKOFF_APPLIED = "TOO_MANY_REQUESTS_BACKOFF_APPLIED";

    @NotNull
    public static final String UNAUTHORIZED_ACCESS_BLOCKER = "UNAUTHORIZED_ACCESS_BLOCKER";

    @NotNull
    public static final String UNAUTHORIZED_ERROR_SET_BLOCKER = "UNAUTHORIZED_ERROR_SET_BLOCKER";

    @NotNull
    public static final String UNBLOCKED_REQUEST_COUNT = "UNBLOCKED_REQUEST_COUNT";

    @NotNull
    public static final String UNKNOWN_RESPONSE = "UNKNOWN_RESPONSE";

    @NotNull
    public static final String UPLOAD_ABANDONED = "UPLOAD_ABANDONED";

    @NotNull
    public static final String UPLOAD_ACCEPTABLE_FAILURE = "UPLOAD_ACCEPTABLE_FAILURE";

    @NotNull
    public static final String UPLOAD_ATTEMPT_CATEGORY = "UPLOAD_ATTEMPT_CATEGORY";

    @NotNull
    public static final String UPLOAD_AVERAGE_ATTEMPTS_ABANDONED = "UPLOAD_AVERAGE_ATTEMPTS_ABANDONED";

    @NotNull
    public static final String UPLOAD_AVERAGE_ATTEMPTS_SUCCESS = "UPLOAD_AVERAGE_ATTEMPTS_SUCCESS";

    @NotNull
    public static final String UPLOAD_BLOCKED = "UPLOAD_BLOCKED";

    @NotNull
    public static final String UPLOAD_BLOCKED_UNKNOWN_REASON = "UPLOAD_BLOCKED_UNKNOWN_REASON";

    @NotNull
    public static final String UPLOAD_BLOCKER_STATE_EVALUATION = "UPLOAD_BLOCKER_STATE_EVALUATION";

    @NotNull
    public static final String UPLOAD_CANCELLED = "UPLOAD_CANCELLED";

    @NotNull
    public static final String UPLOAD_ENQUEUED_TO_WORK_MANAGER_TIME = "UPLOAD_ENQUEUED_TO_WORK_MANAGER_TIME";

    @NotNull
    public static final String UPLOAD_ENQUEUED_TO_WORK_MANAGER_TIME_FOR_ATTEMPT = "UPLOAD_ENQUEUED_TO_WORK_MANAGER_TIME_FOR_ATTEMPT_";

    @NotNull
    public static final String UPLOAD_ERROR = "UPLOAD_ERROR";

    @NotNull
    public static final String UPLOAD_ERROR_ON_ATTEMPT = "UPLOAD_ERROR_ON_ATTEMPT_";

    @NotNull
    public static final String UPLOAD_FILE_RATE = "UPLOAD_FILE_RATE";

    @NotNull
    public static final String UPLOAD_MAX_ATTEMPTS_EXCEEDED = "UPLOAD_MAX_ATTEMPTS_EXCEEDED";

    @NotNull
    public static final String UPLOAD_NOT_ABANDONED = "UPLOAD_NOT_ABANDONED";

    @NotNull
    public static final String UPLOAD_PART_START_TIME = "UPLOAD_PART_START_TIME";

    @NotNull
    public static final String UPLOAD_PAUSED = "UPLOAD_PAUSED";

    @NotNull
    public static final String UPLOAD_REQUESTED = "UPLOAD_REQUESTED";

    @NotNull
    public static final String UPLOAD_REQUESTED_TO_SUCCEEDED = "UPLOAD_REQUEST_TO_SUCCEEDED";

    @NotNull
    public static final String UPLOAD_REQUEST_CALLED_ON_EMPTY_PARTS = "UPLOAD_REQUEST_CALLED_ON_EMPTY_PARTS";

    @NotNull
    public static final String UPLOAD_REQUEST_CANCEL_COUNT = "UPLOAD_REQUEST_CANCEL_COUNT";

    @NotNull
    public static final String UPLOAD_REQUEST_CANCEL_EVENT = "UPLOAD_REQUEST_CANCEL_EVENT";

    @NotNull
    public static final String UPLOAD_REQUEST_CANCEL_TIMER = "UPLOAD_REQUEST_CANCEL_TIMER";

    @NotNull
    public static final String UPLOAD_REQUEST_CANCEL_TIMER_PER_ITEM = "UPLOAD_REQUEST_CANCEL_TIMER_PER_ITEM";

    @NotNull
    public static final String UPLOAD_RESUMED = "UPLOAD_RESUMED";

    @NotNull
    public static final String UPLOAD_SCHEDULING_COMPLETED = "UPLOAD_SCHEDULING_COMPLETED";

    @NotNull
    public static final String UPLOAD_SCHEDULING_COMPLETED_TIME = "UPLOAD_SCHEDULING_COMPLETED_TIME";

    @NotNull
    public static final String UPLOAD_SCHEDULING_INTERRUPTED = "UPLOAD_SCHEDULING_INTERRUPTED";

    @NotNull
    public static final String UPLOAD_SCHEDULING_INTERRUPTED_TIME = "UPLOAD_SCHEDULING_INTERRUPT_TIME";

    @NotNull
    public static final String UPLOAD_SIZE_CATEGORY_MAX_ATTEMPTS_EXCEEDED = "UPLOAD_SIZE_CATEGORY_MAX_ATTEMPTS_EXCEEDED";

    @NotNull
    public static final String UPLOAD_SIZE_CATEGORY_SUCCEEDED = "UPLOAD_SIZE_CATEGORY_SUCCEEDED_";

    @NotNull
    public static final String UPLOAD_SIZE_GROUP_CATEGORY_MAX_ATTEMPTS_EXCEEDED = "UPLOAD_SIZE_GROUP_CATEGORY_MAX_ATTEMPTS_EXCEEDED";

    @NotNull
    public static final String UPLOAD_SIZE_GROUP_CATEGORY_SUCCEEDED = "UPLOAD_SIZE_GROUP_CATEGORY_SUCCEEDED_";

    @NotNull
    public static final String UPLOAD_STARTED_REQUEST_TIME = "UPLOAD_HANDLED_REQUEST_TIME";

    @NotNull
    public static final String UPLOAD_STARTED_REQUEST_TIME_FOR_ATTEMPT = "UPLOAD_HANDLED_REQUEST_TIME_FOR_ATTEMPT_";

    @NotNull
    public static final String UPLOAD_SUCCEEDED = "UPLOAD_SUCCEEDED";

    @NotNull
    public static final String UPLOAD_SUCCEEDED_ON_ATTEMPT = "UPLOAD_SUCCEEDED_ON_ATTEMPT_";

    @NotNull
    public static final String UPLOAD_UNRECOVERABLE = "UPLOAD_UNRECOVERABLE";

    @NotNull
    public static final String UPLOAD_UNRECOVERABLE_SIZE_CATEGORY = "UPLOAD_UNRECOVERABLE_SIZE_CATEGORY";

    @NotNull
    public static final String UPLOAD_UNRECOVERABLE_SIZE_GROUP_CATEGORY = "UPLOAD_UNRECOVERABLE_SIZE_GROUP_CATEGORY";

    @NotNull
    public static final String VISUAL_DIGEST_COMPUTE_EXCEPTION = "VISUAL_DIGEST_COMPUTE_EXCEPTION";
}
