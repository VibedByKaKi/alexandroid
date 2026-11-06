package com.amazon.alexa.client.alexaservice.networking.message.callbacks;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface SendRequestCallback {
    void onFailure(RequestFailureReason requestFailureReason);

    void onSuccess();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class RequestFailureReason {

        @Nullable
        private final Exception exception;
        private final Reason reason;

        @Nullable
        private final Integer responseCode;
        public static final RequestFailureReason NO_NETWORK = new RequestFailureReason(Reason.NO_NETWORK);
        public static final RequestFailureReason INVALID_AUTHORIZATION = new RequestFailureReason(Reason.INVALID_AUTHORIZATION);

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum Reason {
            NO_NETWORK,
            INVALID_AUTHORIZATION,
            AVS_REQUEST_FAILED,
            IO_EXCEPTION,
            EVENT_LISTENER_UNAVAILABLE
        }

        private RequestFailureReason(Reason reason, @Nullable Integer num, @Nullable Exception exc) {
            this.reason = reason;
            this.responseCode = num;
            this.exception = exc;
        }

        public static RequestFailureReason getAVSRequestFailed(@Nullable Integer num) {
            return new RequestFailureReason(Reason.AVS_REQUEST_FAILED, num);
        }

        public static RequestFailureReason getEventListenerUnavailable() {
            return new RequestFailureReason(Reason.EVENT_LISTENER_UNAVAILABLE);
        }

        public static RequestFailureReason getIOException(@Nullable Exception exc) {
            return new RequestFailureReason(Reason.IO_EXCEPTION, exc);
        }

        public Exception getException() {
            return this.exception;
        }

        public Reason getReason() {
            return this.reason;
        }

        public Integer getResponseCode() {
            return this.responseCode;
        }

        private RequestFailureReason(Reason reason, @Nullable Exception exc) {
            this(reason, null, exc);
        }

        private RequestFailureReason(Reason reason, @Nullable Integer num) {
            this(reason, num, null);
        }

        private RequestFailureReason(Reason reason) {
            this(reason, null, null);
        }
    }
}
