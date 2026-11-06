package com.amazon.comms.calling.data.dataSource;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.BeginCallPayload;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent;", "", "<init>", "()V", "OnBeginCall", "OnError", "Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent$OnBeginCall;", "Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent$OnError;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class InitiateCallEvent {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent$OnBeginCall;", "Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent;", "payload", "Lcom/amazon/comms/calling/domain/model/BeginCallPayload;", "<init>", "(Lcom/amazon/comms/calling/domain/model/BeginCallPayload;)V", "getPayload", "()Lcom/amazon/comms/calling/domain/model/BeginCallPayload;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBeginCall extends InitiateCallEvent {

        @NotNull
        private final BeginCallPayload payload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBeginCall(@NotNull BeginCallPayload beginCallPayload) {
            super(null);
            beginCallPayload.getClass();
            this.payload = beginCallPayload;
        }

        public static /* synthetic */ OnBeginCall copy$default(OnBeginCall onBeginCall, BeginCallPayload beginCallPayload, int i, Object obj) {
            if ((i & 1) != 0) {
                beginCallPayload = onBeginCall.payload;
            }
            return onBeginCall.copy(beginCallPayload);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final BeginCallPayload getPayload() {
            return this.payload;
        }

        @NotNull
        public final OnBeginCall copy(@NotNull BeginCallPayload payload) {
            payload.getClass();
            return new OnBeginCall(payload);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnBeginCall) && Intrinsics.areEqual(this.payload, ((OnBeginCall) other).payload);
        }

        @NotNull
        public final BeginCallPayload getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return this.payload.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnBeginCall(payload=" + this.payload + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent$OnError;", "Lcom/amazon/comms/calling/data/dataSource/InitiateCallEvent;", "statusCode", "", "<init>", "(I)V", "getStatusCode", "()I", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnError extends InitiateCallEvent {
        private final int statusCode;

        public OnError(int i) {
            super(null);
            this.statusCode = i;
        }

        public static /* synthetic */ OnError copy$default(OnError onError, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = onError.statusCode;
            }
            return onError.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getStatusCode() {
            return this.statusCode;
        }

        @NotNull
        public final OnError copy(int statusCode) {
            return new OnError(statusCode);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnError) && this.statusCode == ((OnError) other).statusCode;
        }

        public final int getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.statusCode);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m(this.statusCode, "OnError(statusCode=", MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public /* synthetic */ InitiateCallEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InitiateCallEvent() {
    }
}
