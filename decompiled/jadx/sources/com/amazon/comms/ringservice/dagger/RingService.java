package com.amazon.comms.ringservice.dagger;

import com.amazon.comms.calling.service.DeviceCallingService;
import com.amazon.comms.calling.sipclient.CallQualityMetrics;
import com.amazon.comms.ringservice.CallQualityStats;
import com.amazon.comms.ringservice.DeviceCallingServiceImpl;
import dagger.Component;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public enum RingService {
    INSTANCE;

    private DeviceCallingService deviceCallingService;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Component
    @Singleton
    public interface RingServiceComponent {
        DeviceCallingServiceImpl deviceCallingService();
    }

    public void clearCallQualityMetrics(String str) {
        CallQualityStats.getInstance().clearCallQualityMetrics(str);
    }

    public CallQualityMetrics getCallQualityMetrics(String str) {
        return CallQualityStats.getInstance().getCallQualityMetrics(str);
    }

    public synchronized DeviceCallingService getDeviceCallingService() {
        try {
            if (this.deviceCallingService == null) {
                this.deviceCallingService = DaggerRingService_RingServiceComponent.create().deviceCallingService();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.deviceCallingService;
    }
}
