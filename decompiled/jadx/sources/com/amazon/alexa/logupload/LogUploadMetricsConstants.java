package com.amazon.alexa.logupload;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final class LogUploadMetricsConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ComponentName {
        public static final String COMPONENT = "LogUpload";
        public static final String SUB_COMPONENT = "LogUpload_Session";

        private ComponentName() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EventName {
        public static final String UPLOAD_ATTEMPT_SUFFIX = ".log.upload.attempt";
        public static final String UPLOAD_DEFAULT_NAME = "default";
        public static final String UPLOAD_HTTP_ERROR_INFIX = ".log.upload.error.http.";
        public static final String UPLOAD_OTHER_ERROR_SUFFIX = ".log.upload.error.other";
        public static final String UPLOAD_RETRIEVING_ERROR_SUFFIX = ".log.upload.error.retrieving";
        public static final String UPLOAD_SUCCESS_SUFFIX = ".log.upload.success";

        private EventName() {
        }
    }

    private LogUploadMetricsConstants() {
    }
}
