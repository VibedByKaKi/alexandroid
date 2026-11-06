package com.amazon.comms.calling.domain.usecase.pcc;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/amazon/comms/calling/domain/usecase/pcc/SendCallTypeInCallCommandParams;", "", "callId", "", "inCallCommandName", "callExperienceType", "deviceCallStateSerialized", "callFlags", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCallId", "()Ljava/lang/String;", "getInCallCommandName", "getCallExperienceType", "getDeviceCallStateSerialized", "getCallFlags", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class SendCallTypeInCallCommandParams {

    @NotNull
    private final String callExperienceType;

    @NotNull
    private final List<String> callFlags;

    @NotNull
    private final String callId;

    @NotNull
    private final String deviceCallStateSerialized;

    @NotNull
    private final String inCallCommandName;

    public SendCallTypeInCallCommandParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<String> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.callId = str;
        this.inCallCommandName = str2;
        this.callExperienceType = str3;
        this.deviceCallStateSerialized = str4;
        this.callFlags = list;
    }

    public static /* synthetic */ SendCallTypeInCallCommandParams copy$default(SendCallTypeInCallCommandParams sendCallTypeInCallCommandParams, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendCallTypeInCallCommandParams.callId;
        }
        if ((i & 2) != 0) {
            str2 = sendCallTypeInCallCommandParams.inCallCommandName;
        }
        if ((i & 4) != 0) {
            str3 = sendCallTypeInCallCommandParams.callExperienceType;
        }
        if ((i & 8) != 0) {
            str4 = sendCallTypeInCallCommandParams.deviceCallStateSerialized;
        }
        if ((i & 16) != 0) {
            list = sendCallTypeInCallCommandParams.callFlags;
        }
        List list2 = list;
        String str5 = str3;
        return sendCallTypeInCallCommandParams.copy(str, str2, str5, str4, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getInCallCommandName() {
        return this.inCallCommandName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCallExperienceType() {
        return this.callExperienceType;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDeviceCallStateSerialized() {
        return this.deviceCallStateSerialized;
    }

    @NotNull
    public final List<String> component5() {
        return this.callFlags;
    }

    @NotNull
    public final SendCallTypeInCallCommandParams copy(@NotNull String callId, @NotNull String inCallCommandName, @NotNull String callExperienceType, @NotNull String deviceCallStateSerialized, @NotNull List<String> callFlags) {
        callId.getClass();
        inCallCommandName.getClass();
        callExperienceType.getClass();
        deviceCallStateSerialized.getClass();
        callFlags.getClass();
        return new SendCallTypeInCallCommandParams(callId, inCallCommandName, callExperienceType, deviceCallStateSerialized, callFlags);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendCallTypeInCallCommandParams)) {
            return false;
        }
        SendCallTypeInCallCommandParams sendCallTypeInCallCommandParams = (SendCallTypeInCallCommandParams) other;
        return Intrinsics.areEqual(this.callId, sendCallTypeInCallCommandParams.callId) && Intrinsics.areEqual(this.inCallCommandName, sendCallTypeInCallCommandParams.inCallCommandName) && Intrinsics.areEqual(this.callExperienceType, sendCallTypeInCallCommandParams.callExperienceType) && Intrinsics.areEqual(this.deviceCallStateSerialized, sendCallTypeInCallCommandParams.deviceCallStateSerialized) && Intrinsics.areEqual(this.callFlags, sendCallTypeInCallCommandParams.callFlags);
    }

    @NotNull
    public final String getCallExperienceType() {
        return this.callExperienceType;
    }

    @NotNull
    public final List<String> getCallFlags() {
        return this.callFlags;
    }

    @NotNull
    public final String getCallId() {
        return this.callId;
    }

    @NotNull
    public final String getDeviceCallStateSerialized() {
        return this.deviceCallStateSerialized;
    }

    @NotNull
    public final String getInCallCommandName() {
        return this.inCallCommandName;
    }

    public int hashCode() {
        return this.callFlags.hashCode() + b.a(this.deviceCallStateSerialized, b.a(this.callExperienceType, b.a(this.inCallCommandName, this.callId.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.callId;
        String str2 = this.inCallCommandName;
        String str3 = this.callExperienceType;
        String str4 = this.deviceCallStateSerialized;
        List<String> list = this.callFlags;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("SendCallTypeInCallCommandParams(callId=", str, ", inCallCommandName=", str2, ", callExperienceType=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", deviceCallStateSerialized=", str4, ", callFlags=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list, m);
    }
}
