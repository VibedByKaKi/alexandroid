package com.amazon.alexa.configservice.metrics;

import com.amazon.alexa.app.notification.actions.NotificationActionConstants;
import com.amazon.alexa.cam.client.CamServiceClient;
import com.amazon.alexa.enrollment.metrics.MetricsConstants;
import com.amazon.alexa.protocols.network.NetworkService;
import com.amazon.photos.uploader.cds.error.CdsErrorCodes;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/configservice/metrics/MetricsConstants;", "", "Category", "Type", "Variant", "Error", "Lcom/amazon/alexa/configservice/metrics/MetricsConstants$Category;", "Lcom/amazon/alexa/configservice/metrics/MetricsConstants$Error;", "Lcom/amazon/alexa/configservice/metrics/MetricsConstants$Type;", "Lcom/amazon/alexa/configservice/metrics/MetricsConstants$Variant;", "AlexaMobileAndroidConfigService_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface MetricsConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/configservice/metrics/MetricsConstants$Category;", "Lcom/amazon/alexa/configservice/metrics/MetricsConstants;", "<init>", "()V", "AMACS", "", "POPULATE_CACHE", "CONFIG_RETRIEVAL", "CONFIG_REFRESH", "CONFIG_STORAGE", "CONFIG_SERVICE_ENABLED", "CONFIG_SERVICE_RETRIEVAL", "CONFIG_BRIDGE_RETRIEVAL", "POST_INIT_EVENT_NAME", "AlexaMobileAndroidConfigService_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Category implements MetricsConstants {

        @NotNull
        public static final String AMACS = "AlexaMobileAndroidConfigService";

        @NotNull
        public static final String CONFIG_BRIDGE_RETRIEVAL = "ConfigBridgeRetrieval";

        @NotNull
        public static final String CONFIG_REFRESH = "ConfigRefresh";

        @NotNull
        public static final String CONFIG_RETRIEVAL = "ConfigRetrieval";

        @NotNull
        public static final String CONFIG_SERVICE_ENABLED = "ConfigServiceEnabled";

        @NotNull
        public static final String CONFIG_SERVICE_RETRIEVAL = "ConfigServiceRetrieval";

        @NotNull
        public static final String CONFIG_STORAGE = "ConfigStorage";

        @NotNull
        public static final Category INSTANCE = new Category();

        @NotNull
        public static final String POPULATE_CACHE = "PopulateCache";

        @NotNull
        public static final String POST_INIT_EVENT_NAME = "core_startup.dependency_post_init";

        private Category() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/configservice/metrics/MetricsConstants$Error;", "Lcom/amazon/alexa/configservice/metrics/MetricsConstants;", "<init>", "()V", MetricsConstants.OperationalMetrics.UNKNOWN_ERROR, "", CamServiceClient.IO_EXCEPTION, NetworkService.NETWORK_NOT_CONNECTED, "FORBIDDEN_REQUEST", CdsErrorCodes.internalServerError, "JSON_SYNTAX", "CLASS_CAST_EXCEPTION", "FILE_DOES_NOT_EXIST", "JSON_PARSE_EXCEPTION", "DYNAMIC_VALUE_RECYCLED", "DOMAIN_NOT_ONBOARDED", NotificationActionConstants.MetricConstants.ILLEGAL_ARGUMENT_EXCEPTION, "CANCELLATION_EXCEPTION", "AlexaMobileAndroidConfigService_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error implements MetricsConstants {

        @NotNull
        public static final String CANCELLATION_EXCEPTION = "CancellationException";

        @NotNull
        public static final String CLASS_CAST_EXCEPTION = "ClassCastException";

        @NotNull
        public static final String DOMAIN_NOT_ONBOARDED = "DomainNotOnboarded";

        @NotNull
        public static final String DYNAMIC_VALUE_RECYCLED = "DynamicValueRecycled";

        @NotNull
        public static final String FILE_DOES_NOT_EXIST = "FileDoesNotExist";

        @NotNull
        public static final String FORBIDDEN_REQUEST = "ForbiddenRequest";

        @NotNull
        public static final String ILLEGAL_ARGUMENT_EXCEPTION = "IllegalArgumentException";

        @NotNull
        public static final Error INSTANCE = new Error();

        @NotNull
        public static final String INTERNAL_SERVER_ERROR = "InternalServerError";

        @NotNull
        public static final String IO_EXCEPTION = "IoException_Connected";

        @NotNull
        public static final String JSON_PARSE_EXCEPTION = "JsonParseException";

        @NotNull
        public static final String JSON_SYNTAX = "JsonSyntax";

        @NotNull
        public static final String NOT_CONNECTED = "NotConnected";

        @NotNull
        public static final String UNKNOWN_ERROR = "UnknownError";

        private Error() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/configservice/metrics/MetricsConstants$Type;", "Lcom/amazon/alexa/configservice/metrics/MetricsConstants;", "<init>", "()V", "COUNTER", "", "TIMER", "ERROR", "EVENT", "FILE_SIZE", "AlexaMobileAndroidConfigService_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Type implements MetricsConstants {

        @NotNull
        public static final String COUNTER = "counter";

        @NotNull
        public static final String ERROR = "error";

        @NotNull
        public static final String EVENT = "event";

        @NotNull
        public static final String FILE_SIZE = "fileSize";

        @NotNull
        public static final Type INSTANCE = new Type();

        @NotNull
        public static final String TIMER = "timer";

        private Type() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/configservice/metrics/MetricsConstants$Variant;", "Lcom/amazon/alexa/configservice/metrics/MetricsConstants;", "<init>", "()V", "DEVICE_TYPE", "", "DEVICE_TYPE_APP_VERSION", "NONE", "AlexaMobileAndroidConfigService_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Variant implements MetricsConstants {

        @NotNull
        public static final String DEVICE_TYPE = "deviceType";

        @NotNull
        public static final String DEVICE_TYPE_APP_VERSION = "deviceTypeAppVersion";

        @NotNull
        public static final Variant INSTANCE = new Variant();

        @NotNull
        public static final String NONE = "";

        private Variant() {
        }
    }
}
