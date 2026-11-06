package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.bluetooth.le.ScanFilter;
import android.content.Context;
import com.amazon.whisperjoin.common.sharedtypes.configuration.OveractiveConfiguration;
import com.amazon.whisperjoin.deviceprovisioningservice.device.ProvisioningManagerProvider;
import com.amazon.whisperjoin.deviceprovisioningservice.di.scopes.ProvisioningScope;
import com.amazon.whisperjoin.deviceprovisioningservice.util.Clock;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.deferred.DeferredDiscoveryHandler;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.DeviceDiscoveryStream;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.DeviceEventStream;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.DSSClient;
import com.amazon.whisperjoin.metrics.MinervaMetricsRecorderProvider;
import dagger.Module;
import dagger.Provides;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class ProvisioningManagerModule {
    @Provides
    @ProvisioningScope
    public Disposable getProvisioningManagerDisposable(DeviceEventStream deviceEventStream, DeviceDiscoveryStream deviceDiscoveryStream) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(deviceEventStream.getStreamDisposable());
        compositeDisposable.add(deviceDiscoveryStream.getStreamDisposable());
        return compositeDisposable;
    }

    @Provides
    @ProvisioningScope
    public DeferredDiscoveryHandler providesDeferredDiscoveryHandler(Clock clock) {
        return new DeferredDiscoveryHandler(clock);
    }

    @Provides
    @ProvisioningScope
    public DeviceDiscoveryStream providesDeviceDiscoveryStream(ProvisioningManagerProvider provisioningManagerProvider) {
        return new DeviceDiscoveryStream(provisioningManagerProvider);
    }

    @Provides
    @ProvisioningScope
    public DeviceEventStream providesDeviceEventStream(ProvisioningManagerProvider provisioningManagerProvider) {
        return new DeviceEventStream(provisioningManagerProvider);
    }

    @Provides
    @ProvisioningScope
    public ProvisioningManagerProvider providesProvisioningManagerProvider(Context context, DSSClient dSSClient, MinervaMetricsRecorderProvider minervaMetricsRecorderProvider, List<ScanFilter> list, OveractiveConfiguration overactiveConfiguration) {
        return new ProvisioningManagerProvider(context, dSSClient, minervaMetricsRecorderProvider, list, overactiveConfiguration);
    }
}
