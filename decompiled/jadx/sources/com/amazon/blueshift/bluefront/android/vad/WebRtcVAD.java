package com.amazon.blueshift.bluefront.android.vad;

import com.amazon.blueshift.bluefront.android.vad.config.WebRtcVADConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class WebRtcVAD extends AbstractVAD<WebRtcVADConfig> {
    public WebRtcVAD(int i, WebRtcVADConfig webRtcVADConfig) {
        super(i, webRtcVADConfig);
    }

    @Override // com.amazon.blueshift.bluefront.android.vad.AbstractVAD
    public ByteBuffer setupVAD(WebRtcVADConfig webRtcVADConfig) {
        ByteBuffer createVAD = createVAD(false);
        if (!webRtcVADConfig.getCustomizedAggression().isPresent()) {
            setWebRtcMode(createVAD, webRtcVADConfig.getAggressionMode().ordinal());
            return createVAD;
        }
        WebRtcVADConfig.Aggression aggression = webRtcVADConfig.getCustomizedAggression().get();
        setWebRtcCustomizedMode(createVAD, aggression.getOverHangMax1(), aggression.getOverHangMax2(), aggression.getLocalThreshold(), aggression.getGlobalThreshold());
        return createVAD;
    }
}
