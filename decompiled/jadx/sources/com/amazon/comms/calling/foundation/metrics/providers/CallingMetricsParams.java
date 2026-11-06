package com.amazon.comms.calling.foundation.metrics.providers;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÍ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012(\b\u0002\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u00104\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0012HÆ\u0003JÏ\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032(\b\u0002\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0012HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R:\u0010\u0010\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006<"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/providers/CallingMetricsParams;", "", "commsId", "", "callId", "statusCode", "callType", "deviceType", "transport", "direction", "request_id", "size", "duration", "mediaType", "messageType", "targetType", "genericMetaHeaders", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "getCommsId", "()Ljava/lang/String;", "getCallId", "getStatusCode", "getCallType", "getDeviceType", "getTransport", "getDirection", "getRequest_id", "getSize", "getDuration", "getMediaType", "getMessageType", "getTargetType", "getGenericMetaHeaders", "()Ljava/util/HashMap;", "setGenericMetaHeaders", "(Ljava/util/HashMap;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CallingMetricsParams {

    @Nullable
    private final String callId;

    @Nullable
    private final String callType;

    @Nullable
    private final String commsId;

    @Nullable
    private final String deviceType;

    @Nullable
    private final String direction;

    @Nullable
    private final String duration;

    @Nullable
    private HashMap<String, Object> genericMetaHeaders;

    @Nullable
    private final String mediaType;

    @Nullable
    private final String messageType;

    @Nullable
    private final String request_id;

    @Nullable
    private final String size;

    @Nullable
    private final String statusCode;

    @Nullable
    private final String targetType;

    @Nullable
    private final String transport;

    public /* synthetic */ CallingMetricsParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : hashMap);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCommsId() {
        return this.commsId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getMediaType() {
        return this.mediaType;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getMessageType() {
        return this.messageType;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getTargetType() {
        return this.targetType;
    }

    @Nullable
    public final HashMap<String, Object> component14() {
        return this.genericMetaHeaders;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCallType() {
        return this.callType;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getTransport() {
        return this.transport;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getRequest_id() {
        return this.request_id;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @NotNull
    public final CallingMetricsParams copy(@Nullable String commsId, @Nullable String callId, @Nullable String statusCode, @Nullable String callType, @Nullable String deviceType, @Nullable String transport, @Nullable String direction, @Nullable String request_id, @Nullable String size, @Nullable String duration, @Nullable String mediaType, @Nullable String messageType, @Nullable String targetType, @Nullable HashMap<String, Object> genericMetaHeaders) {
        return new CallingMetricsParams(commsId, callId, statusCode, callType, deviceType, transport, direction, request_id, size, duration, mediaType, messageType, targetType, genericMetaHeaders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallingMetricsParams)) {
            return false;
        }
        CallingMetricsParams callingMetricsParams = (CallingMetricsParams) other;
        return Intrinsics.areEqual(this.commsId, callingMetricsParams.commsId) && Intrinsics.areEqual(this.callId, callingMetricsParams.callId) && Intrinsics.areEqual(this.statusCode, callingMetricsParams.statusCode) && Intrinsics.areEqual(this.callType, callingMetricsParams.callType) && Intrinsics.areEqual(this.deviceType, callingMetricsParams.deviceType) && Intrinsics.areEqual(this.transport, callingMetricsParams.transport) && Intrinsics.areEqual(this.direction, callingMetricsParams.direction) && Intrinsics.areEqual(this.request_id, callingMetricsParams.request_id) && Intrinsics.areEqual(this.size, callingMetricsParams.size) && Intrinsics.areEqual(this.duration, callingMetricsParams.duration) && Intrinsics.areEqual(this.mediaType, callingMetricsParams.mediaType) && Intrinsics.areEqual(this.messageType, callingMetricsParams.messageType) && Intrinsics.areEqual(this.targetType, callingMetricsParams.targetType) && Intrinsics.areEqual(this.genericMetaHeaders, callingMetricsParams.genericMetaHeaders);
    }

    @Nullable
    public final String getCallId() {
        return this.callId;
    }

    @Nullable
    public final String getCallType() {
        return this.callType;
    }

    @Nullable
    public final String getCommsId() {
        return this.commsId;
    }

    @Nullable
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final String getDuration() {
        return this.duration;
    }

    @Nullable
    public final HashMap<String, Object> getGenericMetaHeaders() {
        return this.genericMetaHeaders;
    }

    @Nullable
    public final String getMediaType() {
        return this.mediaType;
    }

    @Nullable
    public final String getMessageType() {
        return this.messageType;
    }

    @Nullable
    public final String getRequest_id() {
        return this.request_id;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final String getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    public final String getTargetType() {
        return this.targetType;
    }

    @Nullable
    public final String getTransport() {
        return this.transport;
    }

    public int hashCode() {
        String str = this.commsId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.callId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.callType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceType;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.transport;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.direction;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.request_id;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.size;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.duration;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.mediaType;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.messageType;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.targetType;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        HashMap<String, Object> hashMap = this.genericMetaHeaders;
        return hashCode13 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final void setGenericMetaHeaders(@Nullable HashMap<String, Object> hashMap) {
        this.genericMetaHeaders = hashMap;
    }

    @NotNull
    public String toString() {
        String str = this.commsId;
        String str2 = this.callId;
        String str3 = this.statusCode;
        String str4 = this.callType;
        String str5 = this.deviceType;
        String str6 = this.transport;
        String str7 = this.direction;
        String str8 = this.request_id;
        String str9 = this.size;
        String str10 = this.duration;
        String str11 = this.mediaType;
        String str12 = this.messageType;
        String str13 = this.targetType;
        HashMap<String, Object> hashMap = this.genericMetaHeaders;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("CallingMetricsParams(commsId=", str, ", callId=", str2, ", statusCode=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", callType=", str4, ", deviceType=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str5, ", transport=", str6, ", direction=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str7, ", request_id=", str8, ", size=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str9, ", duration=", str10, ", mediaType=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str11, ", messageType=", str12, ", targetType=");
        m.append(str13);
        m.append(", genericMetaHeaders=");
        m.append(hashMap);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public CallingMetricsParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable HashMap<String, Object> hashMap) {
        this.commsId = str;
        this.callId = str2;
        this.statusCode = str3;
        this.callType = str4;
        this.deviceType = str5;
        this.transport = str6;
        this.direction = str7;
        this.request_id = str8;
        this.size = str9;
        this.duration = str10;
        this.mediaType = str11;
        this.messageType = str12;
        this.targetType = str13;
        this.genericMetaHeaders = hashMap;
    }

    public CallingMetricsParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }
}
