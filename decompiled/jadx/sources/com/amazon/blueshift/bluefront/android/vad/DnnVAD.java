package com.amazon.blueshift.bluefront.android.vad;

import com.amazon.blueshift.bluefront.android.vad.config.DnnVADConfig;
import com.google.common.base.Preconditions;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DnnVAD extends AbstractVAD<DnnVADConfig> {
    public DnnVAD(int i, DnnVADConfig dnnVADConfig) {
        super(i, dnnVADConfig);
    }

    @Override // com.amazon.blueshift.bluefront.android.vad.AbstractVAD
    public ByteBuffer setupVAD(DnnVADConfig dnnVADConfig) {
        Preconditions.checkNotNull(dnnVADConfig, "DnnVadConfig cannot be null.");
        ByteBuffer createVAD = createVAD(true);
        if (dnnVADConfig.getThreshold().isPresent()) {
            setDNNThreshold(createVAD, dnnVADConfig.getThreshold().get().floatValue());
        }
        return createVAD;
    }
}
