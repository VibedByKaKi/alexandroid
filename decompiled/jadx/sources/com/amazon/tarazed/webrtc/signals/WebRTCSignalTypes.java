package com.amazon.tarazed.webrtc.signals;

import com.amazonaws.mobileconnectors.cognitoidentityprovider.util.CognitoServiceConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/amazon/tarazed/webrtc/signals/WebRTCSignalTypes;", "", "()V", CognitoServiceConstants.CHLG_RESP_ANSWER, "", "EVENT_TYPE_MEDIA_SIGNAL", "OFFER", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class WebRTCSignalTypes {

    @NotNull
    public static final String ANSWER = "answer";

    @NotNull
    public static final String EVENT_TYPE_MEDIA_SIGNAL = "mediaSignal";

    @NotNull
    public static final WebRTCSignalTypes INSTANCE = new WebRTCSignalTypes();

    @NotNull
    public static final String OFFER = "offer";

    private WebRTCSignalTypes() {
    }
}
