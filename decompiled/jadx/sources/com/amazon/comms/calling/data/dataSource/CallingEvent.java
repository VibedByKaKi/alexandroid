package com.amazon.comms.calling.data.dataSource;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.CallModel;
import com.amazon.comms.calling.service.ErrorCode;
import com.amazon.comms.calling.service.HangupReason;
import defpackage.a$$ExternalSyntheticOutline0;
import defpackage.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CallingEvent;", "", "<init>", "()V", "OnCallAdded", "OnCallRemoved", "OnRinging", "OnAccepted", "OnErrorDuringCall", "OnHangup", "OnMediaDTMF", "OnSignalingDTMF", "OnErrorDuringSIP", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnAccepted;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnCallAdded;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnCallRemoved;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnErrorDuringCall;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnErrorDuringSIP;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnHangup;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnMediaDTMF;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnRinging;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnSignalingDTMF;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class CallingEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnAccepted;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent;", "call", "Lcom/amazon/comms/calling/domain/model/CallModel;", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallModel;)V", "getCall", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAccepted extends CallingEvent {

        @NotNull
        private final CallModel call;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAccepted(@NotNull CallModel callModel) {
            super(null);
            callModel.getClass();
            this.call = callModel;
        }

        public static /* synthetic */ OnAccepted copy$default(OnAccepted onAccepted, CallModel callModel, int i, Object obj) {
            if ((i & 1) != 0) {
                callModel = onAccepted.call;
            }
            return onAccepted.copy(callModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CallModel getCall() {
            return this.call;
        }

        @NotNull
        public final OnAccepted copy(@NotNull CallModel call) {
            call.getClass();
            return new OnAccepted(call);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnAccepted) && Intrinsics.areEqual(this.call, ((OnAccepted) other).call);
        }

        @NotNull
        public final CallModel getCall() {
            return this.call;
        }

        public int hashCode() {
            return this.call.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnAccepted(call=" + this.call + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnCallAdded;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent;", "call", "Lcom/amazon/comms/calling/domain/model/CallModel;", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallModel;)V", "getCall", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCallAdded extends CallingEvent {

        @NotNull
        private final CallModel call;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCallAdded(@NotNull CallModel callModel) {
            super(null);
            callModel.getClass();
            this.call = callModel;
        }

        public static /* synthetic */ OnCallAdded copy$default(OnCallAdded onCallAdded, CallModel callModel, int i, Object obj) {
            if ((i & 1) != 0) {
                callModel = onCallAdded.call;
            }
            return onCallAdded.copy(callModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CallModel getCall() {
            return this.call;
        }

        @NotNull
        public final OnCallAdded copy(@NotNull CallModel call) {
            call.getClass();
            return new OnCallAdded(call);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnCallAdded) && Intrinsics.areEqual(this.call, ((OnCallAdded) other).call);
        }

        @NotNull
        public final CallModel getCall() {
            return this.call;
        }

        public int hashCode() {
            return this.call.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnCallAdded(call=" + this.call + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnCallRemoved;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent;", "call", "Lcom/amazon/comms/calling/domain/model/CallModel;", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallModel;)V", "getCall", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCallRemoved extends CallingEvent {

        @NotNull
        private final CallModel call;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnCallRemoved(@NotNull CallModel callModel) {
            super(null);
            callModel.getClass();
            this.call = callModel;
        }

        public static /* synthetic */ OnCallRemoved copy$default(OnCallRemoved onCallRemoved, CallModel callModel, int i, Object obj) {
            if ((i & 1) != 0) {
                callModel = onCallRemoved.call;
            }
            return onCallRemoved.copy(callModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CallModel getCall() {
            return this.call;
        }

        @NotNull
        public final OnCallRemoved copy(@NotNull CallModel call) {
            call.getClass();
            return new OnCallRemoved(call);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnCallRemoved) && Intrinsics.areEqual(this.call, ((OnCallRemoved) other).call);
        }

        @NotNull
        public final CallModel getCall() {
            return this.call;
        }

        public int hashCode() {
            return this.call.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnCallRemoved(call=" + this.call + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnErrorDuringCall;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent;", "call", "Lcom/amazon/comms/calling/domain/model/CallModel;", "errorCode", "Lcom/amazon/comms/calling/service/ErrorCode;", "internalErrorCode", "", "errorDescription", "", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallModel;Lcom/amazon/comms/calling/service/ErrorCode;ILjava/lang/String;)V", "getCall", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "getErrorCode", "()Lcom/amazon/comms/calling/service/ErrorCode;", "getInternalErrorCode", "()I", "getErrorDescription", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnErrorDuringCall extends CallingEvent {

        @NotNull
        private final CallModel call;

        @NotNull
        private final ErrorCode errorCode;

        @NotNull
        private final String errorDescription;
        private final int internalErrorCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnErrorDuringCall(@NotNull CallModel callModel, @NotNull ErrorCode errorCode, int i, @NotNull String str) {
            super(null);
            callModel.getClass();
            errorCode.getClass();
            str.getClass();
            this.call = callModel;
            this.errorCode = errorCode;
            this.internalErrorCode = i;
            this.errorDescription = str;
        }

        public static /* synthetic */ OnErrorDuringCall copy$default(OnErrorDuringCall onErrorDuringCall, CallModel callModel, ErrorCode errorCode, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                callModel = onErrorDuringCall.call;
            }
            if ((i2 & 2) != 0) {
                errorCode = onErrorDuringCall.errorCode;
            }
            if ((i2 & 4) != 0) {
                i = onErrorDuringCall.internalErrorCode;
            }
            if ((i2 & 8) != 0) {
                str = onErrorDuringCall.errorDescription;
            }
            return onErrorDuringCall.copy(callModel, errorCode, i, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CallModel getCall() {
            return this.call;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component3, reason: from getter */
        public final int getInternalErrorCode() {
            return this.internalErrorCode;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getErrorDescription() {
            return this.errorDescription;
        }

        @NotNull
        public final OnErrorDuringCall copy(@NotNull CallModel call, @NotNull ErrorCode errorCode, int internalErrorCode, @NotNull String errorDescription) {
            call.getClass();
            errorCode.getClass();
            errorDescription.getClass();
            return new OnErrorDuringCall(call, errorCode, internalErrorCode, errorDescription);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnErrorDuringCall)) {
                return false;
            }
            OnErrorDuringCall onErrorDuringCall = (OnErrorDuringCall) other;
            return Intrinsics.areEqual(this.call, onErrorDuringCall.call) && this.errorCode == onErrorDuringCall.errorCode && this.internalErrorCode == onErrorDuringCall.internalErrorCode && Intrinsics.areEqual(this.errorDescription, onErrorDuringCall.errorDescription);
        }

        @NotNull
        public final CallModel getCall() {
            return this.call;
        }

        @NotNull
        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final int getInternalErrorCode() {
            return this.internalErrorCode;
        }

        public int hashCode() {
            return this.errorDescription.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.internalErrorCode, (this.errorCode.hashCode() + (this.call.hashCode() * 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "OnErrorDuringCall(call=" + this.call + ", errorCode=" + this.errorCode + ", internalErrorCode=" + this.internalErrorCode + ", errorDescription=" + this.errorDescription + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnErrorDuringSIP;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent;", "callId", "", "errorCode", "Lcom/amazon/comms/calling/service/ErrorCode;", "internalErrorCode", "", "errorDesc", "<init>", "(Ljava/lang/String;Lcom/amazon/comms/calling/service/ErrorCode;ILjava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getErrorCode", "()Lcom/amazon/comms/calling/service/ErrorCode;", "getInternalErrorCode", "()I", "getErrorDesc", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnErrorDuringSIP extends CallingEvent {

        @NotNull
        private final String callId;

        @NotNull
        private final ErrorCode errorCode;

        @NotNull
        private final String errorDesc;
        private final int internalErrorCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnErrorDuringSIP(@NotNull String str, @NotNull ErrorCode errorCode, int i, @NotNull String str2) {
            super(null);
            str.getClass();
            errorCode.getClass();
            str2.getClass();
            this.callId = str;
            this.errorCode = errorCode;
            this.internalErrorCode = i;
            this.errorDesc = str2;
        }

        public static /* synthetic */ OnErrorDuringSIP copy$default(OnErrorDuringSIP onErrorDuringSIP, String str, ErrorCode errorCode, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = onErrorDuringSIP.callId;
            }
            if ((i2 & 2) != 0) {
                errorCode = onErrorDuringSIP.errorCode;
            }
            if ((i2 & 4) != 0) {
                i = onErrorDuringSIP.internalErrorCode;
            }
            if ((i2 & 8) != 0) {
                str2 = onErrorDuringSIP.errorDesc;
            }
            return onErrorDuringSIP.copy(str, errorCode, i, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCallId() {
            return this.callId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component3, reason: from getter */
        public final int getInternalErrorCode() {
            return this.internalErrorCode;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getErrorDesc() {
            return this.errorDesc;
        }

        @NotNull
        public final OnErrorDuringSIP copy(@NotNull String callId, @NotNull ErrorCode errorCode, int internalErrorCode, @NotNull String errorDesc) {
            callId.getClass();
            errorCode.getClass();
            errorDesc.getClass();
            return new OnErrorDuringSIP(callId, errorCode, internalErrorCode, errorDesc);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnErrorDuringSIP)) {
                return false;
            }
            OnErrorDuringSIP onErrorDuringSIP = (OnErrorDuringSIP) other;
            return Intrinsics.areEqual(this.callId, onErrorDuringSIP.callId) && this.errorCode == onErrorDuringSIP.errorCode && this.internalErrorCode == onErrorDuringSIP.internalErrorCode && Intrinsics.areEqual(this.errorDesc, onErrorDuringSIP.errorDesc);
        }

        @NotNull
        public final String getCallId() {
            return this.callId;
        }

        @NotNull
        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }

        @NotNull
        public final String getErrorDesc() {
            return this.errorDesc;
        }

        public final int getInternalErrorCode() {
            return this.internalErrorCode;
        }

        public int hashCode() {
            return this.errorDesc.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.internalErrorCode, (this.errorCode.hashCode() + (this.callId.hashCode() * 31)) * 31, 31);
        }

        @NotNull
        public String toString() {
            return "OnErrorDuringSIP(callId=" + this.callId + ", errorCode=" + this.errorCode + ", internalErrorCode=" + this.internalErrorCode + ", errorDesc=" + this.errorDesc + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnHangup;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent;", "call", "Lcom/amazon/comms/calling/domain/model/CallModel;", "hangupReason", "Lcom/amazon/comms/calling/service/HangupReason;", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallModel;Lcom/amazon/comms/calling/service/HangupReason;)V", "getCall", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "getHangupReason", "()Lcom/amazon/comms/calling/service/HangupReason;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHangup extends CallingEvent {

        @NotNull
        private final CallModel call;

        @NotNull
        private final HangupReason hangupReason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnHangup(@NotNull CallModel callModel, @NotNull HangupReason hangupReason) {
            super(null);
            callModel.getClass();
            hangupReason.getClass();
            this.call = callModel;
            this.hangupReason = hangupReason;
        }

        public static /* synthetic */ OnHangup copy$default(OnHangup onHangup, CallModel callModel, HangupReason hangupReason, int i, Object obj) {
            if ((i & 1) != 0) {
                callModel = onHangup.call;
            }
            if ((i & 2) != 0) {
                hangupReason = onHangup.hangupReason;
            }
            return onHangup.copy(callModel, hangupReason);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CallModel getCall() {
            return this.call;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final HangupReason getHangupReason() {
            return this.hangupReason;
        }

        @NotNull
        public final OnHangup copy(@NotNull CallModel call, @NotNull HangupReason hangupReason) {
            call.getClass();
            hangupReason.getClass();
            return new OnHangup(call, hangupReason);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnHangup)) {
                return false;
            }
            OnHangup onHangup = (OnHangup) other;
            return Intrinsics.areEqual(this.call, onHangup.call) && this.hangupReason == onHangup.hangupReason;
        }

        @NotNull
        public final CallModel getCall() {
            return this.call;
        }

        @NotNull
        public final HangupReason getHangupReason() {
            return this.hangupReason;
        }

        public int hashCode() {
            return this.hangupReason.hashCode() + (this.call.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OnHangup(call=" + this.call + ", hangupReason=" + this.hangupReason + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnMediaDTMF;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent;", "call", "Lcom/amazon/comms/calling/domain/model/CallModel;", "success", "", "statusCode", "", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallModel;ZLjava/lang/String;)V", "getCall", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "getSuccess", "()Z", "getStatusCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMediaDTMF extends CallingEvent {

        @NotNull
        private final CallModel call;

        @NotNull
        private final String statusCode;
        private final boolean success;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnMediaDTMF(@NotNull CallModel callModel, boolean z, @NotNull String str) {
            super(null);
            callModel.getClass();
            str.getClass();
            this.call = callModel;
            this.success = z;
            this.statusCode = str;
        }

        public static /* synthetic */ OnMediaDTMF copy$default(OnMediaDTMF onMediaDTMF, CallModel callModel, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                callModel = onMediaDTMF.call;
            }
            if ((i & 2) != 0) {
                z = onMediaDTMF.success;
            }
            if ((i & 4) != 0) {
                str = onMediaDTMF.statusCode;
            }
            return onMediaDTMF.copy(callModel, z, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CallModel getCall() {
            return this.call;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getStatusCode() {
            return this.statusCode;
        }

        @NotNull
        public final OnMediaDTMF copy(@NotNull CallModel call, boolean success, @NotNull String statusCode) {
            call.getClass();
            statusCode.getClass();
            return new OnMediaDTMF(call, success, statusCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnMediaDTMF)) {
                return false;
            }
            OnMediaDTMF onMediaDTMF = (OnMediaDTMF) other;
            return Intrinsics.areEqual(this.call, onMediaDTMF.call) && this.success == onMediaDTMF.success && Intrinsics.areEqual(this.statusCode, onMediaDTMF.statusCode);
        }

        @NotNull
        public final CallModel getCall() {
            return this.call;
        }

        @NotNull
        public final String getStatusCode() {
            return this.statusCode;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return this.statusCode.hashCode() + c.a(this.success, this.call.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            CallModel callModel = this.call;
            boolean z = this.success;
            String str = this.statusCode;
            StringBuilder sb = new StringBuilder("OnMediaDTMF(call=");
            sb.append(callModel);
            sb.append(", success=");
            sb.append(z);
            sb.append(", statusCode=");
            return a$$ExternalSyntheticOutline0.m(sb, str, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnRinging;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent;", "call", "Lcom/amazon/comms/calling/domain/model/CallModel;", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallModel;)V", "getCall", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRinging extends CallingEvent {

        @NotNull
        private final CallModel call;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRinging(@NotNull CallModel callModel) {
            super(null);
            callModel.getClass();
            this.call = callModel;
        }

        public static /* synthetic */ OnRinging copy$default(OnRinging onRinging, CallModel callModel, int i, Object obj) {
            if ((i & 1) != 0) {
                callModel = onRinging.call;
            }
            return onRinging.copy(callModel);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CallModel getCall() {
            return this.call;
        }

        @NotNull
        public final OnRinging copy(@NotNull CallModel call) {
            call.getClass();
            return new OnRinging(call);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnRinging) && Intrinsics.areEqual(this.call, ((OnRinging) other).call);
        }

        @NotNull
        public final CallModel getCall() {
            return this.call;
        }

        public int hashCode() {
            return this.call.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnRinging(call=" + this.call + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CallingEvent$OnSignalingDTMF;", "Lcom/amazon/comms/calling/data/dataSource/CallingEvent;", "call", "Lcom/amazon/comms/calling/domain/model/CallModel;", "statusCode", "", "<init>", "(Lcom/amazon/comms/calling/domain/model/CallModel;Ljava/lang/String;)V", "getCall", "()Lcom/amazon/comms/calling/domain/model/CallModel;", "getStatusCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSignalingDTMF extends CallingEvent {

        @NotNull
        private final CallModel call;

        @NotNull
        private final String statusCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSignalingDTMF(@NotNull CallModel callModel, @NotNull String str) {
            super(null);
            callModel.getClass();
            str.getClass();
            this.call = callModel;
            this.statusCode = str;
        }

        public static /* synthetic */ OnSignalingDTMF copy$default(OnSignalingDTMF onSignalingDTMF, CallModel callModel, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                callModel = onSignalingDTMF.call;
            }
            if ((i & 2) != 0) {
                str = onSignalingDTMF.statusCode;
            }
            return onSignalingDTMF.copy(callModel, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CallModel getCall() {
            return this.call;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getStatusCode() {
            return this.statusCode;
        }

        @NotNull
        public final OnSignalingDTMF copy(@NotNull CallModel call, @NotNull String statusCode) {
            call.getClass();
            statusCode.getClass();
            return new OnSignalingDTMF(call, statusCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OnSignalingDTMF)) {
                return false;
            }
            OnSignalingDTMF onSignalingDTMF = (OnSignalingDTMF) other;
            return Intrinsics.areEqual(this.call, onSignalingDTMF.call) && Intrinsics.areEqual(this.statusCode, onSignalingDTMF.statusCode);
        }

        @NotNull
        public final CallModel getCall() {
            return this.call;
        }

        @NotNull
        public final String getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            return this.statusCode.hashCode() + (this.call.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "OnSignalingDTMF(call=" + this.call + ", statusCode=" + this.statusCode + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    public /* synthetic */ CallingEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CallingEvent() {
    }
}
