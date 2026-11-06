package com.amazon.alexa.accessory.frames.metrics.media;

import io.branch.referral.BranchError;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum MediaImportError {
    WIFI_AP_START_FAILED(-101),
    WIFI_AP_CONNECT_FAILED(-102),
    WIFI_AP_CONNECTION_LOST(-103),
    IMPORT_SESSION_START_FAILED(-104),
    IMPORT_BT_DISCONNECTED(-105),
    IMPORT_WIFI_DISCONNECTED(-106),
    MEDIA_DOWNLOAD_SERVER_ISSUE(-107),
    MEDIA_DOWNLOAD_STORAGE_FULL(-108),
    CAMERA_ROLL_SAVE_STORAGE_FULL(-109),
    MEDIA_DOWNLOAD_INVALID_DATA(-110),
    CAMERA_ROLL_SAVE_PERMISSION_DENIED(BranchError.ERR_BRANCH_REQ_TIMED_OUT),
    CAMERA_ROLL_DELETE_FAILED(BranchError.ERR_BRANCH_UNABLE_TO_REACH_SERVERS),
    CAMERA_ROLL_MEDIA_NOT_FOUND(BranchError.ERR_BRANCH_NO_CONNECTIVITY),
    MEDIA_SAVE_INDEX_UPDATE_FAILED(BranchError.ERR_BRANCH_KEY_INVALID),
    TRANSFER_FAILED(BranchError.ERR_BRANCH_RESOURCE_CONFLICT),
    DEVICE_TEMPERATURE_UNSAFE(BranchError.ERR_BRANCH_INVALID_REQUEST),
    DEVICE_RESOURCE_BUSY(BranchError.ERR_BRANCH_TRACKING_DISABLED),
    WIFI_DISABLED(BranchError.ERR_BRANCH_TASK_TIMEOUT);

    private final int code;

    MediaImportError(int i) {
        this.code = i;
    }

    public int getCode() {
        return this.code;
    }
}
