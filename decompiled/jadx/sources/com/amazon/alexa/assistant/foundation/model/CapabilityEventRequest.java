package com.amazon.alexa.assistant.foundation.model;

import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u001c\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0004\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/model/CapabilityEventRequest;", "", "event", "Lcom/amazon/alexa/assistant/foundation/model/Event;", "completion", "Lkotlin/Function1;", "Lkotlin/Result;", "", "", "cancellationJob", "Lkotlinx/coroutines/Job;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/Event;Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/Job;)V", "getEvent", "()Lcom/amazon/alexa/assistant/foundation/model/Event;", "getCompletion", "()Lkotlin/jvm/functions/Function1;", "getCancellationJob", "()Lkotlinx/coroutines/Job;", "holdForReconnect", "", "getHoldForReconnect$annotations", "()V", "getHoldForReconnect", "()Z", "setHoldForReconnect", "(Z)V", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CapabilityEventRequest {

    @Nullable
    private final Job cancellationJob;

    @Nullable
    private final Function1<Result<Integer>, Unit> completion;

    @NotNull
    private final Event event;
    private boolean holdForReconnect;

    public /* synthetic */ CapabilityEventRequest(Event event, Function1 function1, Job job, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(event, (i & 2) != 0 ? null : function1, (i & 4) != 0 ? null : job);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CapabilityEventRequest copy$default(CapabilityEventRequest capabilityEventRequest, Event event, Function1 function1, Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            event = capabilityEventRequest.event;
        }
        if ((i & 2) != 0) {
            function1 = capabilityEventRequest.completion;
        }
        if ((i & 4) != 0) {
            job = capabilityEventRequest.cancellationJob;
        }
        return capabilityEventRequest.copy(event, function1, job);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @Nullable
    public final Function1<Result<Integer>, Unit> component2() {
        return this.completion;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Job getCancellationJob() {
        return this.cancellationJob;
    }

    @NotNull
    public final CapabilityEventRequest copy(@NotNull Event event, @Nullable Function1<? super Result<Integer>, Unit> completion, @Nullable Job cancellationJob) {
        event.getClass();
        return new CapabilityEventRequest(event, completion, cancellationJob);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapabilityEventRequest)) {
            return false;
        }
        CapabilityEventRequest capabilityEventRequest = (CapabilityEventRequest) other;
        return Intrinsics.areEqual(this.event, capabilityEventRequest.event) && Intrinsics.areEqual(this.completion, capabilityEventRequest.completion) && Intrinsics.areEqual(this.cancellationJob, capabilityEventRequest.cancellationJob);
    }

    @Nullable
    public final Job getCancellationJob() {
        return this.cancellationJob;
    }

    @Nullable
    public final Function1<Result<Integer>, Unit> getCompletion() {
        return this.completion;
    }

    @NotNull
    public final Event getEvent() {
        return this.event;
    }

    public final boolean getHoldForReconnect() {
        return this.holdForReconnect;
    }

    public int hashCode() {
        int hashCode = this.event.hashCode() * 31;
        Function1<Result<Integer>, Unit> function1 = this.completion;
        int hashCode2 = (hashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Job job = this.cancellationJob;
        return hashCode2 + (job != null ? job.hashCode() : 0);
    }

    public final void setHoldForReconnect(boolean z) {
        this.holdForReconnect = z;
    }

    @NotNull
    public String toString() {
        return "CapabilityEventRequest(event=" + this.event + ", completion=" + this.completion + ", cancellationJob=" + this.cancellationJob + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CapabilityEventRequest(@NotNull Event event, @Nullable Function1<? super Result<Integer>, Unit> function1, @Nullable Job job) {
        event.getClass();
        this.event = event;
        this.completion = function1;
        this.cancellationJob = job;
    }

    @InternalAssistantSdkApi
    public static /* synthetic */ void getHoldForReconnect$annotations() {
    }
}
