package com.amazon.comms.calling.data.dao;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0010J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004J\u0006\u0010\u0017\u001a\u00020\u0018R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006R\u000e\u0010\n\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/amazon/comms/calling/data/dao/InitiateOutboundCallRequestBuilder;", "", "callMediaStreams", "", "", "<init>", "(Ljava/util/List;)V", "getCallMediaStreams", "()Ljava/util/List;", "setCallMediaStreams", "type", "targetCommsId", "deviceEndpoint", "groupID", "groupIDType", "isDropin", "", "usecase", "withContactTarget", "withDeviceTarget", "withGroupTarget", "isDropIn", "withResolvableTarget", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/amazon/comms/calling/data/dao/InitiateOutboundCallRequest;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class InitiateOutboundCallRequestBuilder {

    @NotNull
    private List<String> callMediaStreams;

    @Nullable
    private String deviceEndpoint;

    @Nullable
    private String groupID;

    @Nullable
    private String groupIDType;
    private boolean isDropin;

    @Nullable
    private String targetCommsId;
    private String type;

    @Nullable
    private String usecase;

    public InitiateOutboundCallRequestBuilder(@NotNull List<String> list) {
        list.getClass();
        this.callMediaStreams = list;
    }

    @NotNull
    public final InitiateOutboundCallRequest build() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.getDefault());
        String str = this.type;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("type");
            str = null;
        }
        CallTarget callTarget = new CallTarget(str, this.groupID, this.groupIDType, this.targetCommsId, this.deviceEndpoint, this.usecase);
        String format = simpleDateFormat.format(new Date());
        format.getClass();
        return new InitiateOutboundCallRequest(callTarget, new ClientMetricsInfo(format), this.isDropin, this.callMediaStreams);
    }

    @NotNull
    public final List<String> getCallMediaStreams() {
        return this.callMediaStreams;
    }

    public final void setCallMediaStreams(@NotNull List<String> list) {
        list.getClass();
        this.callMediaStreams = list;
    }

    @NotNull
    public final InitiateOutboundCallRequestBuilder withContactTarget(@NotNull String targetCommsId, boolean isDropin) {
        targetCommsId.getClass();
        this.type = "ContactTarget";
        this.isDropin = isDropin;
        this.targetCommsId = targetCommsId;
        return this;
    }

    @NotNull
    public final InitiateOutboundCallRequestBuilder withDeviceTarget(@NotNull String deviceEndpoint, boolean isDropin) {
        deviceEndpoint.getClass();
        this.type = "DeviceTarget";
        this.isDropin = isDropin;
        this.deviceEndpoint = deviceEndpoint;
        return this;
    }

    @NotNull
    public final InitiateOutboundCallRequestBuilder withGroupTarget(@NotNull String groupIDType, @NotNull String groupID, boolean isDropIn) {
        groupIDType.getClass();
        groupID.getClass();
        this.type = "GroupTarget";
        this.groupIDType = groupIDType;
        this.groupID = groupID;
        this.isDropin = isDropIn;
        return this;
    }

    @NotNull
    public final InitiateOutboundCallRequestBuilder withResolvableTarget(@NotNull String usecase) {
        usecase.getClass();
        this.type = "ResolvableTarget";
        this.usecase = usecase;
        return this;
    }
}
