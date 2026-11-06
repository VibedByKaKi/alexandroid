package com.amazon.alexa.simba.dependencies;

import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.LazyComponent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u0004\u0018\u00010\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/simba/dependencies/DeviceInformationProvider;", "", "deviceInformationLazy", "Lcom/amazon/alexa/protocols/service/api/LazyComponent;", "Lcom/amazon/alexa/device/api/DeviceInformation;", "environmentServiceLazy", "Lcom/amazon/alexa/protocols/environment/EnvironmentService;", "(Lcom/amazon/alexa/protocols/service/api/LazyComponent;Lcom/amazon/alexa/protocols/service/api/LazyComponent;)V", "deviceInfo", "Lcom/amazon/alexa/simba/dependencies/DeviceInfo;", "deviceInformation", "environmentService", "getDeviceInformation", "Companion", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class DeviceInformationProvider {

    @NotNull
    public static final String PLATFORM = "Android";

    @Nullable
    private DeviceInfo deviceInfo;

    @Nullable
    private DeviceInformation deviceInformation;

    @NotNull
    private final LazyComponent<DeviceInformation> deviceInformationLazy;

    @Nullable
    private EnvironmentService environmentService;

    @NotNull
    private final LazyComponent<EnvironmentService> environmentServiceLazy;

    public DeviceInformationProvider(@NotNull LazyComponent<DeviceInformation> lazyComponent, @NotNull LazyComponent<EnvironmentService> lazyComponent2) {
        lazyComponent.getClass();
        lazyComponent2.getClass();
        this.deviceInformationLazy = lazyComponent;
        this.environmentServiceLazy = lazyComponent2;
    }

    @Nullable
    public final DeviceInfo getDeviceInformation() {
        DeviceInformation deviceInformation;
        DeviceInformation deviceInformation2 = this.deviceInformation;
        if (deviceInformation2 == null) {
            deviceInformation2 = this.deviceInformationLazy.get();
        }
        this.deviceInformation = deviceInformation2;
        EnvironmentService environmentService = this.environmentService;
        if (environmentService == null) {
            environmentService = this.environmentServiceLazy.get();
        }
        this.environmentService = environmentService;
        if (environmentService == null || (deviceInformation = this.deviceInformation) == null) {
            return null;
        }
        DeviceInfo deviceInfo = this.deviceInfo;
        if (deviceInfo != null) {
            return deviceInfo;
        }
        String versionName = environmentService.getVersionName();
        versionName.getClass();
        return new DeviceInfo(versionName, "Android", deviceInformation.getVersionRelease(), deviceInformation.getDeviceSerialNumber(), environmentService.getMarketplace().getObfuscatedId().getMarketplaceId());
    }
}
