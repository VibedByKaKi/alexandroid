package com.amazon.comms.calling.domain.model.pcc;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/amazon/comms/calling/domain/model/pcc/CallConfig;", "", "ringToneSupported", "", "manualAnswerCall", "manualDeclineCall", "manualEndCall", "videoSupported", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRingToneSupported", "()Ljava/lang/String;", "getManualAnswerCall", "getManualDeclineCall", "getManualEndCall", "getVideoSupported", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CallConfig {

    @SerializedName("MANUAL_ANSWER_CALL")
    @Nullable
    private final String manualAnswerCall;

    @SerializedName("MANUAL_DECLINE_CALL")
    @Nullable
    private final String manualDeclineCall;

    @SerializedName("MANUAL_END_CALL")
    @Nullable
    private final String manualEndCall;

    @SerializedName("OVERRIDE_RINGTONE_SUPPORTED")
    @Nullable
    private final String ringToneSupported;

    @SerializedName("VIDEO_SUPPORTED")
    @Nullable
    private final String videoSupported;

    public /* synthetic */ CallConfig(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ CallConfig copy$default(CallConfig callConfig, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = callConfig.ringToneSupported;
        }
        if ((i & 2) != 0) {
            str2 = callConfig.manualAnswerCall;
        }
        if ((i & 4) != 0) {
            str3 = callConfig.manualDeclineCall;
        }
        if ((i & 8) != 0) {
            str4 = callConfig.manualEndCall;
        }
        if ((i & 16) != 0) {
            str5 = callConfig.videoSupported;
        }
        String str6 = str5;
        String str7 = str3;
        return callConfig.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getRingToneSupported() {
        return this.ringToneSupported;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getManualAnswerCall() {
        return this.manualAnswerCall;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getManualDeclineCall() {
        return this.manualDeclineCall;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getManualEndCall() {
        return this.manualEndCall;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getVideoSupported() {
        return this.videoSupported;
    }

    @NotNull
    public final CallConfig copy(@Nullable String ringToneSupported, @Nullable String manualAnswerCall, @Nullable String manualDeclineCall, @Nullable String manualEndCall, @Nullable String videoSupported) {
        return new CallConfig(ringToneSupported, manualAnswerCall, manualDeclineCall, manualEndCall, videoSupported);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallConfig)) {
            return false;
        }
        CallConfig callConfig = (CallConfig) other;
        return Intrinsics.areEqual(this.ringToneSupported, callConfig.ringToneSupported) && Intrinsics.areEqual(this.manualAnswerCall, callConfig.manualAnswerCall) && Intrinsics.areEqual(this.manualDeclineCall, callConfig.manualDeclineCall) && Intrinsics.areEqual(this.manualEndCall, callConfig.manualEndCall) && Intrinsics.areEqual(this.videoSupported, callConfig.videoSupported);
    }

    @Nullable
    public final String getManualAnswerCall() {
        return this.manualAnswerCall;
    }

    @Nullable
    public final String getManualDeclineCall() {
        return this.manualDeclineCall;
    }

    @Nullable
    public final String getManualEndCall() {
        return this.manualEndCall;
    }

    @Nullable
    public final String getRingToneSupported() {
        return this.ringToneSupported;
    }

    @Nullable
    public final String getVideoSupported() {
        return this.videoSupported;
    }

    public int hashCode() {
        String str = this.ringToneSupported;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.manualAnswerCall;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.manualDeclineCall;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.manualEndCall;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.videoSupported;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.ringToneSupported;
        String str2 = this.manualAnswerCall;
        String str3 = this.manualDeclineCall;
        String str4 = this.manualEndCall;
        String str5 = this.videoSupported;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("CallConfig(ringToneSupported=", str, ", manualAnswerCall=", str2, ", manualDeclineCall=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str3, ", manualEndCall=", str4, ", videoSupported=");
        return a$$ExternalSyntheticOutline0.m(m, str5, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public CallConfig(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.ringToneSupported = str;
        this.manualAnswerCall = str2;
        this.manualDeclineCall = str3;
        this.manualEndCall = str4;
        this.videoSupported = str5;
    }

    public CallConfig() {
        this(null, null, null, null, null, 31, null);
    }
}
