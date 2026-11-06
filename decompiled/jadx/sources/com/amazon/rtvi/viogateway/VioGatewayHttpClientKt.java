package com.amazon.rtvi.viogateway;

import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {Constants.LOG_TAG, "", "AUTH_TOKEN_PATH", "FRAME_DATA_PATH", "ENRICHMENTS_PATH", "FRAME_ADDONS_PATH", "FRAME_BOUNDARY", "RTVIAndroidAlexaAvsSdk_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VioGatewayHttpClientKt {

    @NotNull
    private static final String AUTH_TOKEN_PATH = "/auth/token";

    @NotNull
    private static final String ENRICHMENTS_PATH = "/events/enrichments-generated";

    @NotNull
    private static final String FRAME_ADDONS_PATH = "/events/frame-addons-finalized";

    @NotNull
    private static final String FRAME_BOUNDARY = "rtvi-frame";

    @NotNull
    private static final String FRAME_DATA_PATH = "/events/frame-data";

    @NotNull
    private static final String TAG = "RTVICCS-GatewayHttp";
}
