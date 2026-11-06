package com.amazon.whisperjoin.common.sharedtypes.smarthome.metrics;

import com.amazon.whisperjoin.common.sharedtypes.smarthome.data.BluetoothFFSEntry;
import com.amazon.whisperjoin.common.sharedtypes.smarthome.data.ZigbeeFFSEntry;
import com.amazon.whisperjoin.metrics.MinervaMetricsRecorder;
import com.amazon.whisperjoin.metrics.MinervaMetricsRecorderProvider;
import com.amazon.whisperjoin.metrics.WhisperJoinMetricSourceName;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CredentialSyncMetricsRecorder {
    private static final String FFS_CRED_SYNC_PREFIX = "FFS.SyncCredentials.";
    private static final String JSON_EXCEPTION_COUNT = "JSONExceptionCount";
    private static final String MIN_SYNC_REQUEST_DSHS = "FFS.SyncCredentials.RequestCount.DSHS";
    private static final String MIN_SYNC_REQUEST_MIDDLEWARE = "FFS.SyncCredentials.RequestCount.Middleware";
    private static final String MIN_SYNC_REQUEST_S2DM = "FFS.SyncCredentials.RequestCount.S2DM";
    private static final String MIN_SYNC_REQUEST_UNKNOWN = "FFS.SyncCredentials.RequestCount.UNKNOWN";
    private static final String MIN_SYNC_REQUEST_UNRECOGNIZED_SOURCE = "FFS.SyncCredentials.RequestCount.UnrecognizedSource";
    private static final String SET_CREDENTIALS_ZIGBEE_BLE_CALL_COUNT = "SetCredentialsZigbeeBLECallCount";
    private static final String SET_CREDENTIALS_ZIGBEE_BLE_ENTRY_COUNT_BLE = "SetCredentialsZigbeeBLEEntryCountBLE";
    private static final String SET_CREDENTIALS_ZIGBEE_BLE_ENTRY_COUNT_ZIGBEE = "SetCredentialsZigbeeBLEEntryCountZigbee";
    private static final String SET_CREDENTIALS_ZIGBEE_CALL_COUNT = "SetCredentialsZigbeeCallCount";
    private static final String SET_CREDENTIALS_ZIGBEE_ENTRY_COUNT_ZIGBEE = "SetCredentialsZigbeeEntryCountZigbee";
    private static final String SYNC_FAILURE_COUNT = "FFS.SyncCredentials.FailureCount";
    private static final String SYNC_START_COUNT = "FFS.SyncCredentials.StartCount";
    private static final String SYNC_SUCCESS_COUNT = "FFS.SyncCredentials.SuccessCount";
    private final MinervaMetricsRecorderProvider mMinervaMetricsRecorderProvider;

    public CredentialSyncMetricsRecorder(MinervaMetricsRecorderProvider minervaMetricsRecorderProvider) {
        this.mMinervaMetricsRecorderProvider = minervaMetricsRecorderProvider;
    }

    private MinervaMetricsRecorder getNewMinervaRecorder() {
        return this.mMinervaMetricsRecorderProvider.getMetricsRecorder(WhisperJoinMetricSourceName.DSHS_SCHEMA_ID);
    }

    private void recordMinervaCount(String str) {
        MinervaMetricsRecorder newMinervaRecorder = getNewMinervaRecorder();
        newMinervaRecorder.incrementCounter(str);
        newMinervaRecorder.close();
    }

    public void onJSONSerializationError() {
        recordMinervaCount(JSON_EXCEPTION_COUNT);
    }

    public void onRequestSyncCredentialsDSHS() {
        recordMinervaCount(MIN_SYNC_REQUEST_DSHS);
    }

    public void onRequestSyncCredentialsMiddleware() {
        recordMinervaCount(MIN_SYNC_REQUEST_MIDDLEWARE);
    }

    public void onRequestSyncCredentialsS2DM() {
        recordMinervaCount(MIN_SYNC_REQUEST_S2DM);
    }

    public void onRequestSyncCredentialsUnknown() {
        recordMinervaCount(MIN_SYNC_REQUEST_UNKNOWN);
    }

    public void onRequestSyncCredentialsUnrecognizedSource() {
        recordMinervaCount(MIN_SYNC_REQUEST_UNRECOGNIZED_SOURCE);
    }

    public void onSetCredentials(ZigbeeFFSEntry zigbeeFFSEntry, BluetoothFFSEntry bluetoothFFSEntry) {
        MinervaMetricsRecorder newMinervaRecorder = getNewMinervaRecorder();
        newMinervaRecorder.incrementCounter(SET_CREDENTIALS_ZIGBEE_BLE_CALL_COUNT);
        newMinervaRecorder.recordCounter(SET_CREDENTIALS_ZIGBEE_BLE_ENTRY_COUNT_ZIGBEE, zigbeeFFSEntry.getAuthMaterials().size());
        newMinervaRecorder.recordCounter(SET_CREDENTIALS_ZIGBEE_BLE_ENTRY_COUNT_BLE, bluetoothFFSEntry.getAuthMaterials().size());
        newMinervaRecorder.close();
    }

    public void onSyncCredentialsFailure() {
        recordMinervaCount(SYNC_FAILURE_COUNT);
    }

    public void onSyncCredentialsStart() {
        recordMinervaCount(SYNC_START_COUNT);
    }

    public void onSyncCredentialsSuccess() {
        recordMinervaCount(SYNC_SUCCESS_COUNT);
    }

    public void onSetCredentials(ZigbeeFFSEntry zigbeeFFSEntry) {
        MinervaMetricsRecorder newMinervaRecorder = getNewMinervaRecorder();
        newMinervaRecorder.incrementCounter(SET_CREDENTIALS_ZIGBEE_CALL_COUNT);
        newMinervaRecorder.recordCounter(SET_CREDENTIALS_ZIGBEE_ENTRY_COUNT_ZIGBEE, zigbeeFFSEntry.getAuthMaterials().size());
        newMinervaRecorder.close();
    }
}
