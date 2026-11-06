package com.amazon.comms.calling.domain.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.b;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b;\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\n\u0012\b\b\u0002\u0010 \u001a\u00020\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b#\u0010$J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\t\u0010B\u001a\u00020\nHÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010F\u001a\u00020\nHÆ\u0003J\t\u0010G\u001a\u00020\nHÆ\u0003J\t\u0010H\u001a\u00020\u0013HÆ\u0003J\t\u0010I\u001a\u00020\u0013HÆ\u0003J\t\u0010J\u001a\u00020\u0013HÆ\u0003J\t\u0010K\u001a\u00020\u0013HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\t\u0010O\u001a\u00020\nHÆ\u0003J\t\u0010P\u001a\u00020\nHÆ\u0003J\t\u0010Q\u001a\u00020\u001eHÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\t\u0010S\u001a\u00020\nHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009d\u0002\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010W\u001a\u00020\n2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020ZHÖ\u0001J\t\u0010[\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010,R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010,R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010,R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010,R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010,R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010,R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010&R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010,R\u0011\u0010\u001c\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010,R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010,R\u0011\u0010 \u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010,R\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b;\u0010&¨\u0006\\"}, d2 = {"Lcom/amazon/comms/calling/domain/model/CallModel;", "", "callId", "", "remoteParticipantName", "remoteParticipantCommsId", "callee", "Lcom/amazon/comms/calling/domain/model/Agent;", "caller", "isEnhancedProcessingEnabled", "", "isGroupCall", "isOptInRequired", "isDropInCall", "callOrigin", "Lcom/amazon/comms/calling/domain/model/CallOrigin;", "isVideoCall", "isRemoteRttEnabled", "callAcceptedTimeForCallDurationTimer", "", "callStartTime", "callConnectedTime", "callEndTime", "callProvider", "statusCodeStr", "ratingModel", "Lcom/amazon/comms/calling/domain/model/RatingModel;", "isComingFromIntent", "isUpdateEvent", "audioDowngradeStatus", "Lcom/amazon/comms/calling/domain/model/AudioDowngradeType;", "isCallSetupEventVideoEmitted", "isFrostedDisclaimerFinished", "remoteParticipantUri", "deviceGruu", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/comms/calling/domain/model/Agent;Lcom/amazon/comms/calling/domain/model/Agent;ZZZZLcom/amazon/comms/calling/domain/model/CallOrigin;ZZJJJJLjava/lang/String;Ljava/lang/String;Lcom/amazon/comms/calling/domain/model/RatingModel;ZZLcom/amazon/comms/calling/domain/model/AudioDowngradeType;ZZLjava/lang/String;Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getRemoteParticipantName", "getRemoteParticipantCommsId", "getCallee", "()Lcom/amazon/comms/calling/domain/model/Agent;", "getCaller", "()Z", "getCallOrigin", "()Lcom/amazon/comms/calling/domain/model/CallOrigin;", "getCallAcceptedTimeForCallDurationTimer", "()J", "getCallStartTime", "getCallConnectedTime", "getCallEndTime", "getCallProvider", "getStatusCodeStr", "getRatingModel", "()Lcom/amazon/comms/calling/domain/model/RatingModel;", "getAudioDowngradeStatus", "()Lcom/amazon/comms/calling/domain/model/AudioDowngradeType;", "getRemoteParticipantUri", "getDeviceGruu", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CallModel {

    @NotNull
    private final AudioDowngradeType audioDowngradeStatus;
    private final long callAcceptedTimeForCallDurationTimer;
    private final long callConnectedTime;
    private final long callEndTime;

    @NotNull
    private final String callId;

    @Nullable
    private final CallOrigin callOrigin;

    @Nullable
    private final String callProvider;
    private final long callStartTime;

    @Nullable
    private final Agent callee;

    @Nullable
    private final Agent caller;

    @Nullable
    private final String deviceGruu;
    private final boolean isCallSetupEventVideoEmitted;
    private final boolean isComingFromIntent;
    private final boolean isDropInCall;
    private final boolean isEnhancedProcessingEnabled;
    private final boolean isFrostedDisclaimerFinished;
    private final boolean isGroupCall;
    private final boolean isOptInRequired;
    private final boolean isRemoteRttEnabled;
    private final boolean isUpdateEvent;
    private final boolean isVideoCall;

    @Nullable
    private final RatingModel ratingModel;

    @NotNull
    private final String remoteParticipantCommsId;

    @NotNull
    private final String remoteParticipantName;

    @Nullable
    private final String remoteParticipantUri;

    @Nullable
    private final String statusCodeStr;

    public /* synthetic */ CallModel(String str, String str2, String str3, Agent agent, Agent agent2, boolean z, boolean z2, boolean z3, boolean z4, CallOrigin callOrigin, boolean z5, boolean z6, long j, long j2, long j3, long j4, String str4, String str5, RatingModel ratingModel, boolean z7, boolean z8, AudioDowngradeType audioDowngradeType, boolean z9, boolean z10, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : agent, (i & 16) != 0 ? null : agent2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? null : callOrigin, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? false : z6, (i & 4096) != 0 ? 0L : j, (i & 8192) != 0 ? 0L : j2, (i & 16384) != 0 ? 0L : j3, (32768 & i) != 0 ? 0L : j4, (65536 & i) != 0 ? null : str4, (131072 & i) != 0 ? "" : str5, (262144 & i) != 0 ? null : ratingModel, (524288 & i) != 0 ? false : z7, (1048576 & i) != 0 ? false : z8, (2097152 & i) != 0 ? AudioDowngradeType.NO_DOWNGRADE : audioDowngradeType, (4194304 & i) != 0 ? false : z9, (8388608 & i) != 0 ? false : z10, (16777216 & i) != 0 ? null : str6, (i & 33554432) != 0 ? null : str7);
    }

    public static /* synthetic */ CallModel copy$default(CallModel callModel, String str, String str2, String str3, Agent agent, Agent agent2, boolean z, boolean z2, boolean z3, boolean z4, CallOrigin callOrigin, boolean z5, boolean z6, long j, long j2, long j3, long j4, String str4, String str5, RatingModel ratingModel, boolean z7, boolean z8, AudioDowngradeType audioDowngradeType, boolean z9, boolean z10, String str6, String str7, int i, Object obj) {
        String str8;
        String str9;
        String str10 = (i & 1) != 0 ? callModel.callId : str;
        String str11 = (i & 2) != 0 ? callModel.remoteParticipantName : str2;
        String str12 = (i & 4) != 0 ? callModel.remoteParticipantCommsId : str3;
        Agent agent3 = (i & 8) != 0 ? callModel.callee : agent;
        Agent agent4 = (i & 16) != 0 ? callModel.caller : agent2;
        boolean z11 = (i & 32) != 0 ? callModel.isEnhancedProcessingEnabled : z;
        boolean z12 = (i & 64) != 0 ? callModel.isGroupCall : z2;
        boolean z13 = (i & 128) != 0 ? callModel.isOptInRequired : z3;
        boolean z14 = (i & 256) != 0 ? callModel.isDropInCall : z4;
        CallOrigin callOrigin2 = (i & 512) != 0 ? callModel.callOrigin : callOrigin;
        boolean z15 = (i & 1024) != 0 ? callModel.isVideoCall : z5;
        boolean z16 = (i & 2048) != 0 ? callModel.isRemoteRttEnabled : z6;
        long j5 = (i & 4096) != 0 ? callModel.callAcceptedTimeForCallDurationTimer : j;
        String str13 = str10;
        String str14 = str11;
        long j6 = (i & 8192) != 0 ? callModel.callStartTime : j2;
        long j7 = (i & 16384) != 0 ? callModel.callConnectedTime : j3;
        long j8 = (i & 32768) != 0 ? callModel.callEndTime : j4;
        String str15 = (i & 65536) != 0 ? callModel.callProvider : str4;
        long j9 = j8;
        String str16 = (i & 131072) != 0 ? callModel.statusCodeStr : str5;
        RatingModel ratingModel2 = (i & 262144) != 0 ? callModel.ratingModel : ratingModel;
        String str17 = str16;
        boolean z17 = (i & 524288) != 0 ? callModel.isComingFromIntent : z7;
        boolean z18 = (i & 1048576) != 0 ? callModel.isUpdateEvent : z8;
        AudioDowngradeType audioDowngradeType2 = (i & 2097152) != 0 ? callModel.audioDowngradeStatus : audioDowngradeType;
        boolean z19 = (i & 4194304) != 0 ? callModel.isCallSetupEventVideoEmitted : z9;
        boolean z20 = (i & 8388608) != 0 ? callModel.isFrostedDisclaimerFinished : z10;
        String str18 = (i & 16777216) != 0 ? callModel.remoteParticipantUri : str6;
        if ((i & 33554432) != 0) {
            str9 = str18;
            str8 = callModel.deviceGruu;
        } else {
            str8 = str7;
            str9 = str18;
        }
        return callModel.copy(str13, str14, str12, agent3, agent4, z11, z12, z13, z14, callOrigin2, z15, z16, j5, j6, j7, j9, str15, str17, ratingModel2, z17, z18, audioDowngradeType2, z19, z20, str9, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final CallOrigin getCallOrigin() {
        return this.callOrigin;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsVideoCall() {
        return this.isVideoCall;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsRemoteRttEnabled() {
        return this.isRemoteRttEnabled;
    }

    /* renamed from: component13, reason: from getter */
    public final long getCallAcceptedTimeForCallDurationTimer() {
        return this.callAcceptedTimeForCallDurationTimer;
    }

    /* renamed from: component14, reason: from getter */
    public final long getCallStartTime() {
        return this.callStartTime;
    }

    /* renamed from: component15, reason: from getter */
    public final long getCallConnectedTime() {
        return this.callConnectedTime;
    }

    /* renamed from: component16, reason: from getter */
    public final long getCallEndTime() {
        return this.callEndTime;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getCallProvider() {
        return this.callProvider;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getStatusCodeStr() {
        return this.statusCodeStr;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final RatingModel getRatingModel() {
        return this.ratingModel;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRemoteParticipantName() {
        return this.remoteParticipantName;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsComingFromIntent() {
        return this.isComingFromIntent;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsUpdateEvent() {
        return this.isUpdateEvent;
    }

    @NotNull
    /* renamed from: component22, reason: from getter */
    public final AudioDowngradeType getAudioDowngradeStatus() {
        return this.audioDowngradeStatus;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsCallSetupEventVideoEmitted() {
        return this.isCallSetupEventVideoEmitted;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsFrostedDisclaimerFinished() {
        return this.isFrostedDisclaimerFinished;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final String getRemoteParticipantUri() {
        return this.remoteParticipantUri;
    }

    @Nullable
    /* renamed from: component26, reason: from getter */
    public final String getDeviceGruu() {
        return this.deviceGruu;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getRemoteParticipantCommsId() {
        return this.remoteParticipantCommsId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Agent getCallee() {
        return this.callee;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Agent getCaller() {
        return this.caller;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsEnhancedProcessingEnabled() {
        return this.isEnhancedProcessingEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsGroupCall() {
        return this.isGroupCall;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsOptInRequired() {
        return this.isOptInRequired;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsDropInCall() {
        return this.isDropInCall;
    }

    @NotNull
    public final CallModel copy(@NotNull String callId, @NotNull String remoteParticipantName, @NotNull String remoteParticipantCommsId, @Nullable Agent callee, @Nullable Agent caller, boolean isEnhancedProcessingEnabled, boolean isGroupCall, boolean isOptInRequired, boolean isDropInCall, @Nullable CallOrigin callOrigin, boolean isVideoCall, boolean isRemoteRttEnabled, long callAcceptedTimeForCallDurationTimer, long callStartTime, long callConnectedTime, long callEndTime, @Nullable String callProvider, @Nullable String statusCodeStr, @Nullable RatingModel ratingModel, boolean isComingFromIntent, boolean isUpdateEvent, @NotNull AudioDowngradeType audioDowngradeStatus, boolean isCallSetupEventVideoEmitted, boolean isFrostedDisclaimerFinished, @Nullable String remoteParticipantUri, @Nullable String deviceGruu) {
        callId.getClass();
        remoteParticipantName.getClass();
        remoteParticipantCommsId.getClass();
        audioDowngradeStatus.getClass();
        return new CallModel(callId, remoteParticipantName, remoteParticipantCommsId, callee, caller, isEnhancedProcessingEnabled, isGroupCall, isOptInRequired, isDropInCall, callOrigin, isVideoCall, isRemoteRttEnabled, callAcceptedTimeForCallDurationTimer, callStartTime, callConnectedTime, callEndTime, callProvider, statusCodeStr, ratingModel, isComingFromIntent, isUpdateEvent, audioDowngradeStatus, isCallSetupEventVideoEmitted, isFrostedDisclaimerFinished, remoteParticipantUri, deviceGruu);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallModel)) {
            return false;
        }
        CallModel callModel = (CallModel) other;
        return Intrinsics.areEqual(this.callId, callModel.callId) && Intrinsics.areEqual(this.remoteParticipantName, callModel.remoteParticipantName) && Intrinsics.areEqual(this.remoteParticipantCommsId, callModel.remoteParticipantCommsId) && Intrinsics.areEqual(this.callee, callModel.callee) && Intrinsics.areEqual(this.caller, callModel.caller) && this.isEnhancedProcessingEnabled == callModel.isEnhancedProcessingEnabled && this.isGroupCall == callModel.isGroupCall && this.isOptInRequired == callModel.isOptInRequired && this.isDropInCall == callModel.isDropInCall && this.callOrigin == callModel.callOrigin && this.isVideoCall == callModel.isVideoCall && this.isRemoteRttEnabled == callModel.isRemoteRttEnabled && this.callAcceptedTimeForCallDurationTimer == callModel.callAcceptedTimeForCallDurationTimer && this.callStartTime == callModel.callStartTime && this.callConnectedTime == callModel.callConnectedTime && this.callEndTime == callModel.callEndTime && Intrinsics.areEqual(this.callProvider, callModel.callProvider) && Intrinsics.areEqual(this.statusCodeStr, callModel.statusCodeStr) && Intrinsics.areEqual(this.ratingModel, callModel.ratingModel) && this.isComingFromIntent == callModel.isComingFromIntent && this.isUpdateEvent == callModel.isUpdateEvent && this.audioDowngradeStatus == callModel.audioDowngradeStatus && this.isCallSetupEventVideoEmitted == callModel.isCallSetupEventVideoEmitted && this.isFrostedDisclaimerFinished == callModel.isFrostedDisclaimerFinished && Intrinsics.areEqual(this.remoteParticipantUri, callModel.remoteParticipantUri) && Intrinsics.areEqual(this.deviceGruu, callModel.deviceGruu);
    }

    @NotNull
    public final AudioDowngradeType getAudioDowngradeStatus() {
        return this.audioDowngradeStatus;
    }

    public final long getCallAcceptedTimeForCallDurationTimer() {
        return this.callAcceptedTimeForCallDurationTimer;
    }

    public final long getCallConnectedTime() {
        return this.callConnectedTime;
    }

    public final long getCallEndTime() {
        return this.callEndTime;
    }

    @NotNull
    public final String getCallId() {
        return this.callId;
    }

    @Nullable
    public final CallOrigin getCallOrigin() {
        return this.callOrigin;
    }

    @Nullable
    public final String getCallProvider() {
        return this.callProvider;
    }

    public final long getCallStartTime() {
        return this.callStartTime;
    }

    @Nullable
    public final Agent getCallee() {
        return this.callee;
    }

    @Nullable
    public final Agent getCaller() {
        return this.caller;
    }

    @Nullable
    public final String getDeviceGruu() {
        return this.deviceGruu;
    }

    @Nullable
    public final RatingModel getRatingModel() {
        return this.ratingModel;
    }

    @NotNull
    public final String getRemoteParticipantCommsId() {
        return this.remoteParticipantCommsId;
    }

    @NotNull
    public final String getRemoteParticipantName() {
        return this.remoteParticipantName;
    }

    @Nullable
    public final String getRemoteParticipantUri() {
        return this.remoteParticipantUri;
    }

    @Nullable
    public final String getStatusCodeStr() {
        return this.statusCodeStr;
    }

    public int hashCode() {
        int a2 = b.a(this.remoteParticipantCommsId, b.a(this.remoteParticipantName, this.callId.hashCode() * 31, 31), 31);
        Agent agent = this.callee;
        int hashCode = (a2 + (agent == null ? 0 : agent.hashCode())) * 31;
        Agent agent2 = this.caller;
        int a3 = c.a(this.isDropInCall, c.a(this.isOptInRequired, c.a(this.isGroupCall, c.a(this.isEnhancedProcessingEnabled, (hashCode + (agent2 == null ? 0 : agent2.hashCode())) * 31, 31), 31), 31), 31);
        CallOrigin callOrigin = this.callOrigin;
        int m = BitVector$$ExternalSyntheticOutline0.m(this.callEndTime, BitVector$$ExternalSyntheticOutline0.m(this.callConnectedTime, BitVector$$ExternalSyntheticOutline0.m(this.callStartTime, BitVector$$ExternalSyntheticOutline0.m(this.callAcceptedTimeForCallDurationTimer, c.a(this.isRemoteRttEnabled, c.a(this.isVideoCall, (a3 + (callOrigin == null ? 0 : callOrigin.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str = this.callProvider;
        int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusCodeStr;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RatingModel ratingModel = this.ratingModel;
        int a4 = c.a(this.isFrostedDisclaimerFinished, c.a(this.isCallSetupEventVideoEmitted, (this.audioDowngradeStatus.hashCode() + c.a(this.isUpdateEvent, c.a(this.isComingFromIntent, (hashCode3 + (ratingModel == null ? 0 : ratingModel.hashCode())) * 31, 31), 31)) * 31, 31), 31);
        String str3 = this.remoteParticipantUri;
        int hashCode4 = (a4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceGruu;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isCallSetupEventVideoEmitted() {
        return this.isCallSetupEventVideoEmitted;
    }

    public final boolean isComingFromIntent() {
        return this.isComingFromIntent;
    }

    public final boolean isDropInCall() {
        return this.isDropInCall;
    }

    public final boolean isEnhancedProcessingEnabled() {
        return this.isEnhancedProcessingEnabled;
    }

    public final boolean isFrostedDisclaimerFinished() {
        return this.isFrostedDisclaimerFinished;
    }

    public final boolean isGroupCall() {
        return this.isGroupCall;
    }

    public final boolean isOptInRequired() {
        return this.isOptInRequired;
    }

    public final boolean isRemoteRttEnabled() {
        return this.isRemoteRttEnabled;
    }

    public final boolean isUpdateEvent() {
        return this.isUpdateEvent;
    }

    public final boolean isVideoCall() {
        return this.isVideoCall;
    }

    @NotNull
    public String toString() {
        String str = this.callId;
        String str2 = this.remoteParticipantName;
        String str3 = this.remoteParticipantCommsId;
        Agent agent = this.callee;
        Agent agent2 = this.caller;
        boolean z = this.isEnhancedProcessingEnabled;
        boolean z2 = this.isGroupCall;
        boolean z3 = this.isOptInRequired;
        boolean z4 = this.isDropInCall;
        CallOrigin callOrigin = this.callOrigin;
        boolean z5 = this.isVideoCall;
        boolean z6 = this.isRemoteRttEnabled;
        long j = this.callAcceptedTimeForCallDurationTimer;
        long j2 = this.callStartTime;
        long j3 = this.callConnectedTime;
        long j4 = this.callEndTime;
        String str4 = this.callProvider;
        String str5 = this.statusCodeStr;
        RatingModel ratingModel = this.ratingModel;
        boolean z7 = this.isComingFromIntent;
        boolean z8 = this.isUpdateEvent;
        AudioDowngradeType audioDowngradeType = this.audioDowngradeStatus;
        boolean z9 = this.isCallSetupEventVideoEmitted;
        boolean z10 = this.isFrostedDisclaimerFinished;
        String str6 = this.remoteParticipantUri;
        String str7 = this.deviceGruu;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("CallModel(callId=", str, ", remoteParticipantName=", str2, ", remoteParticipantCommsId=");
        m.append(str3);
        m.append(", callee=");
        m.append(agent);
        m.append(", caller=");
        m.append(agent2);
        m.append(", isEnhancedProcessingEnabled=");
        m.append(z);
        m.append(", isGroupCall=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z2, ", isOptInRequired=", z3, ", isDropInCall=");
        m.append(z4);
        m.append(", callOrigin=");
        m.append(callOrigin);
        m.append(", isVideoCall=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z5, ", isRemoteRttEnabled=", z6, ", callAcceptedTimeForCallDurationTimer=");
        m.append(j);
        ArcMode$$ExternalSyntheticOutline0.m(j2, ", callStartTime=", ", callConnectedTime=", m);
        m.append(j3);
        ArcMode$$ExternalSyntheticOutline0.m(j4, ", callEndTime=", ", callProvider=", m);
        AppLaunchChecker$$ExternalSyntheticOutline0.m(m, str4, ", statusCodeStr=", str5, ", ratingModel=");
        m.append(ratingModel);
        m.append(", isComingFromIntent=");
        m.append(z7);
        m.append(", isUpdateEvent=");
        m.append(z8);
        m.append(", audioDowngradeStatus=");
        m.append(audioDowngradeType);
        m.append(", isCallSetupEventVideoEmitted=");
        AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14726m(m, z9, ", isFrostedDisclaimerFinished=", z10, ", remoteParticipantUri=");
        return DoubleList$$ExternalSyntheticOutline0.m(m, str6, ", deviceGruu=", str7, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public CallModel(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Agent agent, @Nullable Agent agent2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable CallOrigin callOrigin, boolean z5, boolean z6, long j, long j2, long j3, long j4, @Nullable String str4, @Nullable String str5, @Nullable RatingModel ratingModel, boolean z7, boolean z8, @NotNull AudioDowngradeType audioDowngradeType, boolean z9, boolean z10, @Nullable String str6, @Nullable String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        audioDowngradeType.getClass();
        this.callId = str;
        this.remoteParticipantName = str2;
        this.remoteParticipantCommsId = str3;
        this.callee = agent;
        this.caller = agent2;
        this.isEnhancedProcessingEnabled = z;
        this.isGroupCall = z2;
        this.isOptInRequired = z3;
        this.isDropInCall = z4;
        this.callOrigin = callOrigin;
        this.isVideoCall = z5;
        this.isRemoteRttEnabled = z6;
        this.callAcceptedTimeForCallDurationTimer = j;
        this.callStartTime = j2;
        this.callConnectedTime = j3;
        this.callEndTime = j4;
        this.callProvider = str4;
        this.statusCodeStr = str5;
        this.ratingModel = ratingModel;
        this.isComingFromIntent = z7;
        this.isUpdateEvent = z8;
        this.audioDowngradeStatus = audioDowngradeType;
        this.isCallSetupEventVideoEmitted = z9;
        this.isFrostedDisclaimerFinished = z10;
        this.remoteParticipantUri = str6;
        this.deviceGruu = str7;
    }
}
