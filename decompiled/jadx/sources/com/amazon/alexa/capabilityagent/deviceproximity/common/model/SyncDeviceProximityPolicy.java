package com.amazon.alexa.capabilityagent.deviceproximity.common.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/SyncDeviceProximityPolicy;", "", "proxyingForDevice", "Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/ProxyingForDevice;", "syncPolicySpecifications", "Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/SyncPolicySpecifications;", "<init>", "(Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/ProxyingForDevice;Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/SyncPolicySpecifications;)V", "getProxyingForDevice", "()Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/ProxyingForDevice;", "getSyncPolicySpecifications", "()Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/SyncPolicySpecifications;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SyncDeviceProximityPolicy {

    @Nullable
    private final ProxyingForDevice proxyingForDevice;

    @NotNull
    private final SyncPolicySpecifications syncPolicySpecifications;

    public SyncDeviceProximityPolicy(@Nullable ProxyingForDevice proxyingForDevice, @NotNull SyncPolicySpecifications syncPolicySpecifications) {
        syncPolicySpecifications.getClass();
        this.proxyingForDevice = proxyingForDevice;
        this.syncPolicySpecifications = syncPolicySpecifications;
    }

    public static /* synthetic */ SyncDeviceProximityPolicy copy$default(SyncDeviceProximityPolicy syncDeviceProximityPolicy, ProxyingForDevice proxyingForDevice, SyncPolicySpecifications syncPolicySpecifications, int i, Object obj) {
        if ((i & 1) != 0) {
            proxyingForDevice = syncDeviceProximityPolicy.proxyingForDevice;
        }
        if ((i & 2) != 0) {
            syncPolicySpecifications = syncDeviceProximityPolicy.syncPolicySpecifications;
        }
        return syncDeviceProximityPolicy.copy(proxyingForDevice, syncPolicySpecifications);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final ProxyingForDevice getProxyingForDevice() {
        return this.proxyingForDevice;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final SyncPolicySpecifications getSyncPolicySpecifications() {
        return this.syncPolicySpecifications;
    }

    @NotNull
    public final SyncDeviceProximityPolicy copy(@Nullable ProxyingForDevice proxyingForDevice, @NotNull SyncPolicySpecifications syncPolicySpecifications) {
        syncPolicySpecifications.getClass();
        return new SyncDeviceProximityPolicy(proxyingForDevice, syncPolicySpecifications);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncDeviceProximityPolicy)) {
            return false;
        }
        SyncDeviceProximityPolicy syncDeviceProximityPolicy = (SyncDeviceProximityPolicy) other;
        return Intrinsics.areEqual(this.proxyingForDevice, syncDeviceProximityPolicy.proxyingForDevice) && Intrinsics.areEqual(this.syncPolicySpecifications, syncDeviceProximityPolicy.syncPolicySpecifications);
    }

    @Nullable
    public final ProxyingForDevice getProxyingForDevice() {
        return this.proxyingForDevice;
    }

    @NotNull
    public final SyncPolicySpecifications getSyncPolicySpecifications() {
        return this.syncPolicySpecifications;
    }

    public int hashCode() {
        ProxyingForDevice proxyingForDevice = this.proxyingForDevice;
        return this.syncPolicySpecifications.hashCode() + ((proxyingForDevice == null ? 0 : proxyingForDevice.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "SyncDeviceProximityPolicy(proxyingForDevice=" + this.proxyingForDevice + ", syncPolicySpecifications=" + this.syncPolicySpecifications + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ SyncDeviceProximityPolicy(ProxyingForDevice proxyingForDevice, SyncPolicySpecifications syncPolicySpecifications, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : proxyingForDevice, syncPolicySpecifications);
    }
}
