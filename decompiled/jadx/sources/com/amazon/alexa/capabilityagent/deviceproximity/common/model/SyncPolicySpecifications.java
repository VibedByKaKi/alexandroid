package com.amazon.alexa.capabilityagent.deviceproximity.common.model;

import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/SyncPolicySpecifications;", "", "roles", "", "Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/DeviceRole;", "<init>", "(Ljava/util/List;)V", "getRoles", "()Ljava/util/List;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SyncPolicySpecifications {

    @NotNull
    private final List<DeviceRole> roles;

    /* JADX WARN: Multi-variable type inference failed */
    public SyncPolicySpecifications(@JsonProperty("role") @NotNull List<? extends DeviceRole> list) {
        list.getClass();
        this.roles = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncPolicySpecifications copy$default(SyncPolicySpecifications syncPolicySpecifications, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = syncPolicySpecifications.roles;
        }
        return syncPolicySpecifications.copy(list);
    }

    @NotNull
    public final List<DeviceRole> component1() {
        return this.roles;
    }

    @NotNull
    public final SyncPolicySpecifications copy(@JsonProperty("role") @NotNull List<? extends DeviceRole> roles) {
        roles.getClass();
        return new SyncPolicySpecifications(roles);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SyncPolicySpecifications) && Intrinsics.areEqual(this.roles, ((SyncPolicySpecifications) other).roles);
    }

    @NotNull
    public final List<DeviceRole> getRoles() {
        return this.roles;
    }

    public int hashCode() {
        return this.roles.hashCode();
    }

    @NotNull
    public String toString() {
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m("SyncPolicySpecifications(roles=", MarkdownConstants.RIGHT_PARENTHESIS, this.roles);
    }
}
