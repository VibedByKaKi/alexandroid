package com.amazon.alexa.accessory.frames.metrics.media;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum TiltCorrectionError {
    IMAGE_DECODE_FAILED("image_decode_failed"),
    EXIF_READ_FAILED("exif_read_failed"),
    IMU_EXTRACTION_FAILED("imu_extraction_failed"),
    ROTATION_FAILED("rotation_failed"),
    EXIF_WRITE_FAILED("exif_write_failed"),
    XMP_EXTRACTION_FAILED("xmp_extraction_failed");

    private final String value;

    TiltCorrectionError(String str) {
        this.value = str;
    }

    public String getErrorMetric() {
        return "MediaImport_tilt_correction_" + this.value;
    }

    public String getValue() {
        return this.value;
    }
}
