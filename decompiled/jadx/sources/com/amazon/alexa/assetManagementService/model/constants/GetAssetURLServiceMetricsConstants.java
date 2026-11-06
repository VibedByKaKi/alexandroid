package com.amazon.alexa.assetManagementService.model.constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class GetAssetURLServiceMetricsConstants {
    public static final String CAM_COMPONENT_NAME = "CAM";
    public static final String DOT = ".";
    public static final String LATENCY = "latency";
    public static final String METRICS_NAME_PREFIX = "getAssetURLService.";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EventName {
        public static final String EXECUTION_ERROR = "execution_error";
        public static final String FALLBACK_CONFIG_LOAD = "fallback_load_time";
        public static final String INTERRUPT_ERROR = "interrupt_error";
        public static final String NATIVE_NULL_RESPONSE = "getAssetUrl.native.nullResponse";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class EventType {
        public static final String NON_ACTIONABLE_HTTP_ERROR = "non_actionable_http_error";
        public static final String PARSER_ERROR = "parser_error";
        public static final String ROOM_THREAD_ERROR = "room_thread_error";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Subcomponent {
        public static final String GET_ASSET_URL = "getAssetURL";
        public static final String GET_MAPPINGS = "getAssetMappingsFromCloudFront";
        public static final String IO_FAILURE = "IO_failure";
        public static final String MAPPING_FAILURE = "mapping_failure";
        public static final String MAPPING_SUCCESS = "mapping_success";
        public static final String NO_NETWORK = "no_network";
        public static final String ROOM_DATABASE = "RoomDatabase";
        public static final String STORAGE_TO_CACHE = "convertPersistentStorageEntitiesToCache";
    }

    private GetAssetURLServiceMetricsConstants() {
    }
}
