package com.amazon.comms.config.tablets;

import android.content.Context;
import android.os.Build;
import com.amazon.comms.config.util.DeviceConfigConstants;
import com.amazon.comms.policy.CallingServiceRuntimePolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class VegaConfig extends HDTabletConfig {
    private static VegaConfig vegaConfig = new VegaConfig();

    public static VegaConfig getDeviceConfigInstance() {
        return vegaConfig;
    }

    @Override // com.amazon.comms.config.tablets.TabletConfig, com.amazon.comms.config.DeviceConfig
    public boolean acceptPresenceBroadcast() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean forceCamera2API() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public String getBuildVersion() {
        return Build.VERSION.INCREMENTAL;
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
    public int getVideoMaxBitrate() {
        return 2000;
    }

    @Override // com.amazon.comms.config.tablets.HDTabletConfig, com.amazon.comms.config.tablets.TabletConfig, com.amazon.comms.config.DeviceConfig
    public int getVideoStartBitrate() {
        return 600;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean isWebRTCAcousticEchoCancelerPreferred() {
        return true;
    }

    @Override // com.amazon.comms.config.tablets.TabletConfig, com.amazon.comms.config.DeviceConfig
    public boolean shouldPersistSimDeviceContext() {
        return true;
    }

    @Override // com.amazon.comms.config.DeviceConfig
    public boolean supportsHandsFreeProfileEnabledDock() {
        return true;
    }
}
