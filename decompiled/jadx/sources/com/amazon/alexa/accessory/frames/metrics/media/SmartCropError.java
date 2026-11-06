package com.amazon.alexa.accessory.frames.metrics.media;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum SmartCropError {
    IMAGE_DECODE_FAILED("image_decode_failed"),
    FACE_DETECTION_FAILED("face_detection_failed"),
    CROP_COMPUTATION_FAILED("crop_computation_failed"),
    BITMAP_CROP_FAILED("bitmap_crop_failed"),
    EXIF_WRITE_FAILED("exif_write_failed"),
    OUT_OF_MEMORY("out_of_memory"),
    ORIENTATION_CORRECTION_FAILED("orientation_correction_failed");

    private final String value;

    SmartCropError(String str) {
        this.value = str;
    }

    public String getErrorMetric() {
        return "MediaImport_smart_crop_" + this.value;
    }

    public String getValue() {
        return this.value;
    }
}
