package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.content.Context;
import com.amazon.whisperjoin.deviceprovisioningservice.arcus.data.FFSArcusSettings;
import com.amazon.whisperjoin.deviceprovisioningservice.device.DiscoverySettings;
import com.amazon.whisperjoin.deviceprovisioningservice.di.scopes.ZeroTouchDependencyInjectorScope;
import com.amazon.whisperjoin.deviceprovisioningservice.metrics.FFSProvisioningServiceMetricsRecorder;
import com.amazon.whisperjoin.deviceprovisioningservice.util.Clock;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.deferred.DeferredDiscoveryHandler;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.DeviceDiscoveryStream;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.provisioning.operation.WJDeviceSetupModeSupportedPredicate;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.zerotouch.ZeroTouchWorkflowController;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.zerotouch.ZeroTouchWorkflowFactory;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.zerotouch.ZeroTouchWorkflowFailureUpdateHandler;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.zerotouch.ZeroTouchWorkflowMetricsReporter;
import com.amazon.whisperjoin.deviceprovisioningservice.workflow.zerotouch.ZeroTouchWorkflowRouter;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.util.Iso8601TimeConverter;
import com.amazon.whisperjoin.util.FireOSUtil;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class ZeroTouchProvisioningModule {
    private final Context mContext;
    private final FFSArcusSettings mFFSArcusSettings;
    private final ZeroTouchWorkflowFactory mWorkflowFactory;

    public ZeroTouchProvisioningModule(Context context, ZeroTouchWorkflowFactory zeroTouchWorkflowFactory, FFSArcusSettings fFSArcusSettings) {
        this.mContext = context;
        this.mWorkflowFactory = zeroTouchWorkflowFactory;
        this.mFFSArcusSettings = fFSArcusSettings;
    }

    @Provides
    public FireOSUtil providesFireOSUtil() {
        return new FireOSUtil(this.mContext);
    }

    @Provides
    public FFSArcusSettings providesZeroTouchProvisioningSettings() {
        return this.mFFSArcusSettings;
    }

    @Provides
    @ZeroTouchDependencyInjectorScope
    public ZeroTouchWorkflowController providesZeroTouchWorkflowController(ZeroTouchWorkflowRouter zeroTouchWorkflowRouter, DeviceDiscoveryStream deviceDiscoveryStream, ZeroTouchWorkflowMetricsReporter zeroTouchWorkflowMetricsReporter, FFSProvisioningServiceMetricsRecorder fFSProvisioningServiceMetricsRecorder, DiscoverySettings discoverySettings, ZeroTouchWorkflowFailureUpdateHandler zeroTouchWorkflowFailureUpdateHandler, DeferredDiscoveryHandler deferredDiscoveryHandler, FFSArcusSettings fFSArcusSettings) {
        return new ZeroTouchWorkflowController(this.mContext, zeroTouchWorkflowRouter, deviceDiscoveryStream, zeroTouchWorkflowMetricsReporter, fFSProvisioningServiceMetricsRecorder, discoverySettings, zeroTouchWorkflowFailureUpdateHandler, deferredDiscoveryHandler, fFSArcusSettings.getThrottleSettings());
    }

    @Provides
    public ZeroTouchWorkflowFactory providesZeroTouchWorkflowFactory() {
        return this.mWorkflowFactory;
    }

    @Provides
    @ZeroTouchDependencyInjectorScope
    public ZeroTouchWorkflowFailureUpdateHandler providesZeroTouchWorkflowFailureUpdateHandler(FireOSUtil fireOSUtil, Clock clock, Boolean bool, FFSArcusSettings fFSArcusSettings) {
        return new ZeroTouchWorkflowFailureUpdateHandler(fireOSUtil, clock, bool.booleanValue(), Iso8601TimeConverter.convertDurationToMs(fFSArcusSettings.getThrottleSettings().getZtwFailedMonitorWindowPeriod()), fFSArcusSettings.getThrottleSettings().getZtwFailedThreshold(), Iso8601TimeConverter.convertDurationToMs(fFSArcusSettings.getThrottleSettings().getZtwDssFailedMonitorWindowPeriod()), fFSArcusSettings.getThrottleSettings().getZtwDssFailedThreshold());
    }

    @Provides
    @ZeroTouchDependencyInjectorScope
    public ZeroTouchWorkflowMetricsReporter providesZeroTouchWorkflowMetricsReporter(FFSProvisioningServiceMetricsRecorder fFSProvisioningServiceMetricsRecorder) {
        return new ZeroTouchWorkflowMetricsReporter(fFSProvisioningServiceMetricsRecorder);
    }

    @Provides
    public ZeroTouchWorkflowRouter providesZeroTouchWorkflowRouter(ZeroTouchWorkflowFactory zeroTouchWorkflowFactory, FFSArcusSettings fFSArcusSettings, WJDeviceSetupModeSupportedPredicate wJDeviceSetupModeSupportedPredicate) {
        return new ZeroTouchWorkflowRouter(zeroTouchWorkflowFactory, fFSArcusSettings, wJDeviceSetupModeSupportedPredicate);
    }
}
