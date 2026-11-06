package com.amazon.alexa.accessory.frames.metrics.media;

import com.amazon.alexa.accessory.frames.media.dto.ImportType;
import com.amazon.alexa.accessory.frames.metrics.MetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum MediaImportStep {
    START_WIFI_AP("start_wifiap"),
    GET_WIFI_AP("get_wifiap"),
    GET_WIFI_AP_STATUS("get_wifiap-status"),
    STOP_WIFI_AP("stop_wifiap"),
    CONNECT_TO_WIFI_AP("connect_wifiap"),
    START_ASSET_TRANSFER_SESSION("start_asset_transfer_session"),
    NOTIFY_ASSET_TRANSFER_SESSION("notify_asset_transfer_state"),
    DOWNLOAD_ASSET("download_asset"),
    SAVE_TO_CAMERA_ROLL("save_to_camera_roll"),
    TILT_CORRECTION("tilt_correction"),
    SMART_CROP("smart_crop"),
    LCE_ENHANCEMENT("lce_enhancement"),
    NOISE_REDUCTION("noise_reduction"),
    NAN_START_SESSION("nan_start_session"),
    NAN_ATTACH("nan_attach"),
    NAN_DISCOVERY("nan_discovery"),
    NAN_DATA_PATH("nan_data_path"),
    NAN_START_WIFI_AWARE("nan_start_wifi_aware"),
    NAN_DOWNLOAD_ASSET("nan_download_asset");

    private final String value;

    MediaImportStep(String str) {
        this.value = str;
    }

    public String getFailureMetric() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(MediaImportMetricsConstants.MEDIA_IMPORT_PREFIX), this.value, "_failed");
    }

    public String getSuccessMetric(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(getSuccessMetric());
        sb.append(z ? MetricsConstants.AUTO_CAPTURED_SUFFIX : MetricsConstants.MANUAL_CAPTURED_SUFFIX);
        return sb.toString();
    }

    public String getTriggerMetric() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(MediaImportMetricsConstants.MEDIA_IMPORT_PREFIX), this.value, "_trigger");
    }

    public String getValue() {
        return this.value;
    }

    public String getSuccessMetric() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(MediaImportMetricsConstants.MEDIA_IMPORT_PREFIX), this.value, com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsConstants.SUCCESS_SUFFIX);
    }

    public String getSuccessMetric(ImportType importType) {
        return getSuccessMetric() + importType.getMetricSuffix();
    }
}
