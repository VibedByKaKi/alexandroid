package com.amazon.comms.calling.domain.model.dataChannel;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0001HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelModel;", "", "type", "Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelType;", "eventName", "", "payload", "<init>", "(Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelType;Ljava/lang/String;Ljava/lang/Object;)V", "getType", "()Lcom/amazon/comms/calling/domain/model/dataChannel/DataChannelType;", "getEventName", "()Ljava/lang/String;", "getPayload", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class DataChannelModel {

    @SerializedName("eventName")
    @NotNull
    private final String eventName;

    @SerializedName("payload")
    @NotNull
    private final Object payload;

    @SerializedName("type")
    @NotNull
    private final DataChannelType type;

    public DataChannelModel(@NotNull DataChannelType dataChannelType, @NotNull String str, @NotNull Object obj) {
        dataChannelType.getClass();
        str.getClass();
        obj.getClass();
        this.type = dataChannelType;
        this.eventName = str;
        this.payload = obj;
    }

    public static /* synthetic */ DataChannelModel copy$default(DataChannelModel dataChannelModel, DataChannelType dataChannelType, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            dataChannelType = dataChannelModel.type;
        }
        if ((i & 2) != 0) {
            str = dataChannelModel.eventName;
        }
        if ((i & 4) != 0) {
            obj = dataChannelModel.payload;
        }
        return dataChannelModel.copy(dataChannelType, str, obj);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final DataChannelType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Object getPayload() {
        return this.payload;
    }

    @NotNull
    public final DataChannelModel copy(@NotNull DataChannelType type, @NotNull String eventName, @NotNull Object payload) {
        type.getClass();
        eventName.getClass();
        payload.getClass();
        return new DataChannelModel(type, eventName, payload);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataChannelModel)) {
            return false;
        }
        DataChannelModel dataChannelModel = (DataChannelModel) other;
        return this.type == dataChannelModel.type && Intrinsics.areEqual(this.eventName, dataChannelModel.eventName) && Intrinsics.areEqual(this.payload, dataChannelModel.payload);
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final Object getPayload() {
        return this.payload;
    }

    @NotNull
    public final DataChannelType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.payload.hashCode() + b.a(this.eventName, this.type.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        DataChannelType dataChannelType = this.type;
        String str = this.eventName;
        Object obj = this.payload;
        StringBuilder sb = new StringBuilder("DataChannelModel(type=");
        sb.append(dataChannelType);
        sb.append(", eventName=");
        sb.append(str);
        sb.append(", payload=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, MarkdownConstants.RIGHT_PARENTHESIS, obj);
    }
}
