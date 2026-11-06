package com.amazon.alexa.mobilytics.integration.ama.resourcestat.memory;

import com.amazon.alexa.mobilytics.integration.ama.resourcestat.MobilyticsResourceStatCaptor;
import com.amazon.alexa.mobilytics.util.Log;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class MobilyticsMemoryStatCaptor implements MobilyticsResourceStatCaptor<MemoryStat, MobilyticsMemoryStatCaptorOutput> {
    private static final String TAG = Log.tag((Class<?>) MobilyticsMemoryStatCaptor.class);
    private MemoryStatManager memoryStatManager;

    @Inject
    public MobilyticsMemoryStatCaptor(MemoryStatManager memoryStatManager) {
        this.memoryStatManager = memoryStatManager;
    }

    @Override // com.amazon.alexa.mobilytics.integration.ama.resourcestat.MobilyticsResourceStatCaptor
    public MemoryStat start() {
        return new MemoryStat(this.memoryStatManager.getTotalAppMemory());
    }

    @Override // com.amazon.alexa.mobilytics.integration.ama.resourcestat.MobilyticsResourceStatCaptor
    public MobilyticsMemoryStatCaptorOutput stop(MemoryStat memoryStat) {
        return new MobilyticsMemoryStatCaptorOutput(Long.valueOf((memoryStat.getValue().longValue() + this.memoryStatManager.getTotalAppMemory()) / 2));
    }
}
