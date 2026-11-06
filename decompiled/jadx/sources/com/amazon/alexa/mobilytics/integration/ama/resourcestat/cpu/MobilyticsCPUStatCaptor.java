package com.amazon.alexa.mobilytics.integration.ama.resourcestat.cpu;

import com.amazon.alexa.mobilytics.integration.ama.resourcestat.MobilyticsResourceStatCaptor;
import com.amazon.alexa.mobilytics.util.Log;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes18.dex */
public class MobilyticsCPUStatCaptor implements MobilyticsResourceStatCaptor<CpuStat, MobilyticsCPUStatCaptorOutput> {
    private static final String TAG = Log.tag((Class<?>) MobilyticsCPUStatCaptor.class);
    private CpuStatManager cpuStatManager;

    @Inject
    public MobilyticsCPUStatCaptor(CpuStatManager cpuStatManager) {
        this.cpuStatManager = cpuStatManager;
    }

    @Override // com.amazon.alexa.mobilytics.integration.ama.resourcestat.MobilyticsResourceStatCaptor
    public CpuStat start() {
        return this.cpuStatManager.init();
    }

    @Override // com.amazon.alexa.mobilytics.integration.ama.resourcestat.MobilyticsResourceStatCaptor
    public MobilyticsCPUStatCaptorOutput stop(CpuStat cpuStat) {
        return new MobilyticsCPUStatCaptorOutput(Float.valueOf(this.cpuStatManager.getCpuUtilization(cpuStat, this.cpuStatManager.init())));
    }
}
