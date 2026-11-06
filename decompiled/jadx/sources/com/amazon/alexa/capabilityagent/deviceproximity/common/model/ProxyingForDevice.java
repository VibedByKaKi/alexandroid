package com.amazon.alexa.capabilityagent.deviceproximity.common.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/ProxyingForDevice;", "", "deviceId", "", "deviceIdType", "Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/DeviceIdType;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/DeviceIdType;)V", "getDeviceId", "()Ljava/lang/String;", "getDeviceIdType", "()Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/DeviceIdType;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ProxyingForDevice {

    @NotNull
    private final String deviceId;

    @Nullable
    private final DeviceIdType deviceIdType;

    public ProxyingForDevice(@NotNull String str, @Nullable DeviceIdType deviceIdType) {
        str.getClass();
        this.deviceId = str;
        this.deviceIdType = deviceIdType;
    }

    public static /* synthetic */ ProxyingForDevice copy$default(ProxyingForDevice proxyingForDevice, String str, DeviceIdType deviceIdType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = proxyingForDevice.deviceId;
        }
        if ((i & 2) != 0) {
            deviceIdType = proxyingForDevice.deviceIdType;
        }
        return proxyingForDevice.copy(str, deviceIdType);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final DeviceIdType getDeviceIdType() {
        return this.deviceIdType;
    }

    @NotNull
    public final ProxyingForDevice copy(@NotNull String deviceId, @Nullable DeviceIdType deviceIdType) {
        deviceId.getClass();
        return new ProxyingForDevice(deviceId, deviceIdType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProxyingForDevice)) {
            return false;
        }
        ProxyingForDevice proxyingForDevice = (ProxyingForDevice) other;
        return Intrinsics.areEqual(this.deviceId, proxyingForDevice.deviceId) && this.deviceIdType == proxyingForDevice.deviceIdType;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final DeviceIdType getDeviceIdType() {
        return this.deviceIdType;
    }

    public int hashCode() {
        int hashCode = this.deviceId.hashCode() * 31;
        DeviceIdType deviceIdType = this.deviceIdType;
        return hashCode + (deviceIdType == null ? 0 : deviceIdType.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProxyingForDevice(deviceId=" + this.deviceId + ", deviceIdType=" + this.deviceIdType + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ ProxyingForDevice(String str, DeviceIdType deviceIdType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : deviceIdType);
    }
}
