package com.amazon.comms.calling.data.dao;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/amazon/comms/calling/data/dao/CallTarget;", "", "type", "", FragmentMetaData.GROUP_ID, "groupIdentityType", "targetCommsId", "deviceEndpoint", "usecase", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getGroupId", "getGroupIdentityType", "getTargetCommsId", "getDeviceEndpoint", "getUsecase", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CallTarget {

    @SerializedName("deviceEndpoint")
    @Nullable
    private final String deviceEndpoint;

    @SerializedName(FragmentMetaData.GROUP_ID)
    @Nullable
    private final String groupId;

    @SerializedName("groupIdentityType")
    @Nullable
    private final String groupIdentityType;

    @SerializedName("targetCommsId")
    @Nullable
    private final String targetCommsId;

    @SerializedName(MessagingControllerConstant.MESSAGING_CONTROLLER_PAYLOAD_TYPE)
    @NotNull
    private final String type;

    @SerializedName("usecase")
    @Nullable
    private final String usecase;

    public CallTarget(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        str.getClass();
        this.type = str;
        this.groupId = str2;
        this.groupIdentityType = str3;
        this.targetCommsId = str4;
        this.deviceEndpoint = str5;
        this.usecase = str6;
    }

    public static /* synthetic */ CallTarget copy$default(CallTarget callTarget, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callTarget.type;
        }
        if ((i & 2) != 0) {
            str2 = callTarget.groupId;
        }
        if ((i & 4) != 0) {
            str3 = callTarget.groupIdentityType;
        }
        if ((i & 8) != 0) {
            str4 = callTarget.targetCommsId;
        }
        if ((i & 16) != 0) {
            str5 = callTarget.deviceEndpoint;
        }
        if ((i & 32) != 0) {
            str6 = callTarget.usecase;
        }
        String str7 = str5;
        String str8 = str6;
        return callTarget.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getGroupIdentityType() {
        return this.groupIdentityType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getTargetCommsId() {
        return this.targetCommsId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDeviceEndpoint() {
        return this.deviceEndpoint;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getUsecase() {
        return this.usecase;
    }

    @NotNull
    public final CallTarget copy(@NotNull String type, @Nullable String groupId, @Nullable String groupIdentityType, @Nullable String targetCommsId, @Nullable String deviceEndpoint, @Nullable String usecase) {
        type.getClass();
        return new CallTarget(type, groupId, groupIdentityType, targetCommsId, deviceEndpoint, usecase);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallTarget)) {
            return false;
        }
        CallTarget callTarget = (CallTarget) other;
        return Intrinsics.areEqual(this.type, callTarget.type) && Intrinsics.areEqual(this.groupId, callTarget.groupId) && Intrinsics.areEqual(this.groupIdentityType, callTarget.groupIdentityType) && Intrinsics.areEqual(this.targetCommsId, callTarget.targetCommsId) && Intrinsics.areEqual(this.deviceEndpoint, callTarget.deviceEndpoint) && Intrinsics.areEqual(this.usecase, callTarget.usecase);
    }

    @Nullable
    public final String getDeviceEndpoint() {
        return this.deviceEndpoint;
    }

    @Nullable
    public final String getGroupId() {
        return this.groupId;
    }

    @Nullable
    public final String getGroupIdentityType() {
        return this.groupIdentityType;
    }

    @Nullable
    public final String getTargetCommsId() {
        return this.targetCommsId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUsecase() {
        return this.usecase;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.groupId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupIdentityType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.targetCommsId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceEndpoint;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.usecase;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.groupId;
        String str3 = this.groupIdentityType;
        String str4 = this.targetCommsId;
        String str5 = this.deviceEndpoint;
        String str6 = this.usecase;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("CallTarget(type=", str, ", groupId=", str2, ", groupIdentityType=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", targetCommsId=", str4, ", deviceEndpoint=");
        return DoubleList$$ExternalSyntheticOutline0.m(m, str5, ", usecase=", str6, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
