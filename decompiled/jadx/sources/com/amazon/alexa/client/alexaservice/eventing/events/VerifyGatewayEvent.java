package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.alexaservice.networking.message.callbacks.SendMessageCallback;
import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u0011\u0010\u001a\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bHÆ\u0003JL\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\t\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/amazon/alexa/client/alexaservice/eventing/events/VerifyGatewayEvent;", "Lcom/amazon/alexa/client/alexaservice/eventing/Event$NotGated;", "isSuccess", "", "requiresEndpointChange", "dropReason", "Lcom/amazon/alexa/client/alexaservice/networking/message/callbacks/SendMessageCallback$DropReason;", "statusCode", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "(ZZLcom/amazon/alexa/client/alexaservice/networking/message/callbacks/SendMessageCallback$DropReason;Ljava/lang/Integer;Ljava/lang/Exception;)V", "getDropReason", "()Lcom/amazon/alexa/client/alexaservice/networking/message/callbacks/SendMessageCallback$DropReason;", "getException", "()Ljava/lang/Exception;", "()Z", "getRequiresEndpointChange", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(ZZLcom/amazon/alexa/client/alexaservice/networking/message/callbacks/SendMessageCallback$DropReason;Ljava/lang/Integer;Ljava/lang/Exception;)Lcom/amazon/alexa/client/alexaservice/eventing/events/VerifyGatewayEvent;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "AVSAndroidClient-alexaservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerifyGatewayEvent extends Event.NotGated {

    @Nullable
    private final SendMessageCallback.DropReason dropReason;

    @Nullable
    private final Exception exception;
    private final boolean isSuccess;
    private final boolean requiresEndpointChange;

    @Nullable
    private final Integer statusCode;

    public /* synthetic */ VerifyGatewayEvent(boolean z, boolean z2, SendMessageCallback.DropReason dropReason, Integer num, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : dropReason, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : exc);
    }

    public static /* synthetic */ VerifyGatewayEvent copy$default(VerifyGatewayEvent verifyGatewayEvent, boolean z, boolean z2, SendMessageCallback.DropReason dropReason, Integer num, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            z = verifyGatewayEvent.isSuccess;
        }
        if ((i & 2) != 0) {
            z2 = verifyGatewayEvent.requiresEndpointChange;
        }
        if ((i & 4) != 0) {
            dropReason = verifyGatewayEvent.dropReason;
        }
        if ((i & 8) != 0) {
            num = verifyGatewayEvent.statusCode;
        }
        if ((i & 16) != 0) {
            exc = verifyGatewayEvent.exception;
        }
        Exception exc2 = exc;
        SendMessageCallback.DropReason dropReason2 = dropReason;
        return verifyGatewayEvent.copy(z, z2, dropReason2, num, exc2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getRequiresEndpointChange() {
        return this.requiresEndpointChange;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final SendMessageCallback.DropReason getDropReason() {
        return this.dropReason;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Exception getException() {
        return this.exception;
    }

    @NotNull
    public final VerifyGatewayEvent copy(boolean isSuccess, boolean requiresEndpointChange, @Nullable SendMessageCallback.DropReason dropReason, @Nullable Integer statusCode, @Nullable Exception exception) {
        return new VerifyGatewayEvent(isSuccess, requiresEndpointChange, dropReason, statusCode, exception);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerifyGatewayEvent)) {
            return false;
        }
        VerifyGatewayEvent verifyGatewayEvent = (VerifyGatewayEvent) other;
        return this.isSuccess == verifyGatewayEvent.isSuccess && this.requiresEndpointChange == verifyGatewayEvent.requiresEndpointChange && this.dropReason == verifyGatewayEvent.dropReason && Intrinsics.areEqual(this.statusCode, verifyGatewayEvent.statusCode) && Intrinsics.areEqual(this.exception, verifyGatewayEvent.exception);
    }

    @Nullable
    public final SendMessageCallback.DropReason getDropReason() {
        return this.dropReason;
    }

    @Nullable
    public final Exception getException() {
        return this.exception;
    }

    public final boolean getRequiresEndpointChange() {
        return this.requiresEndpointChange;
    }

    @Nullable
    public final Integer getStatusCode() {
        return this.statusCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.isSuccess;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.requiresEndpointChange;
        int i2 = (i + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        SendMessageCallback.DropReason dropReason = this.dropReason;
        int hashCode = (i2 + (dropReason == null ? 0 : dropReason.hashCode())) * 31;
        Integer num = this.statusCode;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Exception exc = this.exception;
        return hashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        boolean z = this.isSuccess;
        boolean z2 = this.requiresEndpointChange;
        SendMessageCallback.DropReason dropReason = this.dropReason;
        Integer num = this.statusCode;
        Exception exc = this.exception;
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("VerifyGatewayEvent(isSuccess=", z, ", requiresEndpointChange=", z2, ", dropReason=");
        m.append(dropReason);
        m.append(", statusCode=");
        m.append(num);
        m.append(", exception=");
        m.append(exc);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public VerifyGatewayEvent() {
        this(false, false, null, null, null, 31, null);
    }

    public VerifyGatewayEvent(boolean z, boolean z2, @Nullable SendMessageCallback.DropReason dropReason, @Nullable Integer num, @Nullable Exception exc) {
        this.isSuccess = z;
        this.requiresEndpointChange = z2;
        this.dropReason = dropReason;
        this.statusCode = num;
        this.exception = exc;
    }
}
