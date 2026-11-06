package com.amazon.comms.calling.data.dao;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.DeviceModel;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/amazon/comms/calling/data/dao/GetDevicesResponse;", "", "deviceModels", "", "Lcom/amazon/comms/calling/domain/model/DeviceModel;", "status", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getDeviceModels", "()Ljava/util/List;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class GetDevicesResponse {

    @SerializedName("devices")
    @Nullable
    private final List<DeviceModel> deviceModels;

    @SerializedName("status")
    @Nullable
    private final String status;

    public /* synthetic */ GetDevicesResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetDevicesResponse copy$default(GetDevicesResponse getDevicesResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getDevicesResponse.deviceModels;
        }
        if ((i & 2) != 0) {
            str = getDevicesResponse.status;
        }
        return getDevicesResponse.copy(list, str);
    }

    @Nullable
    public final List<DeviceModel> component1() {
        return this.deviceModels;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final GetDevicesResponse copy(@Nullable List<DeviceModel> deviceModels, @Nullable String status) {
        return new GetDevicesResponse(deviceModels, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDevicesResponse)) {
            return false;
        }
        GetDevicesResponse getDevicesResponse = (GetDevicesResponse) other;
        return Intrinsics.areEqual(this.deviceModels, getDevicesResponse.deviceModels) && Intrinsics.areEqual(this.status, getDevicesResponse.status);
    }

    @Nullable
    public final List<DeviceModel> getDeviceModels() {
        return this.deviceModels;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        List<DeviceModel> list = this.deviceModels;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.status;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetDevicesResponse(deviceModels=" + this.deviceModels + ", status=" + this.status + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public GetDevicesResponse(@Nullable List<DeviceModel> list, @Nullable String str) {
        this.deviceModels = list;
        this.status = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetDevicesResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
