package com.amazon.alexa.crashreporting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class CrashReportingMetrics {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Component {
        public static final String CRASH_HANDLER = "CrashHandler";

        private Component() {
            throw new UnsupportedOperationException("No instances!");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class ExtraData {
        public static final String ERROR_SOURCE = "errorSource";
        public static final String SEND_PRIORITY = "sendPriority";

        private ExtraData() {
            throw new UnsupportedOperationException("No instances!");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class MetricKey {
        public static final String APP_CRASH = "APP_CRASH";
        public static final String APP_CRASH_COUNT = "APP_CRASH_COUNT";
        public static final String APP_CRASH_USING_BUGSNAG = "APP_CRASH_USING_BUGSNAG";

        private MetricKey() {
            throw new UnsupportedOperationException("No instances!");
        }
    }

    private CrashReportingMetrics() {
        throw new UnsupportedOperationException("No instances!");
    }
}
