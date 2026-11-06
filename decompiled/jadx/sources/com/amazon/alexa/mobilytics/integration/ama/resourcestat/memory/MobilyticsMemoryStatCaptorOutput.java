package com.amazon.alexa.mobilytics.integration.ama.resourcestat.memory;

import com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceCaptorOutput;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class MobilyticsMemoryStatCaptorOutput implements MobilyticsResourceCaptorOutput<Long> {
    private long totalAppMemory;

    public MobilyticsMemoryStatCaptorOutput(Long l) {
        this.totalAppMemory = l.longValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.alexa.mobilytics.identity.resourcestat.MobilyticsResourceCaptorOutput
    public Long getOutput() {
        return Long.valueOf(this.totalAppMemory);
    }
}
