package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.amazon.whisperjoin.deviceprovisioningservice.service.power.DevicePowerStatusProvider;
import com.amazon.whisperjoin.deviceprovisioningservice.util.Clock;
import com.amazon.whisperjoin.deviceprovisioningservice.util.JobInfoProvider;
import com.amazon.whisperjoin.deviceprovisioningservice.util.PermissionsHelper;
import com.amazon.whisperjoin.deviceprovisioningservice.wifi.CurrentWifiNetworkProvider;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class UtilModule {
    @Provides
    public Clock providesClock() {
        return new Clock.SystemClockImpl();
    }

    @Provides
    public CurrentWifiNetworkProvider providesCurrentWifiNetworkProvider(WifiManager wifiManager) {
        return new CurrentWifiNetworkProvider(wifiManager);
    }

    @Provides
    public DevicePowerStatusProvider providesDevicePowerStatsProvider(Context context) {
        return new DevicePowerStatusProvider(context);
    }

    @Provides
    public JobInfoProvider providesJobInfoProvider() {
        return new JobInfoProvider();
    }

    @Provides
    public PermissionsHelper providesPermissionsHelper(Context context) {
        return new PermissionsHelper(context);
    }
}
