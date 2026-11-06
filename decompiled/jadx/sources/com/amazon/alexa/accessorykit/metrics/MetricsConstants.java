package com.amazon.alexa.accessorykit.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface MetricsConstants {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AccessoryMobilyticsUserProvider {
        public static final String ACCESSORY_MOBILYTICS_USER_PROVIDER = "AccessoryMobilyticsUserProvider";
        public static final String USER_CHANGE_DETECTED = "UserChangeDetected";
        public static final String USER_IS_ABSENT = "UserIsAbsent";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface AutoSetup {
        public static final String AUTO_SETUP_ACCESSORY_LINK = "AutoSetupAccessoryLink";
        public static final String AUTO_SETUP_ACCESSORY_LINK_FAILED = "AutoSetupAccessoryLinkFailed";
        public static final String AUTO_SETUP_ACCESSORY_LINK_TIME = "AutoSetupAccessoryLinkTime";
        public static final String AUTO_SETUP_COMPONENT_NAME = "AutoSetup";
        public static final String AUTO_SETUP_SESSION_CONNECTED = "AutoSetupSessionConnected";
        public static final String AUTO_SETUP_SESSION_CONNECTED_TIME = "AutoSetupSessionConnectedTime";
        public static final String AUTO_SETUP_SESSION_CREATED = "AutoSetupSessionCreated";
        public static final String AUTO_SETUP_SESSION_CREATED_TIME = "AutoSetupSessionCreatedTime";
        public static final String AUTO_SETUP_SESSION_FAILED = "AutoSetupSessionFailed";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CloudPairing {
        public static final String ACKNOWLEDGE_PAIRING_DATA = "AccessoryAcknowledgePairingData";
        public static final String ACKNOWLEDGE_PAIRING_DATA_EXCEPTION_PREFIX = "AccessoryAcknowledgePairingDataException";
        public static final String ACKNOWLEDGE_PAIRING_DATA_FAILURE_TIME = "AccessoryAcknowledgePairingDataFailureTime";
        public static final String ACKNOWLEDGE_PAIRING_DATA_PREPARED_REQUEST = "AccessoryAcknowledgePairingDataPreparedRequest";
        public static final String ACKNOWLEDGE_PAIRING_DATA_REQUEST = "AccessoryAcknowledgePairingDataRequest";
        public static final String ACKNOWLEDGE_PAIRING_DATA_STATUS_CODE = "AccessoryAcknowledgePairingDataStatusCode";
        public static final String ACKNOWLEDGE_PAIRING_DATA_SUCCESS_TIME = "AccessoryAcknowledgePairingDataSuccessTime";
        public static final String CLOUD_PAIRING_JOB_SCHEDULED = "AccessoryCloudPairingJobScheduled";
        public static final String CLOUD_PAIRING_JOB_SCHEDULED_TIME = "AccessoryCloudPairingJobScheduledTime";
        public static final String CLOUD_PAIRING_JOB_SERVICE_START_JOB = "AccessoryCloudPairingJobServiceStartJob";
        public static final String CLOUD_PAIRING_NOTIFICATION_TIME = "AccessoryCloudPairingNotificationTime";
        public static final String COMPONENT = "CloudPairingKeyRotation";
        public static final String GET_PAIRING_ENABLEMENT_STATUS = "AccessoryGetPairingEnablementStatus";
        public static final String GET_PAIRING_ENABLEMENT_STATUS_EXCEPTION_PREFIX = "AccessoryGetPairingEnablementStatusException";
        public static final String GET_PAIRING_ENABLEMENT_STATUS_FAILURE_TIME = "AccessoryGetPairingEnablementStatusFailureTime";
        public static final String GET_PAIRING_ENABLEMENT_STATUS_HAS_DATA = "AccessoryGetPairingEnablementStatusHasData";
        public static final String GET_PAIRING_ENABLEMENT_STATUS_PARSE_DATA = "AccessoryGetPairingEnablementStatusParseData";
        public static final String GET_PAIRING_ENABLEMENT_STATUS_PREPARED_REQUEST = "AccessoryGetPairingEnablementStatusPreparedRequest";
        public static final String GET_PAIRING_ENABLEMENT_STATUS_REQUEST = "AccessoryGetPairingEnablementStatusRequest";
        public static final String GET_PAIRING_ENABLEMENT_STATUS_STATUS_CODE = "AccessoryGetPairingEnablementStatusStatusCode";
        public static final String GET_PAIRING_ENABLEMENT_STATUS_SUCCESS_TIME = "AccessoryGetPairingEnablementStatusSuccessTime";
        public static final String KEY_ROTATION_NOTIFICATION = "CloudPairingKeyRotationNotification";
        public static final String KEY_ROTATION_NOTIFICATION_UPDATE_KEYS = "CloudPairingKeyRotationNotificationUpdateKeys";
        public static final String KEY_ROTATION_NOTIFICATION_UPDATE_TIME = "CloudPairingKeyRotationUpdateTime";
        public static final String KEY_ROTATION_ON_CONNECTION_UPDATE_KEYS = "CloudPairingKeyRotationOnConnectionUpdateKeys";
        public static final String LIST_PAIRED_DEVICES = "AccessoryListPairedDevices";
        public static final String LIST_PAIRED_DEVICES_EXCEPTION_PREFIX = "AccessoryListPairedDevicesException";
        public static final String LIST_PAIRED_DEVICES_FAILURE_TIME = "AccessoryListPairedDevicesFailureTime";
        public static final String LIST_PAIRED_DEVICES_HAS_DATA = "AccessoryListPairedDevicesHasData";
        public static final String LIST_PAIRED_DEVICES_PARSE_DATA = "AccessoryListPairedDevicesParseData";
        public static final String LIST_PAIRED_DEVICES_PREPARED_REQUEST = "AccessoryListPairedDevicesPreparedRequest";
        public static final String LIST_PAIRED_DEVICES_REQUEST = "AccessoryListPairedDevicesRequest";
        public static final String LIST_PAIRED_DEVICES_STATUS_CODE = "AccessoryListPairedDevicesStatusCode";
        public static final String LIST_PAIRED_DEVICES_SUCCESS_TIME = "AccessoryListPairedDevicesSuccessTime";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ColdStart {
        public static final String ACCESSORIES_DEFERRED_INITIALIZATION_DURATION = "AccessoriesDeferredInitializationDuration";
        public static final String ACCESSORIES_INSTANTIATION_DURATION = "AccessoriesInstantiationDuration";
        public static final String ACCESSORIES_OBJECT = "accessoriesObject";
        public static final String ACCESSORIES_PROCESS_INTEGRATIONS = "accessoriesProcessIntegrations";
        public static final String FEATURE_CHECKER_SYNC_LATENCY = "accessoriesFeatureCheckerSyncLatency";
        public static final String MAIN_PROCESS_INTEGRATIONS = "mainProcessIntegrations";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DiagnosticsUpload {
        public static final String ACCESSORY_ERROR = "AccessoryDiagnosticsUploadAccessoryError";
        public static final String APP_LOG_UPLOAD_FAILURE = "AccessoryDiagnosticsUploadAppLogFailure";
        public static final String APP_LOG_UPLOAD_SUCCESS = "AccessoryDiagnosticsUploadAppLogSuccess";
        public static final String BATCH_READY_TIMEOUT = "AccessoryDiagnosticsUploadBatchReadyTimeout";
        public static final String CLOUD_PATH_SELECTED = "AccessoryDiagnosticsUploadCloudPathSelected";
        public static final String COMPONENT_NAME = "AccessoryDiagnosticsUpload";
        public static final String DEVICE_LOG_UPLOAD_FAILURE = "AccessoryDiagnosticsUploadDeviceLogFailure";
        public static final String DEVICE_LOG_UPLOAD_SUCCESS = "AccessoryDiagnosticsUploadDeviceLogSuccess";
        public static final String DONE_TIMEOUT = "AccessoryDiagnosticsUploadDoneTimeout";
        public static final String FAILURE = "AccessoryDiagnosticsUploadFailure";
        public static final String GET_ASSET_INFO_TIMEOUT = "AccessoryDiagnosticsUploadGetAssetInfoTimeout";
        public static final String INITIATED = "AccessoryDiagnosticsUploadInitiated";
        public static final String LEGACY_FALLBACK = "AccessoryDiagnosticsUploadLegacyFallback";
        public static final String NEXT_BATCH_TIMEOUT = "AccessoryDiagnosticsUploadNextBatchTimeout";
        public static final String P2P_PATH_SELECTED = "AccessoryDiagnosticsUploadP2PPathSelected";
        public static final String SUCCESS = "AccessoryDiagnosticsUploadSuccess";
        public static final String WIFI_PERMISSION_MISSING = "AccessoryDiagnosticsUploadWifiPermissionMissing";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FindMy {
        public static final String BATTERY_EVENT = "AccessoryFindMyXBatteryEvent";
        public static final String BLUETOOTH_LINK_EVENT = "AccessoryFindMyXBlueToothLinkEvent";
        public static final String BLUETOOTH_UNLINK_EVENT = "AccessoryFindMyXBlueToothUnLinkEvent";
        public static final String GET_CENTRALIZED_LOCATION_SUCCESS = "AccessoryFindMyXGetCentralizedLocation";
        public static final String GET_LOCATION_SUCCESS = "AccessoryFindMyXGetLocation";
        public static final String PRESENCE_EVENT = "AccessoryFindMyXPresenceEvent";
        public static final String QUERY_SETTING_COOKIE_NOT_FOUND = "AccessoryFindMyXQuerySettingCookieNotFound";
        public static final String QUERY_SETTING_EXCEPTION_PREFIX = "AccessoryFindMyXQuerySettingException";
        public static final String QUERY_SETTING_HAS_DATA = "AccessoryFindMyXQuerySettingHasData";
        public static final String QUERY_SETTING_PARSE_SUCCESS = "AccessoryFindMyXQuerySettingParseData";
        public static final String QUERY_SETTING_PREPARED_REQUEST = "AccessoryFindMyXQuerySettingPreparedRequest";
        public static final String QUERY_SETTING_REQUEST = "AccessoryFindMyXQuerySettingRequest";
        public static final String QUERY_SETTING_STATUS_CODE = "AccessoryFindMyXQuerySettingStatusCode";
        public static final String QUERY_SETTING_SUCCESS = "AccessoryFindMyXQuerySetting";
        public static final String QUERY_SETTING_TOKEN_NOT_FOUND = "AccessoryFindMyXQuerySettingTokenNotFound";
        public static final String REPORT_LOCATION_EXCEPTION_PREFIX = "AccessoryFindMyXReportLocationException";
        public static final String REPORT_LOCATION_HAS_DATA = "AccessoryFindMyXReportLocationHasData";
        public static final String REPORT_LOCATION_PARSE_SUCCESS = "AccessoryFindMyXReportLocationParseData";
        public static final String REPORT_LOCATION_PREPARED_REQUEST = "AccessoryFindMyXReportLocationPreparedRequest";
        public static final String REPORT_LOCATION_REQUEST = "AccessoryFindMyXReportLocationRequest";
        public static final String REPORT_LOCATION_STATUS_CODE = "AccessoryFindMyXReportLocationStatusCode";
        public static final String REPORT_LOCATION_SUCCESS = "AccessoryFindMyXReportLocation";
        public static final String UNKNOWN_EVENT = "AccessoryFindMyXUnknownEvent";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface InterProcessFeatureChecker {
        public static final String FEATURE_PARITY = "FeatureValueParity";
        public static final String INTERPROCESS_FEATURE_CHECKER = "InterprocessFeatureChecker";
        public static final String NEW_FEATURE_LATENCY = "NewFeatureCheckerTime";
        public static final String OLD_FEATURE_LATENCY = "OldFeatureCheckerTime";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface InterprocessMarketplaceSupplier {
        public static final String INTERPROCESS_MARKETPLACE_SUPPLIER = "InterprocessMarketplaceSupplier";
        public static final String MARKETPLACE_AVAILABLE_LATENCY = "MarketplaceAvailableLatency";
        public static final String MARKETPLACE_EMPTY = "MarketplaceEmpty";
        public static final String MARKETPLACE_ERROR = "MarketplaceError";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface InterprocessUserSupplier {
        public static final String ACCESS_TOKEN_NULL = "AccessTokenIsNull";
        public static final String IPC_USER_SUPPLIER = "InterprocessUserSupplier";
        public static final String USER_CHANGE_DETECTED = "UserChangeDetected";
        public static final String USER_NOT_AVAILABLE = "UserNotAvailable";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Oobe {
        public static final String COMPLETE_SETUP_FAILED_NO_ACCESSORY_IN_INTERACTOR = "CompleteSetupFailedNoAccessoryInInteractor";
        public static final String COMPLETE_SETUP_FAILED_NO_SESSION = "CompleteSetupFailedNoSession";
        public static final String COMPLETE_SETUP_REQUEST_SUCCESS = "CompleteSetupRequestSuccess";
        public static final String START_SETUP_FAILED_NO_SESSION = "StartSetupFailedNoSession";
        public static final String START_SETUP_REQUEST_SUCCESS = "StartSetupRequestSuccess";
        public static final String UNKNOWN = "UNKNOWN";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SessionEpisode {
        public static final String SESSION_EPISODE_RATE_HOURLY = "sessionEpisodePerHour";
    }
}
