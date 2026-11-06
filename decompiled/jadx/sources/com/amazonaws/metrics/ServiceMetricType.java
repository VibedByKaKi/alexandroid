package com.amazonaws.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public interface ServiceMetricType extends MetricType {
    public static final String DOWNLOAD_BYTE_COUNT_NAME_SUFFIX = "DownloadByteCount";
    public static final String DOWNLOAD_THROUGHPUT_NAME_SUFFIX = "DownloadThroughput";
    public static final String UPLOAD_BYTE_COUNT_NAME_SUFFIX = "UploadByteCount";
    public static final String UPLOAD_THROUGHPUT_NAME_SUFFIX = "UploadThroughput";

    String getServiceName();
}
