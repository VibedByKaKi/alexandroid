package com.amazon.rtvi.viogateway;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/rtvi/viogateway/UploadPhaseMetrics;", "", "<init>", "()V", "CONNECTION_REUSED", "", "DNS_MS", "CONNECT_MS", "TLS_MS", "REQUEST_MS", "TTFB_MS", "RESPONSE_MS", "RTVIAndroidAlexaAvsSdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class UploadPhaseMetrics {

    @NotNull
    public static final String CONNECTION_REUSED = "vio_gateway_frame_upload_connection_reused";

    @NotNull
    public static final String CONNECT_MS = "vio_gateway_frame_upload_connect_ms";

    @NotNull
    public static final String DNS_MS = "vio_gateway_frame_upload_dns_ms";

    @NotNull
    public static final UploadPhaseMetrics INSTANCE = new UploadPhaseMetrics();

    @NotNull
    public static final String REQUEST_MS = "vio_gateway_frame_upload_request_ms";

    @NotNull
    public static final String RESPONSE_MS = "vio_gateway_frame_upload_response_ms";

    @NotNull
    public static final String TLS_MS = "vio_gateway_frame_upload_tls_ms";

    @NotNull
    public static final String TTFB_MS = "vio_gateway_frame_upload_ttfb_ms";

    private UploadPhaseMetrics() {
    }
}
