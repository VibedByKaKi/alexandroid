package com.amazon.comms.config.tablets;

import android.content.Context;
import com.amazon.comms.calling.service.CandidateNetworkPolicy;
import com.amazon.comms.config.util.DeviceConfigConstants;
import com.amazon.comms.policy.CallingServiceRuntimePolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AZKMZEQAGSURBConfig extends HDTabletConfig {
    private static AZKMZEQAGSURBConfig aZKMZEQAGSURBConfig = new AZKMZEQAGSURBConfig();

    public static AZKMZEQAGSURBConfig getDeviceConfigInstance() {
        return aZKMZEQAGSURBConfig;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public CandidateNetworkPolicy getCandidateNetworkPolicy() {
        return CandidateNetworkPolicy.LOW_COST;
    }

    @Override // com.amazon.comms.config.tablets.TabletConfig, com.amazon.comms.config.DeviceConfig
    public synchronized CallingServiceRuntimePolicy getRuntimePolicy(Context context) {
        try {
            try {
                if (this.runtimePolicy == null) {
                    this.runtimePolicy = (CallingServiceRuntimePolicy) Class.forName(DeviceConfigConstants.ALWAYS_ON_RUNTIME_POLICY).getDeclaredConstructor(Context.class).newInstance(context);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.runtimePolicy;
    }

    @Override // com.amazon.comms.config.tablets.HDTabletConfig, com.amazon.comms.config.tablets.TabletConfig, com.amazon.comms.config.DeviceConfig
    public int getVideoStartBitrate() {
        return 600;
    }
}
